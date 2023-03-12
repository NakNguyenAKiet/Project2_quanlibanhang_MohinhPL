package Utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CustomJComboBox {
    
    private Color comboBoxBackgroundColor;
    private Color comboBoxForegroundColor;
    private String comboBoxFont;
    private int comboBoxFontStyle;
    private int comboBoxFontSize;
    private Color comboBoxListCellBackgroundColor;
    private Color comboBoxListCellForegroundColor;
    private String comboBoxListCellFont;
    private int comboBoxListCellFontStyle;
    private int comboBoxListCellFontSize;

    public void setComboBoxBackgroundColor(Color comboBoxBackgroundColor) {
        this.comboBoxBackgroundColor = comboBoxBackgroundColor;
    }

    public void setComboBoxForegroundColor(Color comboBoxForegroundColor) {
        this.comboBoxForegroundColor = comboBoxForegroundColor;
    }

    public void setComboBoxFont(String comboBoxFont) {
        this.comboBoxFont = comboBoxFont;
    }

    public void setComboBoxFontStyle(int comboBoxFontStyle) {
        this.comboBoxFontStyle = comboBoxFontStyle;
    }

    public void setComboBoxFontSize(int comboBoxFontSize) {
        this.comboBoxFontSize = comboBoxFontSize;
    }

    public void setComboBoxListCellBackgroundColor(Color comboBoxListCellBackgroundColor) {
        this.comboBoxListCellBackgroundColor = comboBoxListCellBackgroundColor;
    }

    public void setComboBoxListCellForegroundColor(Color comboBoxListCellForegroundColor) {
        this.comboBoxListCellForegroundColor = comboBoxListCellForegroundColor;
    }

    public void setComboBoxListCellFont(String comboBoxListCellFont) {
        this.comboBoxListCellFont = comboBoxListCellFont;
    }

    public void setComboBoxListCellFontStyle(int comboBoxListCellFontStyle) {
        this.comboBoxListCellFontStyle = comboBoxListCellFontStyle;
    }

    public void setComboBoxListCellFontSize(int comboBoxListCellFontSize) {
        this.comboBoxListCellFontSize = comboBoxListCellFontSize;
    }
    
    
    
    public void custom(JComboBox<String> comboBox) {
        comboBox.setRenderer(new CustomListCellRenderer());
        comboBox.setBackground(comboBoxBackgroundColor);
        comboBox.setForeground(comboBoxForegroundColor); 
        comboBox.setFont(new Font(comboBoxFont, comboBoxFontStyle, comboBoxFontSize));
    }
    
    private class CustomListCellRenderer implements ListCellRenderer<Object> {
        private final DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component renderer = defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            renderer.setBackground(comboBoxListCellBackgroundColor); 
            renderer.setForeground(comboBoxListCellForegroundColor); 
            renderer.setFont(new Font(comboBoxListCellFont, comboBoxListCellFontStyle, comboBoxListCellFontSize)); 
            return renderer;
        }
    }
}
