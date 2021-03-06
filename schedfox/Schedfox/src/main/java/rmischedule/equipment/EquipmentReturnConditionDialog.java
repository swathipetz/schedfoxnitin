/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EquipmentReturnConditionDialog.java
 *
 * Created on Jun 1, 2011, 1:41:33 PM
 */

package rmischedule.equipment;

import java.util.Date;
import javax.swing.JOptionPane;
import rmischedule.main.Main_Window;
import rmischeduleserver.control.EmployeeNotesController;
import rmischeduleserver.control.EquipmentController;
import schedfoxlib.model.EmployeeEquipment;
import schedfoxlib.model.EmployeeNotes;

/**
 *
 * @author user
 */
public class EquipmentReturnConditionDialog extends javax.swing.JDialog {

    private EmployeeEquipment employeeEquipment;
    private String companyId;

    private enum EquipmentCondition {
        Good("Good", 0), Fair("Fair", 1), Bad("Bad", 2), Broken("Broken", 3);

        private String val;
        private Integer value;

        EquipmentCondition(String val, Integer value) {
            this.val = val;
            this.value = value;
        }

        public String getVal() {
            return val;
        }

        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return val;
        }
    }

    /** Creates new form EquipmentReturnConditionDialog */
    public EquipmentReturnConditionDialog(java.awt.Frame parent, boolean modal,
            EmployeeEquipment empEquip, String companyId) {
        super(parent, modal);
        this.employeeEquipment = empEquip;
        this.companyId = companyId;
        initComponents();

        conditionCombo.addItem(EquipmentCondition.Good);
        conditionCombo.addItem(EquipmentCondition.Fair);
        conditionCombo.addItem(EquipmentCondition.Bad);
        conditionCombo.addItem(EquipmentCondition.Broken);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uniformConditionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        conditionCombo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteTxt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();

        uniformConditionPanel.setMaximumSize(new java.awt.Dimension(32767, 35));
        uniformConditionPanel.setPreferredSize(new java.awt.Dimension(341, 35));
        uniformConditionPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Equipment Condition");
        uniformConditionPanel.add(jLabel1);

        conditionCombo.setMinimumSize(new java.awt.Dimension(180, 26));
        conditionCombo.setPreferredSize(new java.awt.Dimension(180, 26));
        uniformConditionPanel.add(conditionCombo);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 25));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel4.setPreferredSize(new java.awt.Dimension(331, 20));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Equipment Notes");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setMaximumSize(new java.awt.Dimension(10000, 16));
        jPanel4.add(jLabel2);

        jPanel3.add(jPanel4);

        noteTxt.setColumns(20);
        noteTxt.setRows(5);
        jScrollPane1.setViewportView(noteTxt);

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(341, 35));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        cancelBtn.setText("Cancel");
        cancelBtn.setMaximumSize(new java.awt.Dimension(75, 28));
        cancelBtn.setMinimumSize(new java.awt.Dimension(75, 28));
        cancelBtn.setPreferredSize(new java.awt.Dimension(75, 28));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);

        okBtn.setText("OK");
        okBtn.setMaximumSize(new java.awt.Dimension(75, 28));
        okBtn.setMinimumSize(new java.awt.Dimension(75, 28));
        okBtn.setPreferredSize(new java.awt.Dimension(75, 28));
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel2.add(okBtn);

        getContentPane().add(jPanel2);

        setSize(new java.awt.Dimension(349, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        EquipmentController controller = EquipmentController.getInstance(this.companyId);
        EmployeeNotesController empController = EmployeeNotesController.getInstance(this.companyId);
        try {
            if (noteTxt.getText().trim().length() > 0) {
                EmployeeNotesController notesController = EmployeeNotesController.getInstance(companyId);
                EmployeeNotes empNotes = new EmployeeNotes();
                empNotes.setEmployeeNotesId(0);
                empNotes.setEmployeeId(employeeEquipment.getEmployeeId());
                empNotes.setEmployeeNotesDateTime(new Date());
                empNotes.setEmployeeNotesNotes(noteTxt.getText().trim());
                empNotes.setUserId(Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));
                empNotes.setNoteTypeId(empController.getEmployeeNoteType("Equipment"));
                
                notesController.saveEmployeeNotes(empNotes);
            }
            employeeEquipment.setReturnedCondition(((EquipmentCondition)conditionCombo.getSelectedItem()).getValue());

            controller.returnEmployeeEquipment(employeeEquipment,
                                Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "Problem saving information!",
                    "Could not save! Error: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox conditionCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea noteTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JPanel uniformConditionPanel;
    // End of variables declaration//GEN-END:variables

}
