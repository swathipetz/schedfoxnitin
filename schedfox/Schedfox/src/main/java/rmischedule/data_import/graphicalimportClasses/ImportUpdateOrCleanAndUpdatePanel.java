/*
 * ImportUpdateOrCleanAndUpdatePanel.java
 *
 * Created on March 1, 2006, 11:20 AM
 */

package rmischedule.data_import.graphicalimportClasses;
import javax.swing.*;
import rmischedule.xadmin.parentFormInterface;
/**
 *
 * @author  Ira Juneau
 */
public class ImportUpdateOrCleanAndUpdatePanel extends javax.swing.JPanel implements ImportGenericType {
    
    private ImportDataWindow parent;
    
    /** Creates new form ImportUpdateOrCleanAndUpdatePanel */
    public ImportUpdateOrCleanAndUpdatePanel() {
        initComponents();
        myGroup.add(RemoveInsertRadio);
        myGroup.add(UpdateRadio);
        myGroup.add(InsertRadio);
    }
    
    public String getTitle() {
        return "Step 1: What do you want to do?"; 
    }
    
    public void showMe() {
        
    }
    
    public void setParent(ImportDataWindow parent) {
        this.parent = parent;
    }
    
    public void doOnNext() {
        int myUpdateType = 0;
        if (RemoveInsertRadio.isSelected()) {
            myUpdateType = ImportDataWindow.CLEANINSERTONLY;
        } else if (UpdateRadio.isSelected()) {
            myUpdateType = ImportDataWindow.UPDATEONLY;
        } else {
            myUpdateType = ImportDataWindow.INSERTONLY;
        }
        parent.setImportType(myUpdateType);
    }
    
    public JPanel getComponent() {
        return this;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        myGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        InsertRadio = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        UpdateRadio = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        RemoveInsertRadio = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridLayout(3, 4));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        InsertRadio.setText("I want to insert existing data from another source into SchedFox.");
        InsertRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        InsertRadio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel1.add(InsertRadio);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        UpdateRadio.setText("I want to use existing data to import additional information into SchedFox.");
        UpdateRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        UpdateRadio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(UpdateRadio);

        add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        RemoveInsertRadio.setText("I want to remove all information from SchedFox and import all data from an outside source.");
        RemoveInsertRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        RemoveInsertRadio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel3.add(RemoveInsertRadio);

        add(jPanel3);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton InsertRadio;
    private javax.swing.JRadioButton RemoveInsertRadio;
    private javax.swing.JRadioButton UpdateRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup myGroup;
    // End of variables declaration//GEN-END:variables
    
}