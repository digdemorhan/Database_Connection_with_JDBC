/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//FARKLI BİR YÖNTEMLE VERİTABANI BAĞLANTISI 


public class veritabani2 {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        //dbHelper sınıfından helper nesnesini türettik
        dbHelper helper = new dbHelper();
        
        Statement statement = null; //Şimdilik null, try-catch'de referans bağlanacak
        ResultSet resultSet = null; //Sonuçların tutulacağı sınıf
        //Bu class'ların nesnelerini oluşturup referans bağlamadan null bıraktık
        
        
        /*
        try {
            //Nesne üzerinden o sınıfa dair metoda ulaştık
            connection = helper.getConnection();
            System.out.println("Baglanti basarili.");
            //SQLException fırlatır dedik, kullandığımız için önlem almalıyız
        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz. " + ex);
        }*/
        
        try {
            //Nesne üzerinden o sınıfa dair metoda ulaştık
            connection = helper.getConnection();           
            //Statement'i referansa bağlayalım, referansı alıp statement'a attık
            statement = connection.createStatement();
            //Sonuçları alalım, sorguyu çalıştırıp resultSet'in içerisine gönderecek
            resultSet = statement.executeQuery("SELECT * FROM personel"); //Tüm personelleri seçtik
            //resultSet'i kullanalım
            while(resultSet.next()){ //okuyacak daha fazla eleman var mı?
                System.out.println(resultSet.getInt("idPersonel") + " " + 
                   resultSet.getString("personelAdi") + " " + resultSet.getString("personelSoyadi")
                   + " " + resultSet.getString("personelMail")); 
                /*
                    Bunun yerine daha verimli bir yazdırma yapabiliriz.
                    Kolon numarasına göre yazdırdık.
                    System.out.println(resultSet.getInt(1) + "" + resultSet.getString(2) + "" + resultSet.getString(3) + "" + resultSet.getString(4));
                */
            }
        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz. " + ex);
        
    }
  }
}
