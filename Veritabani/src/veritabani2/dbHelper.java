/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//FARKLI BİR YÖNTEMLE VERİTABANI BAĞLANTISI 

public class dbHelper {
    
    private String dbUsername = "root";
    private String dbPassword = "";
    private String dbUrl = "jdbc:mysql://localhost:3306/sirket";
    
    /*
        İstediğimizde connection yapıp geri gönderecek metot
        Aşağının anlamı: Bu metot SQLException fırlatır
    */
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
