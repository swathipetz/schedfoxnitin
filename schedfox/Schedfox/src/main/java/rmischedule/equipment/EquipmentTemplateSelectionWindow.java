/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmischedule.equipment;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import rmischedule.main.Main_Window;
import static rmischedule.templates.interfaces.TemplateSystemInterface.templateController;
import rmischedule.templates.models.InitializeTemplateSystem;
import rmischedule.templates.view.TemplateDiagForm;
import rmischeduleserver.control.EmployeeController;
import rmischeduleserver.control.MessagingController;

import rmischeduleserver.control.TemplateController;
import schedfoxlib.model.Employee;
import schedfoxlib.model.EmployeeEquipment;
import schedfoxlib.model.MessagingCommunication;
import schedfoxlib.model.MessagingCommunicationBatch;
import schedfoxlib.model.Template;

/**
 *
 * @author ira
 */
public class EquipmentTemplateSelectionWindow extends javax.swing.JDialog {

    private String companyId;
    private TemplateCombo templateCombo = new TemplateCombo();
    private ArrayList<EmployeeEquipment> equipment;

    private static final int templateType = 5;

    /**
     * Creates new form EquipmentTemplateSelectionWindow
     */
    public EquipmentTemplateSelectionWindow(java.awt.Frame parent, boolean modal, String companyId, ArrayList<EmployeeEquipment> selectedEmployees) {
        super(parent, modal);
        initComponents();

        this.companyId = companyId;
        this.equipment = selectedEmployees;

        refreshTemplates();
        
        emailFromTxt.setText("auto@champ.net");
        try {
            emailFromTxt.setText(Main_Window.parentOfApplication.getUser().getEmail());
        } catch (Exception exe) {}
    }

    private void refreshTemplates() {
        try {
            TemplateController templateController = TemplateController.getInstance(companyId);
            ArrayList<Template> templates = templateController.getTemplatesByType(templateType);
            Template selectTemplate = new Template();
            selectTemplate.setTemplateId(-1);
            selectTemplate.setTemplateName("Type text below, or select a template");
            templateCombo = new TemplateCombo();
            templateCombo.addTemplate(selectTemplate);
            for (int t = 0; t < templates.size(); t++) {
                templateCombo.addTemplate(templates.get(t));
            }
            templateCmb.setModel(templateCombo);
            templateCmb.repaint();
        } catch (Exception exe) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        templateCmb = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        editTemplateBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        emailFromTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTxt = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        emailBtn = new javax.swing.JButton();
        smsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(2000, 35));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(476, 35));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Template (if wanted)");
        jLabel1.setMaximumSize(new java.awt.Dimension(130, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(130, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel2.add(jLabel1);

        templateCmb.setModel(templateCombo);
        templateCmb.setMaximumSize(new java.awt.Dimension(32767, 28));
        templateCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templateCmbActionPerformed(evt);
            }
        });
        jPanel2.add(templateCmb);

        jPanel3.setMaximumSize(new java.awt.Dimension(4, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(4, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        editTemplateBtn.setText("Edit Templates");
        editTemplateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTemplateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(editTemplateBtn);

        getContentPane().add(jPanel2);

        jPanel5.setMaximumSize(new java.awt.Dimension(2000, 35));
        jPanel5.setMinimumSize(new java.awt.Dimension(0, 35));
        jPanel5.setPreferredSize(new java.awt.Dimension(476, 35));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Email Address to send from (only for email)");
        jLabel2.setMaximumSize(new java.awt.Dimension(260, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(260, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(260, 16));
        jPanel5.add(jLabel2);

        jPanel6.setMaximumSize(new java.awt.Dimension(4, 32767));
        jPanel6.setMinimumSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        emailFromTxt.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        jPanel5.add(emailFromTxt);

        getContentPane().add(jPanel5);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        messageTxt.setColumns(20);
        messageTxt.setRows(5);
        jScrollPane1.setViewportView(messageTxt);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 35));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        emailBtn.setText("Email");
        emailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBtnActionPerformed(evt);
            }
        });
        jPanel4.add(emailBtn);

        smsBtn.setText("SMS");
        smsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smsBtnActionPerformed(evt);
            }
        });
        jPanel4.add(smsBtn);

        getContentPane().add(jPanel4);

        setSize(new java.awt.Dimension(508, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editTemplateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTemplateBtnActionPerformed
        InitializeTemplateSystem init = ((templateCmb.getSelectedItem().toString().length() > 0) && (templateCmb.getSelectedItem().toString().length() == 0))
                ? new InitializeTemplateSystem.Builder(companyId, "-1", templateType, templateController).incomingText(messageTxt.getText()).build()
                : new InitializeTemplateSystem.Builder(companyId, "-1", templateType, templateController).build();

        TemplateDiagForm templateForm = new TemplateDiagForm();
        templateForm.init(init);
        templateForm.pack();
        templateForm.setVisible(true);
        refreshTemplates();
    }//GEN-LAST:event_editTemplateBtnActionPerformed

    private void templateCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_templateCmbActionPerformed
        Template selectedTemplate = templateCombo.getTemplateAt(templateCombo.selectedIndex);
        if (selectedTemplate.getTemplateId() != -1) {
            messageTxt.setText(selectedTemplate.getTemplateValue());
        }
    }//GEN-LAST:event_templateCmbActionPerformed

    private void emailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(Main_Window.parentOfApplication, "Your are about to send an email out to " + this.equipment.size()
                + " employees. Are you sure you want to do this?", "Confirm Send", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            MessagingCommunicationBatch batch = new MessagingCommunicationBatch();
            batch.setAttachPdf(false);
            batch.setFromEmail("auto@champ.net");
            batch.setIsemail(true);
            batch.setIssms(false);
            batch.setSubject("Champion National Security - Uniform Return");
            batch.setMessagingSouce(MessagingCommunicationBatch.templateEmail);
            batch.setUserId(Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));

            try {
                MessagingController messageController = new MessagingController(this.companyId);
                EmployeeController employeeController = EmployeeController.getInstance(this.companyId);
                batch.setMessagingCommunicationBatchId(messageController.saveCommunicationBatch(batch));

                for (int e = 0; e < equipment.size(); e++) {
                    try {
                        Employee emp = employeeController.getEmployeeById(equipment.get(e).getEmployeeId());

                        MessagingCommunication comm = new MessagingCommunication();
                        comm.setEmployeeId(equipment.get(e).getEmployeeId());
                        comm.setAttachPdf(false);
                        comm.setIsEmail(true);
                        comm.setIsSMS(false);
                        comm.setUserId(Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));
                        comm.setBody(messageTxt.getText());
                        //comm.setDatetimesent(new java.util.Date());
                        comm.setSentTo(emp.getEmployeeEmail());
                        comm.setSubject("Champion National Security - Uniform Return");
                        comm.setFromEmail(emailFromTxt.getText());

                        comm.setMessagingCommunicationBatchId(batch.getMessagingCommunicationBatchId());
                        messageController.saveMessagingCommunication(comm);
                    } catch (Exception exe) {}
                }
            } catch (Exception exe) {
            }
            
            JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "Messages are queued to be sent, they may take up to 10 minutes to begin sending.", "Messages Queued", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_emailBtnActionPerformed

    private void smsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smsBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(Main_Window.parentOfApplication, "Your are about to send text messages out to " + this.equipment.size()
                + " employees. Are you sure you want to do this?", "Confirm Send", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            MessagingCommunicationBatch batch = new MessagingCommunicationBatch();
            batch.setAttachPdf(false);
            batch.setIsemail(false);
            batch.setIssms(true);
            batch.setMessagingSouce(9);
            batch.setUserId(Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));

            try {
                MessagingController messageController = new MessagingController(this.companyId);
                EmployeeController employeeController = EmployeeController.getInstance(this.companyId);
                batch.setMessagingCommunicationBatchId(messageController.saveCommunicationBatch(batch));

                for (int e = 0; e < equipment.size(); e++) {
                    try {
                        Employee emp = employeeController.getEmployeeById(equipment.get(e).getEmployeeId());

                        MessagingCommunication comm = new MessagingCommunication();
                        comm.setEmployeeId(equipment.get(e).getEmployeeId());
                        comm.setAttachPdf(false);
                        comm.setIsEmail(false);
                        comm.setIsSMS(true);
                        comm.setUserId(Integer.parseInt(Main_Window.parentOfApplication.getUser().getUserId()));
                        comm.setBody(messageTxt.getText());
                        comm.setSentTo(emp.getEmployeeCell());
                        comm.setSubject("Champion National Security - Uniform Return");
                        if (Main_Window.parentOfApplication.getUser().getEmail() == null) {
                            comm.setFromEmail(Main_Window.parentOfApplication.getUser().getEmail());
                        } else {
                            comm.setFromEmail("auto@champ.net");
                        }
                        comm.setMessagingCommunicationBatchId(batch.getMessagingCommunicationBatchId());
                        messageController.saveMessagingCommunication(comm);
                    } catch (Exception exe) {}
                }
            } catch (Exception exe) {
            }
            
            JOptionPane.showMessageDialog(Main_Window.parentOfApplication, "Messages are queued to be sent, they may take up to 10 minutes to begin sending.", "Messages Queued", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_smsBtnActionPerformed

    private class TemplateCombo implements ComboBoxModel {

        private ArrayList<Template> templates;
        private Integer selectedIndex;

        public TemplateCombo() {
            templates = new ArrayList<Template>();
            selectedIndex = 0;
        }

        public void addTemplate(Template temp) {
            templates.add(temp);
        }

        public void clearTemplate() {
            templates.clear();
            selectedIndex = -1;
        }

        @Override
        public void setSelectedItem(Object anItem) {
            if (anItem instanceof Template) {
                try {
                    Template temp = (Template) anItem;
                    for (int t = 0; t < templates.size(); t++) {
                        if (templates.get(t).getTemplateId().equals(temp.getTemplateId())) {
                            selectedIndex = t;
                        }
                    }
                } catch (Exception exe) {
                }
            }
        }

        @Override
        public Object getSelectedItem() {
            try {
                return templates.get(selectedIndex).getTemplateName();
            } catch (Exception exe) {
            }
            return "";
        }

        public Template getTemplateAt(int row) {
            return templates.get(row);
        }

        @Override
        public int getSize() {
            return templates.size();
        }

        @Override
        public Object getElementAt(int index) {
            return templates.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editTemplateBtn;
    private javax.swing.JButton emailBtn;
    private javax.swing.JTextField emailFromTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageTxt;
    private javax.swing.JButton smsBtn;
    private javax.swing.JComboBox templateCmb;
    // End of variables declaration//GEN-END:variables
}
