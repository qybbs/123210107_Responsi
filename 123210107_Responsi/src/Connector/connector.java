/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class connector {
    static Connection conn;
    
    public static Connection connector() {
        if (conn == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("movie_db");
            data.setUser("root");
            data.setPassword("");
            
            try {
                conn = data.getConnection();
                System.out.println("Koneksi berhasil!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Koneksi gagal!");
            }
        }
        return conn;
    }
}
