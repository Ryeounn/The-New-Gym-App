package form;

import form.EditInformationCusForm;
import form.CustomerForm;
import form.AttendanceCusForm;
import form.AboutUs;
import app.MainConnection;
import form.LoginForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class FeedbackForm extends javax.swing.JFrame {

    public FeedbackForm() {
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

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFitness = new javax.swing.JTextArea();
        lbfbFitness = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pHeader1 = new javax.swing.JPanel();
        lbInfor = new javax.swing.JLabel();
        lbFitness = new javax.swing.JLabel();
        lbNutrizone = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbAboutUs = new javax.swing.JLabel();
        lbNewaEvent = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        lbfbNutri = new javax.swing.JLabel();
        lbfbMore = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNutri = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMore = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText(" FEEDBACK");

        txtFitness.setColumns(20);
        txtFitness.setRows(5);
        txtFitness.setToolTipText("");
        jScrollPane1.setViewportView(txtFitness);

        lbfbFitness.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbfbFitness.setText("Fitness Program");

        btnSend.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSend.setText("SEND");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
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

        lbFitness.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbFitness.setForeground(new java.awt.Color(255, 255, 255));
        lbFitness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFitness.setText("Fitness Program");
        lbFitness.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbFitness.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFitness.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFitnessMouseClicked(evt);
            }
        });

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

        lbNewaEvent.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNewaEvent.setForeground(new java.awt.Color(255, 255, 255));
        lbNewaEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNewaEvent.setText("News and Event");
        lbNewaEvent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNewaEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNewaEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNewaEventMouseClicked(evt);
            }
        });

        lbFeedback.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbFeedback.setForeground(new java.awt.Color(255, 153, 0));
        lbFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFeedback.setText("Feedback");
        lbFeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pHeader1Layout = new javax.swing.GroupLayout(pHeader1);
        pHeader1.setLayout(pHeader1Layout);
        pHeader1Layout.setHorizontalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader1Layout.createSequentialGroup()
                .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeader1Layout.createSequentialGroup()
                        .addGap(0, 380, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon))
                    .addGroup(pHeader1Layout.createSequentialGroup()
                        .addComponent(lbNewaEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHeader1Layout.setVerticalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeader1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(1, 1, 1)
                .addGroup(pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNewaEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbfbNutri.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbfbNutri.setText("Nutrition Zone");

        lbfbMore.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbfbMore.setText("More");

        txtNutri.setColumns(20);
        txtNutri.setRows(5);
        txtNutri.setToolTipText("");
        jScrollPane2.setViewportView(txtNutri);

        txtMore.setColumns(20);
        txtMore.setRows(5);
        txtMore.setToolTipText("");
        jScrollPane3.setViewportView(txtMore);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(lbTitle)
                .addGap(0, 428, Short.MAX_VALUE))
            .addComponent(pHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbfbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbfbNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbfbMore, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lbTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbfbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbfbNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(lbfbMore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       try {
            String feedFit = txtFitness.getText();
            String feedNutri = txtNutri.getText();
            String feedMore = txtMore.getText();
            Connection conn = MainConnection.getConnection();
            if(feedFit.equals("") || feedNutri.equals("")|| feedMore.equals("")){
                JOptionPane.showMessageDialog(this, "Can't Blank");
            }
            String sql = "insert into Feedback(TextFitness,TextNutri,TextMore) values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, feedFit);
            ps.setString(2, feedNutri);
            ps.setString(3, feedMore);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Send Feedback Succesfully");
            txtFitness.setText(null);
            txtNutri.setText(null);
            txtMore.setText(null);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    txtFitness.setText(null);
        txtNutri.setText(null);
        txtMore.setText(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lbInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInforMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbInforMouseClicked

    private void lbAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAttendanceMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAttendanceMouseClicked

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

    private void lbAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAboutUsMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAboutUsMouseClicked

    private void lbFitnessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFitnessMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FitnessProgram().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFitnessMouseClicked

    private void lbNutrizoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNutrizoneMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutritionZoneForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNutrizoneMouseClicked

    private void lbNewaEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNewaEventMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNewaEventMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFitness;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNewaEvent;
    private javax.swing.JLabel lbNutrizone;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbfbFitness;
    private javax.swing.JLabel lbfbMore;
    private javax.swing.JLabel lbfbNutri;
    private javax.swing.JPanel pHeader1;
    private javax.swing.JTextArea txtFitness;
    private javax.swing.JTextArea txtMore;
    private javax.swing.JTextArea txtNutri;
    // End of variables declaration//GEN-END:variables
}
