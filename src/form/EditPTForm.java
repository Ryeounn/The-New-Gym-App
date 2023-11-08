package form;

import app.MainConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class EditPTForm extends javax.swing.JFrame {

    public EditPTForm() {
        initComponents();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    System.out.println(ex);
                }
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
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbErrorID = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lbSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtUser = new javax.swing.JLabel();
        txtPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Customer");

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

        lbEditCustomer.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbEditCustomer.setForeground(new java.awt.Color(255, 153, 0));
        lbEditCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditCustomer.setText("Edit Personal Trainer");
        lbEditCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        lbEditCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(4, 4, 4)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("EDIT PERSONAL TRAINER");

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

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbErrorID.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbErrorID.setForeground(new java.awt.Color(255, 0, 0));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbSalary.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbSalary.setText("Salary");

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addGap(162, 162, 162)
                                .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(162, 162, 162)
                            .addComponent(lbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbErrorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(339, 339, 339))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbErrorID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            String uName = txtSearch.getText();
            String sql = "select UsernamePT,Password,Firstname,Lastname,Gender,Email,Phone,Address,Birthday,Salary from PT where UsernamePT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
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
                txtUser.setText(rs.getString("UsernamePT"));
                txtPass.setText(rs.getString("Password"));
                txtSalary.setText(rs.getString("Salary"));
                lbErrorID.setText(null);
            } else {
                lbErrorID.setText("Username not match database");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtSearch.setText(null);
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn = MainConnection.getConnection();
        String search = txtSearch.getText();
        try {
            String sql = "delete PT where UsernamePT=?";
            PreparedStatement psc = conn.prepareStatement(sql);
            psc.setString(1, search);
            psc.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete PT Successfully");
            txtSearch.setText(null);
            txtFName.setText(null);
            txtLName.setText(null);
            txtEmail.setText(null);
            txtPhone.setText(null);
            txtBirthday.setText(null);
            txtAddress.setText(null);
            txtUser.setText(null);
            txtPass.setText(null);
            txtSalary.setText(null);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String search = txtSearch.getText();
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
                String query = "update PT set UsernamePT=?,Password=?,Firstname=?,Lastname=?,Gender=?,Email=?,Phone=?,Address=?,Birthday=?,Salary=? where UsernamePT=?";
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
                psc.setString(11, search);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update PT Succesfully");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
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
    private javax.swing.JLabel lbErrorID;
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
    private javax.swing.JLabel txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
