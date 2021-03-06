/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HoursDetail.java
 *
 * Created on Apr 4, 2011, 4:45:02 PM
 */
package rmischedule.billing;

import java.text.NumberFormat;
import schedfoxlib.model.EmployeePaymentHours;

/**
 *
 * @author user
 */
public class HoursDetail extends javax.swing.JPanel {

    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    private EmployeePaymentHours hours;

    /** Creates new form HoursDetail */
    public HoursDetail(EmployeePaymentHours hours) {
        initComponents();

        this.hours = hours;
        regHoursType.setText("Regular Hrs");
        try {
            regHrsLabel.setText(hours.getRegularHrs().toString());
        } catch (Exception e) {
            regHrsLabel.setText("");
        }
        try {
            regPayLabel.setText(currencyFormat.format(hours.getRegularPay()));
        } catch (Exception e) {
            regPayLabel.setText(currencyFormat.format(0));
        }
        try {
            overtimeHrsLabel.setText(hours.getOvertimeHrs().toString());
        } catch (Exception e) {
            overtimeHrsLabel.setText("");
        }
        try {
            overtimePayLabel.setText(currencyFormat.format(hours.getOvertimePay()));
        } catch (Exception e) {
            overtimePayLabel.setText(currencyFormat.format(0));
        }
        try {
            totalLabel.setText(currencyFormat.format(getTotal()));
        } catch (Exception e) {
            totalLabel.setText(currencyFormat.format(0));
        }
        overtimeHoursType.setText("Overtime Hrs");
    }

    public Double getTotal() {
        double val = 0;
        if (hours.getRegularPay() != null) {
            val += hours.getRegularPay().doubleValue();
        }
        if (hours.getOvertimePay() != null) {
            val += hours.getOvertimePay().doubleValue();
        }
        return val;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        regHoursType = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        regHrsLabel = new javax.swing.JLabel();
        regPayLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        overtimeHoursType = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        overtimeHrsLabel = new javax.swing.JLabel();
        overtimePayLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel2.setMinimumSize(new java.awt.Dimension(41, 20));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 20));
        jPanel2.setLayout(new java.awt.GridLayout());

        regHoursType.setText("jLabel1");
        regHoursType.setMaximumSize(new java.awt.Dimension(40000, 20));
        regHoursType.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel2.add(regHoursType);

        add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel1.setMinimumSize(new java.awt.Dimension(82, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(125, 20));
        jPanel1.setLayout(new java.awt.GridLayout());

        regHrsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        regHrsLabel.setText("jLabel2");
        regHrsLabel.setMaximumSize(new java.awt.Dimension(400, 20));
        jPanel1.add(regHrsLabel);

        regPayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        regPayLabel.setText("jLabel2");
        regPayLabel.setMaximumSize(new java.awt.Dimension(400, 20));
        jPanel1.add(regPayLabel);

        add(jPanel1);

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel5.setMinimumSize(new java.awt.Dimension(41, 20));
        jPanel5.setPreferredSize(new java.awt.Dimension(130, 20));
        jPanel5.setLayout(new java.awt.GridLayout());

        overtimeHoursType.setText("jLabel3");
        overtimeHoursType.setMaximumSize(new java.awt.Dimension(40000, 20));
        overtimeHoursType.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel5.add(overtimeHoursType);

        add(jPanel5);

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 20));
        jPanel3.setLayout(new java.awt.GridLayout());

        overtimeHrsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        overtimeHrsLabel.setText("jLabel2");
        overtimeHrsLabel.setMaximumSize(new java.awt.Dimension(40000, 20));
        overtimeHrsLabel.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel3.add(overtimeHrsLabel);

        overtimePayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        overtimePayLabel.setText("jLabel7");
        overtimePayLabel.setMaximumSize(new java.awt.Dimension(40000, 20));
        overtimePayLabel.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel3.add(overtimePayLabel);

        add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 20));
        jPanel4.setLayout(new java.awt.GridLayout());

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Total");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setMaximumSize(new java.awt.Dimension(40000, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel4.add(jLabel8);

        totalLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalLabel.setText("jLabel7");
        totalLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        totalLabel.setMaximumSize(new java.awt.Dimension(40000, 20));
        totalLabel.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel4.add(totalLabel);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel overtimeHoursType;
    private javax.swing.JLabel overtimeHrsLabel;
    private javax.swing.JLabel overtimePayLabel;
    private javax.swing.JLabel regHoursType;
    private javax.swing.JLabel regHrsLabel;
    private javax.swing.JLabel regPayLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
