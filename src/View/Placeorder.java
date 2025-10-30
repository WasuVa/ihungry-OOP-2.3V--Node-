/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BurgerController.LinkedList;
import BurgerModel.Burger;
import BurgerController.BurgerController;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Placeorder extends javax.swing.JFrame {
    private BurgerController burgerController;
    public Placeorder(BurgerController burgerController) throws IOException {
        initComponents();
        setTitle("place Oder Panel");
        setLocationRelativeTo(null);
        this.burgerController = burgerController;
        lblPOrder.setText(burgerController.generateOrderID());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBurgerqty = new javax.swing.JTextField();
        txtCusId = new javax.swing.JTextField();
        btnPlaceoder = new javax.swing.JButton();
        btnPback = new javax.swing.JButton();
        btnPcancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPOrder = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCusname = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnqtnplus = new javax.swing.JButton();
        btnqtymin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Window");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Oder");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Customer Id       :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Oder Id               :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Burger QTY     :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Oder Status     :");

        txtBurgerqty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBurgerqty.setText("1");
        txtBurgerqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurgerqtyActionPerformed(evt);
            }
        });
        txtBurgerqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBurgerqtyKeyReleased(evt);
            }
        });

        txtCusId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCusId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIdActionPerformed(evt);
            }
        });

        btnPlaceoder.setBackground(new java.awt.Color(51, 204, 0));
        btnPlaceoder.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPlaceoder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceoder.setText("Place Oder");
        btnPlaceoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceoderActionPerformed(evt);
            }
        });

        btnPback.setBackground(new java.awt.Color(255, 0, 51));
        btnPback.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPback.setForeground(new java.awt.Color(255, 255, 255));
        btnPback.setText("Back to home page");
        btnPback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPbackActionPerformed(evt);
            }
        });

        btnPcancel.setBackground(new java.awt.Color(255, 0, 51));
        btnPcancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPcancel.setForeground(new java.awt.Color(255, 255, 255));
        btnPcancel.setText("Cancel");
        btnPcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("NET Total :");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 255, 0));
        lblStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblStatusKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblStatusKeyReleased(evt);
            }
        });

        lblPOrder.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Customer Name :");

        txtCusname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusnameActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(204, 0, 51));
        lblTotal.setText("LKR 500.0");

        btnqtnplus.setText(">");
        btnqtnplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnqtnplusMouseClicked(evt);
            }
        });
        btnqtnplus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnqtnplusKeyReleased(evt);
            }
        });

        btnqtymin.setText("<");
        btnqtymin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnqtyminMouseClicked(evt);
            }
        });
        btnqtymin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnqtyminKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBurgerqty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnqtymin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnqtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCusId)
                            .addComponent(lblPOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPlaceoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPcancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnPlaceoder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(btnPcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblPOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCusId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCusname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBurgerqty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnqtymin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnqtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBurgerqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurgerqtyActionPerformed

    }//GEN-LAST:event_txtBurgerqtyActionPerformed

    private void txtCusIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIdActionPerformed

    }//GEN-LAST:event_txtCusIdActionPerformed

    public String genOrderId() {
       int lastOrderIdNum=1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Burger.txt"));
            String line = br.readLine();
            if (line!=null) {
                lastOrderIdNum=Integer.parseInt(line.substring(1, 5));   
            }else if (line==null) {
                return String.format("B0001");
            }
            while(line!=null){
                 line=br.readLine();
                 lastOrderIdNum++;
             }
        }catch(IOException ex){
            
        }
        return String.format("B%04d", lastOrderIdNum);
    }
    private void btnPlaceoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceoderActionPerformed
        String orderId=lblPOrder.getText();
        String cusId=txtCusId.getText();
        String name=txtCusname.getText();
        int status=0;
        int bgrQty=Integer.parseInt(txtBurgerqty.getText());
        if (cusId.length()==10) {
            if(name.length()>0){
                lblStatus.setText("preparing");
                int res = JOptionPane.showConfirmDialog(this, "Do you want to add ? ", "New Burger", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    try {
                        try (FileWriter fw = new FileWriter("Burger.txt", true)) {
                            Burger burger=new Burger(orderId, cusId, name, bgrQty, status);
                            fw.write(orderId + "," + cusId + "," + name + "," + bgrQty + "," + status + "\n");
                        }
                    } catch (IOException ex) {
                    }
                    JOptionPane.showMessageDialog(this, "Added Success");
                    lblPOrder.setText(genOrderId());
                    txtCusId.setText("0");
                    txtCusname.setText("");
                    txtBurgerqty.setText("1");
                    lblStatus.setText("");
                    lblTotal.setText("LKR 500.0");
                }else{
                    JOptionPane.showMessageDialog(this, "Oder Didn't placed,cancel successfull");
                    txtCusId.setText("0");
                    txtCusname.setText("");
                    txtBurgerqty.setText("");
                    lblStatus.setText("Cancled");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Customer Name is incorrect,Please inpute correct name");
                txtCusId.setText("0");
                txtCusname.setText("");
                txtBurgerqty.setText("1");
                lblTotal.setText("LKR 500.0");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Customer ID is incorrect,Please inpute correct ID");
            txtCusId.setText("0");
            txtCusname.setText("");
            txtBurgerqty.setText("1");   
            lblTotal.setText("LKR 500.0");
        }
    }//GEN-LAST:event_btnPlaceoderActionPerformed

    private void btnPbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPbackActionPerformed
        dispose();
        new MainWindow(burgerController).setVisible(true);
    }//GEN-LAST:event_btnPbackActionPerformed

    private void txtCusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusnameActionPerformed

    }//GEN-LAST:event_txtCusnameActionPerformed

    private void btnPcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcancelActionPerformed
        txtCusId.setText("0");
        txtCusname.setText("");
        txtBurgerqty.setText("1");
        lblTotal.setText("LKR 500.0");
    }//GEN-LAST:event_btnPcancelActionPerformed

    private void lblStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblStatusKeyPressed

    }//GEN-LAST:event_lblStatusKeyPressed

    private void lblStatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblStatusKeyReleased
        
    }//GEN-LAST:event_lblStatusKeyReleased

    private void txtBurgerqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurgerqtyKeyReleased
        String qty=txtBurgerqty.getText();
        if (qty.isEmpty()) {
            lblTotal.setText("LKR 500.0");
            txtBurgerqty.setText("1");
            return;
        }
        lblTotal.setText("LKR "+(double)Burger.bgrPrice*Integer.parseInt(qty));
    }//GEN-LAST:event_txtBurgerqtyKeyReleased

    private void btnqtyminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnqtyminKeyReleased
        
    }//GEN-LAST:event_btnqtyminKeyReleased

    private void btnqtnplusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnqtnplusKeyReleased
           
    }//GEN-LAST:event_btnqtnplusKeyReleased

    private void btnqtyminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnqtyminMouseClicked
        String qty=txtBurgerqty.getText();
        int minQty=Integer.parseInt(qty);
        if (minQty>1) {
            txtBurgerqty.setText(""+(minQty-1));
            lblTotal.setText("LKR "+(double)Burger.bgrPrice*Integer.parseInt(txtBurgerqty.getText()));
        }
    }//GEN-LAST:event_btnqtyminMouseClicked

    private void btnqtnplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnqtnplusMouseClicked
        String qty=txtBurgerqty.getText();
        int minQty=Integer.parseInt(qty);
        if (minQty>=0) {
            txtBurgerqty.setText(""+(minQty+1));
            lblTotal.setText("LKR "+(double)Burger.bgrPrice*Integer.parseInt(txtBurgerqty.getText()));
        }else if (qty.isEmpty()) {
            txtBurgerqty.setText("1");
        }
    }//GEN-LAST:event_btnqtnplusMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPback;
    private javax.swing.JButton btnPcancel;
    private javax.swing.JButton btnPlaceoder;
    private javax.swing.JButton btnqtnplus;
    private javax.swing.JButton btnqtymin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPOrder;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtBurgerqty;
    private javax.swing.JTextField txtCusId;
    private javax.swing.JTextField txtCusname;
    // End of variables declaration//GEN-END:variables
}
