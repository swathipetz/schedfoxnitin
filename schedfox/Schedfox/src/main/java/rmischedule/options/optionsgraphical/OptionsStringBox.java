/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OptionsStringBox.java
 *
 * Created on May 18, 2010, 5:22:34 PM
 */

package rmischedule.options.optionsgraphical;

import rmischedule.components.Options.options;
import rmischedule.options.optiontypeclasses.StringOptionClass;

/**
 *
 * @author user
 */
public class OptionsStringBox extends javax.swing.JPanel {

    private int access;
    private StringOptionClass options;

    /** Creates new form OptionsStringBox */
    public OptionsStringBox(StringOptionClass myOption, int AccessLevel) {
        initComponents();
        access = AccessLevel;
        options = myOption;
        DisplayNameLabel.setText(myOption.getMyDisplay());
        jTextField1.setText(myOption.read(access) + "");
    }

    private void saveChanges() {
        options.writeOption(jTextField1.getText(), access);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayNameLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(32767, 25));
        setMinimumSize(new java.awt.Dimension(107, 25));
        setPreferredSize(new java.awt.Dimension(107, 25));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                saveStuff(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        DisplayNameLabel.setText("jLabel1");
        add(DisplayNameLabel);

        jTextField1.setText("jTextField1");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                saveStuff(evt);
            }
        });
        add(jTextField1);
    }// </editor-fold>//GEN-END:initComponents

    private void saveStuff(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saveStuff
         saveChanges();
    }//GEN-LAST:event_saveStuff


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayNameLabel;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}