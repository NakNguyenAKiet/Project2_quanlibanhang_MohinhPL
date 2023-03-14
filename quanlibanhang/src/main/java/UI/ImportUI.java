package UI;

import BLL.CategoryBLL;
import DTO.Category;
import Utils.CustomJButton;
import Utils.CustomJComboBox;
import Utils.CustomJTable;
import Utils.CustomJTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class ImportUI extends javax.swing.JInternalFrame {
    
    CustomJTable customJtable = new CustomJTable();
    CustomJTextField customJTextField = new CustomJTextField();
    CustomJComboBox customJComboBox = new CustomJComboBox();
    CustomJButton customJButton = new CustomJButton();
    
    public ImportUI() {
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
        customJtable.custom(Import_Vegetable_Table);
        customJtable.custom(Import_Category_Table);
        
        customJTextField.setTextFieldBackgroundColor(Color.WHITE);
        customJTextField.setTextFieldForegroundColor(new Color(30, 39, 46));
        customJTextField.setTextFieldFont("Cambria");
        customJTextField.setTextFieldFontStyle(Font.PLAIN);
        customJTextField.setTextFieldFontSize(14);
        customJTextField.setTextFieldBorderColor(new Color(223, 228, 234));
        customJTextField.setTextFieldBorderWeight(1);
        customJTextField.setTextFieldPadding(10);
        customJTextField.custom(textField_VegetableID);
        customJTextField.custom(textField_VegetableName);
        customJTextField.custom(textField_VegetableAmount);
        customJTextField.custom(textField_VegetablePrice);
        customJTextField.custom(textField_CategoryID);
        customJTextField.custom(textField_CategoryName);
        customJTextField.custom(textField_CategoryDescription);
        customJTextField.custom(textField_SearchVegetable);
        customJTextField.custom(textField_SearchCategory);
        
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
        customJComboBox.custom(comboBox_VegetableCategoryID);
        customJComboBox.custom(comboBox_VegetableUnit);
        
        customJButton.setButtonForegroundColor(Color.WHITE);
        customJButton.setButtonFont("Cambria");
        customJButton.setButtonFontStyle(Font.BOLD);
        customJButton.setButtonFontSize(15);
        customJButton.setButtonBorderColor(Color.WHITE);
        customJButton.setButtonBorderWeight(0);
        customJButton.setButtonBorderRadius(10);
        IconFontSwing.register(FontAwesome.getIconFont());
        
        customJButton.setButtonBackgroundColor(new Color(50, 255, 126));
        Icon iconInsertVegetable = IconFontSwing.buildIcon(FontAwesome.PLUS_CIRCLE, 18, Color.WHITE);
        customJButton.setButtonIcon(iconInsertVegetable);
        customJButton.custom(button_InsertVegetable);
        Icon iconInsertCategory = IconFontSwing.buildIcon(FontAwesome.PLUS_CIRCLE, 22, Color.WHITE);
        customJButton.setButtonIcon(iconInsertCategory);
        customJButton.custom(button_InsertCategory);
        
        customJButton.setButtonBackgroundColor(new Color(255, 242, 0));
        Icon iconUpdateVegetable = IconFontSwing.buildIcon(FontAwesome.PENCIL, 17, Color.WHITE);
        customJButton.setButtonIcon(iconUpdateVegetable);
        customJButton.custom(button_UpdateVegetable);
        Icon iconUpdateCategory = IconFontSwing.buildIcon(FontAwesome.PENCIL, 20, Color.WHITE);
        customJButton.setButtonIcon(iconUpdateCategory);
        customJButton.custom(button_UpdateCategory);
        
        customJButton.setButtonBackgroundColor(new Color(255, 56, 56));
        Icon iconDeleteVegetable = IconFontSwing.buildIcon(FontAwesome.TRASH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteVegetable);
        customJButton.custom(button_DeleteVegetable);
        Icon iconDeleteCategory = IconFontSwing.buildIcon(FontAwesome.TRASH, 20, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteCategory);
        customJButton.custom(button_DeleteCategory);
        
        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        Icon iconResetVegetable = IconFontSwing.buildIcon(FontAwesome.REPEAT, 17, Color.WHITE);
        customJButton.setButtonIcon(iconResetVegetable);
        customJButton.custom(button_ResetVegetable);
        Icon iconResetCategory = IconFontSwing.buildIcon(FontAwesome.REPEAT, 20, Color.WHITE);
        customJButton.setButtonIcon(iconResetCategory);
        customJButton.custom(button_ResetCategory);
        
        customJButton.setButtonBackgroundColor(new Color(30, 39, 46));
        Icon iconSearchVegetable = IconFontSwing.buildIcon(FontAwesome.SEARCH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconSearchVegetable);
        customJButton.custom(button_SearchVegetable);
        Icon iconSearchCategory = IconFontSwing.buildIcon(FontAwesome.SEARCH, 20, Color.WHITE);
        customJButton.setButtonIcon(iconSearchCategory);
        customJButton.custom(button_SearchCategory);

        makeIcon("no-image.png", label_Image, 140, 140);
        
    }
    
    
    
    
    

    private void makeIcon (String filename, JLabel label, int width, int height) {
        String relativePath = "src/main/java/images/";
        ImageIcon icon = new ImageIcon(relativePath + filename);
        Image resizedImg = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(resizedImg));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Import_Vegetable_Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Import_Category_Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textField_VegetableID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        textField_VegetableName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textField_VegetableAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        textField_VegetablePrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboBox_VegetableCategoryID = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboBox_VegetableUnit = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        label_Image = new javax.swing.JLabel();
        button_ResetVegetable = new javax.swing.JButton();
        textField_SearchVegetable = new javax.swing.JTextField();
        button_InsertVegetable = new javax.swing.JButton();
        button_UpdateVegetable = new javax.swing.JButton();
        button_DeleteVegetable = new javax.swing.JButton();
        button_SearchVegetable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        textField_CategoryID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        textField_CategoryName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        textField_CategoryDescription = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        button_ResetCategory = new javax.swing.JButton();
        button_DeleteCategory = new javax.swing.JButton();
        button_UpdateCategory = new javax.swing.JButton();
        button_SearchCategory = new javax.swing.JButton();
        button_InsertCategory = new javax.swing.JButton();
        textField_SearchCategory = new javax.swing.JTextField();

        setBackground(new java.awt.Color(241, 242, 246));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1050, 600));
        setVisible(true);

        Import_Vegetable_Table.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Import_Vegetable_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, "1", "Tomato", "kg", "100", "150000"},
                {"2", null, "2", "Tomato", "kg", "100", "150000"},
                {"3", null, "3", "Tomato", "per fruit", "100", "150000"},
                {"4", null, "1", "Tomato", "per fruit", "100", "150000"},
                {"5", null, "2", "Tomato", "per fruit", "100", "150000"},
                {"6", null, "3", "Tomato", "bunch", "100", "150000"},
                {"7", null, "1", "Tomato", "bag", "100", "150000"},
                {"8", null, "2", "Tomato", "kg", "100", "150000"},
                {"9", null, "3", "Tomato", "kg", "100", "150000"},
                {"10", null, "1", "Tomato", "kg", "100", null}
            },
            new String [] {
                "ID", "Hình Ảnh", "ID D.Mục", "Tên Sản Phẩm", "Đơn Vị", "SL", "Giá Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Import_Vegetable_Table.setAutoscrolls(false);
        Import_Vegetable_Table.setGridColor(new java.awt.Color(223, 228, 234));
        Import_Vegetable_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Import_Vegetable_Table);
        if (Import_Vegetable_Table.getColumnModel().getColumnCount() > 0) {
            Import_Vegetable_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            Import_Vegetable_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            Import_Vegetable_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
            Import_Vegetable_Table.getColumnModel().getColumn(3).setPreferredWidth(150);
            Import_Vegetable_Table.getColumnModel().getColumn(4).setPreferredWidth(50);
            Import_Vegetable_Table.getColumnModel().getColumn(5).setPreferredWidth(10);
            Import_Vegetable_Table.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        Import_Category_Table.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Import_Category_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fruit", "The kind that can be eaten without cooking"},
                {"2", "Green Vegetables", "The kind used to make salads or soups"},
                {"3", "Spices", "The kind used to enhance the taste of food"},
                {"4", "Fruit", "The kind used to enhance the taste of food"},
                {"5", "Green Vegetables", "The kind used to enhance the taste of food"},
                {"6", "Spices", "The kind used to enhance the taste of food"},
                {"7", "Fruit", "The kind used to enhance the taste of food"},
                {"8", "Green Vegetables", "The kind used to enhance the taste of food"},
                {"9", "Fruit", "The kind used to enhance the taste of food"},
                {"10", "Spices", "The kind used to enhance the taste of food"}
            },
            new String [] {
                "ID", "Tên Danh Mục", "Mô Tả"
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
        Import_Category_Table.setAutoscrolls(false);
        Import_Category_Table.setGridColor(new java.awt.Color(223, 228, 234));
        Import_Category_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(Import_Category_Table);
        if (Import_Category_Table.getColumnModel().getColumnCount() > 0) {
            Import_Category_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            Import_Category_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            Import_Category_Table.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 46));
        jLabel1.setText("NHẬP SẢN PHẨM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        textField_VegetableID.setText("1");
        textField_VegetableID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_VegetableID.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 64, 198));
        jLabel4.setText("ID Sản Phẩm:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_VegetableID)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_VegetableID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 220, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        textField_VegetableName.setText("Tomato");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 64, 198));
        jLabel5.setText("Tên Sản Phẩm:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(textField_VegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_VegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        textField_VegetableAmount.setText("100");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 64, 198));
        jLabel6.setText("Số Lượng:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_VegetableAmount)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_VegetableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, 220, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        textField_VegetablePrice.setText("150000");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 64, 198));
        jLabel7.setText("Giá Tiền:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_VegetablePrice)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_VegetablePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, 220, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 64, 198));
        jLabel8.setText("Danh Mục:");

        comboBox_VegetableCategoryID.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        comboBox_VegetableCategoryID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_VegetableCategoryID.setBorder(null);
        comboBox_VegetableCategoryID.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboBox_VegetableCategoryID, 0, 220, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_VegetableCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 35, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 64, 198));
        jLabel9.setText("Đơn Vị:");

        comboBox_VegetableUnit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        comboBox_VegetableUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_VegetableUnit.setBorder(null);
        comboBox_VegetableUnit.setFocusable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboBox_VegetableUnit, 0, 220, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_VegetableUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 98, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        label_Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 228, 234), 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 15, -1, -1));

        button_ResetVegetable.setText("RESET");
        button_ResetVegetable.setBorder(null);
        button_ResetVegetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ResetVegetable.setFocusable(false);
        button_ResetVegetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_ResetVegetable.setIconTextGap(5);
        jPanel1.add(button_ResetVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 183, 88, 35));
        jPanel1.add(textField_SearchVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 246, 250, 35));

        button_InsertVegetable.setText("THÊM");
        button_InsertVegetable.setBorder(null);
        button_InsertVegetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_InsertVegetable.setFocusable(false);
        button_InsertVegetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_InsertVegetable.setIconTextGap(5);
        jPanel1.add(button_InsertVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 183, 88, 35));

        button_UpdateVegetable.setText("SỬA");
        button_UpdateVegetable.setBorder(null);
        button_UpdateVegetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_UpdateVegetable.setFocusable(false);
        button_UpdateVegetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_UpdateVegetable.setIconTextGap(5);
        jPanel1.add(button_UpdateVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 183, 88, 35));

        button_DeleteVegetable.setText("XÓA");
        button_DeleteVegetable.setBorder(null);
        button_DeleteVegetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DeleteVegetable.setFocusable(false);
        button_DeleteVegetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_DeleteVegetable.setIconTextGap(5);
        jPanel1.add(button_DeleteVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 183, 88, 35));

        button_SearchVegetable.setText("TÌM KIẾM");
        button_SearchVegetable.setBorder(null);
        button_SearchVegetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SearchVegetable.setFocusable(false);
        button_SearchVegetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_SearchVegetable.setIconTextGap(5);
        jPanel1.add(button_SearchVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 245, 110, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 46));
        jLabel2.setText("NHẬP DANH MỤC");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        textField_CategoryID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_CategoryID.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 64, 198));
        jLabel10.setText("ID Danh Mục:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CategoryID)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 64, 198));
        jLabel11.setText("Tên Danh Mục:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CategoryName)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 64, 198));
        jLabel12.setText("Mô Tả:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textField_CategoryDescription)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_CategoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        button_ResetCategory.setBorder(null);
        button_ResetCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ResetCategory.setFocusable(false);
        button_ResetCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_ResetCategory.setIconTextGap(0);
        button_ResetCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ResetCategoryActionPerformed(evt);
            }
        });

        button_DeleteCategory.setBorder(null);
        button_DeleteCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DeleteCategory.setFocusable(false);
        button_DeleteCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_DeleteCategory.setIconTextGap(0);
        button_DeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteCategoryActionPerformed(evt);
            }
        });

        button_UpdateCategory.setBorder(null);
        button_UpdateCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_UpdateCategory.setFocusable(false);
        button_UpdateCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_UpdateCategory.setIconTextGap(0);
        button_UpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateCategoryActionPerformed(evt);
            }
        });

        button_SearchCategory.setBorder(null);
        button_SearchCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SearchCategory.setFocusable(false);
        button_SearchCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_SearchCategory.setIconTextGap(0);
        button_SearchCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchCategoryActionPerformed(evt);
            }
        });

        button_InsertCategory.setBorder(null);
        button_InsertCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_InsertCategory.setFocusable(false);
        button_InsertCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_InsertCategory.setIconTextGap(0);
        button_InsertCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_InsertCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(button_InsertCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_UpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_DeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField_SearchCategory))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_ResetCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(button_SearchCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(button_InsertCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(button_UpdateCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_DeleteCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_ResetCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_SearchCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textField_SearchCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Category category = new Category();
    CategoryBLL categoryBLL = new CategoryBLL();
    
    /* ===================================== INSERT CATEGORY ===================================== */   
    private void button_InsertCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_InsertCategoryActionPerformed
        category.setCategoryId(4);
        category.setName(textField_CategoryName.getText());
        category.setDescription(textField_CategoryDescription.getText());
        String error = categoryBLL.insertCategory(category);
        if (error == null) {
            System.out.println("Insert Category Successfully!");
        } else {
            System.err.println(error);
        }
    }//GEN-LAST:event_button_InsertCategoryActionPerformed

    /* ===================================== UPDATE CATEGORY ===================================== */   
    private void button_UpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateCategoryActionPerformed
       
    }//GEN-LAST:event_button_UpdateCategoryActionPerformed

    /* ===================================== DELETE CATEGORY ===================================== */   
    private void button_DeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteCategoryActionPerformed
       
    }//GEN-LAST:event_button_DeleteCategoryActionPerformed

    /* ===================================== RESET CATEGORY ===================================== */   
    private void button_ResetCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ResetCategoryActionPerformed
        textField_CategoryID.setText("");
        textField_CategoryName.setText("");
        textField_CategoryDescription.setText("");
    }//GEN-LAST:event_button_ResetCategoryActionPerformed

    /* ===================================== SEARCH CATEGORY ===================================== */   
    private void button_SearchCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchCategoryActionPerformed
        
    }//GEN-LAST:event_button_SearchCategoryActionPerformed
   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Import_Category_Table;
    private javax.swing.JTable Import_Vegetable_Table;
    private javax.swing.JButton button_DeleteCategory;
    private javax.swing.JButton button_DeleteVegetable;
    private javax.swing.JButton button_InsertCategory;
    private javax.swing.JButton button_InsertVegetable;
    private javax.swing.JButton button_ResetCategory;
    private javax.swing.JButton button_ResetVegetable;
    private javax.swing.JButton button_SearchCategory;
    private javax.swing.JButton button_SearchVegetable;
    private javax.swing.JButton button_UpdateCategory;
    private javax.swing.JButton button_UpdateVegetable;
    private javax.swing.JComboBox<String> comboBox_VegetableCategoryID;
    private javax.swing.JComboBox<String> comboBox_VegetableUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_Image;
    private javax.swing.JTextField textField_CategoryDescription;
    private javax.swing.JTextField textField_CategoryID;
    private javax.swing.JTextField textField_CategoryName;
    private javax.swing.JTextField textField_SearchCategory;
    private javax.swing.JTextField textField_SearchVegetable;
    private javax.swing.JTextField textField_VegetableAmount;
    private javax.swing.JTextField textField_VegetableID;
    private javax.swing.JTextField textField_VegetableName;
    private javax.swing.JTextField textField_VegetablePrice;
    // End of variables declaration//GEN-END:variables
}
