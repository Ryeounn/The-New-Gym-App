package form;

import app.MainConnection;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class AboutUs extends javax.swing.JFrame {

    public AboutUs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pHeader1 = new javax.swing.JPanel();
        lbInfor = new javax.swing.JLabel();
        lbFitness = new javax.swing.JLabel();
        lbNutrizone = new javax.swing.JLabel();
        lbAttendance = new javax.swing.JLabel();
        lbNandE = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbAboutUs = new javax.swing.JLabel();
        lbFeedback = new javax.swing.JLabel();
        pIntro1 = new javax.swing.JPanel();
        lbIntroTitle = new javax.swing.JLabel();
        pIntro2 = new javax.swing.JPanel();
        lbTitleText = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();
        lbText2 = new javax.swing.JLabel();
        lbText3 = new javax.swing.JLabel();
        lbText4 = new javax.swing.JLabel();
        pIntro3 = new javax.swing.JPanel();
        lbIntroTitle1 = new javax.swing.JLabel();
        pIntro4 = new javax.swing.JPanel();
        lbIntroTitle2 = new javax.swing.JLabel();
        pIntro5 = new javax.swing.JPanel();
        lbIntroTitle3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

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

        lbAboutUs.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbAboutUs.setForeground(new java.awt.Color(255, 153, 0));
        lbAboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAboutUs.setText("About Us");
        lbAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        lbAboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout pHeader1Layout = new javax.swing.GroupLayout(pHeader1);
        pHeader1.setLayout(pHeader1Layout);
        pHeader1Layout.setHorizontalGroup(
            pHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeader1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 93, Short.MAX_VALUE))))
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
                    .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNandE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNutrizone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pIntro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pIntro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pIntro1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pIntro1MouseMoved(evt);
            }
        });
        pIntro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIntro1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIntro1MouseExited(evt);
            }
        });

        lbIntroTitle.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lbIntroTitle.setText("INTRODUCTION");

        javax.swing.GroupLayout pIntro1Layout = new javax.swing.GroupLayout(pIntro1);
        pIntro1.setLayout(pIntro1Layout);
        pIntro1Layout.setHorizontalGroup(
            pIntro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbIntroTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pIntro1Layout.setVerticalGroup(
            pIntro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIntro1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIntroTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pIntro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbTitleText.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        lbText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbText2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbText3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        lbText4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout pIntro2Layout = new javax.swing.GroupLayout(pIntro2);
        pIntro2.setLayout(pIntro2Layout);
        pIntro2Layout.setHorizontalGroup(
            pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIntro2Layout.createSequentialGroup()
                .addGroup(pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pIntro2Layout.createSequentialGroup()
                            .addGap(354, 354, 354)
                            .addComponent(lbTitleText))
                        .addGroup(pIntro2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbText2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pIntro2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbText4, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbText3, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        pIntro2Layout.setVerticalGroup(
            pIntro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pIntro3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pIntro3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pIntro3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pIntro3MouseMoved(evt);
            }
        });
        pIntro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIntro3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIntro3MouseExited(evt);
            }
        });

        lbIntroTitle1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lbIntroTitle1.setText("SUCCESS STORIES");

        javax.swing.GroupLayout pIntro3Layout = new javax.swing.GroupLayout(pIntro3);
        pIntro3.setLayout(pIntro3Layout);
        pIntro3Layout.setHorizontalGroup(
            pIntro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIntroTitle1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pIntro3Layout.setVerticalGroup(
            pIntro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIntroTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pIntro4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pIntro4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pIntro4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pIntro4MouseMoved(evt);
            }
        });
        pIntro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIntro4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIntro4MouseExited(evt);
            }
        });

        lbIntroTitle2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lbIntroTitle2.setText("BRANCH");

        javax.swing.GroupLayout pIntro4Layout = new javax.swing.GroupLayout(pIntro4);
        pIntro4.setLayout(pIntro4Layout);
        pIntro4Layout.setHorizontalGroup(
            pIntro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lbIntroTitle2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pIntro4Layout.setVerticalGroup(
            pIntro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIntro4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIntroTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pIntro5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pIntro5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pIntro5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pIntro5MouseMoved(evt);
            }
        });
        pIntro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIntro5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIntro5MouseExited(evt);
            }
        });

        lbIntroTitle3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lbIntroTitle3.setText("STAFF");

        javax.swing.GroupLayout pIntro5Layout = new javax.swing.GroupLayout(pIntro5);
        pIntro5.setLayout(pIntro5Layout);
        pIntro5Layout.setHorizontalGroup(
            pIntro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIntro5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbIntroTitle3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pIntro5Layout.setVerticalGroup(
            pIntro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIntro5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIntroTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbStaff.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Fisrt Name", "Last Name", "Gender", "Phone", "Email", "Address", "BrachID"
            }
        ));
        jScrollPane4.setViewportView(tbStaff);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pIntro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pIntro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pIntro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pIntro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addComponent(pIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pIntro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pIntro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pIntro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pIntro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6))
                    .addComponent(pIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
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

    private void lbFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFeedbackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbFeedbackMouseClicked

    private void pIntro1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro1MouseMoved
        lbIntroTitle.setForeground(Color.orange);
    }//GEN-LAST:event_pIntro1MouseMoved

    private void pIntro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro1MouseExited
        lbIntroTitle.setForeground(Color.black);
    }//GEN-LAST:event_pIntro1MouseExited

    private void pIntro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro1MouseClicked
        lbTitleText.setText("3T MUSCLE");
        lbText.setText("We're the lowest cost nationwide 24/7 Gym with over 10 operating sites.");
        lbText2.setText("It's our misson to break down barriers to fitness for everyone in Vietnam, providing top-quality gyms and expert");
        lbText3.setText("adviataffordable price.");
        lbText4.setText(null);
        lbIntroTitle.setForeground(Color.red);
    }//GEN-LAST:event_pIntro1MouseClicked

    private void pIntro3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro3MouseMoved
        lbIntroTitle1.setForeground(Color.orange);
    }//GEN-LAST:event_pIntro3MouseMoved

    private void pIntro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro3MouseClicked
        lbTitleText.setText("3T MUSCLE");
        lbText.setText("People have trusted and chosen 3T Muscle software to work well in the gym business.");
        lbText2.setText("Because 3T Muscle software connects to the maximum online on the mobile app, web, and app platforms.");
        lbText3.setText("This is the pride when accounting for 90% of the market share of Yoga, Fitness, and Swimming Pools in Vietnam.");
        lbText4.setText("From there, letting gyms across the country know about the software will somewhat improve the store's uptime.");
        lbIntroTitle1.setForeground(Color.red);
    }//GEN-LAST:event_pIntro3MouseClicked

    private void pIntro3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro3MouseExited
        lbIntroTitle1.setForeground(Color.black);
    }//GEN-LAST:event_pIntro3MouseExited

    private void pIntro4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro4MouseMoved
        lbIntroTitle2.setForeground(Color.orange);
    }//GEN-LAST:event_pIntro4MouseMoved

    private void pIntro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro4MouseClicked
        lbTitleText.setText("3T MUSCLE");
        lbText.setText("1. 1068 Hau Giang, Ward 12, District 6, HCMC");
        lbText2.setText("2. 58D Ung Van Khiem, Ward 25, Binh Thanh District, HCMC");
        lbText3.setText("3. 99 Nguyen Van Cu extends, An Binh Ward, Ninh Kieu District, Can Tho City, Vietnam ");
        lbText4.setText(null);
        lbIntroTitle2.setForeground(Color.red);
    }//GEN-LAST:event_pIntro4MouseClicked

    private void pIntro4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro4MouseExited
        lbIntroTitle2.setForeground(Color.black);
    }//GEN-LAST:event_pIntro4MouseExited

    private void pIntro5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro5MouseMoved
        lbIntroTitle3.setForeground(Color.orange);
    }//GEN-LAST:event_pIntro5MouseMoved

    private void pIntro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro5MouseClicked
        try {
            lbTitleText.setText("3T MUSCLE");
            lbIntroTitle3.setForeground(Color.red);
            Connection conn = MainConnection.getConnection();
            String sql = "select Firstname,Lastname,Gender,Phone,Email,Address,BranchID from Employee order by BranchID asc";
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
                int q = rm.getColumnCount();
                DefaultTableModel db = (DefaultTableModel) tbStaff.getModel();
                db.setRowCount(0);
                while (rs.next()) {
                    Vector columdata = new Vector();
                    for (int i = 1; i <= q; i++) {
                        columdata.add(rs.getString("Firstname"));
                        columdata.add(rs.getString("Lastname"));
                        columdata.add(rs.getString("Gender"));
                        columdata.add(rs.getString("Phone"));
                        columdata.add(rs.getString("Email"));
                        columdata.add(rs.getString("Address"));
                        columdata.add(rs.getString("BranchID"));
                    }
                    db.addRow(columdata);
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_pIntro5MouseClicked

    private void pIntro5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIntro5MouseExited
        lbIntroTitle3.setForeground(Color.black);
    }//GEN-LAST:event_pIntro5MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JLabel lbAttendance;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFitness;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JLabel lbIntroTitle;
    private javax.swing.JLabel lbIntroTitle1;
    private javax.swing.JLabel lbIntroTitle2;
    private javax.swing.JLabel lbIntroTitle3;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNandE;
    private javax.swing.JLabel lbNutrizone;
    private javax.swing.JLabel lbText;
    private javax.swing.JLabel lbText2;
    private javax.swing.JLabel lbText3;
    private javax.swing.JLabel lbText4;
    private javax.swing.JLabel lbTitleText;
    private javax.swing.JPanel pHeader1;
    private javax.swing.JPanel pIntro1;
    private javax.swing.JPanel pIntro2;
    private javax.swing.JPanel pIntro3;
    private javax.swing.JPanel pIntro4;
    private javax.swing.JPanel pIntro5;
    private javax.swing.JTable tbStaff;
    // End of variables declaration//GEN-END:variables
}
