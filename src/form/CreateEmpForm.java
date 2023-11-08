package form;

import javax.swing.JOptionPane;
import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;

public class CreateEmpForm extends javax.swing.JFrame {

    public CreateEmpForm() {
        initComponents();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    System.out.println(ex);
                }
                break;
            }
        }
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
        btnCancel = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lbBirthday = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lbSalary = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lbFName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbLName = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        lbPass = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        cbbGender = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lbEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Employee");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCreateEmp.setBackground(new java.awt.Color(255, 255, 255));
        lbCreateEmp.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbCreateEmp.setForeground(new java.awt.Color(255, 153, 0));
        lbCreateEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreateEmp.setText("Create Employee");
        lbCreateEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbCreateEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lbEditCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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

        lbEditInfor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditInfor.setForeground(new java.awt.Color(255, 255, 255));
        lbEditInfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditInfor.setText("Edit Information");
        lbEditInfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditInforMouseClicked(evt);
            }
        });

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
                .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon)))
                .addContainerGap())
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(2, 2, 2)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(73, 24));

        lbBirthday.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbBirthday.setText("Birthday");

        lbPhone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbPhone.setText("Phone");

        txtBirthday.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtPhone.setPreferredSize(new java.awt.Dimension(73, 24));

        lbSalary.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbSalary.setText("Salary");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("CREATE EMPLOYEE");

        lbAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbAddress.setText("Address");

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbFName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbFName.setText("First Name");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtAddress.setPreferredSize(new java.awt.Dimension(73, 24));

        txtFName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbUser.setText("Username");

        lbLName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbLName.setText("Last Name");

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(73, 24));

        txtLName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbPass.setText("Password");

        lbGender.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbGender.setText("Gender");

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        cbbGender.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        cbbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Male", "Female", "Other" }));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbEmail.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(369, 369, 369))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lbTitle)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBirthday)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lbEditInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditInforMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationManageForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditInforMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked

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

    private void lbCreateEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateEmpMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEmpForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCreateEmpMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtFName.setText(null);
        txtLName.setText(null);
        txtEmail.setText(null);
        txtPhone.setText(null);
        txtBirthday.setText(null);
        txtAddress.setText(null);
        txtUser.setText(null);
        txtPass.setText(null);
        txtSalary.setText(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        boolean flag = false;
        String fName = txtFName.getText();
        String lName = txtLName.getText();
        String genDer = (String) cbbGender.getSelectedItem();
        String email = txtEmail.getText();
        String stEmail = "^[A-Za-z]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String phone = txtPhone.getText();
        String stPhone = "^[0-9]{10}$";
        String birthDay = txtBirthday.getText();
        String stBirth = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String addRess = txtAddress.getText();
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        String salary = txtSalary.getText();

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
        } else if (uName.equals("")) {
            JOptionPane.showMessageDialog(this, "Username can't blank");
            txtUser.requestFocus();
            flag = true;
        } else if (uName.length() < 6) {
            JOptionPane.showMessageDialog(this, "Username must be more than 6 character");
            txtUser.requestFocus();
            flag = true;
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Password can't blank");
            txtPass.requestFocus();
            flag = true;
        } else if (pass.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be more than 8 character");
            txtPass.requestFocus();
            flag = true;
        } else if (salary.equals("")) {
            JOptionPane.showMessageDialog(this, "Salary can't blank");
            txtSalary.requestFocus();
            flag = true;
        }

        if (!flag) {
            try {
                Connection conn = MainConnection.getConnection();
                String sql = "select UsernameEmp,Password,Firstname,Lastname,Gender,Email,Phone,Address,Birthday,Salary from Employee where UsernameEmp=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "The account already exists on the system");
                } else {
                    String query = "insert into Employee(UsernameEmp,Password,Firstname,Lastname,Gender,Email,Phone,Address,Birthday,Salary) values (?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement psc = conn.prepareStatement(query);
                    psc.setString(1, uName);
                    psc.setString(2, pass);
                    psc.setString(3, fName);
                    psc.setString(4, lName);
                    psc.setString(5, genDer);
                    psc.setString(6, email);
                    psc.setString(7, phone);
                    psc.setString(8, addRess);
                    psc.setString(9, birthDay);
                    psc.setString(10, salary);
                    psc.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Create PT Succesfully \nUsername: " + uName + "\nPassword: " + pass);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
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
    private javax.swing.JLabel lbFName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLName;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbReportSalary;
    private javax.swing.JLabel lbSalary;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pHeader;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
