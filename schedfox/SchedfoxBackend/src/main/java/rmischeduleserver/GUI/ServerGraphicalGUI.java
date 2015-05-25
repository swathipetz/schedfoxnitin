/*
 * ServerGUI.java
 *
 * Created on January 18, 2005, 2:01 PM
 */

package rmischeduleserver.GUI;
import java.util.*;
import java.io.*;
import java.awt.Font;
import rmischeduleserver.data_connection_types.ClientVector;
import rmischeduleserver.*;
import rmischeduleserver.mysqlconnectivity.queries.*;
import rmischeduleserver.data_connection_types.*;
import javax.swing.text.*;
import javax.swing.*;
/**
 *
 * @author  ira
 */
public class ServerGraphicalGUI extends javax.swing.JFrame implements ServerGUI {
    private long timeToRun;
    
    /** Creates new form ServerGUI */
    public ServerGraphicalGUI() {
        initComponents();
        timeToRun = 0;
    }
    
    public static String getTime() {
        Calendar time = Calendar.getInstance();
        String hour = time.get(Calendar.HOUR_OF_DAY) + "";
        String minute = time.get(Calendar.MINUTE) + "";
        String second = time.get(Calendar.SECOND) + "";
        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        if (minute.length() == 1) {
            minute = "0" + minute;
        }
        if (second.length() == 1) {
            second = "0" + second;
        }
        return "[" + hour + ":" + minute + ":" + second + "] ";
    }
    
    public void printMessage(String message) {
        MessagePane.append("\n" + getTime() + message);
        MessagePane.scrollRectToVisible(
                new java.awt.Rectangle(1,MessagePane.getHeight(),1,1)
                );
    }
    
    public void printError(String error) {
        ErrorPane.append("\n" + getTime() + error);
        ErrorPane.scrollRectToVisible(
                new java.awt.Rectangle(1,ErrorPane.getHeight(),1,1)
                );
    }
    
    public void printClientList(ClientVector list) {
        ClientVector myList = list;
        Vector clients = new Vector(list.size());
        for (int i = 0; i < list.size(); i++) {
            //clients.add(myList.getAT(i).userName + "(" + myList.getAT(i).userIPConnectingFrom + ")");
        }
        ClientList.setListData(clients);
    }
    
    public void setVisible(boolean val) {
        super.setVisible(val);
    }
    
    public void printSocketMessage(String message) {
        if (jTabbedPane1.getSelectedComponent() != SocketScroller) {
            return;
        }
        SocketMessages.append("\n" + getTime() + message);
        SocketMessages.scrollRectToVisible(
                new java.awt.Rectangle(1,SocketMessages.getHeight(),1,1)
                );
    }
    
    public void setQueryStartTime() {
        if (jTabbedPane1.getSelectedComponent() != QueryStatusScroller) {
            return;
        }
        timeToRun = System.nanoTime();
    }
    
    public void printQueryStatus(String query){
        if (jTabbedPane1.getSelectedComponent() != QueryStatusScroller) {
            return;
        }
        timeToRun = System.nanoTime() - timeToRun;
        QueryMessages.append("Running Query: " + query + "\n");
        QueryMessages.append("Took " + timeToRun + " nanoseconds to execute!\n");
        QueryStatusScroller.scrollRectToVisible(
                new java.awt.Rectangle(1,QueryStatusScroller.getHeight(),1,1));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        MessageScroller = new javax.swing.JScrollPane();
        MessagePane = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ErrorPane = new javax.swing.JTextArea();
        SocketScroller = new javax.swing.JScrollPane();
        SocketMessages = new javax.swing.JTextArea();
        QueryStatusScroller = new javax.swing.JScrollPane();
        QueryMessages = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRunMaint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Messages");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                sendMessageToClients(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 10));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        MessageScroller.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        MessagePane.setEditable(false);
        MessagePane.setFont(new java.awt.Font("MonoSpaced", 0, 11));
        MessagePane.setWrapStyleWord(true);
        MessageScroller.setViewportView(MessagePane);

        jTabbedPane1.addTab("(RMI)Server Messages", MessageScroller);

        ErrorPane.setEditable(false);
        ErrorPane.setFont(new java.awt.Font("MonoSpaced", 0, 11));
        jScrollPane3.setViewportView(ErrorPane);

        jTabbedPane1.addTab("(RMI)Server Errors", jScrollPane3);

        SocketScroller.setViewportView(SocketMessages);

        jTabbedPane1.addTab("(Socket)Server Messages", SocketScroller);

        QueryStatusScroller.setViewportView(QueryMessages);

        jTabbedPane1.addTab("Query Status", QueryStatusScroller);

        jPanel1.add(jTabbedPane1);

        getContentPane().add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(160, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(160, 130));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.BorderLayout());

        btnRunMaint.setText("Run Maintenance");
        btnRunMaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunMaintActionPerformed(evt);
            }
        });
        jPanel3.add(btnRunMaint, java.awt.BorderLayout.NORTH);

        jScrollPane1.setViewportView(ClientList);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        getContentPane().add(jPanel2);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-600)/2, (screenSize.height-350)/2, 600, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessageToClients(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_sendMessageToClients
        askToSendCloseMessageToAllActiveClients();
    }//GEN-LAST:event_sendMessageToClients

private void btnRunMaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunMaintActionPerformed
    Thread run = new Thread() {
        @Override
        public void run()
        {
            Main.runMaint();            
        }
    };
    
    run.start();
}//GEN-LAST:event_btnRunMaintActionPerformed
    
    /**
     * Display question to user if we want to inform users that program is closing down.
     */
    private void askToSendCloseMessageToAllActiveClients() {
        int response = JOptionPane.showConfirmDialog(this, "Do you want to send a message to all connected clients informing them that the program is closing?", "Inform Clients Of Update?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            SocketCommandStructure command = new SocketCommandStructure(GeneralQueryFormat.KILL_CLIENT);
            command.message = "The SchedFox Server has been shut down for maintenence.  Please wait a few minutes before trying to log back in.";
            Main.myServer.getSocketConnection().sendCommandToClients(command);
        }
    }
    
   public void sendMaintToClient(){
        SocketCommandStructure command = new SocketCommandStructure(GeneralQueryFormat.KILL_CLIENT);
        command.message = "The SchedFox Server has been shut down for maintenence.  Please wait a few minutes before trying to log back in.";
        Main.myServer.getSocketConnection().sendCommandToClients(command);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGraphicalGUI().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ClientList;
    private javax.swing.JTextArea ErrorPane;
    private javax.swing.JTextArea MessagePane;
    private javax.swing.JScrollPane MessageScroller;
    private javax.swing.JTextArea QueryMessages;
    private javax.swing.JScrollPane QueryStatusScroller;
    private javax.swing.JTextArea SocketMessages;
    private javax.swing.JScrollPane SocketScroller;
    private javax.swing.JButton btnRunMaint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}