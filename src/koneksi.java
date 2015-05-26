/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class koneksi {
    private String user, pass, url;
    public Connection con = null;
    
    public koneksi(){
        String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/tubesmks"; // sesuaikan dengan nama database anda
            String user = "root"; // user mysql anda
            String pass = ""; // passowrd mysql
 
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        } 
        
    }
    
}
