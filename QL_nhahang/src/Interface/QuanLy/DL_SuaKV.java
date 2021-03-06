/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.BanHang.Banhang_UI;
import Models.KhuVuc;
import Mysql.ConnectMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DL_SuaKV extends javax.swing.JDialog {
   ConnectMySql cn = new ConnectMySql();
    /**
     * Creates new form DL_SuaKV
     * @param parent
     * @param modal
     * @param ma
     */
    int maKV;
    String tenKV;
    public DL_SuaKV(java.awt.Frame parent, boolean modal, int ma) {
        super(parent, modal);
        initComponents();
         ArrayList<KhuVuc> b = cn.GetKV(ma);
        maKV = b.get(0).getMaKhuVuc();
        String[] mb = b.get(0).getTenKhuVuc().split(" ");
        tenKV = mb[1];
        txttenKV.setText(mb[1]);
        lblten.setText("Sửa KV - "+b.get(0).getTenKhuVuc());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txttenKV = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblten = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Tên khu vực : ");

        txttenKV.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        txttenKV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttenKVKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xác nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnhuy.setBackground(new java.awt.Color(153, 0, 0));
        btnhuy.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        btnhuy.setForeground(new java.awt.Color(255, 255, 255));
        btnhuy.setText("Hủy bỏ");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblten.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblten.setForeground(new java.awt.Color(255, 255, 255));
        lblten.setText("Sửa Khu vực ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblten)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblten)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txttenKV, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txttenKV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txttenKV.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tên khu vực không được để trống !");
            return;
        }        
        KhuVuc kv = new KhuVuc();
        kv.setTenKhuVuc("Tầng "+txttenKV.getText());
        kv.setMaKhuVuc(maKV);
        cn.UpdateKV(kv);
        
        QL_Ban.B.FillKV();
        QL_Ban.B.updateUI();
        try{
            Banhang_UI.bh.loadKhuVuc();
        }catch(Exception e){

        }
        this.dispose();        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnhuyActionPerformed

    private void txttenKVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttenKVKeyReleased

    }//GEN-LAST:event_txttenKVKeyReleased

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhuy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblten;
    private javax.swing.JTextField txttenKV;
    // End of variables declaration//GEN-END:variables
}
