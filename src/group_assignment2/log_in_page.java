package group_assignment2;

import group_assignment2.Login_Page;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AVITA
 */
public class log_in_page extends javax.swing.JFrame {

    /**
     * Creates new form log_in_page
     */
    public log_in_page() {
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

        lbl_Login = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txtbox_username = new javax.swing.JTextField();
        txtbox_Password = new javax.swing.JPasswordField();
        btn_Clear = new javax.swing.JButton();
        btn_Confirm = new javax.swing.JButton();
        cmb_role = new javax.swing.JComboBox<>();
        lbl_role = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Login.setText("SIGMA SDN BHD");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_username.setText("Username:");

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_password.setText("Password:");

        btn_Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Confirm.setText("Login ");
        btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmActionPerformed(evt);
            }
        });

        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales Manager", "Purchase Manager", "Administrator" }));

        lbl_role.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_role.setText("Role:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Login Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_password)
                                        .addComponent(lbl_username))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbox_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbox_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_role)
                                    .addGap(30, 30, 30)
                                    .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btn_Confirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Clear)))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Login)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)))
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_Login)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_role))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbox_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbox_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Confirm)
                    .addComponent(btn_Clear))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmActionPerformed
            String cmb_input_role = (String) cmb_role.getSelectedItem();
            String mod_input_role = cmb_input_role.toLowerCase().replace(" ", "_");
            String txtbox_input_username = txtbox_username.getText();
            String txtbox_input_password = txtbox_Password.getText();
            boolean loginAuth;
            
            if (txtbox_input_username.isEmpty() || txtbox_input_password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill in credential.", "Empty Field Detacted", JOptionPane.WARNING_MESSAGE);
            }else{
                Login_Page obj = new Login_Page(mod_input_role,txtbox_input_username,txtbox_input_password);
                loginAuth = obj.login_auth();
                if (loginAuth){
                    dispose();
                }
            }
    }//GEN-LAST:event_btn_ConfirmActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txtbox_username.setText("");
        txtbox_Password.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(log_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Confirm;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtbox_Password;
    private javax.swing.JTextField txtbox_username;
    // End of variables declaration//GEN-END:variables
}