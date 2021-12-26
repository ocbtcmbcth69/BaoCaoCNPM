/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.Run;
import Models.Loai;
import Mysql.ConnectMySql;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ASUS
 */
public class QL_NhomMon extends javax.swing.JPanel {

    /**
     * Creates new form QL_NhomMon
     */
    ConnectMySql cn = new ConnectMySql();
    public static QL_NhomMon nhom;
    public QL_NhomMon() {
        initComponents();
        nhom = this;
        FillTable();
        setFontTable(tbNhomMon);
    }
    
     private void setFontTable(JTable t){
        Font myFont = new Font("Serif", Font.PLAIN, 16);
        JTableHeader hd1 = t.getTableHeader();
        hd1.setFont(myFont);
    }
    public void FillTable() {
        ArrayList<Loai> arrTable = cn.GetLoai();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Mã loại");
        tbmodel.addColumn("Tên loại");
        tbmodel.addColumn("Màu sắc");

        if (arrTable != null) {
            int soloai = 0;
            for (Loai l : arrTable) {
                soloai++;
                tbmodel.addRow(new Object[]{l.GetMaLoai(), l.GetTenLoai(),l.GetMauSac()});
            }
            lblthongtin.setText(String.valueOf(soloai)+" loại");
        } else {
            JOptionPane.showMessageDialog(null, "Không có loại nào");
        }
        tbNhomMon.setModel(tbmodel);
        for(int i = 0; i < tbNhomMon.getColumnCount();i++){
            Class<?> col = tbNhomMon.getColumnClass(i);
            tbNhomMon.setDefaultEditor(col, null);
        } 
        
        tbNhomMon.getColumnModel().getColumn(0).setMinWidth(0);
        tbNhomMon.getColumnModel().getColumn(0).setMaxWidth(0);        
        tbNhomMon.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoaKV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbNhomMon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblthongtin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1150, 740));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_30px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(111, 47));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_file_30px.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.setPreferredSize(new java.awt.Dimension(111, 47));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoaKV.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaKV.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnXoaKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_cancel_35px.png"))); // NOI18N
        btnXoaKV.setText("Xóa ");
        btnXoaKV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaKV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnXoaKV)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tbNhomMon.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        tbNhomMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Mã Khu vực", "Tên Khu vực"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhomMon.setMinimumSize(new java.awt.Dimension(20, 20));
        tbNhomMon.setRowHeight(25);
        tbNhomMon.setSelectionBackground(new java.awt.Color(0, 255, 204));
        jScrollPane3.setViewportView(tbNhomMon);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Tổng số nhóm món :");

        lblthongtin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(255, 0, 0));
        lblthongtin.setText("...");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel5.setText("Tìm Loại :");

        txttim.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblthongtin)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblthongtin))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Quản lý nhóm món");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DL_ThemLoai kv = new DL_ThemLoai(Run.menuQL, true);
        kv.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int select=tbNhomMon.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn món nào !");
        }else{
            String mamon = (String) tbNhomMon.getValueAt(select, 0);
            DL_SuaNhom sua = new DL_SuaNhom(Run.menuQL, true, mamon);
            sua.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaKVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKVActionPerformed
        int[] selectedRows = tbNhomMon.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn món nào !");
        } else {
            ArrayList<String> ListMaBan = new ArrayList<String>();
            String sp = "";
            for (int i : selectedRows) {
                String ma = (String) tbNhomMon.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbNhomMon.getValueAt(i, 1);

                sp += tenban + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa món: \n " + sp, "Xóa món", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean xoa = cn.DeleteThucDon(ListMaBan);
                if (xoa == true) {
                    FillTable();
                }else
                JOptionPane.showMessageDialog(null, "Không xóa được món !");
            }
        }
    }//GEN-LAST:event_btnXoaKVActionPerformed

    private void txttimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyReleased
ArrayList<Loai> arrTable = cn.SearchLoai(txttim.getText().trim());
        if(arrTable != null){
            DefaultTableModel tbmodel = new DefaultTableModel();

            tbmodel.addColumn("Mã loại");
            tbmodel.addColumn("Tên loại");
            tbmodel.addColumn("Màu sắc");

            int soloai = 0;
            for (Loai l : arrTable) {
                soloai++;
                tbmodel.addRow(new Object[]{l.GetMaLoai(), l.GetTenLoai(),l.GetMauSac()});
            }
            tbNhomMon.setModel(tbmodel);
            for(int i = 0; i < tbNhomMon.getColumnCount();i++){
                Class<?> col = tbNhomMon.getColumnClass(i);
                tbNhomMon.setDefaultEditor(col, null);
            }
            
            tbNhomMon.getColumnModel().getColumn(0).setMinWidth(0);
            tbNhomMon.getColumnModel().getColumn(0).setMaxWidth(0);        
            tbNhomMon.getColumnModel().getColumn(0).setPreferredWidth(0);
        }        // TODO add your handling cod        // TODO add your handling code here:
    }//GEN-LAST:event_txttimKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaKV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JTable tbNhomMon;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
