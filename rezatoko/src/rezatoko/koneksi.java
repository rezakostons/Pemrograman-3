/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rezatoko;
import java.sql.*;
/**
 *
 * @author Mor
 */
public class koneksi {
    Connection conn = null;
    
    public koneksi(){
    }
    public Connection getkoneksi(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sepatu","root","");
            System.out.println ("Koneksi Berhasil");
        }
        catch(Exception w){
        System.out.println ("Koneksi Error");    
        }
        return conn;
    }   
}
