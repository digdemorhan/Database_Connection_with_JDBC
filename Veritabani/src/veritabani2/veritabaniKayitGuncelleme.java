/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class veritabaniKayitGuncelleme {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        dbHelper dbhelper = new dbHelper();
        PreparedStatement statement = null;
        
        try{
            connection = dbhelper.getConnection();
            String sqlGuncelle = "UPDATE personel SET idPersonel=3 WHERE idPersonel=4";
            statement = connection.prepareStatement(sqlGuncelle);
            statement.executeUpdate();
            System.out.println("Kayit basariyla guncellendi.");
        }catch(SQLException ex){
            System.out.println("Bir hata olustu. " + ex);
        }
        
    }
}
