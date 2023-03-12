package UI;

import Utils.CustomJTable;
import java.awt.Color;
import java.awt.Font;

public class ImportUI extends javax.swing.JInternalFrame {
    
    CustomJTable customJtable = new CustomJTable();
    
    public ImportUI() {
        initComponents();
        customJtable.setHeaderHeight(30);
        customJtable.setHedaerBackgroundColor(new Color(30, 39, 46));
        customJtable.setHeaderForegroundColor(Color.WHITE);
        customJtable.setHeaderBorderColor(Color.BLACK);
        customJtable.setHeaderFont("SegoeUI");
        customJtable.setHeaderFontSize(13);
        customJtable.setHeaderFontStyle(Font.BOLD);
        customJtable.setRowHeight(30);
        customJtable.setCellPadding(5);
        customJtable.custom(Import_Vegetable_Table);
        customJtable.custom(Import_Category_Table);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Import_Vegetable_Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Import_Category_Table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1050, 600));
        setVisible(true);

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
                "ID", "Hình Ảnh", "D.Mục", "Tên Sản Phẩm", "Đơn Vị", "SL", "Giá Tiền"
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
        Import_Vegetable_Table.setGridColor(new java.awt.Color(153, 153, 153));
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
        Import_Category_Table.setGridColor(new java.awt.Color(153, 153, 153));
        Import_Category_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(Import_Category_Table);
        if (Import_Category_Table.getColumnModel().getColumnCount() > 0) {
            Import_Category_Table.getColumnModel().getColumn(0).setPreferredWidth(10);
            Import_Category_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
            Import_Category_Table.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Import_Category_Table;
    private javax.swing.JTable Import_Vegetable_Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
