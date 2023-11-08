package form;

import javax.swing.JOptionPane;

public class ManagerForm extends javax.swing.JFrame {

    public ManagerForm() {
        initComponents();
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
        lbWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        pHeader.setBackground(new java.awt.Color(0, 102, 102));
        pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pHeader.setPreferredSize(new java.awt.Dimension(1000, 68));

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

        lbEditCustomer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEditCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lbEditCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditCustomer.setText("Edit Personal Trainer");
        lbEditCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbEditCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditCustomerMouseClicked(evt);
            }
        });

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
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon))
                    .addGroup(pHeaderLayout.createSequentialGroup()
                        .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
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
                .addGap(8, 8, 8)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCreatePT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReportSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    LoginForm lgF = new LoginForm();
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

    private void lbEditCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditCustomerMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbEditCustomerMouseClicked

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

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbCreateEmp;
    private javax.swing.JLabel lbCreatePT;
    private javax.swing.JLabel lbEditCustomer;
    private javax.swing.JLabel lbEditEmp;
    private javax.swing.JLabel lbEditInfor;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbReportSalary;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel pHeader;
    // End of variables declaration//GEN-END:variables
}
