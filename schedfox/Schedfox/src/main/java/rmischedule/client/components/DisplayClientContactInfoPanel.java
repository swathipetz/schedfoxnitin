/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmischedule.client.components;

import java.awt.Color;
import rmischedule.utility.ParentTrickleListener;
import schedfoxlib.model.ClientContact;

/**
 *
 * @author ira
 */
public class DisplayClientContactInfoPanel extends javax.swing.JPanel {

    private Color highlightColor = new Color(18, 107, 13);
    
    /**
     * Creates new form DisplayClientContactInfoPanel
     */
    public DisplayClientContactInfoPanel(ClientContact contact, String searchText) {
        initComponents();
        
        this.addMouseListener(new ParentTrickleListener());
        for (int c = 0; c < this.getComponentCount(); c++) {
            this.getComponent(c).addMouseListener(new ParentTrickleListener());
        }
        
        contactNameTxt.setText(contact.getFullName());
        if (contact.getFullName().toUpperCase().contains(searchText.toUpperCase())) {
            contactNameTxt.setForeground(highlightColor);
        }
        
        contactAddressTxt.setText(contact.getClientContactAddress() + ", " + contact.getClientContactCity() + ", " + 
                contact.getClientContactState() + " " + contact.getClientContactZip());
        if (contactAddressTxt.getText().toUpperCase().contains(searchText.toUpperCase())) {
            contactAddressTxt.setForeground(highlightColor);
        }
        
        emailTxt.setText(contact.getClientContactEmail());
        if (contact.getClientContactEmail().toUpperCase().contains(searchText.toUpperCase())) {
            emailTxt.setForeground(highlightColor);
        }
        
        phoneTxt.setText(contact.getClientContactPhone());
        if (contact.getClientContactPhone().toUpperCase().contains(searchText.toUpperCase())) {
            phoneTxt.setForeground(highlightColor);
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

        jPanel1 = new javax.swing.JPanel();
        contactNameTxt = new javax.swing.JLabel();
        contactAddressTxt = new javax.swing.JLabel();
        emailTxt = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(33407, 16));
        setPreferredSize(new java.awt.Dimension(605, 16));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(jPanel1);

        contactNameTxt.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        contactNameTxt.setText("jLabel1");
        contactNameTxt.setMaximumSize(new java.awt.Dimension(160, 16));
        contactNameTxt.setMinimumSize(new java.awt.Dimension(160, 16));
        contactNameTxt.setPreferredSize(new java.awt.Dimension(160, 16));
        add(contactNameTxt);

        contactAddressTxt.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        contactAddressTxt.setText("jLabel1");
        contactAddressTxt.setMaximumSize(new java.awt.Dimension(220, 16));
        contactAddressTxt.setMinimumSize(new java.awt.Dimension(220, 16));
        contactAddressTxt.setPreferredSize(new java.awt.Dimension(220, 16));
        add(contactAddressTxt);

        emailTxt.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        emailTxt.setText("jLabel1");
        emailTxt.setMaximumSize(new java.awt.Dimension(180, 16));
        emailTxt.setMinimumSize(new java.awt.Dimension(180, 16));
        emailTxt.setPreferredSize(new java.awt.Dimension(180, 16));
        add(emailTxt);

        phoneTxt.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        phoneTxt.setText("jLabel1");
        phoneTxt.setMaximumSize(new java.awt.Dimension(110, 16));
        phoneTxt.setMinimumSize(new java.awt.Dimension(110, 16));
        phoneTxt.setPreferredSize(new java.awt.Dimension(110, 16));
        add(phoneTxt);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactAddressTxt;
    private javax.swing.JLabel contactNameTxt;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phoneTxt;
    // End of variables declaration//GEN-END:variables
}