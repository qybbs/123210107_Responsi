/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class modeltabeldatamovie extends AbstractTableModel {
    List<datamovie> dm;
    public modeltabeldatamovie(List<datamovie> dm) {
        this.dm = dm;
    }

    @Override
    public int getRowCount() {
        return dm.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "Judul";
            case 1 :
                return "Alur";
            case 2 :
                return "Penokohan";
            case 3 :
                return "Akting";
            case 4 :
                return "Nilai";
            default :
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int column) {
        switch (column) {
            case 0 :
                return dm.get(rowIndex).getJudul();
            case 1 :
                return dm.get(rowIndex).getAlur();
            case 2 :
                return dm.get(rowIndex).getPenokohan();
            case 3 :
                return dm.get(rowIndex).getAkting();
            case 4 :
                return dm.get(rowIndex).getNilai();
            default :
                return null;
        }
    }
    
}
