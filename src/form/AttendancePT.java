package form;

import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class AttendancePT extends javax.swing.JFrame {

    public AttendancePT() {
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
        pHeader2 = new javax.swing.JPanel();
        lbCustomGuide3 = new javax.swing.JLabel();
        lbNewandEvent3 = new javax.swing.JLabel();
        lbIcon2 = new javax.swing.JLabel();
        lbAttendance2 = new javax.swing.JLabel();
        lbLogout2 = new javax.swing.JLabel();
        lbEditInformation2 = new javax.swing.JLabel();
        lbViewCus = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAtt = new javax.swing.JTable();
        lbErrorUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Information");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("ATTENDANCE");

        pHeader2.setBackground(new java.awt.Color(0, 102, 102));
        pHeader2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader2.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCustomGuide3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCustomGuide3.setForeground(new java.awt.Color(255, 255, 255));
        lbCustomGuide3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCustomGuide3.setText("Customer Guide");
        lbCustomGuide3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbCustomGuide3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCustomGuide3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCustomGuide3MouseClicked(evt);
            }
        });

        lbNewandEvent3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNewandEvent3.setForeground(new java.awt.Color(255, 255, 255));
        lbNewandEvent3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNewandEvent3.setText("News and Event");
        lbNewandEvent3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNewandEvent3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNewandEvent3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNewandEvent3MouseClicked(evt);
            }
        });

        lbIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        lbIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIcon2MouseClicked(evt);
            }
        });

        lbAttendance2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbAttendance2.setForeground(new java.awt.Color(255, 153, 0));
        lbAttendance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAttendance2.setText("Attendance");
        lbAttendance2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbAttendance2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbAttendance2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAttendance2MouseClicked(evt);
            }
        });

        lbLogout2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbLogout2.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout2.setText("   Log out?");
        lbLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogout2MouseClicked(evt);
            }
        });

        lbEditInformation2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditInformation2.setForeground(new java.awt.Color(255, 255, 255));
        lbEditInformation2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditInformation2.setText("Edit Information");
        lbEditInformation2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditInformation2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditInformation2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditInformation2MouseClicked(evt);
            }
        });

        lbViewCus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbViewCus.setForeground(new java.awt.Color(255, 255, 255));
        lbViewCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbViewCus.setText("View Customer List");
        lbViewCus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbViewCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbViewCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbViewCusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pHeader2Layout = new javax.swing.GroupLayout(pHeader2);
        pHeader2.setLayout(pHeader2Layout);
        pHeader2Layout.setHorizontalGroup(
            pHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader2Layout.createSequentialGroup()
                .addComponent(lbViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeader2Layout.createSequentialGroup()
                        .addComponent(lbCustomGuide3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNewandEvent3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbAttendance2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pHeader2Layout.createSequentialGroup()
                        .addGap(0, 765, Short.MAX_VALUE)
                        .addComponent(lbLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon2)))
                .addContainerGap())
        );
        pHeader2Layout.setVerticalGroup(
            pHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon2)
                    .addComponent(lbLogout2))
                .addGap(2, 2, 2)
                .addGroup(pHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNewandEvent3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCustomGuide3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbAtt.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbAtt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Phone", "Pack", "PT Name", "Time"
            }
        ));
        jScrollPane1.setViewportView(tbAtt);

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(lbTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbErrorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch)))
                        .addGap(0, 329, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCustomGuide3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCustomGuide3MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomerGuideForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCustomGuide3MouseClicked

    private void lbNewandEvent3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNewandEvent3MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventPTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNewandEvent3MouseClicked

    private void lbIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon2MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIcon2MouseClicked

    private void lbAttendance2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAttendance2MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePT().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAttendance2MouseClicked

    private void lbLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogout2MouseClicked
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
    }//GEN-LAST:event_lbLogout2MouseClicked

    private void lbEditInformation2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditInformation2MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationFTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditInformation2MouseClicked

    private void lbViewCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewCusMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerList().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbViewCusMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String uName = txtSearch.getText();
        Connection conn = MainConnection.getConnection();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
        } else {
            try {
                lbErrorUser.setText(null);
                lbErrorUser.setForeground(null);
                String sql = "select Customer.Firstname,Customer.Lastname,Customer.Phone,TrainingPack.Infor,PT.UsernamePT,AttendanceSheet.Time from TrainingPack,ReportSalary,Customer,AttendanceSheet,PT where TrainingPack.IDPack = ReportSalary.IDPack AND Customer.UsernameCus = ReportSalary.UsernameCus AND Customer.UsernameCus = AttendanceSheet.UsernameCus AND AttendanceSheet.UsernamePT = PT.UsernamePT AND PT.UsernamePT=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbAtt.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columndata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columndata.add(rs.getString("Firstname") + " " + rs.getString("Lastname"));
                        columndata.add(rs.getString("Phone"));
                        columndata.add(rs.getString("Infor"));
                        columndata.add(rs.getString("UsernamePT"));
                        columndata.add(rs.getString("Time"));
                    }
                    db.addRow(columndata);
                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAttendance2;
    private javax.swing.JLabel lbCustomGuide3;
    private javax.swing.JLabel lbEditInformation2;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbIcon2;
    private javax.swing.JLabel lbLogout2;
    private javax.swing.JLabel lbNewandEvent3;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbViewCus;
    private javax.swing.JPanel pHeader2;
    private javax.swing.JTable tbAtt;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
