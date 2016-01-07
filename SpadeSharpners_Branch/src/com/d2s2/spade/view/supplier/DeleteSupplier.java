/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.view.supplier;

import com.d2s2.spade.controllers.supplier.SupplierController;
import com.d2s2.spade.models.Supplier;
import com.d2s2.spade.models.SupplierTelephone;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dimuth Tharaka
 */
public class DeleteSupplier extends javax.swing.JDialog {

    /**
     * Creates new form DeleteSupplier
     */
    public DeleteSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         try {
            createModel();
            model=addSuppliersToTable(model);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTableSorter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        keywordSearchField = new org.jdesktop.swingx.JXSearchField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierDetailsTable = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iDField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Delete Supplier");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Panel"));

        keywordSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keywordSearchFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Type Keyword Here");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keywordSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keywordSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        supplierDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Address", "Email"
            }
        ));
        supplierDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supplierDetailsTable);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Supplier Details"));

        jLabel3.setText("Supplier ID");

        jLabel4.setText("Name");

        jLabel5.setText("Address");

        jLabel6.setText("Email");

        jButton1.setText("Delete Supplier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iDField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(nameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(emailField))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(iDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keywordSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keywordSearchFieldKeyReleased
        filterTableInkeywordSearch();
    }//GEN-LAST:event_keywordSearchFieldKeyReleased

    private void supplierDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDetailsTableMouseClicked
        int clickedRow =supplierDetailsTable.rowAtPoint(evt.getPoint());
        String SupplierID=(String) supplierDetailsTable.getModel().getValueAt(clickedRow, 0);
        String name =(String) supplierDetailsTable.getModel().getValueAt(clickedRow, 1);
        String address =(String) supplierDetailsTable.getModel().getValueAt(clickedRow, 2);
        String email =(String) supplierDetailsTable.getModel().getValueAt(clickedRow, 3);
        iDField.setText(SupplierID);
        nameField.setText(name);
        addressField.setText(address);
        emailField.setText(email);
        iDField.setEditable(false);
        nameField.setEditable(false);
        addressField.setEditable(false);
        emailField.setEditable(false);
    }//GEN-LAST:event_supplierDetailsTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            removeFromDatabase(iDField.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeleteSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public  boolean removeFromDatabase(String ID) throws ClassNotFoundException, SQLException{
    
        boolean removed = false;
        SupplierController.removeSupplier(ID);
        /*
        try {
            added = SupplierController.addSupplier(supplier,supplierTelephoneList);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        } catch (SQLException ex) {
            System.out.println("SQL Exception"+ ex);
        }
        return added;
        */
        return true;
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
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteSupplier dialog = new DeleteSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private DefaultTableModel addSuppliersToTable(DefaultTableModel newModel) throws ClassNotFoundException, SQLException{
        ArrayList<Supplier> supplierList=SupplierController.getAllSuppliers();
        
      
        
        for (Supplier spl : supplierList) {
             System.out.println(spl.getSupplierId()+spl.getName()+spl.getAddress()+spl.getEmail());
             newModel.addRow(new Object[]{spl.getSupplierId(),spl.getName(),spl.getAddress(),spl.getEmail()});
        }
        return newModel;
    }
    public void createModel(){
        Object[] columns={"ID","Name", "Adress", "Email"};
        model.setColumnIdentifiers(columns);
        setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField iDField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXSearchField keywordSearchField;
    private javax.swing.JTextField nameField;
    private org.jdesktop.swingx.JXTable supplierDetailsTable;
    // End of variables declaration//GEN-END:variables
    private Object row[]  = new Object[4];
    private DefaultTableModel contactModel = new DefaultTableModel();
     private TableRowSorter<TableModel> sorter;
    private DefaultTableModel model = new DefaultTableModel();
    private void setModel(DefaultTableModel newmodel){
        supplierDetailsTable.setModel(model);

    }
     private DefaultTableModel getSpecificSupplierDetails(String ID, DefaultTableModel model) throws ClassNotFoundException, SQLException{
        ArrayList<SupplierTelephone> supplierContactList = SupplierController.getSupplierContactInfo(ID);
        for (SupplierTelephone contact : supplierContactList) {
            model.addRow(new Object[]{ID,contact.getContactName(),contact.getTelNo()});
            System.out.println("Contact Name="+ contact.getContactName()+contact.getTelNo());
        }
        return model;
    }
    private void filterTableInkeywordSearch() {
        String text = keywordSearchField.getText();

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(sorter.getRowFilter().regexFilter("^(?i)" + text));
        }
        
    }
    private void setTableSorter() {
        sorter = new TableRowSorter<>(supplierDetailsTable.getModel());
        supplierDetailsTable.setRowSorter(sorter);
    }
}

