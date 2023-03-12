package Utils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CustomJTextField {
    private Color textFieldBackgroundColor;
    private Color textFieldForegroundColor;
    private String textFieldFont;
    private int textFieldFontStyle;
    private int textFieldFontSize;
    private int textFieldWidth;
    private int textFieldHeight;
    private Color textFieldBorderColor;
    private int textFieldBorderWeight;
    private int textFieldPadding;

    public void setTextFieldBackgroundColor(Color textFieldBackgroundColor) {
        this.textFieldBackgroundColor = textFieldBackgroundColor;
    }

    public void setTextFieldForegroundColor(Color textFieldForegroundColor) {
        this.textFieldForegroundColor = textFieldForegroundColor;
    }

    public void setTextFieldFont(String textFieldFont) {
        this.textFieldFont = textFieldFont;
    }

    public void setTextFieldFontStyle(int textFieldFontStyle) {
        this.textFieldFontStyle = textFieldFontStyle;
    }

    public void setTextFieldFontSize(int textFieldFontSize) {
        this.textFieldFontSize = textFieldFontSize;
    }

    public void setTextFieldWidth(int textFieldWidth) {
        this.textFieldWidth = textFieldWidth;
    }

    public void setTextFieldHeight(int textFieldHeight) {
        this.textFieldHeight = textFieldHeight;
    }

    public void setTextFieldBorderColor(Color textFieldBorderColor) {
        this.textFieldBorderColor = textFieldBorderColor;
    }

    public void setTextFieldBorderWeight(int textFieldBorderWeight) {
        this.textFieldBorderWeight = textFieldBorderWeight;
    }

    public void setTextFieldPadding(int textFieldPadding) {
        this.textFieldPadding = textFieldPadding;
    }
    
    public void custom(JTextField textField) {
        textField.setBackground(textFieldBackgroundColor);
        textField.setForeground(textFieldForegroundColor);
        textField.setFont(new Font(textFieldFont, textFieldFontStyle, textFieldFontSize));
        textField.setOpaque(true);
        textField.setSize(textFieldWidth, textFieldHeight);
        Border lineBorder = BorderFactory.createLineBorder(textFieldBorderColor, textFieldBorderWeight);
        Border paddingBorder = BorderFactory.createEmptyBorder(0, textFieldPadding, 0, textFieldPadding);
        textField.setBorder(BorderFactory.createCompoundBorder(lineBorder, paddingBorder));
    }
}
