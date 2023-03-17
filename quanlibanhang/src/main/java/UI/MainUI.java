package UI;

import UI.OrderManagementUI.ListBillUI;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MainUI extends javax.swing.JFrame {
    public MainUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("QUẢN LÝ BÁN HÀNG");
        ImportUI importUI = new ImportUI();
        ListBillUI billUI = new ListBillUI();
        CustomerUI customerUI = new CustomerUI();
        StatisticalUI statisticalUI = new StatisticalUI();
        showUI("Quản lý nhập hàng", importUI);
        showUI("Quản lý hóa đơn", billUI);
        showUI("Quản lý khách hàng", customerUI);
        showUI("Thống kê doanh thu / sản phẩm ", statisticalUI);
    }
    
    private void showUI(String tabName, JInternalFrame UI) {
        UI.setVisible(true);
        UI.setSize(TabbedPane_Show_UI.getSize());
        UI.setLocation(0, 0);
        UI.setBorder(null);
        UI.setResizable(false);
        UI.setClosable(false);
        UI.setIconifiable(false);
        UI.setMaximizable(false);
        BasicInternalFrameUI BasicIUI = (BasicInternalFrameUI)UI.getUI();
        BasicIUI.setNorthPane(null);
        TabbedPane_Show_UI.addTab(tabName, UI);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane_Show_UI = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TabbedPane_Show_UI.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPane_Show_UI.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane_Show_UI, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane_Show_UI, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane_Show_UI;
    // End of variables declaration//GEN-END:variables
}
