/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmployeePaymentDetail.java
 *
 * Created on Apr 4, 2011, 4:33:01 PM
 */

package rmischedule.billing;

import java.text.NumberFormat;
import java.util.ArrayList;
import rmischedule.utility.StringHlpr;
import schedfoxlib.model.EmployeePaymentDeduction;
import schedfoxlib.model.EmployeePaymentHours;
import schedfoxlib.model.EmployeePaymentTaxes;
import schedfoxlib.model.EmployeePayments;

/**
 *
 * @author user
 */
public class EmployeePaymentDetail extends javax.swing.JDialog {

    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    /** Creates new form EmployeePaymentDetail */
    public EmployeePaymentDetail(java.awt.Frame parent, boolean modal, 
            EmployeePayments payment, int companyId) {
        super(parent, modal);
        initComponents();

        double wageTotal = 0;
        double deductionTotal = 0;
        double taxTotal = 0;
        this.setTitle("Details for check number: "+StringHlpr.stripLeadingZeros(payment.getCheckNum()));
        ArrayList<EmployeePaymentHours> hours = payment.getHours(companyId + "");
        for (int h = 0; h < hours.size(); h++) {
            HoursDetail detail = new HoursDetail(hours.get(h));
            hoursPanel.add(detail);
            wageTotal += detail.getTotal();
        }
        ArrayList<EmployeePaymentDeduction> deductions = payment.getDeductions(companyId + "");
        for (int d = 0; d < deductions.size(); d++) {
            DeductionDetail deductDetail = new DeductionDetail(deductions.get(d));
            deductionsPanel.add(deductDetail);
            deductionTotal += deductDetail.getAmount();
        }
        ArrayList<EmployeePaymentTaxes> taxes = payment.getTaxes(companyId + "");
        for (int t = 0; t < taxes.size(); t++) {
            TaxDetail taxDetail = new TaxDetail(taxes.get(t));
            taxesPanel.add(taxDetail);
            taxTotal += taxDetail.getAmount();
        }

        wagesTxt.setText(currencyFormat.format(wageTotal));
        deductionTxt.setText(currencyFormat.format(deductionTotal));
        taxTxt.setText(currencyFormat.format(taxTotal));
        totalTxt.setText(currencyFormat.format(wageTotal - deductionTotal - taxTotal));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hoursPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deductionsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taxesPanel = new javax.swing.JPanel();
        totalsPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wagesTxt = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deductionTxt = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        taxTxt = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        hoursPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Hours Worked"));
        hoursPanel.setLayout(new javax.swing.BoxLayout(hoursPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(hoursPanel);

        jPanel1.add(jScrollPane1);

        deductionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra Deductions"));
        deductionsPanel.setLayout(new javax.swing.BoxLayout(deductionsPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(deductionsPanel);

        jPanel1.add(jScrollPane2);

        taxesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tax withholdings"));
        taxesPanel.setLayout(new javax.swing.BoxLayout(taxesPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(taxesPanel);

        jPanel1.add(jScrollPane3);

        getContentPane().add(jPanel1);

        totalsPanel.setMaximumSize(new java.awt.Dimension(32767, 35));
        totalsPanel.setPreferredSize(new java.awt.Dimension(462, 30));
        totalsPanel.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Gross");
        jLabel1.setMaximumSize(new java.awt.Dimension(87, 20));
        jPanel5.add(jLabel1);

        wagesTxt.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        wagesTxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        wagesTxt.setText("jLabel2");
        wagesTxt.setMaximumSize(new java.awt.Dimension(900, 20));
        jPanel5.add(wagesTxt);

        jPanel6.setMaximumSize(new java.awt.Dimension(15, 25));
        jPanel6.setMinimumSize(new java.awt.Dimension(5, 10));
        jPanel5.add(jPanel6);

        totalsPanel.add(jPanel5);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setMaximumSize(new java.awt.Dimension(150, 32767));
        jPanel3.add(jPanel9);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setMaximumSize(new java.awt.Dimension(30, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(30, 22));
        jLabel6.setPreferredSize(new java.awt.Dimension(20, 16));
        jPanel3.add(jLabel6);

        deductionTxt.setFont(new java.awt.Font("sansserif", 1, 12));
        deductionTxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        deductionTxt.setText("jLabel4");
        deductionTxt.setMaximumSize(new java.awt.Dimension(60, 20));
        jPanel3.add(deductionTxt);

        jPanel10.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel3.add(jPanel10);

        totalsPanel.add(jPanel3);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(30, 16));
        jLabel7.setMinimumSize(new java.awt.Dimension(30, 22));
        jLabel7.setPreferredSize(new java.awt.Dimension(20, 16));
        jPanel4.add(jLabel7);

        taxTxt.setFont(new java.awt.Font("sansserif", 1, 12));
        taxTxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        taxTxt.setText("jLabel4");
        taxTxt.setMaximumSize(new java.awt.Dimension(55, 20));
        taxTxt.setMinimumSize(new java.awt.Dimension(55, 15));
        jPanel4.add(taxTxt);

        jPanel8.setMaximumSize(new java.awt.Dimension(45, 15));
        jPanel4.add(jPanel8);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("=");
        jLabel9.setMaximumSize(new java.awt.Dimension(20, 16));
        jLabel9.setPreferredSize(new java.awt.Dimension(20, 16));
        jPanel4.add(jLabel9);

        totalTxt.setFont(new java.awt.Font("sansserif", 1, 12));
        totalTxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalTxt.setText("jLabel4");
        totalTxt.setMaximumSize(new java.awt.Dimension(110, 20));
        jPanel4.add(totalTxt);

        jPanel7.setMaximumSize(new java.awt.Dimension(15, 15));
        jPanel4.add(jPanel7);

        totalsPanel.add(jPanel4);

        getContentPane().add(totalsPanel);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(462, 35));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(closeBtn);

        getContentPane().add(jPanel2);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-704)/2, (screenSize.height-362)/2, 704, 362);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel deductionTxt;
    private javax.swing.JPanel deductionsPanel;
    private javax.swing.JPanel hoursPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel taxTxt;
    private javax.swing.JPanel taxesPanel;
    private javax.swing.JLabel totalTxt;
    private javax.swing.JPanel totalsPanel;
    private javax.swing.JLabel wagesTxt;
    // End of variables declaration//GEN-END:variables

}
