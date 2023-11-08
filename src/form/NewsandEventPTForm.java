package form;

import form.*;
import form.FitnessProgram;
import form.FeedbackForm;
import form.EditInformationCusForm;
import form.CustomerForm;
import form.AttendanceCusForm;
import form.AboutUs;
import app.MainConnection;
import app.Muscle3TApp;
import java.sql.PreparedStatement;
import form.LoginForm;
import java.awt.Color;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NewsandEventPTForm extends javax.swing.JFrame {

    public NewsandEventPTForm() {
        initComponents();
        new1();
        new2();
        new3();
        new4();
        new5();
        new6();
        new7();
    }

    private void new1() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 1);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb1.setText("1. "+rsNew.getString("NEInfor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new2() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 2);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb2.setText("2. "+rsNew.getString("NEInfor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new3() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 3);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb3.setText("3. "+rsNew.getString("NEInfor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new4() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 4);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb4.setText("4. "+rsNew.getString("NEInfor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new5() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 10);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb5.setText("5. "+rsNew.getString("NEName"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new6() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 11);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb6.setText("6. "+rsNew.getString("NEName"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void new7() {
        try {
            Connection conn = MainConnection.getConnection();
            String sqlNew1 = "select NEName,NEInfor,NEDetails from NewsaEvent where ID=?";
            PreparedStatement psNew = conn.prepareStatement(sqlNew1);
            psNew.setInt(1, 6);
            ResultSet rsNew = psNew.executeQuery();
            while (rsNew.next()) {
                lb7.setText("7. "+rsNew.getString("NEName"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNews = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pHeader = new javax.swing.JPanel();
        lbCustomer = new javax.swing.JLabel();
        lbGuide = new javax.swing.JLabel();
        lbNews1 = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbEditInfor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        lbNews.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbNews.setText("NEWS AND EVENT");

        lb1.setBackground(new java.awt.Color(102, 102, 102));
        lb1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 153, 0));
        lb1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 153, 0));
        lb2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 153, 0));
        lb3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 153, 0));
        lb4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });

        lb5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 153, 0));
        lb5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });

        lb6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 153, 0));
        lb6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });

        lb7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 153, 0));
        lb7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("SEA GAME 32");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sea_games_32.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

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

        lbNews1.setBackground(new java.awt.Color(255, 153, 0));
        lbNews1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbNews1.setForeground(new java.awt.Color(255, 153, 0));
        lbNews1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNews1.setText("News and Event");
        lbNews1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbNews1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNews1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNews1MouseClicked(evt);
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
                        .addComponent(lbNews1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(4, 4, 4)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNews1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbNews)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(pHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbNews)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://baotintuc.vn/the-thao/sea-games-32-cu-ta-viet-nam-vuot-chi-tieu-hcv-20230516163828967.html";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb1MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://thanhnien.vn/nguoi-manh-nhat-the-gioi-an-uong-nhu-the-nao-trong-mot-ngay-185230222235423988.htm";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb2MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://vir.com.vn/mandatory-exercise-at-the-office-swedens-latest-craze-56631.html";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://thethao247.vn/sea-games/438-ket-qua-nu-viet-nam-vs-nu-myanmar-bao-ve-ngoi-vo-dich-d286850.html";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb4MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://e.vnexpress.net/news/football/thai-defender-blames-referee-for-sea-games-football-final-chaos-4606375.html";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb5MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://e.vnexpress.net/news/sports/vietnam-tops-120-gold-target-at-sea-games-32-4605616.htmls";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb6MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
        try {
            Runtime run = Runtime.getRuntime();
            String url = "https://e.vnexpress.net/news/sports/sea-games-32-closes-4606523.html";
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lb7MouseClicked

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

    private void lbNews1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNews1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsandEventForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbNews1MouseClicked

    private void lbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbIconMouseClicked

    private void lbAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAttendanceMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePT().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbAttendanceMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbCustomer;
    private javax.swing.JLabel lbEditInfor;
    private javax.swing.JLabel lbGuide;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNews;
    private javax.swing.JLabel lbNews1;
    private javax.swing.JPanel pHeader;
    // End of variables declaration//GEN-END:variables
}
