package form;

import app.MainConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class FitnessProgram extends javax.swing.JFrame {

    public FitnessProgram() {
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

        lbFP12 = new javax.swing.JLabel();
        lbFitnessProgram = new javax.swing.JLabel();
        pHeader1 = new javax.swing.JPanel();
        lbInfor = new javax.swing.JLabel();
        lbFitness = new javax.swing.JLabel();
        lbNutrizone = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbNandE = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        lbAboutUs = new javax.swing.JLabel();
        btnFinessProgram = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFit = new javax.swing.JTable();
        cbbFit = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbFP12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbFitnessProgram.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbFitnessProgram.setText("FITNESS PROGRAM");

        pHeader1.setBackground(new java.awt.Color(0, 102, 102));
        pHeader1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader1.setForeground(new java.awt.Color(255, 255, 255));
        pHeader1.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbInfor.setBackground(new java.awt.Color(255, 255, 255));
        lbInfor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbInfor.setForeground(new java.awt.Color(255, 255, 255));
        lbInfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfor.setText("Edit Information");
        lbInfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInforMouseClicked(evt);
            }
        });

        lbFitness.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbFitness.setForeground(new java.awt.Color(255, 153, 0));
        lbFitness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFitness.setText("Fitness Program");
        lbFitness.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbFitness.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbNutrizone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNutrizone.setForeground(new java.awt.Color(255, 255, 255));
        lbNutrizone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNutrizone.setText("Nutrition Zone");
        lbNutrizone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNutrizone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNutrizone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNutrizoneMouseClicked(evt);
            }
        });

        lbAttendance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbAttendance.setForeground(new java.awt.Color(255, 255, 255));
        lbAttendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAttendance.setText("Attendance");
        lbAttendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAttendanceMouseClicked(evt);
            }
        });

        lbNandE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNandE.setForeground(new java.awt.Color(255, 255, 255));
        lbNandE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNandE.setText("News and Event");
        lbNandE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNandE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNandE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNandEMouseClicked(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        lbIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIconMouseClicked(evt);
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

        lbFeedback.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbFeedback.setForeground(new java.awt.Color(255, 255, 255));
        lbFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFeedback.setText("Feedback");
        lbFeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFeedbackMouseClicked(evt);
            }
        });

        lbAboutUs.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        lbAboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAboutUs.setText("About Us");
        lbAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbAboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAboutUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pHeader1Layout = new javax.swing.GroupLayout(pHeader1);
        pHeader1.setLayout(pHeader1Layout);
        pHeader1Layout.setHorizontalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNandE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeader1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon)
                        .addContainerGap())
                    .addGroup(pHeader1Layout.createSequentialGroup()
                        .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        pHeader1Layout.setVerticalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(1, 1, 1)
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNandE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnFinessProgram.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnFinessProgram.setText("SEARCH");
        btnFinessProgram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinessProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinessProgramActionPerformed(evt);
            }
        });

        tbFit.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbFit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Pack", "Stage", "Name Program"
            }
        ));
        tbFit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFit);

        cbbFit.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        cbbFit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1 Month with PT", "1 Month non PT", "6 Month with PT", "6 Month non PT", "12 Month with PT", "12 Month non PT" }));

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbError.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFP12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(377, 377, 377)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFinessProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbFitnessProgram)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(395, 395, 395)
                                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(pHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbFit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lbFP12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbFitnessProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbFit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinessProgram)
                            .addComponent(btnUpdate))
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInforMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbInforMouseClicked

    private void lbNutrizoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNutrizoneMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutritionZoneForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNutrizoneMouseClicked

    private void lbAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAttendanceMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAttendanceMouseClicked

    private void lbNandEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNandEMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNandEMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
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

    private void lbFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFeedbackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFeedbackMouseClicked

    private void lbAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAboutUsMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAboutUsMouseClicked

    private void btnFinessProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinessProgramActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            String uName = txtUser.getText();
            if (uName.equals("")) {
                lbError.setText("Please Enter Username");
                lbError.setForeground(Color.red);
            }
            
            String option = (String) cbbFit.getSelectedItem();
            String sql = "select Customer.UsernameCus,TrainingPack.Infor from Customer,TrainingPack,ReportSalary where Customer.UsernameCus = ReportSalary.UsernameCus AND ReportSalary.IDPack = TrainingPack.IDPack AND Customer.UsernameCus=?";
            PreparedStatement psa = conn.prepareStatement(sql);
            psa.setString(1, uName);
            ResultSet rsa = psa.executeQuery();
            if(rsa.next()) {
                if (option.equals("--")) {
                    lbError.setText("Please your choice");
                    lbError.setForeground(Color.red);
                } else if (option.equals("1 Month with PT")) {
                    String op = option;
                   
                    String sqlop = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb = conn.prepareStatement(sqlop);
                    psb.setString(1, option);
                    psb.setString(2, uName);
                    ResultSet rsb = psb.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);

                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                    }

                } else if (option.equals("1 Month non PT")) {
                    String op1 = option;
                    String sqlop1 = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb1 = conn.prepareStatement(sqlop1);
                    psb1.setString(1, option);
                    psb1.setString(2, uName);
                    ResultSet rsb = psb1.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);
                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                    }

                } else if (option.equals("6 Month non PT")) {
                    String op2 = option;
                    String sqlop2 = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb2 = conn.prepareStatement(sqlop2);
                    psb2.setString(1, option);
                    psb2.setString(2, uName);
                    ResultSet rsb = psb2.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);
                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                    }

                } else if (option.equals("6 Month with PT")) {
                    String op3 = option;
                    String sqlop3 = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb3 = conn.prepareStatement(sqlop3);
                    psb3.setString(1, option);
                    psb3.setString(2, uName);
                    ResultSet rsb = psb3.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);
                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                    }

                } else if (option.equals("12 Month non PT")) {
                    String op4 = option;
                    String sqlop4 = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb4 = conn.prepareStatement(sqlop4);
                    psb4.setString(1, option);
                    psb4.setString(2, uName);
                    ResultSet rsb = psb4.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);
                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                    }

                } else if (option.equals("12 Month with PT")) {
                    String op5 = option;
                    String sqlop5 = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=? ";
                    PreparedStatement psb5 = conn.prepareStatement(sqlop5);
                    psb5.setString(1, option);
                    psb5.setString(2, uName);
                    ResultSet rsb = psb5.executeQuery();
                    if (rsb.next()) {
                        try {
                            String sql1pt = "select TrainingPack.Infor,FitnessProgram.Stage,TypeProgram.NameProgram,FitnessProgram.FitnessID,Customer.UsernameCus from TrainingPack,FitnessProgram,TypeProgram,Customer,Feedback where TypeProgram.TypeID = FitnessProgram.TypeID AND FitnessProgram.FitnessID = TrainingPack.FitnessID AND TrainingPack.IDPack = Feedback.IDPack AND Feedback.UsernameCus = Customer.UsernameCus AND TrainingPack.Infor=? AND Customer.UsernameCus=?";
                            PreparedStatement ps = conn.prepareStatement(sql1pt);
                            ps.setString(1, option);
                            ps.setString(2, uName);
                            ResultSet rs = ps.executeQuery();
                            ResultSetMetaData rm = rs.getMetaData();
                            int q = rm.getColumnCount();
                            DefaultTableModel db = (DefaultTableModel) tbFit.getModel();
                            db.setRowCount(0);
                            while (rs.next()) {
                                Vector columdata = new Vector();
                                for (int i = 1; i <= q; i++) {
                                    columdata.add(rs.getString("FitnessID"));
                                    columdata.add(rs.getString("Infor"));
                                    columdata.add(rs.getString("Stage"));
                                    columdata.add(rs.getString("NameProgram"));
                                }
                                db.addRow(columdata);
                            }
                            lbError.setText(null);
                            lbError.setForeground(null);
                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    }else {
                    JOptionPane.showMessageDialog(this, "You do not subscribe to this package!!!!");
                }

                } 
            }else{
                lbError.setText("Not Match DataBase!!!");
                lbError.setForeground(Color.RED);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnFinessProgramActionPerformed

    private void tbFitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFitMouseClicked
        DefaultTableModel recondModel = (DefaultTableModel) tbFit.getModel();
        int selectRows = tbFit.getSelectedRow();

    }//GEN-LAST:event_tbFitMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String uName = txtUser.getText();
            DefaultTableModel recondModel = (DefaultTableModel) tbFit.getModel();
            int selectRows = tbFit.getSelectedRow();
            Connection conn = MainConnection.getConnection();
            String sql = "insert into SelectFitnessProgram(UsernameCus,FitnessID) values(?,?)";
            PreparedStatement psc = conn.prepareStatement(sql);
            psc.setString(1, uName);
            psc.setString(2, recondModel.getValueAt(selectRows, 0).toString());
            psc.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update Succesfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinessProgram;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbFit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbFP12;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFitness;
    private javax.swing.JLabel lbFitnessProgram;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNandE;
    private javax.swing.JLabel lbNutrizone;
    private javax.swing.JPanel pHeader1;
    private javax.swing.JTable tbFit;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
