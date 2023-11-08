package form;

import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EditInformationManageForm extends javax.swing.JFrame {

    public EditInformationManageForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pHeader = new javax.swing.JPanel();
        lbCreateEmp = new javax.swing.JLabel();
        lbCreatePT = new javax.swing.JLabel();
        lbEditEmp = new javax.swing.JLabel();
        lbEditCustomer = new javax.swing.JLabel();
        lbReportSalary = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbEditInfor = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lbLName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lbGender = new javax.swing.JLabel();
        cbbGender = new javax.swing.JComboBox<>();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lbAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbBirthday = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        btnChangepass = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbErrorSearch = new javax.swing.JLabel();
        lbShowUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Information");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCreateEmp.setBackground(new java.awt.Color(255, 255, 255));
        lbCreateEmp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCreateEmp.setForeground(new java.awt.Color(255, 255, 255));
        lbCreateEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreateEmp.setText("Create Employee");
        lbCreateEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbCreateEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCreateEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateEmpMouseClicked(evt);
            }
        });

        lbCreatePT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCreatePT.setForeground(new java.awt.Color(255, 255, 255));
        lbCreatePT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreatePT.setText("Create Personal Trainer");
        lbCreatePT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbCreatePT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCreatePT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreatePTMouseClicked(evt);
            }
        });

        lbEditEmp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        lbEditEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditEmp.setText("Edit Employee");
        lbEditEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditEmpMouseClicked(evt);
            }
        });

        lbEditCustomer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lbEditCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditCustomer.setText("Edit Personal Trainer");
        lbEditCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbEditCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditCustomerMouseClicked(evt);
            }
        });

        lbReportSalary.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbReportSalary.setForeground(new java.awt.Color(255, 255, 255));
        lbReportSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReportSalary.setText("Report Salary");
        lbReportSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbReportSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReportSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReportSalaryMouseClicked(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        lbIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIconMouseClicked(evt);
            }
        });

        lbEditInfor.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbEditInfor.setForeground(new java.awt.Color(255, 153, 0));
        lbEditInfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditInfor.setText("Edit Information");
        lbEditInfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbEditInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbLogout.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("   Log out?");
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon)
                .addContainerGap())
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLogout)
                    .addComponent(lbIcon))
                .addGap(4, 4, 4)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("EDIT INFORMATION");

        lbFName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbFName.setText("First Name");

        txtFName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbLName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbLName.setText("Last Name");

        txtLName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbGender.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbGender.setText("Gender");

        cbbGender.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        cbbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Male", "Female", "Other" }));

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(73, 24));

        lbPhone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbPhone.setText("Phone");

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtPhone.setToolTipText("");
        txtPhone.setPreferredSize(new java.awt.Dimension(73, 24));

        lbAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbAddress.setText("Address");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtAddress.setPreferredSize(new java.awt.Dimension(73, 24));

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbUser.setText("Username");

        lbPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbPass.setText("Password");

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSubmit.setText("UPDATE");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lbBirthday.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbBirthday.setText("Birthday");

        txtBirthday.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnChangepass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnChangepass.setText("CHANGE");
        btnChangepass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangepassActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbErrorSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbShowUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(lbBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(lbShowUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangepass))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(374, 374, 374))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbErrorSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBirthday)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangepass))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbShowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCreateEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateEmpMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEmpForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCreateEmpMouseClicked

    private void lbCreatePTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreatePTMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCreatePTMouseClicked

    private void lbEditEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditEmpMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmpForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditEmpMouseClicked

    private void lbEditCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditCustomerMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditCustomerMouseClicked

    private void lbReportSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReportSalaryMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportSalaryForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbReportSalaryMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtFName.setText(null);
        txtLName.setText(null);
        cbbGender.setSelectedIndex(0);
        txtEmail.setText(null);
        txtPhone.setText(null);
        txtBirthday.setText(null);
        txtAddress.setText(null);
        lbShowUser.setText(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String fName = txtFName.getText();
        String lName = txtLName.getText();
        String genDer = (String) cbbGender.getSelectedItem();
        String stEmail = "^[A-Za-z]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String email = txtEmail.getText();
        String stPhone = "^[0-9]{10}$";
        String phone = txtPhone.getText();
        String stBirth = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String birthDay = txtBirthday.getText();
        String addRess = txtAddress.getText();
        String search = txtSearch.getText();

        if (fName.equals("")) {
            JOptionPane.showMessageDialog(this, "First Name can't blank");
            txtFName.requestFocus();
            flag = true;
        } else if (lName.equals("")) {
            JOptionPane.showMessageDialog(this, "Last Name can't blank");
            txtLName.requestFocus();
            flag = true;
        } else if (genDer.equals("--")) {
            JOptionPane.showMessageDialog(this, "Gender can't blank");
            flag = true;
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Email can't blank");
            txtEmail.requestFocus();
            flag = true;
        } else if (!email.matches(stEmail)) {
            JOptionPane.showMessageDialog(this, "Email not match form");
            txtEmail.requestFocus();
            flag = true;
        } else if (phone.equals("")) {
            JOptionPane.showMessageDialog(this, "Phone can't blank");
            txtPhone.requestFocus();
            flag = true;
        } else if (!phone.matches(stPhone)) {
            JOptionPane.showMessageDialog(this, "Phone not match form [10 number][0xxxxxxxxx]");
            txtPhone.requestFocus();
            flag = true;
        } else if (birthDay.equals("")) {
            JOptionPane.showMessageDialog(this, "Birthday can't blank");
            txtBirthday.requestFocus();
            flag = true;
        } else if (!birthDay.matches(stBirth)) {
            JOptionPane.showMessageDialog(this, "Birthday not match form [dd/mm/yyyy]");
            txtBirthday.requestFocus();
            flag = true;
        } else if (addRess.equals("")) {
            JOptionPane.showMessageDialog(this, "Address can't blank");
            txtAddress.requestFocus();
            flag = true;
        }

        if (!flag) {
            try {
                String query = "update Manager set Firstname=?,Lastname=?,Gender=?,Email=?,Phone=?,Address=?,Birthday=? where Username=?";
                PreparedStatement psc = conn.prepareStatement(query);
                psc.setString(1, fName);
                psc.setString(2, lName);
                psc.setString(3, genDer);
                psc.setString(4, email);
                psc.setString(5, phone);
                psc.setString(6, addRess);
                psc.setString(7, birthDay);
                psc.setString(8, search);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Frofile Succesfully");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int output = JOptionPane.showConfirmDialog(this, "Log out the system?");
        if (output == JOptionPane.YES_OPTION) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginForm().setVisible(true);
                }
            });
            this.setVisible(false);
        } else if (output == JOptionPane.NO_OPTION) {
            initComponents();
        } else if (output == JOptionPane.CANCEL_OPTION) {
            initComponents();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void btnChangepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangepassActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassForm().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnChangepassActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            String search = txtSearch.getText();
            Connection conn = MainConnection.getConnection();
            String sql = "select Username,Password,Firstname,Lastname,Gender,Email,Phone,Address,Birthday from Manager where Username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, search);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtFName.setText(rs.getString("Firstname"));
                txtLName.setText(rs.getString("Lastname"));
                if (rs.getString("Gender").equals("Male")) {
                    cbbGender.setSelectedIndex(1);
                } else if (rs.getString("Gender").equals("Female")) {
                    cbbGender.setSelectedIndex(2);
                } else if (rs.getString("Gender").equals("Other")) {
                    cbbGender.setSelectedIndex(3);
                } else {
                    cbbGender.setSelectedIndex(0);
                }
                txtEmail.setText(rs.getString("Email"));
                txtPhone.setText(rs.getString("Phone"));
                txtBirthday.setText(rs.getString("Birthday"));
                txtAddress.setText(rs.getString("Address"));
                lbShowUser.setText(rs.getString("Username"));
                lbErrorSearch.setText(null);
            } else {
                lbErrorSearch.setText("Username not match database");
                lbErrorSearch.setForeground(Color.red);
                txtFName.setText(null);
                txtLName.setText(null);
                cbbGender.setSelectedIndex(0);
                txtPhone.setText(null);
                txtEmail.setText(null);
                txtBirthday.setText(null);
                txtAddress.setText(null);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangepass;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbbGender;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbBirthday;
    private javax.swing.JLabel lbCreateEmp;
    private javax.swing.JLabel lbCreatePT;
    private javax.swing.JLabel lbEditCustomer;
    private javax.swing.JLabel lbEditEmp;
    private javax.swing.JLabel lbEditInfor;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbErrorSearch;
    private javax.swing.JLabel lbFName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLName;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbReportSalary;
    private javax.swing.JLabel lbShowUser;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pHeader;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
