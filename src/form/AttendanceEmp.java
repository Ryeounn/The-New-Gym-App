package form;

import form.*;
import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class AttendanceEmp extends javax.swing.JFrame {

    public AttendanceEmp() {
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
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAtt = new javax.swing.JTable();
        lbErrorUser = new javax.swing.JLabel();
        pHeader = new javax.swing.JPanel();
        lbCreateCus = new javax.swing.JLabel();
        lbEditCus = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbInfor = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        btnAttendance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Information");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("ATTENDANCE");

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Username", "Time"
            }
        ));
        jScrollPane1.setViewportView(tbAtt);

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCreateCus.setBackground(new java.awt.Color(255, 255, 255));
        lbCreateCus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCreateCus.setForeground(new java.awt.Color(255, 255, 255));
        lbCreateCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreateCus.setText("Create Customer");
        lbCreateCus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbCreateCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCreateCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateCusMouseClicked(evt);
            }
        });

        lbEditCus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditCus.setForeground(new java.awt.Color(255, 255, 255));
        lbEditCus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditCus.setText("Edit Customer");
        lbEditCus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditCusMouseClicked(evt);
            }
        });

        lbAttendance.setBackground(new java.awt.Color(255, 153, 0));
        lbAttendance.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbAttendance.setForeground(new java.awt.Color(255, 153, 0));
        lbAttendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAttendance.setText("Attendance");
        lbAttendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCreateCus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditCus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addGap(0, 895, Short.MAX_VALUE)
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
                .addGap(4, 4, 4)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditCus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreateCus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAttendance.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnAttendance.setText("CHECK IN");
        btnAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAttendance)
                        .addGap(235, 235, 235)))
                .addGap(0, 0, 0))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(379, 379, 379))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnAttendance))
                .addGap(13, 13, 13)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showTable() {
        Connection conn = MainConnection.getConnection();
        String uName = txtSearch.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
        } else {
            try {
                String sql = "select Employee.Firstname,Employee.Lastname,Employee.UsernameEmp,Att_Emp.Time from Employee,Att_Emp where Employee.UsernameEmp = Att_Emp.UsernameEmp AND Employee.UsernameEmp=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbAtt.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columdata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columdata.add(rs.getString("Firstname") + " " + rs.getString("Lastname"));
                        columdata.add(rs.getString("UsernameEmp"));
                        columdata.add(rs.getString("Time"));
                    }
                    db.addRow(columdata);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
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
                String sql = "select Employee.Firstname,Employee.Lastname,Employee.UsernameEmp,Att_Emp.Time from Employee,Att_Emp where Employee.UsernameEmp = Att_Emp.UsernameEmp AND Employee.UsernameEmp=?";
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
                        columndata.add(rs.getString("UsernameEmp"));
                        columndata.add(rs.getString("Time"));
                    }
                    db.addRow(columndata);
                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void lbCreateCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateCusMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CreateCusForm().setVisible(true);
                } catch (InstantiationException ex) {
                    System.out.println(ex);
                }
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCreateCusMouseClicked

    private void lbInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInforMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationEmpForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbInforMouseClicked

    private void lbEditCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditCusMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditCusMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int output = JOptionPane.showConfirmDialog(this, "Log out the system?");
        if(output == JOptionPane.YES_OPTION){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginForm().setVisible(true);
                }
            });
            this.setVisible(false);
        }else if(output == JOptionPane.NO_OPTION){
            initComponents();
        }
        else if(output == JOptionPane.CANCEL_OPTION){
            initComponents();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        try {
            java.util.Date date = new java.util.Date();
            DateFormat dateformat = null;
            dateformat = new SimpleDateFormat("MMM dd yyyy  h:mma");
            String uName = txtSearch.getText();
            Connection conn = MainConnection.getConnection();
            String query = "select Employee.Firstname,Employee.Lastname,Employee.UsernameEmp,Att_Emp.Time from Employee,Att_Emp where Employee.UsernameEmp = Att_Emp.UsernameEmp AND Employee.UsernameEmp=?";
            PreparedStatement psb = conn.prepareStatement(query);
            psb.setString(1, uName);
            ResultSet rsb = psb.executeQuery();
            while (rsb.next()) {
                if ("".equals(rsb.getString("Time")) || null == rsb.getString("Time")) {
                    String sql = "update Att_Emp set Time=CURRENT_TIMESTAMP  where UsernameEmp=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, uName);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Check in Succesfully");
                    break;
                } else if (!dateformat.format(date).equals(rsb.getString("Time"))) {
                    String queryInsert = "insert into Att_Emp(Time,UsernameEmp) values (?,?)";
                    PreparedStatement psa = conn.prepareStatement(queryInsert);
                    psa.setString(1, dateformat.format(date));
                    psa.setString(2, uName);
                    psa.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Check in Succesfully");
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Check in fail");
                    break;
                }
            }
            showTable();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void lbFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFeedbackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageFeedback().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex);
                }
            }
        });
    }//GEN-LAST:event_lbFeedbackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbCreateCus;
    private javax.swing.JLabel lbEditCus;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pHeader;
    private javax.swing.JTable tbAtt;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
