/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics.upjs.sk.paz1c.skladnik.gui;

import Factory.ObjectFactory;
import dao.MaterialDao;
import dao.PouzivatelDao;
import dao.SkladDao;
import ics.upjs.sk.paz1c.skladnik.entity.Material;
import ics.upjs.sk.paz1c.skladnik.entity.Pouzivatel;
import ics.upjs.sk.paz1c.skladnik.entity.Prijemka;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Daniel
 */
public class VyhliadavanieMaterialScreen extends javax.swing.JFrame {
DefaultTableModel tableModel; 
private PouzivatelDao pouzivatelDao = ObjectFactory.INSTANCE.getPouzivatelDao();
private MaterialDao materialDao = ObjectFactory.INSTANCE.getMaterialDao();
private SkladDao skladDao = ObjectFactory.INSTANCE.getSkladDao();
public static VytvorPrijemkuScreen prijemkaP;
public static VytvorVydajkuScreen vydajkaP;
public static String uzivatel;
public static int cislo;
public static String id;

    /**
     * Creates new form VyhliadavanieMaterialScreen
     */
    public VyhliadavanieMaterialScreen(VytvorPrijemkuScreen prijemka,VytvorVydajkuScreen vydajka,int cislo) {
       if(cislo ==1){
           prijemkaP = prijemka;
       }
       if(cislo ==2){
           vydajkaP =vydajka;
       }
     
        initComponents();
     
    }
private void nastavModelMaterial(){
          String[] columns = {"id","nazov","cena","stav","id_sklad"};
          DefaultTableModel model = new DefaultTableModel(columns,0){
          @Override
          public boolean isCellEditable(int row, int column){
          return false;
          }
          
          };  
          
            mainTable.setModel(model ); 
       
      }
  private void naplnTabulkuMaterial(DefaultTableModel model, List<Material> materials){
          
        for(Material material : materials){
      model.addRow(new Object[]{material.getId(),material.getNazov(),new DecimalFormat("##.##").format(material.getCena()),material.getStav(),material.getId_sklad()});
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uzivatelLabel = new javax.swing.JLabel();
        NazovTextField1 = new javax.swing.JTextField();
        NázovMaterialuLabel1 = new javax.swing.JLabel();
        jHladajButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSpatButton2 = new javax.swing.JButton();
        jPotvrditButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        IDLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jZobrazVšetkyButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uzivatelLabel.setText("uzivatel");

        NázovMaterialuLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NázovMaterialuLabel1.setText("Názov :");

        jHladajButton1.setBackground(new java.awt.Color(0, 102, 0));
        jHladajButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jHladajButton1.setText("Hladaj");
        jHladajButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHladajButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jSpatButton2.setBackground(new java.awt.Color(0, 102, 0));
        jSpatButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSpatButton2.setText("Späť");
        jSpatButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpatButton2ActionPerformed(evt);
            }
        });

        jPotvrditButton3.setBackground(new java.awt.Color(0, 102, 0));
        jPotvrditButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPotvrditButton3.setText("Potvrdiť");
        jPotvrditButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPotvrditButton3ActionPerformed(evt);
            }
        });

        mainTable.setBackground(new java.awt.Color(0, 204, 0));
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nazov", "Stav", "Cena", "Id_Skladu"
            }
        ));
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Vybraté id:");

        IDLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        jZobrazVšetkyButton1.setBackground(new java.awt.Color(0, 102, 0));
        jZobrazVšetkyButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jZobrazVšetkyButton1.setText("Zobraz všetky");
        jZobrazVšetkyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZobrazVšetkyButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpatButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jPotvrditButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(NázovMaterialuLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NazovTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jHladajButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jZobrazVšetkyButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uzivatelLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(uzivatelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHladajButton1)
                    .addComponent(NazovTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NázovMaterialuLabel1)
                    .addComponent(jZobrazVšetkyButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(IDLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpatButton2)
                        .addComponent(jPotvrditButton3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpatButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpatButton2ActionPerformed
       if(jLabel3.getText()=="Prijemka"){
       
     prijemkaP.setVisible(true);
     this.setVisible(false);
     dispose();
          
       }
       if(jLabel3.getText()=="Vydajka"){
           vydajkaP.setVisible(true);
           this.setVisible(false);
           dispose();
        
       }
    }//GEN-LAST:event_jSpatButton2ActionPerformed

    private void jPotvrditButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPotvrditButton3ActionPerformed
        
        if(jLabel3.getText()=="Id"){
            JOptionPane.showMessageDialog(null, "Vyberte material");
        }else{
        if(jLabel3.getText()=="Prijemka"){
          id = IDLabel2.getText();
          prijemkaP.idMaterualuTextField.setText(id);
          prijemkaP.setVisible(true);
         this.setVisible(false);
           dispose();
       }
       if(jLabel3.getText()=="Vydajka"){
          id= IDLabel2.getText();
          vydajkaP.idMaterualuTextField.setText(id);
          vydajkaP.setVisible(true);
           this.setVisible(false);
           dispose();
           
       }
    }//GEN-LAST:event_jPotvrditButton3ActionPerformed
    }
    private void jZobrazVšetkyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZobrazVšetkyButton1ActionPerformed
      nastavModelMaterial();
        tableModel = (DefaultTableModel) mainTable.getModel();         
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        Pouzivatel aktPouz = pouzivatelDao.dajPouzivatela(uzivatelLabel.getText());
        long id = aktPouz.getId_sklad();
        naplnTabulkuMaterial(tableModel, materialDao.getAllBySkladId(id));
    }//GEN-LAST:event_jZobrazVšetkyButton1ActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
        int row = mainTable.getSelectedRow();
        TableModel model = mainTable.getModel();
        long id = (Long) model.getValueAt(row, 0);
        IDLabel2.setText(Long.toString(id));
    }//GEN-LAST:event_mainTableMouseClicked

    private void jHladajButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHladajButton1ActionPerformed
       
        nastavModelMaterial();
        tableModel = (DefaultTableModel) mainTable.getModel();         
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        String nazovMaterialu = NazovTextField1.getText();
        Pouzivatel aktPouz = pouzivatelDao.dajPouzivatela(uzivatelLabel.getText());
        long id = aktPouz.getId_sklad();
        List<Material> vsetky = materialDao.getAllBySkladId(id);
        List<Material> najdeny = new ArrayList<>();
        for (Material material : vsetky) {
            if(material.getNazov().equals(nazovMaterialu)){
                najdeny.add(material);
            }
            
        }
        
        naplnTabulkuMaterial(tableModel, najdeny);
        
    }//GEN-LAST:event_jHladajButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VyhliadavanieMaterialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VyhliadavanieMaterialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VyhliadavanieMaterialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VyhliadavanieMaterialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VyhliadavanieMaterialScreen(prijemkaP,vydajkaP,cislo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IDLabel2;
    private javax.swing.JTextField NazovTextField1;
    private javax.swing.JLabel NázovMaterialuLabel1;
    private javax.swing.JButton jHladajButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JButton jPotvrditButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jSpatButton2;
    private javax.swing.JButton jZobrazVšetkyButton1;
    private javax.swing.JTable mainTable;
    public javax.swing.JLabel uzivatelLabel;
    // End of variables declaration//GEN-END:variables
}
