/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



//RESULTSET'TEN GELEN VERİYİ BİR SINIFA (PERSONEL) AKTARIYORUZ

public class gelenVeriyiSiniflaraUyarlamak_Personel {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        dbHelper dbhelper = new dbHelper();
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        //resultset<--statement<--connection<--helper
        try{
            connection = dbhelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM personel");
            //Verileri grup halinde tutmak için arraylist kullanıyoruz (generic sınıflarla)
            ArrayList<Personel> personeller = new ArrayList<Personel>();
            while(resultSet.next()){
                personeller.add(new Personel( //gönderilecek sınıfı yazmalıyız
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4)
                ));
            }
            System.out.println("Personel Sayisi: " + personeller.size());
            for(Personel personel : personeller){ //foreach döngüsü
                System.out.println("Id: " + personel.id);
                System.out.println("Ad: " + personel.ad);
                System.out.println("Soyad: " + personel.soyad);
                System.out.println("Mail: " + personel.mail);
                System.out.println("******************************");
            }
        }catch(SQLException ex){
            System.out.println("Bir hata oluştu. " + ex);
        }
    }
}
