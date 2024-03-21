/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani2;

/**
 *
 * @author Serdar
 */

//RESULTSET'TEN ÇEKİLEN VERİLER BU CLASS'TA ŞEKİL ALACAK

public class Personel {
    
    //Veritabanındaki sütun adlarını buraya özellik olarak çekiyoruz
    public int id;
    public String ad;
    public String soyad;
    public String mail;

    public Personel(int id, String ad, String soyad, String mail) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.mail = mail;
    }
    
}
