package UI;

import Utils.CustomJButton;
import Utils.CustomJTable;
import Utils.CustomJTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class CustomerUI extends javax.swing.JInternalFrame {
    
    CustomJTable customJtable = new CustomJTable();
    CustomJTextField customJTextField = new CustomJTextField();
    CustomJButton customJButton = new CustomJButton();
    
    public CustomerUI() {
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
        customJtable.custom(Customer_Table);
        
        customJTextField.setTextFieldBackgroundColor(Color.WHITE);
        customJTextField.setTextFieldForegroundColor(new Color(30, 39, 46));
        customJTextField.setTextFieldFont("Cambria");
        customJTextField.setTextFieldFontStyle(Font.PLAIN);
        customJTextField.setTextFieldFontSize(14);
        customJTextField.setTextFieldBorderColor(new Color(223, 228, 234));
        customJTextField.setTextFieldBorderWeight(1);
        customJTextField.setTextFieldPadding(10);
        customJTextField.custom(textField_CustomerID);
        customJTextField.custom(textField_CustomerFullname);
        customJTextField.custom(textField_CustomerPassword);
        customJTextField.custom(textField_CustomerAddress);
        customJTextField.custom(textField_CustomerCity);
        customJTextField.custom(textField_SearchCustomer);
        
        customJButton.setButtonForegroundColor(Color.WHITE);
        customJButton.setButtonFont("Cambria");
        customJButton.setButtonFontStyle(Font.BOLD);
        customJButton.setButtonFontSize(15);
        customJButton.setButtonBorderColor(Color.WHITE);
        customJButton.setButtonBorderWeight(0);
        customJButton.setButtonBorderRadius(10);
        IconFontSwing.register(FontAwesome.getIconFont());
        
        customJButton.setButtonBackgroundColor(new Color(50, 255, 126));
        Icon iconInsertCustomer = IconFontSwing.buildIcon(FontAwesome.PLUS_CIRCLE, 18, Color.WHITE);
        customJButton.setButtonIcon(iconInsertCustomer);
        customJButton.custom(button_InsertCustomer);
        
        customJButton.setButtonBackgroundColor(new Color(255, 242, 0));
        Icon iconUpdateCustomer = IconFontSwing.buildIcon(FontAwesome.PENCIL, 17, Color.WHITE);
        customJButton.setButtonIcon(iconUpdateCustomer);
        customJButton.custom(button_UpdateCustomer);
       
        customJButton.setButtonBackgroundColor(new Color(255, 56, 56));
        Icon iconDeleteCustomer = IconFontSwing.buildIcon(FontAwesome.TRASH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteCustomer);
        customJButton.custom(button_DeleteCustomer);
        
        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        Icon iconResetCustomer = IconFontSwing.buildIcon(FontAwesome.REPEAT, 17, Color.WHITE);
        customJButton.setButtonIcon(iconResetCustomer);
        customJButton.custom(button_ResetCustomer);
        
        customJButton.setButtonBackgroundColor(new Color(30, 39, 46));
        Icon iconSearchCustomer = IconFontSwing.buildIcon(FontAwesome.SEARCH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconSearchCustomer);
        customJButton.custom(button_SearchCustomer);
        
        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        Icon iconRefreshCustomer = IconFontSwing.buildIcon(FontAwesome.REFRESH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconRefreshCustomer);
        customJButton.custom(button_RefreshCustomer);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Customer_Table = new javax.swing.JTable();
        textField_SearchCustomer = new javax.swing.JTextField();
        button_SearchCustomer = new javax.swing.JButton();
        button_RefreshCustomer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        textField_CustomerID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        textField_CustomerFullname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        textField_CustomerPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        textField_CustomerAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        textField_CustomerCity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        button_InsertCustomer = new javax.swing.JButton();
        button_UpdateCustomer = new javax.swing.JButton();
        button_DeleteCustomer = new javax.swing.JButton();
        button_ResetCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 242, 246));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 46));
        jLabel1.setText("DANH SÁCH KHÁCH HÀNG");

        Customer_Table.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Customer_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"2", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"3", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"4", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"5", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"6", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"7", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"8", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"9", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"},
                {"10", "Trương Thành Đại", "123456", "23 Buckinghamshire", "York"}
            },
            new String [] {
                "ID", "Tên Khách Hàng", "Mật Khẩu", "Địa Chỉ", "Thành Phố"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Customer_Table.setAutoscrolls(false);
        Customer_Table.setGridColor(new java.awt.Color(223, 228, 234));
        Customer_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(Customer_Table);
        if (Customer_Table.getColumnModel().getColumnCount() > 0) {
            Customer_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            Customer_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            Customer_Table.getColumnModel().getColumn(2).setPreferredWidth(50);
            Customer_Table.getColumnModel().getColumn(3).setPreferredWidth(200);
            Customer_Table.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        button_SearchCustomer.setText("TÌM KIẾM");
        button_SearchCustomer.setBorder(null);
        button_SearchCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SearchCustomer.setFocusable(false);
        button_SearchCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_SearchCustomer.setIconTextGap(5);
        button_SearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchCustomerActionPerformed(evt);
            }
        });

        button_RefreshCustomer.setText("TẢI LẠI");
        button_RefreshCustomer.setBorder(null);
        button_RefreshCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_RefreshCustomer.setFocusable(false);
        button_RefreshCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_RefreshCustomer.setIconTextGap(5);
        button_RefreshCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RefreshCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textField_SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_RefreshCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_SearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_RefreshCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 46));
        jLabel2.setText("THÊM MỚI KHÁCH HÀNG");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerID.setText("1");
        textField_CustomerID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_CustomerID.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 64, 198));
        jLabel8.setText("ID Khách Hàng:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerID)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerFullname.setText("Trương Thành Đại");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 64, 198));
        jLabel9.setText("Tên Đầy Đủ:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerFullname)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerPassword.setText("123456");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 64, 198));
        jLabel11.setText("Mật Khẩu:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerPassword)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerAddress.setText("30 Broadway");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 64, 198));
        jLabel12.setText("Địa Chỉ:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerAddress)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        textField_CustomerCity.setText("LonDon");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 64, 198));
        jLabel13.setText("Thành Phố:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CustomerCity)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        button_InsertCustomer.setText("THÊM");
        button_InsertCustomer.setBorder(null);
        button_InsertCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_InsertCustomer.setFocusable(false);
        button_InsertCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_InsertCustomer.setIconTextGap(5);
        button_InsertCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_InsertCustomerActionPerformed(evt);
            }
        });

        button_UpdateCustomer.setText("SỬA");
        button_UpdateCustomer.setBorder(null);
        button_UpdateCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_UpdateCustomer.setFocusable(false);
        button_UpdateCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_UpdateCustomer.setIconTextGap(5);
        button_UpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateCustomerActionPerformed(evt);
            }
        });

        button_DeleteCustomer.setText("XÓA");
        button_DeleteCustomer.setBorder(null);
        button_DeleteCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DeleteCustomer.setFocusable(false);
        button_DeleteCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_DeleteCustomer.setIconTextGap(5);
        button_DeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteCustomerActionPerformed(evt);
            }
        });

        button_ResetCustomer.setText("RESET");
        button_ResetCustomer.setBorder(null);
        button_ResetCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ResetCustomer.setFocusable(false);
        button_ResetCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_ResetCustomer.setIconTextGap(5);
        button_ResetCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ResetCustomerActionPerformed(evt);
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
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(button_InsertCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_DeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_ResetCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_InsertCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_DeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_ResetCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
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

    /* ===================================== INSERT CUSTOMER ===================================== */   
    private void button_InsertCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_InsertCustomerActionPerformed
        
    }//GEN-LAST:event_button_InsertCustomerActionPerformed

    /* ===================================== UPDATE CUSTOMER ===================================== */
    private void button_UpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateCustomerActionPerformed
        
    }//GEN-LAST:event_button_UpdateCustomerActionPerformed

    /* ===================================== DELETE CUSTOMER ===================================== */
    private void button_DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteCustomerActionPerformed
        
    }//GEN-LAST:event_button_DeleteCustomerActionPerformed

    /* ===================================== RESET CUSTOMER ===================================== */
    private void button_ResetCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ResetCustomerActionPerformed
        
    }//GEN-LAST:event_button_ResetCustomerActionPerformed

    /* ===================================== SEARCH CUSTOMER ===================================== */
    private void button_SearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchCustomerActionPerformed
        
    }//GEN-LAST:event_button_SearchCustomerActionPerformed

    /* ===================================== REFRESH CUSTOMER ===================================== */
    private void button_RefreshCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RefreshCustomerActionPerformed
        
    }//GEN-LAST:event_button_RefreshCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Customer_Table;
    private javax.swing.JButton button_DeleteCustomer;
    private javax.swing.JButton button_InsertCustomer;
    private javax.swing.JButton button_RefreshCustomer;
    private javax.swing.JButton button_ResetCustomer;
    private javax.swing.JButton button_SearchCustomer;
    private javax.swing.JButton button_UpdateCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textField_CustomerAddress;
    private javax.swing.JTextField textField_CustomerCity;
    private javax.swing.JTextField textField_CustomerFullname;
    private javax.swing.JTextField textField_CustomerID;
    private javax.swing.JTextField textField_CustomerPassword;
    private javax.swing.JTextField textField_SearchCustomer;
    // End of variables declaration//GEN-END:variables
}
