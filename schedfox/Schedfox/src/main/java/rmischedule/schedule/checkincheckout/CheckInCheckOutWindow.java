/*
 * CheckInCheckOutWindow.java
 *
 * Created on June 23, 2005, 6:56 AM
 */

package rmischedule.schedule.checkincheckout;
import java.awt.Color;
import schedfoxlib.model.util.Record_Set;
import java.util.*;
import schedfoxlib.model.AssembleCheckinScheduleType;
/**
 *
 * @author  ira
 */
public class CheckInCheckOutWindow extends javax.swing.JInternalFrame {
    
    private CheckPanel myCheckInPanel;
    private CheckPanel myCheckOutPanel;
    private CheckPanel myNeverCheckedInPanel;
    
    private CheckInCheckOutDataObject myDataObject;
    
    /** Creates new form CheckInCheckOutWindow */
    public CheckInCheckOutWindow() {
        initComponents(); 
        myCheckInPanel = new CheckPanel(CheckPanel.IS_CHECKIN_DATA, this);
        myCheckOutPanel = new CheckPanel(CheckPanel.IS_CHECKOUT_DATA, this);
        myNeverCheckedInPanel = new CheckPanel(CheckPanel.IS_NEVER_CHECKED_IN_DATA, this);
        CheckInTab.add(myCheckInPanel);
        CheckOutTab.add(myCheckOutPanel);
        NeverCheckedInTab.add(myNeverCheckedInPanel);
        CheckInCheckOutTab.setBackgroundAt(1, Color.WHITE);
        CheckInCheckOutTab.setBackgroundAt(0, Color.WHITE);
        CheckInCheckOutTab.setBackgroundAt(2, Color.WHITE);
        myDataObject = new CheckInCheckOutDataObject(myCheckInPanel, myCheckOutPanel, myNeverCheckedInPanel);
    }
    
    public void setVisible(boolean vis) {
        try {
            CheckInCheckOutTab.setSelectedIndex(0);
        } catch (Exception e) {}
        super.setVisible(vis);
    }
    
    /**
     * Gets same arrayList as the schedule, passes it to our object that decides 
     * what the hell to do with it...
     */
    public void updateCheckInWithScheduleData(ArrayList myList) {
        Record_Set rs = (Record_Set)myList.get(0);
        rs.decompressData();
        rs.moveToFront();
        for (int r = 0; r < rs.length(); r++) {
            myDataObject.updateObjectWithScheduleData(new AssembleCheckinScheduleType(rs));
            rs.moveNext();
        }
    }
    
    /**
     * Gets arrayList of our checkin data! yippy!
     */
    public void updateCheckInWithCheckInData(ArrayList myList) {
        myDataObject.updateWithCheckInData(myList);
    }
    
    /**
     * Refreshed hashtable with data....
     */
    public void updateHashTableWithShiftId(String oldShiftId, String newShiftId, IndividualCheckInCheckOutPanel myPanel) {
        myDataObject.updateHashTableWithShiftId(oldShiftId, newShiftId, myPanel);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        CheckInCheckOutTab = new javax.swing.JTabbedPane();
        CheckInTab = new javax.swing.JPanel();
        CheckOutTab = new javax.swing.JPanel();
        NeverCheckedInTab = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Check In/Check Out");
        setFrameIcon(null);
        CheckInTab.setLayout(new java.awt.GridLayout(1, 0));

        CheckInCheckOutTab.addTab("Check In", CheckInTab);

        CheckOutTab.setLayout(new java.awt.GridLayout(1, 0));

        CheckInCheckOutTab.addTab("Check Out", CheckOutTab);

        NeverCheckedInTab.setLayout(new java.awt.GridLayout(1, 0));

        CheckInCheckOutTab.addTab("Never Checked In", NeverCheckedInTab);

        getContentPane().add(CheckInCheckOutTab, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-430)/2, 648, 430);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CheckInCheckOutTab;
    private javax.swing.JPanel CheckInTab;
    private javax.swing.JPanel CheckOutTab;
    private javax.swing.JPanel NeverCheckedInTab;
    // End of variables declaration//GEN-END:variables
    
}