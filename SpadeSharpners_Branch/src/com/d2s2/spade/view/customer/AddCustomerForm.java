/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.view.customer;

import com.d2s2.spade.controllers.CustomerController;
import com.d2s2.spade.models.Customer;
import com.d2s2.spade.models.CustomerTelephone;
import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Heshan Sandamal
 */
public class AddCustomerForm extends javax.swing.JDialog {

    String name;
    String address;
    String phoneNo;
    String id;
    private JTextField tfield;
    //private Container phncont;
    private int count;
    private String nameTField;
    private ArrayList<JTextField> extratextboxArray;
    private int extranoY;
    private JScrollPane phoneScrolPane;

    /**
     * Creates new form AddCustomerForm
     */
    public AddCustomerForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        name = null;
        address = null;
        phoneNo = null;
        id = null;
        nameTField = "extrano";
        count = 0;
        extranoY = 40;
        extratextboxArray = new ArrayList<JTextField>();
        removeExtraPhoneTextboxButton.setEnabled(false);
        removeExtraPhoneTextboxButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CustomerId = new javax.swing.JTextField();
        AddanotherPhoneButton = new javax.swing.JButton();
        removeExtraPhoneTextboxButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ADD NEW CUSTOMER");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Phone No");

        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });

        AddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextActionPerformed(evt);
            }
        });

        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer ID");

        CustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdActionPerformed(evt);
            }
        });

        AddanotherPhoneButton.setText("+");
        AddanotherPhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddanotherPhoneButtonActionPerformed(evt);
            }
        });

        removeExtraPhoneTextboxButton.setText("-");
        removeExtraPhoneTextboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeExtraPhoneTextboxButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddanotherPhoneButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removeExtraPhoneTextboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(AddressText, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(NameText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addCustomerButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddanotherPhoneButton)
                    .addComponent(removeExtraPhoneTextboxButton))
                .addGap(18, 18, 18)
                .addComponent(addCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        name = NameText.getText();
        address = AddressText.getText();
        phoneNo = PhoneText.getText();
        /*if (NameText.getText() == null || AddressText.getText() == null || PhoneText.getText() == null) {

            JOptionPane.showMessageDialog(this, "Please Insert a Customer Name, PhoneNo and Address");
        }*/
        if (name.isEmpty() || address.isEmpty() || phoneNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Insert a Customer Name, PhoneNo and Address");
        } else {
            addCustomer();
        }

    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void addCustomer() {
        try {

            boolean addCustomerToDB = addCustomerToDB();
            if (addCustomerToDB) {
                JOptionPane.showMessageDialog(this, "Added Successfully");
                NameText.setText("");
                AddressText.setText("");
                PhoneText.setText("");
                CustomerId.setText("");
                
            } else {
                JOptionPane.showMessageDialog(this, "Faild to add.");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to add due to " + ex.getMessage());
        }
    }

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
        this.phoneNo = PhoneText.getText();
    }//GEN-LAST:event_PhoneTextActionPerformed


    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
        this.name = NameText.getText();
    }//GEN-LAST:event_NameTextActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
        this.address = AddressText.getText();
    }//GEN-LAST:event_AddressTextActionPerformed

    private void CustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdActionPerformed
        // TODO add your handling code here:
        this.id = CustomerId.getText();
    }//GEN-LAST:event_CustomerIdActionPerformed

    private void AddanotherPhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddanotherPhoneButtonActionPerformed
        // TODO add your handling code here:
        addPhoneTextBox();
    }//GEN-LAST:event_AddanotherPhoneButtonActionPerformed

    private void removeExtraPhoneTextboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeExtraPhoneTextboxButtonActionPerformed
        // TODO add your handling code here:
        removeExtraPhno();
    }//GEN-LAST:event_removeExtraPhoneTextboxButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddanotherPhoneButton;
    private javax.swing.JTextField AddressText;
    private javax.swing.JTextField CustomerId;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton removeExtraPhoneTextboxButton;
    // End of variables declaration//GEN-END:variables

    //----------------------------------------------------------------------
    //methods of contructor
    //--------------------------------------------------------------------
    //----------------------------------------------------------------------
    //validation of elemets
    //--------------------------------------------------------------------
    //-------------------------------------------------------------------------------------
    //methods calls for controllers
    private boolean addCustomerToDB() throws ClassNotFoundException, SQLException {
        //fetch details from view
        ArrayList<CustomerTelephone> lt = new ArrayList<>();
        lt.add(new CustomerTelephone(CustomerId.getText(), PhoneText.getText()));
        for (int i = 0; i < count; i++) {
            lt.add(new CustomerTelephone(CustomerId.getText(), extratextboxArray.get(i).getText()));
        }
        Customer customer = new Customer(CustomerId.getText(), NameText.getText(), AddressText.getText(), lt);

        return CustomerController.addCustomer(customer);
    }

    private void addPhoneTextBox() {
        tfield = new JTextField();
        tfield.setName(nameTField + count);

        extratextboxArray.add(tfield);
        if (count >= 1) {
            extranoY += 40;
        }

        if (count >= 3) {
            AddanotherPhoneButton.setEnabled(false);
        }

        count++;
        tfield.setBounds(PhoneText.getX(), PhoneText.getY() + extranoY, PhoneText.getWidth(), PhoneText.getHeight());
        add(tfield);

        revalidate();
        repaint();
        pack();
        removeExtraPhoneTextboxButton.setVisible(true);
        removeExtraPhoneTextboxButton.setEnabled(true);
        System.out.println(nameTField + count);

    }

    private void removeExtraPhno() {

        count--;
        if (count == 0) {
            removeExtraPhoneTextboxButton.setVisible(false);
            removeExtraPhoneTextboxButton.setEnabled(false);
            extranoY += 40;
        }

        extratextboxArray.get(count).setVisible(false);
        extratextboxArray.get(count).setEnabled(false);

        remove(extratextboxArray.get(count));
        extratextboxArray.remove(extratextboxArray.size() - 1);

        extranoY -= 40;

        if (count < 4) {
            AddanotherPhoneButton.setEnabled(true);
        }
    }

}
