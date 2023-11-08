package form;

import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        btnLogin.setOpaque(true);
        btnLogin.setContentAreaFilled(true);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
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

        jPanel1 = new javax.swing.JPanel();
        lbIconlogin = new javax.swing.JLabel();
        lbCompany = new javax.swing.JLabel();
        lbHotline = new javax.swing.JLabel();
        pLogin = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbErrorUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnPass = new javax.swing.JButton();
        lbErrorPass = new javax.swing.JLabel();
        lbForget = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(464, 205));

        lbIconlogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbIconlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logologin.png"))); // NOI18N

        lbCompany.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        lbCompany.setForeground(new java.awt.Color(255, 255, 255));
        lbCompany.setText("3T MUSCLE FITNESS AND GYM");

        lbHotline.setBackground(new java.awt.Color(0, 102, 102));
        lbHotline.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lbHotline.setForeground(new java.awt.Color(255, 255, 255));
        lbHotline.setText("Hotline: 0707181243");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbCompany)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lbIconlogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbHotline)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(lbIconlogin)
                .addGap(18, 18, 18)
                .addComponent(lbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHotline)
                .addContainerGap())
        );

        pLogin.setBackground(new java.awt.Color(255, 255, 255));

        lbLogin.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(0, 102, 102));
        lbLogin.setText("LOGIN");

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbUser.setText("Username");

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtUserMouseMoved(evt);
            }
        });

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbErrorUser.setForeground(new java.awt.Color(255, 0, 0));

        lbPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbPass.setText("Password");

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtPass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPassMouseMoved(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnPass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnPass.setForeground(new java.awt.Color(255, 0, 0));
        btnPass.setText("FORGET PASSWORD");
        btnPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });

        lbErrorPass.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbErrorPass.setForeground(new java.awt.Color(255, 0, 0));

        lbForget.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbForget.setText("I forget password?");

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(lbLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(lbForget, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnPass))
                    .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(lbErrorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbLogin)
                .addGap(18, 18, 18)
                .addComponent(lbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPass)
                    .addComponent(lbForget, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkManager() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        try {
            String sql = "select Username,Password from Manager where Username=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("Username").equals(uName) && rs.getString("Password").equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkEmployee() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        try {
            String sql = "select UsernameEmp,Password from Employee where UsernameEmp=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernameEmp").equals(uName) && rs.getString("Password").equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkCustomer() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        try {
            String sql = "select UsernameCus,Password from Customer where UsernameCus=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernameCus").equals(uName) && rs.getString("Password").equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkPT() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        try {
            String sql = "select UsernamePT,Password from PT where UsernamePT=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernamePT").equals(uName) && rs.getString("Password").equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserManager() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Username from Manager where Username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUser.setText("Username match");
                lbErrorUser.setForeground(Color.green);
                return true;
            } else {
                lbErrorUser.setText("Can't find Username");
                lbErrorUser.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserEmp() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameEmp from Employee where UsernameEmp=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUser.setText("Username match");
                lbErrorUser.setForeground(Color.green);
                return true;
            } else {
                lbErrorUser.setText("Can't find Username");
                lbErrorUser.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserPT() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernamePT from PT where UsernamePT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUser.setText("Username match");
                lbErrorUser.setForeground(Color.green);
                return true;
            } else {
                lbErrorUser.setText("Can't find Username");
                lbErrorUser.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserCustomer() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameCus from Customer where UsernameCus=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUser.setText("Username match");
                lbErrorUser.setForeground(Color.green);
                return true;
            } else {
                lbErrorUser.setText("Can't find Username");
                lbErrorUser.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPassManager() {
        String pass = txtPass.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Username,Password from Manager where Password=? AND Username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPass.setText("Password match");
                lbErrorPass.setForeground(Color.green);
                return true;
            } else {
                lbErrorPass.setText("Can't find Password");
                lbErrorPass.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPassEmp() {
        String pass = txtPass.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameEmp,Password from Employee where Password=? AND UsernameEmp=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPass.setText("Password match");
                lbErrorPass.setForeground(Color.green);
                return true;
            } else {
                lbErrorPass.setText("Can't find Password");
                lbErrorPass.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPassPT() {
        String pass = txtPass.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernamePT,Password from PT where Password=? AND UsernamePT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPass.setText("Password match");
                lbErrorPass.setForeground(Color.green);
                return true;
            } else {
                lbErrorPass.setText("Can't find Password");
                lbErrorPass.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPassCustomer() {
        String pass = txtPass.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameCus,Password from Customer where Password=? AND UsernameCus=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPass.setText("Password match");
                lbErrorPass.setForeground(Color.green);
                return true;
            } else {
                lbErrorPass.setText("Can't find Password");
                lbErrorPass.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String pass = txtPass.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            txtUser.requestFocus();
            flag = true;
        } else {
            lbErrorUser.setText(null);
        }
        if (pass.equals("")) {
            lbErrorPass.setText("Password can't blank");
            txtUser.requestFocus();
            flag = true;
        } else {
            lbErrorPass.setText(null);
        }
        if (!flag) {
            if (checkManager()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new ManagerForm().setVisible(true);
                    }
                });
                this.setVisible(false);
            } else if (checkEmployee()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new EmpForm().setVisible(true);
                    }
                });
                this.setVisible(false);
            } else if (checkPT()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new PTForm().setVisible(true);
                    }
                });
                this.setVisible(false);
            } else if (checkCustomer()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CustomerForm().setVisible(true);
                    }
                });
                this.setVisible(false);
            } else {
                lbErrorUser.setText("Login information doesn't exist");
                lbErrorPass.setText("Login information doesn't exist");
                lbErrorUser.setForeground(Color.red);
                lbErrorPass.setForeground(Color.red);
                txtUser.requestFocus();
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPasswordForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_btnPassActionPerformed

    private void txtUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseMoved
        String uName = txtUser.getText();
        boolean flag = false;
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
            flag = true;
        }
        if (!flag) {
            if (checktxtUserManager()) {

            } else if (checktxtUserEmp()) {

            } else if (checktxtUserPT()) {

            } else if (checktxtUserCustomer()) {

            } else {
                lbErrorUser.setText("Username doesn't exist");
            }
        }
    }//GEN-LAST:event_txtUserMouseMoved

    private void txtPassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseMoved
        String pass = txtPass.getText();
        boolean flag = false;
        if (pass.equals("")) {
            lbErrorPass.setText("Password can't blank");
            lbErrorPass.setForeground(Color.red);
            flag = true;
        }
        if (!flag) {
            if (checktxtPassManager()) {

            } else if (checktxtPassEmp()) {

            } else if (checktxtPassPT()) {

            } else if (checktxtPassCustomer()) {

            } else {
                lbErrorPass.setText("Password doesn't exist");
            }
        }
    }//GEN-LAST:event_txtPassMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCompany;
    private javax.swing.JLabel lbErrorPass;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbForget;
    private javax.swing.JLabel lbHotline;
    private javax.swing.JLabel lbIconlogin;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
