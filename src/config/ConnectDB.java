/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author adam x rezaa
 */
public class ConnectDB {
    static Connection con;
    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myspp","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
            System.out.println(e);
            System.exit(0);
        }
        return con;
    }
}
