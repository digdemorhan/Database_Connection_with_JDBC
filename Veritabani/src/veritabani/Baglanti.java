/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Serdar
 */
public class Baglanti {
    
    /*
        Bağlanma operasyonlarını tek bir class'ta toplayıp çağırıcaz,
        tekrar tekrar yazma gereksinimi oluşmasın.
    */
    
    //Veritabanına bağlanabilmek için gereken username, password ve url üçlüsü
    private String dbUsername = "root";
    private String dbPassword = "";
    private String dbUrl = "jdbc:mysql://localhost:3306/sirket";
    //Bağlantıyı yapabilmek için Java geliştiricileri tarafından yazılmış olan Connection class'ı
    private Connection connection = null;

    public Baglanti() {  //Kod her new'lendiğinde burası çalışacak.
        
        /*
            Library kısmına yüklenmiş olan Driver'ı özel olarak biz başlattık
            (ileride sorun çıkmaması adına).
        */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı. " + ex);
        }
 
        try {
            //Alttaki satırda Connection class'ına bir referans atıp özellikleri gönderdik
            connection = (Connection) DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Baglanti basarili.");
        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz. " + ex);
        }
    
    }   
}
