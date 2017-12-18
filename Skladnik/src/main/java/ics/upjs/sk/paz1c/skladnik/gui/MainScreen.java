/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics.upjs.sk.paz1c.skladnik.gui;

import Factory.ObjectFactory;
import dao.MaterialDao;
import dao.PouzivatelDao;
import dao.PrijemkaDao;
import dao.VydajkaDao;
import ics.upjs.sk.paz1c.skladnik.entity.Pouzivatel;
import ics.upjs.sk.paz1c.skladnik.entity.Prijemka;
import ics.upjs.sk.paz1c.skladnik.entity.Vydajka;
import ics.upjs.sk.paz1c.skladnik.entity.Material;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcel
 */
public class MainScreen extends javax.swing.JFrame {

    PrijemkaDao prijemkaDao = ObjectFactory.INSTANCE.getPrijemkadDao();
    PouzivatelDao pouzivatelDao =ObjectFactory.INSTANCE.getPouzivatelDao();
    VydajkaDao vydajkaDao = ObjectFactory.INSTANCE.getVydajkaDao();
    MaterialDao materialDao = ObjectFactory.INSTANCE.getMaterialDao();
    DefaultTableModel tableModel; 

    
    public MainScreen() {
        initComponents(); 
        tableModel = (DefaultTableModel) mainTable.getModel();           
        naplnTabulkuPrijmi(tableModel, prijemkaDao.getAll());
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ukazPrijmiButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        ukazMaterialButton = new javax.swing.JButton();
        ukazVydajebutton = new javax.swing.JButton();
        vytvorVydajkuButton = new javax.swing.JButton();
        jPridajKartuMaterialuButton5 = new javax.swing.JButton();
        vytvorPrijemkuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uzivatelLable = new javax.swing.JLabel();
        jVypisyButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        ukazPrijmiButton.setBackground(new java.awt.Color(0, 102, 0));
        ukazPrijmiButton.setText("Prijmy");
        ukazPrijmiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukazPrijmiButtonActionPerformed(evt);
            }
        });

        mainTable.setBackground(new java.awt.Color(0, 204, 0));
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "cena", "id_pouzivatela", "datum", "typ_pohybu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mainTable);

        ukazMaterialButton.setBackground(new java.awt.Color(0, 102, 0));
        ukazMaterialButton.setText("Material");
        ukazMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukazMaterialButtonActionPerformed(evt);
            }
        });

        ukazVydajebutton.setBackground(new java.awt.Color(0, 102, 0));
        ukazVydajebutton.setText("Vydaje");
        ukazVydajebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukazVydajebuttonActionPerformed(evt);
            }
        });

        vytvorVydajkuButton.setBackground(new java.awt.Color(0, 102, 0));
        vytvorVydajkuButton.setText("Vytvorit vydajku");
        vytvorVydajkuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vytvorVydajkuButtonActionPerformed(evt);
            }
        });

        jPridajKartuMaterialuButton5.setBackground(new java.awt.Color(0, 102, 0));
        jPridajKartuMaterialuButton5.setText("Pridat kartu materialu");
        jPridajKartuMaterialuButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPridajKartuMaterialuButton5ActionPerformed(evt);
            }
        });

        vytvorPrijemkuButton.setBackground(new java.awt.Color(0, 102, 0));
        vytvorPrijemkuButton.setText("Vytvorit prijemku");
        vytvorPrijemkuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vytvorPrijemkuButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Skladnik");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusTraversalPolicyProvider(true);

        uzivatelLable.setBackground(new java.awt.Color(0, 204, 0));
        uzivatelLable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uzivatelLable.setForeground(new java.awt.Color(0, 204, 0));
        uzivatelLable.setText("Uzivatel");

        jVypisyButton1.setBackground(new java.awt.Color(0, 102, 0));
        jVypisyButton1.setText("Vypisy");
        jVypisyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVypisyButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(uzivatelLable))
                                .addComponent(ukazVydajebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(ukazPrijmiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(ukazMaterialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jVypisyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vytvorPrijemkuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(vytvorVydajkuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPridajKartuMaterialuButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(247, 247, 247)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uzivatelLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ukazPrijmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ukazVydajebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ukazMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVypisyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vytvorPrijemkuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vytvorVydajkuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPridajKartuMaterialuButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //TO DO pouzivatel ktory je prihlaseny
    private void vytvorPrijemkuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vytvorPrijemkuButtonActionPerformed
      //  String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());       
        Pouzivatel pouzivatel = pouzivatelDao.dajPouzivatela(uzivatelLable.getText());
        Prijemka prijemka = new Prijemka();        
        prijemka.setId_pouzivatel(pouzivatel.getId());     
        prijemka.setDatum(new Date(System.currentTimeMillis()));
        prijemka.setTypPohybu(1L);
        prijemkaDao.pridajPrijemka(prijemka);       
        VytvorPrijemkuScreen vytvorPrijemkuScreen = new VytvorPrijemkuScreen();  
        vytvorPrijemkuScreen.uzivatelLabel.setText(this.uzivatelLable.getText());
        vytvorPrijemkuScreen.setVisible(true);
        this.setVisible(false);
       
       
        
      
        
    }//GEN-LAST:event_vytvorPrijemkuButtonActionPerformed

    private void vytvorVydajkuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vytvorVydajkuButtonActionPerformed
       //String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());       
        Pouzivatel pouzivatel = pouzivatelDao.dajPouzivatela(uzivatelLable.getText());
        Vydajka vydajka = new Vydajka();        
        vydajka.setId_pouzivatel(pouzivatel.getId());     
        vydajka.setDatum(new Date(System.currentTimeMillis()));  
        vydajka.setTyp_pohybu(2L);        
        vydajkaDao.pridajVydajku(vydajka);       
        VytvorVydajkuScreen vytvorVydajkuScreen = new VytvorVydajkuScreen();    
        vytvorVydajkuScreen.uzivatelLabel.setText(this.uzivatelLable.getText());
        vytvorVydajkuScreen.setVisible(true);
        this.setVisible(false);
     
       
    }//GEN-LAST:event_vytvorVydajkuButtonActionPerformed

    private void ukazPrijmiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukazPrijmiButtonActionPerformed
        nastavModelDefault();
        tableModel = (DefaultTableModel) mainTable.getModel(); 
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        naplnTabulkuPrijmi(tableModel, prijemkaDao.getAll());
    }//GEN-LAST:event_ukazPrijmiButtonActionPerformed

    private void ukazVydajebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukazVydajebuttonActionPerformed
        nastavModelDefault();
        tableModel = (DefaultTableModel) mainTable.getModel();         
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        naplnTabulkuVydaje(tableModel, vydajkaDao.getAll());
    }//GEN-LAST:event_ukazVydajebuttonActionPerformed

    private void ukazMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukazMaterialButtonActionPerformed
        nastavModelMaterial();
        tableModel = (DefaultTableModel) mainTable.getModel();         
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        naplnTabulkuMaterial(tableModel, materialDao.getAll());
    }//GEN-LAST:event_ukazMaterialButtonActionPerformed

    private void jPridajKartuMaterialuButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPridajKartuMaterialuButton5ActionPerformed
        PridajKartuMaterialuScreen PKMS = new PridajKartuMaterialuScreen();
        PKMS.uzivatelLabel.setText(this.uzivatelLable.getText());
        PKMS.setVisible(true);
        this.setVisible(false);
        //tu asi dispose netreba nie ? 
      //  dispose();
    }//GEN-LAST:event_jPridajKartuMaterialuButton5ActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
       if(evt.getClickCount()==2){
       int row = mainTable.getSelectedRow();      
       TableModel model = mainTable.getModel();
       String id = model.getValueAt(row, 0).toString();         
       String typPohybu = model.getValueAt(row, 4).toString(); 
       
       if(typPohybu.equals("1")){
       ZobrazPohybScreen zobrazPrijemkuScreen = new ZobrazPohybScreen();
       zobrazPrijemkuScreen.uzivatelLabel.setText(this.uzivatelLable.getText());
       zobrazPrijemkuScreen.idScreenTextField.setText(id);
       zobrazPrijemkuScreen.naplnTabulkuPrijmi();
       zobrazPrijemkuScreen.setVisible(true);
       this.setVisible(false);
       dispose();
       }

       
         if(typPohybu.equals("2")){
       ZobrazPohybScreen zobrazVydajkuScreen = new ZobrazPohybScreen();
       zobrazVydajkuScreen.uzivatelLabel.setText(this.uzivatelLable.getText());
       zobrazVydajkuScreen.idScreenTextField.setText(id);
       zobrazVydajkuScreen.naplnTabulkuVydaje();
       zobrazVydajkuScreen.setVisible(true);
       this.setVisible(false);
       dispose();
       }

       
       }
    }//GEN-LAST:event_mainTableMouseClicked

    private void jVypisyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVypisyButton1ActionPerformed
        VypisyScreen VS = new VypisyScreen();
        VS.uzivatelLabel.setText(this.uzivatelLable.getText());
        VS.setVisible(true);
       this.setVisible(false);
       dispose();
        
    }//GEN-LAST:event_jVypisyButton1ActionPerformed

     private void naplnTabulkuPrijmi(DefaultTableModel model, List<Prijemka> prijmi){
    for(Prijemka prijemka : prijmi){
       model.addRow(new Object[]{prijemka.getId(),prijemka.getCena(),prijemka.getId_pouzivatel(),prijemka.getDatum(),prijemka.getTypPohybu()});
    }
    }
    
 
   
    
    
      private void naplnTabulkuVydaje(DefaultTableModel model, List<Vydajka> vydajky){
    for(Vydajka vydajka : vydajky){
       model.addRow(new Object[]{vydajka.getId(),vydajka.getCena(),vydajka.getId_pouzivatel(),vydajka.getDatum(),vydajka.getTyp_pohybu()});
    }
    }
  
       private void naplnTabulkuMaterial(DefaultTableModel model, List<Material> materials){
          
        for(Material material : materials){
      model.addRow(new Object[]{material.getId(),material.getNazov(),material.getStav(),material.getCena(),material.getId_sklad()});
    }
    }
      
     
      private void nastavModelMaterial(){
          String[] columns = {"id","nazov","stav","cena","id_sklad"};
          DefaultTableModel model = new DefaultTableModel(columns,0){
          @Override
          public boolean isCellEditable(int row, int column){
          return false;
          }
          
          };  
          
            mainTable.setModel(model ); 
         
            

      }
      
      private void nastavModelDefault(){
          String[] columns = {"id","cena","id_pouzivatela","datum","typ_pohybu"};
            DefaultTableModel model = new DefaultTableModel(columns,0){
          @Override
          public boolean isCellEditable(int row, int column){
          return false;
          }
          
          };
            mainTable.setModel(model); 
            
           

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jPridajKartuMaterialuButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jVypisyButton1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton ukazMaterialButton;
    private javax.swing.JButton ukazPrijmiButton;
    private javax.swing.JButton ukazVydajebutton;
    public javax.swing.JLabel uzivatelLable;
    private javax.swing.JButton vytvorPrijemkuButton;
    private javax.swing.JButton vytvorVydajkuButton;
    // End of variables declaration//GEN-END:variables
}
