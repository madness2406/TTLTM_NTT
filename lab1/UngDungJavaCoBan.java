/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author FPTShop
 */
public class UngDungJavaCoBan extends javax.swing.JFrame {

    String operad1 = "";//Toán hạng 1
    String operator = "";//Hành động người dùng đã lựa chọn
    boolean Dbang = false;

    /**
     * Creates new form UngDungJavaCoBan
     */
    public UngDungJavaCoBan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtScreen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnFraction = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEquasl = new javax.swing.JButton();

        jButton16.setText("jButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtScreen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(5, 4, 5, 5));

        btnFraction.setText("1/x");
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnFraction);

        btnSquareRoot.setText("sqrt");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnSquareRoot);

        btnPercentage.setText("%");
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        jPanel2.add(btnPercentage);

        btnMultiply.setText("/");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiply);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        btnPerson.setText("*");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnPerson);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtract);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);

        btnDot.setText("^2");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        jPanel2.add(btnDot);

        btnEquasl.setText("=");
        btnEquasl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquaslActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquasl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (Dbang) {
            Dbang = false;
            txtScreen.setText("");
        }
        String cmd = evt.getActionCommand();//cung cấp cho bạn một Chuỗi đại diện cho lệnh hành động
        txtScreen.setText(txtScreen.getText() + cmd);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        String cmd = evt.getActionCommand();
        operator = cmd;
        operad1 = txtScreen.getText();
        txtScreen.setText("");
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnEquaslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquaslActionPerformed
        if (txtScreen.getText().equals("") || operad1.equals("")) {
            return;
        }
        try {
            double operand1 = Double.parseDouble(operad1);
            double operand2 = Double.parseDouble(txtScreen.getText());
            double Screen = 0;
            if (operator.equals("+")) {
                Screen = operand1 + operand2;
            } else if (operator.equals("-")) {
                Screen = operand1 - operand2;
            } else if (operator.equals("*")) {
                Screen = operand1 * operand2;
            } else if (operator.equals("/")) {
                Screen = operand1 / operand2;
            }
            txtScreen.setText("" + Screen);
            Dbang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEquaslActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtScreen.setText("");
        operad1 = "";
        operator = "";
        Dbang = false;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        if (txtScreen.getText().equals("")) {
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(txtScreen.getText());
            if (cmd.equals("sqrt")) {
                value = Math.sqrt(value);
            } else if (cmd.equals("%")) {
                value = value * 100;
            }
            if (cmd.equals("1/x")) {
                value = 1 / value;
            }
            txtScreen.setText(""+value);
            Dbang=true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if (txtScreen.getText().equals("")) {
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(txtScreen.getText());
            if (cmd.equals("^2")) {
                value = value*value;
            }
            txtScreen.setText(""+value);
            Dbang=true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDotActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UngDungJavaCoBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UngDungJavaCoBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UngDungJavaCoBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UngDungJavaCoBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UngDungJavaCoBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEquasl;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtScreen;
    // End of variables declaration//GEN-END:variables
}
