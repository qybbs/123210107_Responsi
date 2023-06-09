/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JTable;
import javax.swing.JTextField;
import Controller.datamoviecontroller;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class ViewMovie extends javax.swing.JFrame {

    /**
     * Creates new form ViewMovie
     */
    datamoviecontroller dc;
    String judulold = null;
    public ViewMovie() {
        initComponents();
        dc = new datamoviecontroller(this);
        dc.isiTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelMovie = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfJudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfAlur = new javax.swing.JTextField();
        tfPenokohan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAkting = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelMovie);

        jLabel1.setText("Judul");

        jLabel2.setText("Alur");

        jLabel3.setText("Penokohan");

        jLabel4.setText("Akting");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfJudul)
                    .addComponent(tfAlur)
                    .addComponent(tfPenokohan)
                    .addComponent(tfAkting)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnTambah)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAkting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(11, 11, 11)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (tfJudul.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada film terpilih!");
        } else {
            Double alur = Double.parseDouble(tfAlur.getText());
            Double penokohan = Double.parseDouble(tfPenokohan.getText());
            Double akting = Double.parseDouble(tfAkting.getText());
            if (alur > 5 || alur < 0 || penokohan > 5 || penokohan < 0 || akting > 5 || akting < 0) {
                JOptionPane.showMessageDialog(null, "Nilai Alur, Penokohan, dan Akting harus di antara 0-5!");
            } else {
                dc.update(judulold);
                dc.isiTabel();
                dc.clear();
                judulold = null;
            }
        }
                
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        Double alur = Double.parseDouble(tfAlur.getText());
        Double penokohan = Double.parseDouble(tfPenokohan.getText());
        Double akting = Double.parseDouble(tfAkting.getText());
        if (alur > 5 || alur < 0 || penokohan > 5 || penokohan < 0 || akting > 5 || akting < 0) {
            JOptionPane.showMessageDialog(null, "Nilai Alur, Penokohan, dan Akting harus di antara 0-5!");
        } else {
            dc.insert();
            dc.isiTabel();
            dc.clear();
            judulold = null;
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (tfJudul.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada film terpilih!");
        } else {
            dc.delete();
            dc.isiTabel();
            dc.clear();
            judulold = null;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        dc.clear();
        judulold = null;
    }//GEN-LAST:event_btnClearActionPerformed

    private void TabelMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMovieMouseClicked
        // TODO add your handling code here:
        int row = TabelMovie.getSelectedRow();
        tfJudul.setText(TabelMovie.getValueAt(row, 0).toString());
        tfAlur.setText(TabelMovie.getValueAt(row, 1).toString());
        tfPenokohan.setText(TabelMovie.getValueAt(row, 2).toString());
        tfAkting.setText(TabelMovie.getValueAt(row, 3).toString());
        judulold = TabelMovie.getValueAt(row, 0).toString();
    }//GEN-LAST:event_TabelMovieMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelMovie;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAkting;
    private javax.swing.JTextField tfAlur;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfPenokohan;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelMovie() {
        return TabelMovie;
    }

    public void setTabelMovie(JTable TabelMovie) {
        this.TabelMovie = TabelMovie;
    }

    public JTextField getTfAkting() {
        return tfAkting;
    }

    public void setTfAkting(JTextField tfAkting) {
        this.tfAkting = tfAkting;
    }

    public JTextField getTfAlur() {
        return tfAlur;
    }

    public void setTfAlur(JTextField tfAlur) {
        this.tfAlur = tfAlur;
    }

    public JTextField getTfJudul() {
        return tfJudul;
    }

    public void setTfJudul(JTextField tfJudul) {
        this.tfJudul = tfJudul;
    }

    public JTextField getTfPenokohan() {
        return tfPenokohan;
    }

    public void setTfPenokohan(JTextField tfPenokohan) {
        this.tfPenokohan = tfPenokohan;
    }


}
