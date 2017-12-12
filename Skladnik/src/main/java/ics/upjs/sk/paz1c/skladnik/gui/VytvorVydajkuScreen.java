/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics.upjs.sk.paz1c.skladnik.gui;

import Factory.ObjectFactory;
import dao.MaterialDao;
import dao.MysqlPrijemkaDao;
import dao.PohybMaterialuDao;
import dao.PrijemkaDao;
import dao.VydajkaDao;
import ics.upjs.sk.paz1c.skladnik.entity.PohybMaterialu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcel
 */
public class VytvorVydajkuScreen extends javax.swing.JFrame {
    
       VydajkaDao vydajkaDao = ObjectFactory.INSTANCE.getVydajkaDao();
       PohybMaterialuDao pohybMaterialuDao = ObjectFactory.INSTANCE.getPohybMaterialuDao();
       MaterialDao materialDao = ObjectFactory.INSTANCE.getMaterialDao();
       public int idVydajky =vydajkaDao.getLastId();
     
    /**
     * Creates new form VytvorPrijemkuScreen
     */
    public VytvorVydajkuScreen() {
        initComponents();       
        idTextField.setText(idVydajky+"");
        
        System.out.println(idVydajky);
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        pocetLabel = new javax.swing.JLabel();
        idMaterialuLabel = new javax.swing.JLabel();
        idMaterualuTextField = new javax.swing.JTextField();
        pocetTextField = new javax.swing.JTextField();
        cenaLabel = new javax.swing.JLabel();
        cenaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialTable = new javax.swing.JTable();
        potvrdVydajkuButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        pridajMaterialuButton = new javax.swing.JButton();
        vymazPoliaButton = new javax.swing.JButton();
        cenaSpoluTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel.setText("ID:");

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pocetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pocetLabel.setText("Pocet:");

        idMaterialuLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idMaterialuLabel.setText("ID materialu:");

        cenaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cenaLabel.setText("Cena:");

        materialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID materialu", "Nazov materialu", "Cena", "Pocet"
            }
        ));
        jScrollPane1.setViewportView(materialTable);

        potvrdVydajkuButton.setText("Potvrdit");
        potvrdVydajkuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrdVydajkuButtonActionPerformed(evt);
            }
        });

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        pridajMaterialuButton.setText("Pridaj material");
        pridajMaterialuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajMaterialuButtonActionPerformed(evt);
            }
        });

        vymazPoliaButton.setText("Vymaz polia");

        cenaSpoluTextField.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cena spolu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cenaLabel)
                            .addComponent(pocetLabel)
                            .addComponent(idMaterialuLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cenaTextField)
                            .addComponent(idMaterualuTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pocetTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pridajMaterialuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vymazPoliaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(idLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(potvrdVydajkuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(stornoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5)
                                    .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cenaSpoluTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cenaSpoluTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(potvrdVydajkuButton)
                        .addGap(18, 18, 18)
                        .addComponent(stornoButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idMaterualuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMaterialuLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pocetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pocetLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cenaLabel)
                    .addComponent(cenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridajMaterialuButton)
                    .addComponent(vymazPoliaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridajMaterialuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajMaterialuButtonActionPerformed
        int idMaterialu = Integer.parseInt(idMaterualuTextField.getText());
        int pocet = Integer.parseInt(pocetTextField.getText());
        int idVydajky = this.idVydajky;
        int cena = Integer.parseInt(cenaTextField.getText());
        PohybMaterialu pohybMaterialu = new PohybMaterialu();
        pohybMaterialu.setId_materialu(idMaterialu);
        pohybMaterialu.setPocet(pocet);
        pohybMaterialu.setVydajka_id(idVydajky);
        pohybMaterialu.setCena(cena);
       
        pohybMaterialuDao.pridajPohybMaterialuVydaj(pohybMaterialu);        
        DefaultTableModel model= (DefaultTableModel) materialTable.getModel();        
        model.addRow(new Object[]{idMaterialu,materialDao.dajMaterialById(idMaterialu).getNazov(),cena,pocet});
        cenaSpoluTextField.setText(sumaSpolu(model,2,3)+"");
        
    }//GEN-LAST:event_pridajMaterialuButtonActionPerformed

    private void potvrdVydajkuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrdVydajkuButtonActionPerformed
        vydajkaDao.upravCenu(Double.parseDouble(cenaSpoluTextField.getText()), idVydajky);
        MainScreen main = new MainScreen();                       
        main.setVisible(true);
        this.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_potvrdVydajkuButtonActionPerformed

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_stornoButtonActionPerformed

    public int sumaSpolu(DefaultTableModel mdl, int columnCena, int columnPocet) {
    int total = 0;
    // iterate over all columns
    for (int i = 0 ; i < mdl.getRowCount() ; i++) {
        // null or not Integer will throw exception
        total += (Integer) mdl.getValueAt(i, columnCena) * (Integer) mdl.getValueAt(i, columnPocet);
    }
    return total;
}
    
    
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
            java.util.logging.Logger.getLogger(VytvorVydajkuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VytvorVydajkuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VytvorVydajkuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VytvorVydajkuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VytvorVydajkuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cenaLabel;
    private javax.swing.JTextField cenaSpoluTextField;
    private javax.swing.JTextField cenaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idMaterialuLabel;
    private javax.swing.JTextField idMaterualuTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable materialTable;
    private javax.swing.JLabel pocetLabel;
    private javax.swing.JTextField pocetTextField;
    private javax.swing.JButton potvrdVydajkuButton;
    private javax.swing.JButton pridajMaterialuButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JButton vymazPoliaButton;
    // End of variables declaration//GEN-END:variables
}
