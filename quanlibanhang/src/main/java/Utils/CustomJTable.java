package Utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomJTable {

    private int headerHeight;
    private String headerFont;
    private int headerFontStyle;
    private int headerFontSize;
    private Color headerBorderColor;
    private Color hedaerBackgroundColor;
    private Color headerForegroundColor;
    private int rowHeight;
    private int cellPadding;

    public void setHeaderHeight(int headerHeight) {
        this.headerHeight = headerHeight;
    }

    public void setHeaderFont(String headerFont) {
        this.headerFont = headerFont;
    }

    public void setHeaderFontStyle(int headerFontStyle) {
        this.headerFontStyle = headerFontStyle;
    }

    public void setHeaderFontSize(int headerFontSize) {
        this.headerFontSize = headerFontSize;
    }

    public void setHeaderBorderColor(Color headerBorderColor) {
        this.headerBorderColor = headerBorderColor;
    }

    public void setHedaerBackgroundColor(Color hedaerBackgroundColor) {
        this.hedaerBackgroundColor = hedaerBackgroundColor;
    }

    public void setHeaderForegroundColor(Color headerForegroundColor) {
        this.headerForegroundColor = headerForegroundColor;
    }

    public void setRowHeight(int rowHeight) {
        this.rowHeight = rowHeight;
    }

    public void setCellPadding(int cellPadding) {
        this.cellPadding = cellPadding;
    }

    public void custom(JTable table) {
        JTableHeader header = table.getTableHeader();
        Dimension dim = header.getPreferredSize();
        dim.setSize(dim.getWidth(), headerHeight);
        Font font = new Font(headerFont, headerFontStyle, headerFontSize);
        Border border = BorderFactory.createLineBorder(headerBorderColor);

        header.setPreferredSize(dim);
        header.setBackground(hedaerBackgroundColor);
        header.setForeground(headerForegroundColor);
        header.setFont(font);
        header.setBorder(border);

        table.setRowHeight(rowHeight);
        table.setDefaultRenderer(Object.class, new CustomTableCellRenderer());
        table.setFillsViewportHeight(true);
         
        JScrollPane scrollPane = (JScrollPane) table.getParent().getParent();
        scrollPane.getVerticalScrollBar().setBackground(Color.WHITE);
        Dimension trackSize = new Dimension(10, 10);
        scrollPane.getVerticalScrollBar().setPreferredSize(trackSize);
    }

    public class CustomTableCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel c = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (column == 0) {
                ((JLabel) c).setHorizontalAlignment(SwingConstants.CENTER);
            } else {
                ((JLabel) c).setHorizontalAlignment(SwingConstants.LEFT);
            }
            c.setBorder(BorderFactory.createEmptyBorder(cellPadding, cellPadding, cellPadding, cellPadding));
            return c;
        }
    }
}
