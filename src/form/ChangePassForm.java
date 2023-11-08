package form;

import app.MainConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;

public class ChangePassForm extends javax.swing.JFrame {

    public ChangePassForm() {
        initComponents();
        btnChange.setOpaque(true);
        btnChange.setContentAreaFilled(true);
        btnChange.setBorderPainted(false);
        btnChange.setFocusPainted(false);
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

        lbNew = new javax.swing.JLabel();
        lbOld = new javax.swing.JLabel();
        lbConfirm = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbErrorOld = new javax.swing.JLabel();
        lbErrorNew = new javax.swing.JLabel();
        lbErrorConfirm = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbErrorUser = new javax.swing.JLabel();
        txtOld = new javax.swing.JPasswordField();
        txtNew = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forget Password");

        lbNew.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbNew.setText("New Password");

        lbOld.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbOld.setText("Old Password");

        lbConfirm.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbConfirm.setText("Confirm Password");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 102, 102));
        lbTitle.setText(" CHANGE PASSWORD");

        lbErrorOld.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorOld.setForeground(new java.awt.Color(255, 0, 0));

        lbErrorNew.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorNew.setForeground(new java.awt.Color(255, 0, 0));

        lbErrorConfirm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorConfirm.setForeground(new java.awt.Color(255, 0, 0));

        btnChange.setBackground(new java.awt.Color(0, 102, 102));
        btnChange.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("CHANGE PASSWORD");
        btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        lbBack.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menubackLogin.png"))); // NOI18N
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbUser.setText("Username");

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtUserMouseMoved(evt);
            }
        });

        lbErrorUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorUser.setForeground(new java.awt.Color(255, 0, 0));

        txtOld.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtOld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtOldMouseMoved(evt);
            }
        });

        txtNew.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtNew.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtNewMouseMoved(evt);
            }
        });

        txtConfirm.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtConfirm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtConfirmMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErrorOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbErrorNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbErrorConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNew)
                    .addComponent(txtUser)
                    .addComponent(lbErrorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOld)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(lbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnChange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbBack)
                .addGap(1, 1, 1)
                .addComponent(lbTitle)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOld, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorOld, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNew)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorNew, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirm)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkManager() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String oldP = txtOld.getText();
        String newP = txtOld.getText();
        String conP = txtConfirm.getText();
        try {
            String sql = "select Username,Password from Manager where Username=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, oldP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String query = "update Manager set Password=? where Username=?";
                PreparedStatement psc = conn.prepareStatement(query);
                psc.setString(1, conP);
                psc.setString(2, uName);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Password Succesfully");
                returnForm();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkEmp() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String oldP = txtOld.getText();
        String newP = txtOld.getText();
        String conP = txtConfirm.getText();
        try {
            String sql = "select UsernameEmp,Password from Employee where UsernameEmp=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, oldP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String query = "update Employee set Password=? where UsernameEmp=?";
                PreparedStatement psc = conn.prepareStatement(query);
                psc.setString(1, conP);
                psc.setString(2, uName);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Password Succesfully");
                returnForm();
                return true;
            } else {
                return false;
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
        String oldP = txtOld.getText();
        String newP = txtOld.getText();
        String conP = txtConfirm.getText();
        try {
            String sql = "select UsernamePT,Password from PT where UsernamePT=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, oldP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String query = "update PT set Password=? where UsernamePT=?";
                PreparedStatement psc = conn.prepareStatement(query);
                psc.setString(1, conP);
                psc.setString(2, uName);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Password Succesfully");
                returnForm();
                return true;
            } else {
                return false;
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
        String oldP = txtOld.getText();
        String newP = txtOld.getText();
        String conP = txtConfirm.getText();
        try {
            String sql = "select UsernameCus,Password from Customer where UsernameCus=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, oldP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String query = "update Customer set Password=? where UsernameCus=?";
                PreparedStatement psc = conn.prepareStatement(query);
                psc.setString(1, conP);
                psc.setString(2, uName);
                psc.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Password Succesfully");
                returnForm();
                return true;
            } else {
                return false;
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

    private boolean checktxtOldManager() {
        String old = txtOld.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Username,Password from Manager where Password=? AND Username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, old);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorOld.setText("Password match");
                lbErrorOld.setForeground(Color.green);
                return true;
            } else {
                lbErrorOld.setText("Can't find Password");
                lbErrorOld.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtOldEmp() {
        String old = txtOld.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameEmp,Password from Employee where Password=? AND UsernameEmp=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, old);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorOld.setText("Password match");
                lbErrorOld.setForeground(Color.green);
                return true;
            } else {
                lbErrorOld.setText("Can't find Password");
                lbErrorOld.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtOldPT() {
        String old = txtOld.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernamePT,Password from PT where Password=? AND UsernamePT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, old);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorOld.setText("Password match");
                lbErrorOld.setForeground(Color.green);
                return true;
            } else {
                lbErrorOld.setText("Can't find Password");
                lbErrorOld.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtOldCustomer() {
        String old = txtOld.getText();
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameCus,Password from Customer where Password=? AND UsernameCus=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, old);
            ps.setString(2, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorOld.setText("Password match");
                lbErrorOld.setForeground(Color.green);
                return true;
            } else {
                lbErrorOld.setText("Can't find Password");
                lbErrorOld.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public int returnForm() {
        if (JOptionPane.OK_OPTION == 0) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new EditInformationManageForm().setVisible(true);
                }
            });
            this.setVisible(false);
        }
        return 0;
    }

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInformationManageForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbBackMouseClicked

    private void txtNewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewMouseMoved
        Connection conn = MainConnection.getConnection();
        String uName = txtUser.getText();
        String newP = txtNew.getText();
        String old = txtOld.getText();
        String conP = txtConfirm.getText();
        if (newP.equals("")) {
            lbErrorNew.setText("New Pasword can't blank");
            lbErrorNew.setForeground(Color.red);
        } else if (newP.length() < 8) {
            lbErrorNew.setText("New Password must be at least 8 characters");
            lbErrorNew.setForeground(Color.red);
        } else if (newP.length() >= 8) {
            if (newP.equals(old)) {
                lbErrorNew.setText("New Password match Old Password");
                lbErrorNew.setForeground(Color.red);
            } else {
                lbErrorNew.setText("Usable Password");
                lbErrorNew.setForeground(Color.green);
            }
        }
    }//GEN-LAST:event_txtNewMouseMoved

    private void txtOldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOldMouseMoved
        Connection conn = MainConnection.getConnection();
        String pass = txtOld.getText();
        boolean flag = false;
        String old = txtOld.getText();
        if (pass.equals("")) {
            lbErrorOld.setText("Password can't blank");
            lbErrorOld.setForeground(Color.red);
            flag = true;
        } else if (pass.length() < 8) {
            lbErrorOld.setText("Password must be at least 8 characters");
            lbErrorOld.setForeground(Color.red);
            flag = true;
        }

        if (!flag) {
            if (checktxtOldManager()) {

            } else if (checktxtOldEmp()) {

            } else if (checktxtOldPT()) {

            } else if (checktxtOldCustomer()) {

            } else {
                lbErrorOld.setText("Password doesn't exist");
            }
        }
    }//GEN-LAST:event_txtOldMouseMoved

    private void txtConfirmMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmMouseMoved
        Connection conn = MainConnection.getConnection();
        String uName = txtUser.getText();
        String newP = txtNew.getText();
        String conP = txtConfirm.getText();
        if (conP.equals("")) {
            lbErrorConfirm.setText("Confirm Pasword can't blank");
            lbErrorConfirm.setForeground(Color.red);
        } else if (conP.length() < 8) {
            lbErrorConfirm.setText("Confirm Password must be at least 8 characters");
            lbErrorConfirm.setForeground(Color.red);
        } else if (conP.length() >= 8) {
            if (conP.equals(newP)) {
                lbErrorConfirm.setText("Confirm Password match Password");
                lbErrorConfirm.setForeground(Color.green);
            } else {
                lbErrorConfirm.setText("Confirm Password not match Password");
                lbErrorConfirm.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_txtConfirmMouseMoved

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String old = txtOld.getText();
        String newP = txtNew.getText();
        String conP = txtConfirm.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            txtUser.requestFocus();
            flag = true;
        } else {
            lbErrorUser.setText(null);
        }
        if (old.equals("")) {
            lbErrorOld.setText("Password can't blank");
            flag = true;
        } else {
            lbErrorOld.setText(null);
        }
        if (newP.equals("")) {
            lbErrorNew.setText("New Password can't blank");
            flag = true;
        } else {
            lbErrorNew.setText(null);
        }
        if (conP.equals("")) {
            lbErrorConfirm.setText("Confirm Password can't blank");
            flag = true;
        } else {
            lbErrorConfirm.setText(null);
        }

        if (!flag) {
            if (checkManager()) {

            } else if (checkEmp()) {

            } else if (checkPT()) {

            } else if (checkCustomer()) {

            } else {
                lbErrorUser.setText("Information doesn't exist");
                lbErrorUser.setForeground(Color.red);
                lbErrorOld.setText("Information doesn't exist");
                lbErrorOld.setForeground(Color.red);
                lbErrorNew.setText("Information doesn't exist");
                lbErrorNew.setForeground(Color.red);
                lbErrorConfirm.setText("Information doesn't exist");
                lbErrorConfirm.setForeground(Color.red);
            }
        }


    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseMoved
        Connection conn = MainConnection.getConnection();
        String uName = txtUser.getText();
        boolean flag = false;
        String old = txtOld.getText();
        if (uName.equals("")) {
            lbErrorUser.setText("Username can't blank");
            lbErrorUser.setForeground(Color.red);
            flag = true;
        } else if (uName.length() < 6) {
            lbErrorUser.setText("Username must be at least 6 characters");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbConfirm;
    private javax.swing.JLabel lbErrorConfirm;
    private javax.swing.JLabel lbErrorNew;
    private javax.swing.JLabel lbErrorOld;
    private javax.swing.JLabel lbErrorUser;
    private javax.swing.JLabel lbNew;
    private javax.swing.JLabel lbOld;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtNew;
    private javax.swing.JPasswordField txtOld;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
