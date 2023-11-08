/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;


import javax.swing.JOptionPane;
import app.MainConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public class ViewCustomerList extends javax.swing.JFrame {

    public ViewCustomerList() {
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
        lbViewCustom = new javax.swing.JLabel();
        lbCustomGuide = new javax.swing.JLabel();
        lbNewandEvent = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbEditInformation = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        spTable = new javax.swing.JScrollPane();
        tbCus = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Employee");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbViewCustom.setBackground(new java.awt.Color(255, 255, 255));
        lbViewCustom.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbViewCustom.setForeground(new java.awt.Color(255, 153, 0));
        lbViewCustom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbViewCustom.setText("View Customer List");
        lbViewCustom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbViewCustom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbCustomGuide.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCustomGuide.setForeground(new java.awt.Color(255, 255, 255));
        lbCustomGuide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCustomGuide.setText("Customer Guide");
        lbCustomGuide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbViewCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 770, Short.MAX_VALUE)
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
                    .addComponent(lbCustomGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbViewCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbTitle.setText("VIEW CUSTOMER LIST");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Phone", "Email", "UserName"
            }
        ));
        spTable.setViewportView(tbCus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(lbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(55, 55, 55)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCustomGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCustomGuideMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomerGuideForm().setVisible(true);
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
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Customer.Firstname,Customer.Lastname,Customer.Phone,Customer.Email,PT.UsernamePT,PT.Firstname,PT.Lastname from Customer,AttendanceSheet,PT where Customer.UsernameCus = AttendanceSheet.UsernameCus AND AttendanceSheet.UsernamePT=PT.UsernamePT order by PT.UsernamePT asc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
            int q = rm.getColumnCount();
            DefaultTableModel db = (DefaultTableModel) tbCus.getModel();
            db.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString("Firstname"));
                    columndata.add(rs.getString("Lastname"));
                    columndata.add(rs.getString("Phone"));
                    columndata.add(rs.getString("Email"));
                    columndata.add(rs.getString("UsernamePT"));

                }
                db.addRow(columndata);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbCustomGuide;
    private javax.swing.JLabel lbEditInformation;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNewandEvent;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbViewCustom;
    private javax.swing.JPanel pHeader;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTable tbCus;
    // End of variables declaration//GEN-END:variables
}
