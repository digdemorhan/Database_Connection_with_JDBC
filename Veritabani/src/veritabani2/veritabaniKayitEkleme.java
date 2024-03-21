/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class veritabaniKayitEkleme {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        dbHelper dbhelper = new dbHelper();
        PreparedStatement statement = null;
        //Veritabanından veri gelmediği için, biz oraya veri ekleyeceğimiz için resultset silindi
        
    
        try{
            connection = dbhelper.getConnection();
            String sqlEkle = "INSERT INTO personel(personelAdi, personelSoyadi, personelMail) "
                    + "VALUES ('Beyza','Güler','bg@gmail.com')";
            statement = connection.prepareStatement(sqlEkle); 
            statement.executeUpdate(); //güncellemeyi baslat
            System.out.println("Kayit basariyla eklendi.");
        }catch(SQLException ex){
                System.out.println("Bir hata oluştu. " + ex);
        }
    
 }  
}
