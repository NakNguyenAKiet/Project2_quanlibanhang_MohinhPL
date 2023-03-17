/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrderManagementUI;

import UI.MainUI;
import Utils.CustomJButton;
import Utils.CustomJComboBox;
import Utils.CustomJTable;
import Utils.CustomJTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JTable;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author NGOC BAU
 */
public class CreateBillUI extends javax.swing.JFrame {

    /**
     * Creates new form CreateBill
     */
    CustomJTable customJtable = new CustomJTable();
    CustomJTextField customJTextField = new CustomJTextField();
    CustomJButton customJButton = new CustomJButton();
    CustomJComboBox customJComboBox = new CustomJComboBox();
    
    public CreateBillUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LẬP HÓA ĐƠN");
        
        customJtable.setHeaderHeight(30);
        customJtable.setHedaerBackgroundColor(new Color(30, 39, 46));
        customJtable.setHeaderForegroundColor(Color.WHITE);
        customJtable.setHeaderBorderColor(Color.BLACK);
        customJtable.setHeaderFont("Cambria");
        customJtable.setHeaderFontSize(13);
        customJtable.setHeaderFontStyle(Font.BOLD);
        customJtable.setRowHeight(25);
        customJtable.setCellPadding(5);
        customJtable.custom(table_createBill_listProduct);
        customJtable.custom(table_createBill_listProductInBill);

        customJTextField.setTextFieldBackgroundColor(Color.WHITE);
        customJTextField.setTextFieldForegroundColor(new Color(30, 39, 46));
        customJTextField.setTextFieldFont("Cambria");
        customJTextField.setTextFieldFontStyle(Font.PLAIN);
        customJTextField.setTextFieldFontSize(13);
        customJTextField.setTextFieldBorderColor(new Color(223, 228, 234));
        customJTextField.setTextFieldBorderWeight(1);
        customJTextField.setTextFieldPadding(5);
        customJTextField.custom(textField_createBill_billID);
        customJTextField.custom(textField_createBill_createdTime);
        customJTextField.custom(textField_createBill_customerName);
        customJTextField.custom(textField_createBill_productID);
        customJTextField.custom(textField_createBill_totalBill);
        customJTextField.custom(textField_createBill_productName);
        customJTextField.custom(textField_createBill_customerAdd);
        customJTextField.custom(textField_createBill_customerCity);
        customJTextField.custom(textField_createBill_note);

        customJButton.setButtonForegroundColor(Color.WHITE);
        customJButton.setButtonFont("Cambria");
        customJButton.setButtonFontStyle(Font.BOLD);
        customJButton.setButtonFontSize(12);
        customJButton.setButtonBorderColor(Color.WHITE);
        customJButton.setButtonBorderWeight(0);
        customJButton.setButtonBorderRadius(10);
        IconFontSwing.register(FontAwesome.getIconFont());

        customJButton.setButtonBackgroundColor(Color.RED);
        customJButton.custom(button_createBill_close);
        
        customJButton.setButtonBackgroundColor(Color.YELLOW);  
        customJButton.custom(button_createBill_charge);

        customJButton.setButtonBackgroundColor(new Color(50, 255, 126));        
        Icon iconInsertCustomer = IconFontSwing.buildIcon(FontAwesome.PLUS_CIRCLE, 18, Color.WHITE);
        customJButton.setButtonIcon(iconInsertCustomer);        
        customJButton.custom(button_createBill_newBill);        

        customJButton.setButtonBackgroundColor(new Color(255, 56, 56));
        Icon iconDeleteCustomer = IconFontSwing.buildIcon(FontAwesome.TRASH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteCustomer);        
        customJButton.custom(button_createBill_clearFilter);        

        customJComboBox.setComboBoxBackgroundColor(Color.WHITE);
        customJComboBox.setComboBoxForegroundColor(new Color(30, 39, 46));
        customJComboBox.setComboBoxFont("Cambria");
        customJComboBox.setComboBoxFontStyle(Font.PLAIN);
        customJComboBox.setComboBoxFontSize(13);
        customJComboBox.setComboBoxListCellBackgroundColor(Color.WHITE);
        customJComboBox.setComboBoxListCellForegroundColor(new Color(30, 39, 46));
        customJComboBox.setComboBoxListCellFont("Cambria");
        customJComboBox.setComboBoxListCellFontStyle(Font.PLAIN);
        customJComboBox.setComboBoxListCellFontSize(14);
        customJComboBox.custom(combobox_createBill_customerID);  
        customJComboBox.custom(combobox_createBill_categories);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_createBill_listProductInBill = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        textField_createBill_totalBill = new javax.swing.JTextField();
        button_createBill_charge = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        textField_createBill_billID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        textField_createBill_createdTime = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        combobox_createBill_customerID = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        textField_createBill_customerName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        button_createBill_newBill = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        textField_createBill_customerAdd = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        textField_createBill_customerCity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        button_createBill_close = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        textField_createBill_note = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        textField_createBill_productID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        textField_createBill_productName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_createBill_listProduct = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        button_createBill_clearFilter = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        combobox_createBill_categories = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 46));
        jLabel1.setText("CHI TIẾT HÓA ĐƠN");

        table_createBill_listProductInBill.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        table_createBill_listProductInBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"2", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"3", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"4", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"5", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"6", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"7", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"8", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"9", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"},
                {"10", "Trương Thành Đại", "123456", null, "23 Buckinghamshire"}
            },
            new String [] {
                "STT", "Tên Sản Phẩm", "Đơn Giá", "SL", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_createBill_listProductInBill.setAutoscrolls(false);
        table_createBill_listProductInBill.setGridColor(new java.awt.Color(223, 228, 234));
        table_createBill_listProductInBill.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table_createBill_listProductInBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_createBill_listProductInBillMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_createBill_listProductInBill);
        if (table_createBill_listProductInBill.getColumnModel().getColumnCount() > 0) {
            table_createBill_listProductInBill.getColumnModel().getColumn(0).setMaxWidth(30);
            table_createBill_listProductInBill.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 64, 198));
        jLabel11.setText("TỔNG TIỀN:");

        textField_createBill_totalBill.setEditable(false);
        textField_createBill_totalBill.setText("2.533.465 đ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 104, Short.MAX_VALUE)
                    .addComponent(textField_createBill_totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(textField_createBill_totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        button_createBill_charge.setText("THANH TOÁN");
        button_createBill_charge.setBorder(null);
        button_createBill_charge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_createBill_charge.setFocusable(false);
        button_createBill_charge.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_createBill_charge.setIconTextGap(5);
        button_createBill_charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createBill_chargeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 39, 46));
        jLabel3.setText("THÔNG TIN CHUNG");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_billID.setEditable(false);
        textField_createBill_billID.setBackground(new java.awt.Color(255, 255, 255));
        textField_createBill_billID.setText("HD23534");
        textField_createBill_billID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_billID.setEnabled(false);
        textField_createBill_billID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_billIDActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 64, 198));
        jLabel14.setText("Mã Hóa Đơn:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(textField_createBill_billID)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_billID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_createdTime.setEditable(false);
        textField_createBill_createdTime.setBackground(new java.awt.Color(255, 255, 255));
        textField_createBill_createdTime.setText("25/03/3023");
        textField_createBill_createdTime.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_createdTime.setEnabled(false);
        textField_createBill_createdTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_createdTimeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 64, 198));
        jLabel20.setText("Ngày Lập Hóa Đơn:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(textField_createBill_createdTime)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_createdTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 64, 198));
        jLabel21.setText("Mã Khách Hàng:");

        combobox_createBill_customerID.setEditable(true);
        combobox_createBill_customerID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn khách hàng", "KH092356", "KH987234", "KH767345", "KH987325" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(combobox_createBill_customerID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combobox_createBill_customerID, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_customerName.setEditable(false);
        textField_createBill_customerName.setText("Nguyễn Văn A");
        textField_createBill_customerName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_customerName.setEnabled(false);
        textField_createBill_customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_customerNameActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 64, 198));
        jLabel23.setText("Tên Khách Hàng:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addComponent(textField_createBill_customerName)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Nhấn đúp chuột vào một dòng để XÓA SẢN PHẨM /CHỈNH SỬA SỐ LƯỢNG");

        button_createBill_newBill.setText("TẠO MỚI HÓA ĐƠN");
        button_createBill_newBill.setBorder(null);
        button_createBill_newBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_createBill_newBill.setFocusable(false);
        button_createBill_newBill.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_createBill_newBill.setIconTextGap(5);
        button_createBill_newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createBill_newBillActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_customerAdd.setEditable(false);
        textField_createBill_customerAdd.setBackground(new java.awt.Color(255, 255, 255));
        textField_createBill_customerAdd.setText("ABDFSE");
        textField_createBill_customerAdd.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_customerAdd.setEnabled(false);
        textField_createBill_customerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_customerAddActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 64, 198));
        jLabel24.setText("Địa chỉ:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(textField_createBill_customerAdd)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_customerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_customerCity.setEditable(false);
        textField_createBill_customerCity.setBackground(new java.awt.Color(255, 255, 255));
        textField_createBill_customerCity.setText("ÀEDGSDG");
        textField_createBill_customerCity.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_customerCity.setEnabled(false);
        textField_createBill_customerCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_customerCityActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 64, 198));
        jLabel25.setText("Thành Phố:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(textField_createBill_customerCity)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_customerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        button_createBill_close.setText("ĐÓNG");
        button_createBill_close.setBorder(null);
        button_createBill_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_createBill_close.setFocusable(false);
        button_createBill_close.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_createBill_close.setIconTextGap(5);
        button_createBill_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_createBill_closeMouseClicked(evt);
            }
        });
        button_createBill_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createBill_closeActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_note.setBackground(new java.awt.Color(255, 255, 255));
        textField_createBill_note.setText("ABCXYZ");
        textField_createBill_note.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_note.setEnabled(false);
        textField_createBill_note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_noteActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 64, 198));
        jLabel26.setText("Ghi Chú:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 197, Short.MAX_VALUE))
            .addComponent(textField_createBill_note)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_note, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(button_createBill_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button_createBill_newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_createBill_close, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_createBill_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_createBill_newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_createBill_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 46));
        jLabel2.setText("TÌM KIẾM");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_productID.setText("SP0012");
        textField_createBill_productID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_createBill_productID.setEnabled(false);
        textField_createBill_productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_createBill_productIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 64, 198));
        jLabel8.setText("Mã sản phẩm:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 94, Short.MAX_VALUE))
            .addComponent(textField_createBill_productID)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_productID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        textField_createBill_productName.setText("Carot");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 64, 198));
        jLabel9.setText("Tên Sản Phẩm:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(textField_createBill_productName)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_createBill_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        table_createBill_listProduct.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        table_createBill_listProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Trương Thành Đại", "123456"},
                {"2", "Trương Thành Đại", "123456"},
                {"3", "Trương Thành Đại", "123456"},
                {"4", "Trương Thành Đại", "123456"},
                {"5", "Trương Thành Đại", "123456"},
                {"6", "Trương Thành Đại", "123456"},
                {"7", "Trương Thành Đại", "123456"},
                {"8", "Trương Thành Đại", "123456"},
                {"9", "Trương Thành Đại", "123456"},
                {"10", "Trương Thành Đại", "123456"}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Đơn Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_createBill_listProduct.setAutoscrolls(false);
        table_createBill_listProduct.setGridColor(new java.awt.Color(223, 228, 234));
        table_createBill_listProduct.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table_createBill_listProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_createBill_listProductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_createBill_listProduct);
        if (table_createBill_listProduct.getColumnModel().getColumnCount() > 0) {
            table_createBill_listProduct.getColumnModel().getColumn(0).setMaxWidth(90);
            table_createBill_listProduct.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel10.setText("DANH SÁCH SẢN PHẨM");

        button_createBill_clearFilter.setText("XÓA TÌM KIẾM");
        button_createBill_clearFilter.setBorder(null);
        button_createBill_clearFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_createBill_clearFilter.setFocusable(false);
        button_createBill_clearFilter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_createBill_clearFilter.setIconTextGap(5);
        button_createBill_clearFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createBill_clearFilterActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Nhấn đúp chuột vào một dòng để thêm sản phẩm vào hóa đơn");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 64, 198));
        jLabel22.setText("Thể Loại:");

        combobox_createBill_categories.setEditable(true);
        combobox_createBill_categories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Rau", "Củ", "Quả" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(combobox_createBill_categories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combobox_createBill_categories, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_createBill_clearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_createBill_clearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_createBill_listProductInBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_createBill_listProductInBillMouseClicked
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            // do something with the selected row

            // Open frame to edit bill
            EditProductQtyUI editProductQtyUI = new EditProductQtyUI();
            editProductQtyUI.setVisible(true);
        }
    }//GEN-LAST:event_table_createBill_listProductInBillMouseClicked

    private void textField_createBill_productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_productIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_productIDActionPerformed

    private void table_createBill_listProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_createBill_listProductMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            // do something with the selected row

            // Open frame to edit bill
            AddProductQtyUI ediBillDetailUI = new AddProductQtyUI();
            ediBillDetailUI.setVisible(true);
        }
    }//GEN-LAST:event_table_createBill_listProductMouseClicked

    private void button_createBill_chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createBill_chargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_createBill_chargeActionPerformed

    private void textField_createBill_billIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_billIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_billIDActionPerformed

    private void textField_createBill_createdTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_createdTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_createdTimeActionPerformed

    private void textField_createBill_customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_customerNameActionPerformed

    private void button_createBill_clearFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createBill_clearFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_createBill_clearFilterActionPerformed

    private void button_createBill_newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createBill_newBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_createBill_newBillActionPerformed

    private void textField_createBill_customerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_customerAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_customerAddActionPerformed

    private void textField_createBill_customerCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_customerCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_customerCityActionPerformed

    private void button_createBill_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createBill_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_createBill_closeActionPerformed

    private void button_createBill_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_createBill_closeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_button_createBill_closeMouseClicked

    private void textField_createBill_noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_createBill_noteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_createBill_noteActionPerformed

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
            java.util.logging.Logger.getLogger(CreateBillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBillUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_createBill_charge;
    private javax.swing.JButton button_createBill_clearFilter;
    private javax.swing.JButton button_createBill_close;
    private javax.swing.JButton button_createBill_newBill;
    private javax.swing.JComboBox<String> combobox_createBill_categories;
    private javax.swing.JComboBox<String> combobox_createBill_customerID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_createBill_listProduct;
    private javax.swing.JTable table_createBill_listProductInBill;
    private javax.swing.JTextField textField_createBill_billID;
    private javax.swing.JTextField textField_createBill_createdTime;
    private javax.swing.JTextField textField_createBill_customerAdd;
    private javax.swing.JTextField textField_createBill_customerCity;
    private javax.swing.JTextField textField_createBill_customerName;
    private javax.swing.JTextField textField_createBill_note;
    private javax.swing.JTextField textField_createBill_productID;
    private javax.swing.JTextField textField_createBill_productName;
    private javax.swing.JTextField textField_createBill_totalBill;
    // End of variables declaration//GEN-END:variables
}
