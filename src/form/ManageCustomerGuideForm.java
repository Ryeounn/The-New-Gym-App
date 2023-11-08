package form;

import javax.swing.JOptionPane;
import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public class ManageCustomerGuideForm extends javax.swing.JFrame {

    public ManageCustomerGuideForm() {
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
        lbCustomGuide = new javax.swing.JLabel();
        lbNewandEvent = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbEditInformation = new javax.swing.JLabel();
        lbViewCus = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        spTable = new javax.swing.JScrollPane();
        tbCus = new javax.swing.JTable();
        lbErrorUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Employee");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCustomGuide.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbCustomGuide.setForeground(new java.awt.Color(255, 153, 0));
        lbCustomGuide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCustomGuide.setText("Customer Guide");
        lbCustomGuide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbCustomGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCustomGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCustomGuideMouseClicked(evt);
            }
        });

        lbNewandEvent.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNewandEvent.setForeground(new java.awt.Color(255, 255, 255));
        lbNewandEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNewandEvent.setText("News and Event");
        lbNewandEvent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNewandEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNewandEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNewandEventMouseClicked(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        lbIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIconMouseClicked(evt);
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

        lbEditInformation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditInformation.setForeground(new java.awt.Color(255, 255, 255));
        lbEditInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditInformation.setText("Edit Information");
        lbEditInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditInformationMouseClicked(evt);
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

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addComponent(lbViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCustomGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNewandEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addGap(0, 765, Short.MAX_VALUE)
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
                    .addComponent(lbNewandEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCustomGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("CUSTOMER GUIDE");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbCus.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UsernameCus", "FitnessID", "Stage", "Name Program"
            }
        ));
        spTable.setViewportView(tbCus);

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbErrorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(lbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCustomGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCustomGuideMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCustomGuideMouseClicked

    private void lbNewandEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNewandEventMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventPTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNewandEventMouseClicked

    private void lbAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAttendanceMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePT().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAttendanceMouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTForm().setVisible(true);
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String uName = txtSearch.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
        } else {
            try {
                lbErrorUser.setText(null);
                lbErrorUser.setForeground(null);
                Connection conn = MainConnection.getConnection();
                String sql = "select SelectFitnessProgram.UsernameCus,SelectFitnessProgram.FitnessID,FitnessProgram.Stage,TypeProgram.NameProgram from SelectFitnessProgram,FitnessProgram,TypeProgram where SelectFitnessProgram.FitnessID = FitnessProgram.FitnessID AND FitnessProgram.TypeID = TypeProgram.TypeID AND SelectFitnessProgram.UsernameCus=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, uName);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbCus.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columndata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columndata.add(rs.getString("UsernameCus"));
                        columndata.add(rs.getString("FitnessID"));
                        columndata.add(rs.getString("Stage"));
                        columndata.add(rs.getString("NameProgram"));
                        
                    }
                    db.addRow(columndata);
                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void lbEditInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditInformationMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationFTForm().setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_lbEditInformationMouseClicked

    private void lbViewCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewCusMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerList().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbViewCusMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbCustomGuide;
    private javax.swing.JLabel lbEditInformation;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNewandEvent;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbViewCus;
    private javax.swing.JPanel pHeader;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTable tbCus;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
