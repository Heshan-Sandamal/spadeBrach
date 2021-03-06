/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.view.supplier;

import com.d2s2.spade.controllers.supplier.SupplierController;
import com.d2s2.spade.controllers.supplier.SupplierUpdateController;
import com.d2s2.spade.models.Supplier;
import com.d2s2.spade.models.SupplierBranch;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dimuth Tharaka
 */
public class UpdateSupplier extends javax.swing.JFrame {
    

    /**
     * Creates new form UpdateSupplier
     */
    public UpdateSupplier(Supplier supplier) throws ClassNotFoundException, SQLException {
        initComponents();
        this.supplierBranchList=supplier.getBranchContactList();
        
        this.supplier=supplier;
        
        this.IdField.setText(supplier.getSupplierId());
        this.NameField.setText(supplier.getName());
        this.EmailField.setText(supplier.getEmail());
        
        createContactModel();
        contactModel=getTableModel(contactModel,supplierBranchList);
    }
     public void createContactModel(){
        Object[] columns={"Branch Name","Address","Contact Name","Contact No"};
        contactModel.setColumnIdentifiers(columns);
        setContactModel(contactModel);
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        IdField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telephoneNumberField = new javax.swing.JTextField();
        contactNameField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        branchAddressField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactDetailTable = new org.jdesktop.swingx.JXTable();
        addToTableButton = new javax.swing.JButton();
        removeFromTableButton = new javax.swing.JButton();
        editSelectedRowButton = new javax.swing.JButton();
        updateSupplierButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Update Supplier");

        jLabel2.setText("Supplier ID");

        jLabel3.setText("Name");

        jLabel5.setText("Email");

        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Branch Information"));
        jPanel1.setToolTipText("");
        jPanel1.setName("Branch Information"); // NOI18N

        jLabel7.setText("Telephone Number");

        jLabel6.setText("Contact Name");

        contactNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNameFieldActionPerformed(evt);
            }
        });

        branchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Branch Name");

        jLabel10.setText("Branch Address");

        branchAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchAddressFieldActionPerformed(evt);
            }
        });

        contactDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch", "Telephone Number", "Contact Name", "Address"
            }
        ));
        jScrollPane2.setViewportView(contactDetailTable);

        addToTableButton.setText("Add to Table");
        addToTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToTableButtonActionPerformed(evt);
            }
        });

        removeFromTableButton.setText("Remove From Table");
        removeFromTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromTableButtonActionPerformed(evt);
            }
        });

        editSelectedRowButton.setText("Edit Selected row");
        editSelectedRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedRowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(addToTableButton)
                                    .addGap(36, 36, 36))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(branchAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(43, 43, 43))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telephoneNumberField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(contactNameField, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editSelectedRowButton)
                        .addGap(47, 47, 47)
                        .addComponent(removeFromTableButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(branchAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addComponent(addToTableButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeFromTableButton))
                    .addComponent(editSelectedRowButton)))
        );

        updateSupplierButton.setText("Update Supplier");
        updateSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupplierButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdField)
                                    .addComponent(NameField)
                                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(updateSupplierButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateSupplierButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed

    }//GEN-LAST:event_IdFieldActionPerformed

    private void contactNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNameFieldActionPerformed

    private void branchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchFieldActionPerformed

    private void branchAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchAddressFieldActionPerformed

    private void addToTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToTableButtonActionPerformed
        row[0]=branchField.getText();
        row[1]=branchAddressField.getText();
        row[2]=contactNameField.getText();
        row[3]=telephoneNumberField.getText();
        
        if(row[0].equals("") || row[1].equals("") ||row[2].equals("") || row[3].equals("")){
            JOptionPane.showMessageDialog(this, "Please fill all details to add to table");
        }
        else{

            contactModel.addRow(row);
            clearBranchInputFields();
            //setContactModel(contactModel);
        }

    }//GEN-LAST:event_addToTableButtonActionPerformed

    private void removeFromTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromTableButtonActionPerformed
        int selectedRow =contactDetailTable.getSelectedRow();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_removeFromTableButtonActionPerformed

    private void editSelectedRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedRowButtonActionPerformed
        int selectedRow =contactDetailTable.getSelectedRow();
        branchField.setText((String) contactDetailTable.getModel().getValueAt(selectedRow, 0));
        branchAddressField.setText((String) contactDetailTable.getModel().getValueAt(selectedRow, 1));
        contactNameField.setText((String) contactDetailTable.getModel().getValueAt(selectedRow, 2));
        telephoneNumberField.setText((String) contactDetailTable.getModel().getValueAt(selectedRow, 3));
        contactModel.removeRow(selectedRow);
    }//GEN-LAST:event_editSelectedRowButtonActionPerformed

    private void updateSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupplierButtonActionPerformed
        try {
            Supplier newSupplier = new Supplier();
            newSupplier.setSupplierId(supplier.getSupplierId());
            newSupplier.setName(NameField.getText());
            newSupplier.setEmail(EmailField.getText());
            ArrayList<SupplierBranch> supplierBranchListNew = new ArrayList<SupplierBranch>();
            for (int count = 0; count < contactModel.getRowCount(); count++){
                SupplierBranch supplierBranch = new SupplierBranch();
                supplierBranch.setSupplierId(IdField.getText());
                supplierBranch.setBranchName((String) contactModel.getValueAt(count,0));
                supplierBranch.setAddress((String) contactModel.getValueAt(count,1));
                supplierBranch.setContactName((String) contactModel.getValueAt(count,2));
                supplierBranch.setTelNo((String) contactModel.getValueAt(count,3));
                supplierBranchListNew.add(supplierBranch);
                
            }
            newSupplier.setBranchContactList(supplierBranchListNew);
            SupplierUpdateController.updateSupplier(supplier,newSupplier);
            JOptionPane.showMessageDialog(this, "Update Supplier Successfull");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateSupplier.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Update Supplier Failed");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateSupplier.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Update Supplier Failed");
        }
        
    }//GEN-LAST:event_updateSupplierButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateSupplier(supplier).setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UpdateSupplier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField IdField;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton addToTableButton;
    private javax.swing.JTextField branchAddressField;
    private javax.swing.JTextField branchField;
    private org.jdesktop.swingx.JXTable contactDetailTable;
    private javax.swing.JTextField contactNameField;
    private javax.swing.JButton editSelectedRowButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeFromTableButton;
    private javax.swing.JTextField telephoneNumberField;
    private javax.swing.JButton updateSupplierButton;
    // End of variables declaration//GEN-END:variables
    private static Supplier supplier;
    private  DefaultTableModel contactModel= new DefaultTableModel();
    private Object row[]  = new Object[5];
    private DefaultTableModel model = new DefaultTableModel();
    private static ArrayList<SupplierBranch> supplierBranchList;
    private void clearBranchInputFields() {
        branchField.setText(null);
        branchAddressField.setText(null);
        contactNameField.setText(null);
        telephoneNumberField.setText(null);
        
    }
    
    
     private void setContactModel(DefaultTableModel newmodel){
        contactDetailTable.setModel(contactModel);

    }
     private DefaultTableModel getTableModel(DefaultTableModel model,ArrayList<SupplierBranch> supplierContactList) throws ClassNotFoundException, SQLException{
        
        for (SupplierBranch contact : supplierContactList) {
           
            
            contactModel.addRow(new Object[]{contact.getBranchName(),contact.getAddress(),contact.getContactName(),contact.getTelNo()});
            
        }
        return contactModel;
    }
    
}

