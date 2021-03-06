//  package declaration
package rmischedule.messaging.client_email.views;

//  import declarations
import com.inet.jortho.SpellChecker;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import rmischedule.main.Main_Window;
import rmischedule.messaging.client_email.controllers.Client_Email_Controller;

/**
 *
 * @author jdavis
 */
public class Client_Email_Form extends javax.swing.JInternalFrame {
    /*  private variable declarations   */

    private Client_Email_Controller clientEmailController;

    /*  public method implementations   */
    /**
     * Creates new form Client_Email_Form
     */
    public Client_Email_Form() {
        initComponents();

        //  set icons
        this.jSendEmailButton.setIcon(Main_Window.Problemsolver_Email_Dialog_Send_16x16_px);
        this.jExitButton.setIcon(Main_Window.Problemsolver_Email_Dialog_Exit_16x16_px);

        //  set text area
        this.jEmailBodyTextArea.setWrapStyleWord(true);
        this.jEmailBodyTextArea.setLineWrap(true);
        this.jEmailBodyTextArea.setColumns(25);

        if (!Main_Window.parentOfApplication.isRootUser()) {
            this.champUrlBtn.setVisible(false);
        }

        //  set spellchecker
        try {
            SpellChecker.register(this.jEmailSubjectTextField);
            SpellChecker.register(this.jEmailBodyTextArea);
        } catch (Exception ex) {
            throw new RuntimeException("An error has occurred trying to register to SpellChecker in Client_Email Constructor.");
        }   //  end catch block
    }   //  end constructor method block

    public void init() {
        Cursor hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
        this.setCursor(hourglassCursor);
        Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        this.setCursor(normalCursor);

        this.clientEmailController = Client_Email_Controller.getInstance();
        this.clientEmailController.init(this);


    }

    /*  mutators for clientEmailController */
    public JTextField getSubjectField() {
        return this.jEmailSubjectTextField;
    }

    public JTextArea getBodyField() {
        return this.jEmailBodyTextArea;
    }

    public JLabel getTemplatesLabel() {
        return this.jSelectTemplateLabel;
    }

    public JComboBox getTemplatesComboBox() {
        return this.jTemplateNameComboBox;
    }

    public JPanel getBranchPanel() {
        return this.jBranchContactsPanel;
    }

    public JToggleButton getSelectActiveButton() {
        return this.jSelectActiveButton;
    }

    public JToggleButton getSelectInactiveButton() {
        return this.jSelectInactiveButton;
    }

    public JToggleButton getSelectAllButton() {
        return this.jSelectAllButton;
    }

    public JButton getAddressBookButton() {
        return this.jAddressBookButton;
    }

    public JTextField getToTextField() {
        return this.jToTextField;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBasePanel = new javax.swing.JPanel();
        jEmailBasePanel = new javax.swing.JPanel();
        jSelectTemplateLabel = new javax.swing.JLabel();
        jTemplateNameComboBox = new javax.swing.JComboBox();
        jEditTemplatesButton = new javax.swing.JButton();
        jEmailToLabel = new javax.swing.JLabel();
        jEmailSubjectLabel = new javax.swing.JLabel();
        jEmailBodyLabel = new javax.swing.JLabel();
        jEmailSubjectTextField = new javax.swing.JTextField();
        jEmailBodyScrollPane = new javax.swing.JScrollPane();
        jEmailBodyTextArea = new javax.swing.JTextArea();
        jToTextField = new javax.swing.JTextField();
        jContactsBasePanel = new javax.swing.JPanel();
        jBranchContactsBasePanel = new javax.swing.JPanel();
        jBranchContactsScrollPane = new javax.swing.JScrollPane();
        jBranchContactsPanel = new javax.swing.JPanel();
        jContactButtonPanel = new javax.swing.JPanel();
        jSelectActiveButton = new javax.swing.JToggleButton();
        jSelectInactiveButton = new javax.swing.JToggleButton();
        jSelectAllButton = new javax.swing.JToggleButton();
        jAddressBookButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        clientNameBtn = new javax.swing.JButton();
        clientUrlBtn = new javax.swing.JButton();
        userNameBtn = new javax.swing.JButton();
        passwordBtn = new javax.swing.JButton();
        champUrlBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        jToolBarBasePanel = new javax.swing.JPanel();
        jExitButton = new javax.swing.JButton();
        jSendEmailButton = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setResizable(true);
        setTitle("Unique Security Client Email");

        jBasePanel.setLayout(new java.awt.BorderLayout());

        jEmailBasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Email Contents"));

        jSelectTemplateLabel.setText("Select Template:");

        jTemplateNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTemplateNameComboBoxActionPerformed(evt);
            }
        });

        jEditTemplatesButton.setText("Edit Templates");
        jEditTemplatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditTemplatesButtonActionPerformed(evt);
            }
        });

        jEmailToLabel.setText("To:");

        jEmailSubjectLabel.setText("Subject:");

        jEmailBodyLabel.setText("Body:");

        jEmailSubjectTextField.setText(".");

        jEmailBodyScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jEmailBodyScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jEmailBodyTextArea.setColumns(20);
        jEmailBodyTextArea.setRows(5);
        jEmailBodyScrollPane.setViewportView(jEmailBodyTextArea);

        javax.swing.GroupLayout jEmailBasePanelLayout = new javax.swing.GroupLayout(jEmailBasePanel);
        jEmailBasePanel.setLayout(jEmailBasePanelLayout);
        jEmailBasePanelLayout.setHorizontalGroup(
            jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEmailBasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEmailSubjectLabel)
                    .addComponent(jEmailToLabel)
                    .addComponent(jSelectTemplateLabel)
                    .addComponent(jEmailBodyLabel))
                .addGap(18, 18, 18)
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmailBodyScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addComponent(jEmailSubjectTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEmailBasePanelLayout.createSequentialGroup()
                        .addComponent(jTemplateNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                        .addComponent(jEditTemplatesButton))
                    .addComponent(jToTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
                .addContainerGap())
        );
        jEmailBasePanelLayout.setVerticalGroup(
            jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEmailBasePanelLayout.createSequentialGroup()
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTemplateNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditTemplatesButton)
                    .addComponent(jSelectTemplateLabel))
                .addGap(23, 23, 23)
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailToLabel)
                    .addComponent(jToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailSubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailSubjectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEmailBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEmailBasePanelLayout.createSequentialGroup()
                        .addComponent(jEmailBodyLabel)
                        .addContainerGap())
                    .addComponent(jEmailBodyScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
        );

        jBasePanel.add(jEmailBasePanel, java.awt.BorderLayout.NORTH);

        jContactsBasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Recipients\n"));
        jContactsBasePanel.setLayout(new java.awt.GridLayout(1, 3));

        jBranchContactsBasePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBranchContactsBasePanel.setLayout(new java.awt.BorderLayout());

        jBranchContactsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jBranchContactsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4));
        jBranchContactsPanel.setLayout(new java.awt.GridLayout(0, 3));
        jBranchContactsScrollPane.setViewportView(jBranchContactsPanel);

        jBranchContactsBasePanel.add(jBranchContactsScrollPane, java.awt.BorderLayout.CENTER);

        jContactsBasePanel.add(jBranchContactsBasePanel);

        jContactButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSelectActiveButton.setText("Select Active");

        jSelectInactiveButton.setText("Select Inactive");

        jSelectAllButton.setText("Select All");
        jSelectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectAllButtonActionPerformed(evt);
            }
        });

        jAddressBookButton.setText("Address Book");
        jAddressBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddressBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jContactButtonPanelLayout = new javax.swing.GroupLayout(jContactButtonPanel);
        jContactButtonPanel.setLayout(jContactButtonPanelLayout);
        jContactButtonPanelLayout.setHorizontalGroup(
            jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContactButtonPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSelectAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSelectActiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAddressBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSelectInactiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        jContactButtonPanelLayout.setVerticalGroup(
            jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContactButtonPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectActiveButton)
                    .addComponent(jSelectInactiveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jContactButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectAllButton)
                    .addComponent(jAddressBookButton))
                .addGap(53, 53, 53))
        );

        jContactsBasePanel.add(jContactButtonPanel);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clientNameBtn.setText("Insert Client Name");
        clientNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameBtnActionPerformed(evt);
            }
        });

        clientUrlBtn.setText("Insert Client URL");
        clientUrlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientUrlBtnActionPerformed(evt);
            }
        });

        userNameBtn.setText("Insert Username");
        userNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameBtnActionPerformed(evt);
            }
        });

        passwordBtn.setText("Insert Password");
        passwordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBtnActionPerformed(evt);
            }
        });

        champUrlBtn.setText("Insert Champ URL");
        champUrlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champUrlBtnActionPerformed(evt);
            }
        });

        contactBtn.setText("Insert Contact Name");
        contactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientNameBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(clientUrlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(champUrlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(userNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNameBtn)
                    .addComponent(userNameBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordBtn)
                    .addComponent(clientUrlBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champUrlBtn)
                    .addComponent(contactBtn))
                .addGap(10, 10, 10))
        );

        jContactsBasePanel.add(jPanel1);

        jBasePanel.add(jContactsBasePanel, java.awt.BorderLayout.CENTER);

        jToolBarBasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Actions\n"));

        jExitButton.setText("Exit");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jSendEmailButton.setText("Send");
        jSendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendEmailButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jToolBarBasePanelLayout = new javax.swing.GroupLayout(jToolBarBasePanel);
        jToolBarBasePanel.setLayout(jToolBarBasePanelLayout);
        jToolBarBasePanelLayout.setHorizontalGroup(
            jToolBarBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jToolBarBasePanelLayout.createSequentialGroup()
                .addContainerGap(795, Short.MAX_VALUE)
                .addComponent(jSendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jToolBarBasePanelLayout.setVerticalGroup(
            jToolBarBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jToolBarBasePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jToolBarBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExitButton)
                    .addComponent(jSendEmailButton))
                .addContainerGap())
        );

        jBasePanel.add(jToolBarBasePanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jBasePanel, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1000)/2, (screenSize.height-600)/2, 1000, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jEditTemplatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditTemplatesButtonActionPerformed
        clientEmailController.editTemplateAction();
    }//GEN-LAST:event_jEditTemplatesButtonActionPerformed

    private void jTemplateNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTemplateNameComboBoxActionPerformed
        clientEmailController.templateSelectionAction();
    }//GEN-LAST:event_jTemplateNameComboBoxActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jSendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendEmailButtonActionPerformed
        if (clientEmailController.validateSend()) {
            clientEmailController.sendEmail();
        }
    }//GEN-LAST:event_jSendEmailButtonActionPerformed

    private void jSelectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAllButtonActionPerformed
        clientEmailController.selectAllControl(this.jSelectAllButton.isSelected());
    }//GEN-LAST:event_jSelectAllButtonActionPerformed

    private void jAddressBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddressBookButtonActionPerformed
        clientEmailController.addressBookButtonControl();
    }//GEN-LAST:event_jAddressBookButtonActionPerformed

    private void clientUrlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientUrlBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{client_url}", pos);
    }//GEN-LAST:event_clientUrlBtnActionPerformed

    private void userNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{username}", pos);
    }//GEN-LAST:event_userNameBtnActionPerformed

    private void passwordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{client_password}", pos);
    }//GEN-LAST:event_passwordBtnActionPerformed

    private void clientNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{client_name}", pos);
    }//GEN-LAST:event_clientNameBtnActionPerformed

    private void champUrlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champUrlBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{champ_url}", pos);
    }//GEN-LAST:event_champUrlBtnActionPerformed

    private void contactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactBtnActionPerformed
        int pos = jEmailBodyTextArea.getCaretPosition();
        jEmailBodyTextArea.insert("{contact_name}", pos);
    }//GEN-LAST:event_contactBtnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton champUrlBtn;
    private javax.swing.JButton clientNameBtn;
    private javax.swing.JButton clientUrlBtn;
    private javax.swing.JButton contactBtn;
    private javax.swing.JButton jAddressBookButton;
    private javax.swing.JPanel jBasePanel;
    private javax.swing.JPanel jBranchContactsBasePanel;
    private javax.swing.JPanel jBranchContactsPanel;
    private javax.swing.JScrollPane jBranchContactsScrollPane;
    private javax.swing.JPanel jContactButtonPanel;
    private javax.swing.JPanel jContactsBasePanel;
    private javax.swing.JButton jEditTemplatesButton;
    private javax.swing.JPanel jEmailBasePanel;
    private javax.swing.JLabel jEmailBodyLabel;
    private javax.swing.JScrollPane jEmailBodyScrollPane;
    private javax.swing.JTextArea jEmailBodyTextArea;
    private javax.swing.JLabel jEmailSubjectLabel;
    private javax.swing.JTextField jEmailSubjectTextField;
    private javax.swing.JLabel jEmailToLabel;
    private javax.swing.JButton jExitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jSelectActiveButton;
    private javax.swing.JToggleButton jSelectAllButton;
    private javax.swing.JToggleButton jSelectInactiveButton;
    private javax.swing.JLabel jSelectTemplateLabel;
    private javax.swing.JButton jSendEmailButton;
    private javax.swing.JComboBox jTemplateNameComboBox;
    private javax.swing.JTextField jToTextField;
    private javax.swing.JPanel jToolBarBasePanel;
    private javax.swing.JButton passwordBtn;
    private javax.swing.JButton userNameBtn;
    // End of variables declaration//GEN-END:variables
};
