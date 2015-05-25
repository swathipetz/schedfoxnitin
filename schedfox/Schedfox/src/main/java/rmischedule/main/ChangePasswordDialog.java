/*
 * ChangePasswordDialog.java
 *
 * Created on November 28, 2005, 10:19 AM
 */

package rmischedule.main;
import schedfoxlib.model.util.Record_Set;
import rmischeduleserver.mysqlconnectivity.queries.util.*;
import rmischeduleserver.data_connection_types.*;
import rmischedule.data_connection.*;
import rmischedule.main.*;
import javax.swing.*;
/**
 *
 * @author  Ira Juneau
 */
public class ChangePasswordDialog extends javax.swing.JDialog {
    
    private String MD5;
    private String id;
    
    /** Creates new form ChangePasswordDialog */
    public ChangePasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, true);
        initComponents();
        id = Main_Window.parentOfApplication.getUser().getUserId();
        setVisible(true);
    }
    
    /**
     * USED ONLY OFF OF EMAIL LINK! SO OLD PASSWORD IS NOT REQUIRED ALL ELSE SHOULD USE 
     * OTHER CONSTRUCTOR!
     */
    public ChangePasswordDialog(java.awt.Frame parent, boolean modal, String oldmd5, String uid) {
        super(parent, false);
        initComponents();
        OldPWPanel.setVisible(false);
        MD5 = oldmd5;
        id = uid;
        
        try {
            get_user_by_password_id_query checkForValidCombo = new get_user_by_password_id_query();
            checkForValidCombo.update(uid, oldmd5);
            Record_Set rs = new Record_Set();
            rs = new Connection().executeQuery(checkForValidCombo);
            if (rs.length() == 0) {
                setVisible(false);
            } else {
                setVisible(true);
            }
        } catch (Exception e) {
            setVisible(false);
        }
    }
    
    public boolean checkPasswords() {
        boolean arePasswordsValid = true;
        char[] pw = newPwField.getPassword();
        char[] conf = confirmField.getPassword();
        if (pw.length == 0 || (conf.length != pw.length)) {
            arePasswordsValid = false; 
        } else {
            for (int i = 0; i < pw.length; i++) {
                if (pw[i] != conf[i]) {
                    arePasswordsValid = false;
                }
            }
        }
        if (!arePasswordsValid) {
            if (pw.length == 0) {
                JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "Password can not be blank!", "Error", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "New password does not match with the confirm. Please reenter!", "Error", JOptionPane.OK_OPTION);
            }
        }
        return arePasswordsValid;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        OldPWPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        oldPwField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        newPwField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        confirmField = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        OldPWPanel.setLayout(new javax.swing.BoxLayout(OldPWPanel, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setText("Old Password");
        OldPWPanel.add(jLabel1);

        OldPWPanel.add(jPanel8);

        oldPwField.setMaximumSize(new java.awt.Dimension(80, 20));
        oldPwField.setMinimumSize(new java.awt.Dimension(80, 20));
        oldPwField.setPreferredSize(new java.awt.Dimension(80, 20));
        OldPWPanel.add(oldPwField);

        getContentPane().add(OldPWPanel);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        jLabel2.setText("New Password");
        jPanel2.add(jLabel2);

        jPanel2.add(jPanel7);

        newPwField.setMaximumSize(new java.awt.Dimension(80, 20));
        newPwField.setMinimumSize(new java.awt.Dimension(80, 20));
        newPwField.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(newPwField);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.X_AXIS));

        jLabel3.setText("Confirm Password");
        jPanel3.add(jLabel3);

        jPanel3.add(jPanel6);

        confirmField.setMaximumSize(new java.awt.Dimension(80, 20));
        confirmField.setMinimumSize(new java.awt.Dimension(80, 20));
        confirmField.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel3.add(confirmField);

        getContentPane().add(jPanel3);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));

        jButton1.setText("OK");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton1);

        jPanel4.add(jPanel5);

        jButton2.setText("Cancel");
        jButton2.setMaximumSize(new java.awt.Dimension(80, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton2);

        getContentPane().add(jPanel4);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-217)/2, (screenSize.height-135)/2, 217, 135);
    }
    // </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        change_password_for_user_query mySaveQuery = new change_password_for_user_query();
        if (!checkPasswords()) {
            return;
        }
        if (OldPWPanel.isVisible()) {
            mySaveQuery.updateForPw(new String(oldPwField.getPassword()), new String(newPwField.getPassword()), id);
        } else {
            mySaveQuery.updateForMD5(MD5, new String(newPwField.getPassword()), id);
        }
        try {
            new Connection().executeQuery(mySaveQuery);
        } catch (Exception e) {}
        JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "Password Changed", "Save Successful", JOptionPane.OK_OPTION);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OldPWPanel;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField newPwField;
    private javax.swing.JPasswordField oldPwField;
    // End of variables declaration//GEN-END:variables
    
}