package form;

import form.AboutUs;
import app.MainConnection;
import form.LoginForm;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ngu Công
 */
public class AttendanceCusForm extends javax.swing.JFrame {

    /**
     * Creates new form demo
     */
    public AttendanceCusForm() {
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
        lbEditInfor = new javax.swing.JLabel();
        lbFitness = new javax.swing.JLabel();
        lbNutrizone = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbNandE = new javax.swing.JLabel();
        lbAboutUs = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        lbAtt = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lbErrorUser = new javax.swing.JLabel();
        spAtt = new javax.swing.JScrollPane();
        tbAttendance = new javax.swing.JTable();
        btnAttendance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

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

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        lbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIconMouseClicked(evt);
            }
        });

        lbLogout.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("Log out?");
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });

        lbAttendance.setBackground(new java.awt.Color(255, 255, 255));
        lbAttendance.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbAttendance.setForeground(new java.awt.Color(255, 153, 0));
        lbAttendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAttendance.setText("Attendance");
        lbAttendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNandE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon)
                .addContainerGap())
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(2, 2, 2)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNandE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbAtt.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbAtt.setText("ATTENDANCE");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        spAtt.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tbAttendance.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Phone", "Email", "Pack", "Time"
            }
        ));
        spAtt.setViewportView(tbAttendance);

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
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAtt)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(lbAtt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbErrorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAttendance)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lbAtt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAttendance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(spAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
                String sql = "select Customer.UsernameCus,Customer.Phone,Customer.Email,AttendanceSheet.Time,TrainingPack.Infor from Customer,AttendanceSheet,ReportSalary,TrainingPack where ReportSalary.UsernameCus = AttendanceSheet.UsernameCus AND AttendanceSheet.UsernameCus = Customer.UsernameCus AND ReportSalary.IDPack = TrainingPack.IDPack AND Customer.UsernameCus=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbAttendance.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columdata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columdata.add(rs.getString("UsernameCus"));
                        columdata.add(rs.getString("Phone"));
                        columdata.add(rs.getString("Email"));
                        columdata.add(rs.getString("Infor"));
                        columdata.add(rs.getString("Time"));
                    }
                    db.addRow(columdata);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        // TODO add your handling code here:
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Connection conn = MainConnection.getConnection();
        String uName = txtSearch.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
        } else {
            try {
                String sql = "select Customer.UsernameCus,Customer.Phone,Customer.Email,AttendanceSheet.Time,TrainingPack.Infor from Customer,AttendanceSheet,ReportSalary,TrainingPack where ReportSalary.UsernameCus = AttendanceSheet.UsernameCus AND AttendanceSheet.UsernameCus = Customer.UsernameCus AND ReportSalary.IDPack = TrainingPack.IDPack AND Customer.UsernameCus=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbAttendance.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columdata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columdata.add(rs.getString("UsernameCus"));
                        columdata.add(rs.getString("Phone"));
                        columdata.add(rs.getString("Email"));
                        columdata.add(rs.getString("Infor"));
                        columdata.add(rs.getString("Time"));
                    }
                    db.addRow(columdata);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        try {
            java.util.Date date = new java.util.Date();
            DateFormat dateformat = null;
            dateformat = new SimpleDateFormat("MMM dd yyyy  h:mma");
            String uName = txtSearch.getText();
            Connection conn = MainConnection.getConnection();
            String query = "select Customer.UsernameCus,AttendanceSheet.Time,AttendanceSheet.UsernamePT from Customer,AttendanceSheet where Customer.UsernameCus = AttendanceSheet.UsernameCus AND Customer.UsernameCus=?";
            PreparedStatement psb = conn.prepareStatement(query);
            psb.setString(1, uName);
            ResultSet rsb = psb.executeQuery();
            while (rsb.next()) {
                if ("".equals(rsb.getString("Time")) || null == rsb.getString("Time")) {
                    String sql = "update AttendanceSheet set Time=CURRENT_TIMESTAMP where AttendanceSheet.UsernameCus=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, uName);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Check in Succesfully");
                    break;
                } else if (!dateformat.format(date).equals(rsb.getString("Time"))) {
                    String queryInsert = "insert into AttendanceSheet(Time,UsernameCus,UsernamePT) values (?,?,?)";
                    PreparedStatement psa = conn.prepareStatement(queryInsert);
                    psa.setString(1, dateformat.format(date));
                    psa.setString(2, uName);
                    psa.setString(3, rsb.getString("UsernamePT"));
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

    private void lbAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAboutUsMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }//GEN-LAST:event_lbAboutUsMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked

    private void lbNandEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNandEMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNandEMouseClicked

    private void lbNutrizoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNutrizoneMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutritionZoneForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNutrizoneMouseClicked

    private void lbFitnessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFitnessMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FitnessProgram().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFitnessMouseClicked

    private void lbEditInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditInforMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationCusForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditInforMouseClicked

    private void lbFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFeedbackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFeedbackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JLabel lbAtt;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbEditInfor;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFitness;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNandE;
    private javax.swing.JLabel lbNutrizone;
    private javax.swing.JPanel pHeader;
    private javax.swing.JScrollPane spAtt;
    private javax.swing.JTable tbAttendance;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
