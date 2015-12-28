/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.view.customer;

import com.d2s2.spade.controllers.CustomerController;
import com.d2s2.spade.models.Customer;
import com.d2s2.spade.models.CustomerTelephone;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Heshan Sandamal
 */
public class AddCustomerForm extends javax.swing.JDialog {

    /**
     * Creates new form AddCustomerForm
     */
    public AddCustomerForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(addCustomerButton)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(addCustomerButton)
                .addGap(127, 127, 127))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        try {
            boolean addCustomerToDB = addCustomerToDB();
            if(addCustomerToDB){
                JOptionPane.showMessageDialog(this, "Added Successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Faild to add.");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to add due to "+ex.getMessage());
        }
        
    }//GEN-LAST:event_addCustomerButtonActionPerformed

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCustomerForm dialog = new AddCustomerForm(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
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
        ArrayList<CustomerTelephone> lt=new ArrayList<>();
        lt.add(new CustomerTelephone("C-0002","02154"));
        lt.add(new CustomerTelephone("C-0002","022254"));
        Customer customer=new Customer("C-0002","heshan","Bandaragama", lt);
        
        return CustomerController.addCustomer(customer);
    }
    
    
    
    //----------------------------------------------------------------------------------------
}
