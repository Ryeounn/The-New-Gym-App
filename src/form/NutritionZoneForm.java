package form;

import app.MainConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class NutritionZoneForm extends javax.swing.JFrame {

    public NutritionZoneForm() {
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

        pHeader1 = new javax.swing.JPanel();
        lbInfor = new javax.swing.JLabel();
        lbNutrizone = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbNandE = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        lbAboutUs = new javax.swing.JLabel();
        lbFitness = new javax.swing.JLabel();
        lbNutri = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNutrition = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbWhey = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lbNutrizone.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbNutrizone.setForeground(new java.awt.Color(255, 153, 0));
        lbNutrizone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNutrizone.setText("Nutrition Zone");
        lbNutrizone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
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

        lbFitness.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout pHeader1Layout = new javax.swing.GroupLayout(pHeader1);
        pHeader1.setLayout(pHeader1Layout);
        pHeader1Layout.setHorizontalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 98, Short.MAX_VALUE))))
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
                    .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbNutri.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lbNutri.setText("NUTRITION ZONE");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbNutrition.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbNutrition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Number", "Food"
            }
        ));
        jScrollPane1.setViewportView(tbNutrition);

        tbWhey.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbWhey.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "Whey", "Ingredient", "Price"
            }
        ));
        jScrollPane2.setViewportView(tbWhey);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(lbNutri))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(449, 449, 449)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 385, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lbNutri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
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

    private void lbFitnessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFitnessMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FitnessProgram().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFitnessMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Connection conn = MainConnection.getConnection();
            try {
                String sql1pt = "select MenuID,NameFood from Menu";
                PreparedStatement ps = conn.prepareStatement(sql1pt);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbNutrition.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columdata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columdata.add(rs.getString("MenuID"));
                        columdata.add(rs.getString("NameFood"));
                    }
                    db.addRow(columdata);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        try {
            String sql= "select WheyID,Name,Ingredient,Price from Whey";
            PreparedStatement pswhey = conn.prepareStatement(sql);
            ResultSet rswhey = pswhey.executeQuery();
            ResultSetMetaData rsm = rswhey.getMetaData();
            int w = rsm.getColumnCount();
            DefaultTableModel dtb = (DefaultTableModel) tbWhey.getModel();
            dtb.setRowCount(0);
            while(rswhey.next()){
                Vector colunmdt = new Vector();
                for(int j = 1; j < w; j++){
                    colunmdt.add(rswhey.getString("WheyID"));
                    colunmdt.add(rswhey.getString("Name"));
                    colunmdt.add(rswhey.getString("Ingredient"));
                    colunmdt.add(rswhey.getString("Price"));
                }
                dtb.addRow(colunmdt);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFitness;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNandE;
    private javax.swing.JLabel lbNutri;
    private javax.swing.JLabel lbNutrizone;
    private javax.swing.JPanel pHeader1;
    private javax.swing.JTable tbNutrition;
    private javax.swing.JTable tbWhey;
    // End of variables declaration//GEN-END:variables
}
