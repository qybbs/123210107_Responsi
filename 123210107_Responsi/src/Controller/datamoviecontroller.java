/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.List;
import DAO.datamovieDAO;
import DAOImplements.datamovieimplements;
import Model.*;
import View.ViewMovie;

/**
 *
 * @author Lab Informatika
 */
public class datamoviecontroller {
    ViewMovie frame;
    datamovieimplements impldm;
    List<datamovie> dm;
    public datamoviecontroller(ViewMovie frame) {
        this.frame = frame;
        impldm = new datamovieDAO();
        dm = impldm.getAll();
    }
    
    public void isiTabel() {
        dm = impldm.getAll();
        modeltabeldatamovie mtmovie = new modeltabeldatamovie(dm);
        frame.getTabelMovie().setModel(mtmovie);               
    }
    
    public void insert() {
        datamovie m = new datamovie();
        m.setJudul(frame.getTfJudul().getText());
        m.setAlur(Double.parseDouble(frame.getTfAlur().getText()));
        m.setPenokohan(Double.parseDouble(frame.getTfPenokohan().getText()));
        m.setAkting(Double.parseDouble(frame.getTfAkting().getText()));
        Double nilai = (m.getAkting()+m.getAlur()+m.getPenokohan())/3;
        m.setNilai(nilai);
        impldm.insert(m);
    }
    
    public void update(String j) {
        datamovie m = new datamovie();
        String judul = j;
        m.setJudul(frame.getTfJudul().getText());
        m.setAlur(Double.parseDouble(frame.getTfAlur().getText()));
        m.setPenokohan(Double.parseDouble(frame.getTfPenokohan().getText()));
        m.setAkting(Double.parseDouble(frame.getTfAkting().getText()));
        Double nilai = (m.getAkting()+m.getAlur()+m.getPenokohan())/3;
        m.setNilai(nilai);
        impldm.update(m, j);
    }
    
    public void delete() {
        String judul = frame.getTfJudul().getText();
        impldm.delete(judul);
    }
    
    public void clear() {
        frame.getTfJudul().setText("");
        frame.getTfAlur().setText("");
        frame.getTfPenokohan().setText("");
        frame.getTfAkting().setText("");
    }
}
