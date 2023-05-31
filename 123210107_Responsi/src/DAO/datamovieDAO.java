/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAOImplements.datamovieimplements;
import Model.*;
import java.util.List;
import java.sql.*;
import Connector.connector;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Lab Informatika
 */
public class datamovieDAO implements datamovieimplements {
    Connection conn;
    final String insert = "INSERT INTO movie VALUES(?,?,?,?,?);";
    final String update = "UPDATE movie SET judul=?, alur=?, penokohan=?, akting=?, nilai=? WHERE judul=?;";
    final String delete = "DELETE FROM movie WHERE judul=?;";
    final String select = "SELECT * FROM movie;";
    
    public datamovieDAO() {
        conn = connector.connector();
    }
    
    @Override
    public void insert(datamovie dm) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, dm.getJudul());
            st.setDouble(2, dm.getAlur());
            st.setDouble(3, dm.getPenokohan());
            st.setDouble(4, dm.getAkting());
            st.setDouble(5, dm.getNilai());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datamovie dm, String j) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, dm.getJudul());
            st.setDouble(2, dm.getAlur());
            st.setDouble(3, dm.getPenokohan());
            st.setDouble(4, dm.getAkting());
            st.setDouble(5, dm.getNilai());
            st.setString(6, j);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Update! Coba pilih kembali filmnya!");
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String judul) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(delete);
            st.setString(1, judul);
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datamovie> getAll() {
        List<datamovie> dm = null;
        try {
            dm = new ArrayList<datamovie>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                datamovie m = new datamovie();
                m.setJudul(rs.getString("judul"));
                m.setAlur(rs.getDouble("alur"));
                m.setPenokohan(rs.getDouble("penokohan"));
                m.setAkting(rs.getDouble("akting"));
                m.setNilai(rs.getDouble("nilai"));
                dm.add(m);
            }
        } catch (SQLException ex) {
         ex.printStackTrace();
        }
        return dm;
    }
    
}
