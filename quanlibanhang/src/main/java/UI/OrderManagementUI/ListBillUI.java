package UI.OrderManagementUI;

import UI.MainUI;
import Utils.CustomJButton;
import Utils.CustomJComboBox;
import Utils.CustomJTable;
import Utils.CustomJTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JTable;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class ListBillUI extends javax.swing.JInternalFrame {

    CustomJTable customJtable = new CustomJTable();
    CustomJTextField customJTextField = new CustomJTextField();
    CustomJButton customJButton = new CustomJButton();
    CustomJComboBox customJComboBox = new CustomJComboBox();

    public ListBillUI() {
        initComponents();
        customJtable.setHeaderHeight(30);
        customJtable.setHedaerBackgroundColor(new Color(30, 39, 46));
        customJtable.setHeaderForegroundColor(Color.WHITE);
        customJtable.setHeaderBorderColor(Color.BLACK);
        customJtable.setHeaderFont("Cambria");
        customJtable.setHeaderFontSize(13);
        customJtable.setHeaderFontStyle(Font.BOLD);
        customJtable.setRowHeight(30);
        customJtable.setCellPadding(5);
        customJtable.custom(Bills_Table);

        customJTextField.setTextFieldBackgroundColor(Color.WHITE);
        customJTextField.setTextFieldForegroundColor(new Color(30, 39, 46));
        customJTextField.setTextFieldFont("Cambria");
        customJTextField.setTextFieldFontStyle(Font.PLAIN);
        customJTextField.setTextFieldFontSize(14);
        customJTextField.setTextFieldBorderColor(new Color(223, 228, 234));
        customJTextField.setTextFieldBorderWeight(1);
        customJTextField.setTextFieldPadding(10);
        customJTextField.custom(textField_CustomerID);
        customJTextField.custom(textField_billID);

        customJButton.setButtonForegroundColor(Color.WHITE);
        customJButton.setButtonFont("Cambria");
        customJButton.setButtonFontStyle(Font.BOLD);
        customJButton.setButtonFontSize(15);
        customJButton.setButtonBorderColor(Color.WHITE);
        customJButton.setButtonBorderWeight(0);
        customJButton.setButtonBorderRadius(10);
        IconFontSwing.register(FontAwesome.getIconFont());

        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        customJButton.custom(button_searchByDate);

        customJButton.setButtonBackgroundColor(new Color(50, 255, 126));
        Icon iconInsertCustomer = IconFontSwing.buildIcon(FontAwesome.PLUS_CIRCLE, 18, Color.WHITE);
        customJButton.setButtonIcon(iconInsertCustomer);
        customJButton.custom(button_CreateBill);

        customJButton.setButtonBackgroundColor(new Color(255, 242, 0));
        Icon iconUpdateCustomer = IconFontSwing.buildIcon(FontAwesome.PENCIL, 17, Color.WHITE);
        customJButton.setButtonIcon(iconUpdateCustomer);
        customJButton.custom(button_UpdateBill);

        customJButton.setButtonBackgroundColor(new Color(255, 56, 56));
        Icon iconDeleteCustomer = IconFontSwing.buildIcon(FontAwesome.TRASH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteCustomer);
        customJButton.custom(button_DeleteBill);

        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        Icon iconResetCustomer = IconFontSwing.buildIcon(FontAwesome.REPEAT, 17, Color.WHITE);
        customJButton.setButtonIcon(iconResetCustomer);
        customJButton.custom(button_ResetSearchBill);

        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        Icon iconRefreshCustomer = IconFontSwing.buildIcon(FontAwesome.REFRESH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconRefreshCustomer);
        customJButton.custom(button_RefreshBillTable);

        customJComboBox.setComboBoxBackgroundColor(Color.WHITE);
        customJComboBox.setComboBoxForegroundColor(new Color(30, 39, 46));
        customJComboBox.setComboBoxFont("Cambria");
        customJComboBox.setComboBoxFontStyle(Font.PLAIN);
        customJComboBox.setComboBoxFontSize(14);
        customJComboBox.setComboBoxListCellBackgroundColor(Color.WHITE);
        customJComboBox.setComboBoxListCellForegroundColor(new Color(30, 39, 46));
        customJComboBox.setComboBoxListCellFont("Cambria");
        customJComboBox.setComboBoxListCellFontStyle(Font.PLAIN);
        customJComboBox.setComboBoxListCellFontSize(14);
        customJComboBox.custom(combobox_FindInMonth);
        customJComboBox.custom(combobox_FindInYear);

        dateChooser_listBill.setBackground(Color.WHITE);
        dateChooser_listBill.setForeground(new Color(30, 39, 46));
        dateChooser_listBill.setFont(new Font("Cambria", Font.PLAIN, 14));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bills_Table = new javax.swing.JTable();
        button_RefreshBillTable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        textField_billID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        textField_CustomerID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        combobox_FindInMonth = new javax.swing.JComboBox<>();
        combobox_FindInYear = new javax.swing.JComboBox<>();
        panel_filterDate = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dateChooser_listBill = new com.toedter.calendar.JDateChooser();
        button_searchByDate = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        button_CreateBill = new javax.swing.JButton();
        button_UpdateBill = new javax.swing.JButton();
        button_DeleteBill = new javax.swing.JButton();
        button_ResetSearchBill = new javax.swing.JButton();

        setBackground(new java.awt.Color(200, 221, 242));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 46));
        jLabel1.setText("DANH SÁCH HÓA ĐƠN");

        Bills_Table.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Bills_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"2", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"3", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"4", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"5", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"6", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"7", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"8", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"9", "Trương Thành Đại", "123456", "23 Buckinghamshire"},
                {"10", "Trương Thành Đại", "123456", "23 Buckinghamshire"}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Lập", "Mã Khách Hàng", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Bills_Table.setAutoscrolls(false);
        Bills_Table.setGridColor(new java.awt.Color(223, 228, 234));
        Bills_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Bills_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bills_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Bills_Table);

        button_RefreshBillTable.setText("LÀM MỚI");
        button_RefreshBillTable.setBorder(null);
        button_RefreshBillTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_RefreshBillTable.setFocusable(false);
        button_RefreshBillTable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_RefreshBillTable.setIconTextGap(5);
        button_RefreshBillTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RefreshBillTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_RefreshBillTable, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_RefreshBillTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 46));
        jLabel2.setText("TÌM KIẾM");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        textField_billID.setText("HD00001");
        textField_billID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_billID.setEnabled(false);
        textField_billID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_billIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 64, 198));
        jLabel8.setText("Mã  Hóa Đơn:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_billID)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_billID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerID.setText("KH1241234");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 64, 198));
        jLabel9.setText("Mã Khách Hàng:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerID)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 64, 198));
        jLabel11.setText("Tháng:");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 64, 198));
        jLabel14.setText("Năm:");

        combobox_FindInMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm trong tháng 01", "Tìm trong tháng 02", "Tìm trong tháng 03", "Tìm trong tháng 04", "Tìm trong tháng 05", "Tìm trong tháng 06", "Tìm trong tháng 07", "Tìm trong tháng 08", "Tìm trong tháng 09", "Tìm trong tháng 10", "Tìm trong tháng 11", "Tìm trong tháng 12" }));

        combobox_FindInYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trong năm 2021", "Trong năm 2022", "Trong năm 2023" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(combobox_FindInMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(combobox_FindInYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combobox_FindInMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(combobox_FindInYear)))
        );

        panel_filterDate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 64, 198));
        jLabel12.setText("Ngày:");

        button_searchByDate.setText("Tìm Theo Ngày");
        button_searchByDate.setBorder(null);
        button_searchByDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_searchByDate.setFocusable(false);
        button_searchByDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_searchByDate.setIconTextGap(5);
        button_searchByDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_searchByDateMouseClicked(evt);
            }
        });
        button_searchByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchByDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_filterDateLayout = new javax.swing.GroupLayout(panel_filterDate);
        panel_filterDate.setLayout(panel_filterDateLayout);
        panel_filterDateLayout.setHorizontalGroup(
            panel_filterDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_filterDateLayout.createSequentialGroup()
                .addComponent(dateChooser_listBill, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_searchByDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_filterDateLayout.setVerticalGroup(
            panel_filterDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filterDateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_filterDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser_listBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_searchByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Nhấn đúp chuột vào một dòng để xem chi tiết hóa đơn");

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Nhấn nút THÊM để lập hóa đơn mới");

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("Nhấn vào một dòng và chọn SỬA/XÓA để sửa/xóa hóa đơn");

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("Nhấn nút RESET để làm mới giá trị tìm kiếm");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        button_CreateBill.setText("THÊM");
        button_CreateBill.setBorder(null);
        button_CreateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_CreateBill.setFocusable(false);
        button_CreateBill.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_CreateBill.setIconTextGap(5);
        button_CreateBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_CreateBillMouseClicked(evt);
            }
        });
        button_CreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CreateBillActionPerformed(evt);
            }
        });

        button_UpdateBill.setText("SỬA");
        button_UpdateBill.setBorder(null);
        button_UpdateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_UpdateBill.setFocusable(false);
        button_UpdateBill.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_UpdateBill.setIconTextGap(5);
        button_UpdateBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_UpdateBillMouseClicked(evt);
            }
        });
        button_UpdateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateBillActionPerformed(evt);
            }
        });

        button_DeleteBill.setText("XÓA");
        button_DeleteBill.setBorder(null);
        button_DeleteBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DeleteBill.setFocusable(false);
        button_DeleteBill.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_DeleteBill.setIconTextGap(5);
        button_DeleteBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteBillActionPerformed(evt);
            }
        });

        button_ResetSearchBill.setText("RESET");
        button_ResetSearchBill.setBorder(null);
        button_ResetSearchBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ResetSearchBill.setFocusable(false);
        button_ResetSearchBill.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_ResetSearchBill.setIconTextGap(5);
        button_ResetSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ResetSearchBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_filterDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(button_CreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_UpdateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_DeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_ResetSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_filterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_CreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_UpdateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_DeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_ResetSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RefreshBillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RefreshBillTableActionPerformed

    }//GEN-LAST:event_button_RefreshBillTableActionPerformed

    private void button_CreateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CreateBillActionPerformed

    }//GEN-LAST:event_button_CreateBillActionPerformed

    private void button_UpdateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateBillActionPerformed

    }//GEN-LAST:event_button_UpdateBillActionPerformed

    private void button_DeleteBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteBillActionPerformed

    }//GEN-LAST:event_button_DeleteBillActionPerformed

    private void button_ResetSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ResetSearchBillActionPerformed

    }//GEN-LAST:event_button_ResetSearchBillActionPerformed

    private void textField_billIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_billIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_billIDActionPerformed

    private void button_CreateBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_CreateBillMouseClicked
        // Open frame to create new bill
        CreateBillUI createBill = new CreateBillUI();
        createBill.setVisible(true);
    }//GEN-LAST:event_button_CreateBillMouseClicked

    private void button_UpdateBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_UpdateBillMouseClicked
        // Open frame to edit bill
        EditBillUI editBillUI = new EditBillUI();
        editBillUI.setVisible(true);
    }//GEN-LAST:event_button_UpdateBillMouseClicked

    private void Bills_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bills_TableMouseClicked
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            // do something with the selected row

            // Open frame to edit bill
            BillDetailUI billDetailUI = new BillDetailUI();
            billDetailUI.setVisible(true);
        }
    }//GEN-LAST:event_Bills_TableMouseClicked

    private void button_searchByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchByDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_searchByDateActionPerformed

    private void button_searchByDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_searchByDateMouseClicked
        Date filterDate = dateChooser_listBill.getDate();
        if (filterDate != null) {
            String filterDateString = new SimpleDateFormat("yyyy-MM-dd").format(filterDate);
            System.out.println("Date: "+filterDateString);
//        ArrayList<Order> filteredOrders = new ArrayList<Order>();
//        for (Order order : orders) {
//            if (order.getOrderDate().equals(filterDateString)) {
//                filteredOrders.add(order);
//            }
//        }
//        updateOrderTable(filteredOrders);
        }else{
            System.out.println("Date: NULL");
        }

    }//GEN-LAST:event_button_searchByDateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bills_Table;
    private javax.swing.JButton button_CreateBill;
    private javax.swing.JButton button_DeleteBill;
    private javax.swing.JButton button_RefreshBillTable;
    private javax.swing.JButton button_ResetSearchBill;
    private javax.swing.JButton button_UpdateBill;
    private javax.swing.JButton button_searchByDate;
    private javax.swing.JComboBox<String> combobox_FindInMonth;
    private javax.swing.JComboBox<String> combobox_FindInYear;
    private com.toedter.calendar.JDateChooser dateChooser_listBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_filterDate;
    private javax.swing.JTextField textField_CustomerID;
    private javax.swing.JTextField textField_billID;
    // End of variables declaration//GEN-END:variables
}
