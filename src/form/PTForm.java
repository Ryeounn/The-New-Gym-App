package form;


import javax.swing.JOptionPane;

public class PTForm extends javax.swing.JFrame {

    public PTForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pHeader = new javax.swing.JPanel();
        lbCustomer = new javax.swing.JLabel();
        lbGuide = new javax.swing.JLabel();
        lbNews = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbEditInfor = new javax.swing.JLabel();
        lbWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

        lbCustomer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lbCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCustomer.setText("View Customer List");
        lbCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCustomerMouseClicked(evt);
            }
        });

        lbGuide.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbGuide.setForeground(new java.awt.Color(255, 255, 255));
        lbGuide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuide.setText("Customer Guide");
        lbGuide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGuideMouseClicked(evt);
            }
        });

        lbNews.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNews.setForeground(new java.awt.Color(255, 255, 255));
        lbNews.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNews.setText("News and Event");
        lbNews.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbNews.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNewsMouseClicked(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
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

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNews, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 347, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon)
                    .addComponent(lbLogout))
                .addGap(8, 8, 8)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNews, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbWelcome.setFont(new java.awt.Font("Times New Roman", 3, 50)); // NOI18N
        lbWelcome.setForeground(new java.awt.Color(102, 102, 102));
        lbWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logologin.png"))); // NOI18N
        lbWelcome.setText("3T MUSCLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWelcome)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(lbWelcome)
                .addGap(0, 257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lbEditInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditInforMouseClicked
              java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationFTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditInforMouseClicked

    private void lbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCustomerMouseClicked
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerList().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbCustomerMouseClicked

    private void lbGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGuideMouseClicked
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomerGuideForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbGuideMouseClicked

    private void lbNewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNewsMouseClicked
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventPTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNewsMouseClicked

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

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbCustomer;
    private javax.swing.JLabel lbEditInfor;
    private javax.swing.JLabel lbGuide;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNews;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel pHeader;
    // End of variables declaration//GEN-END:variables
}
