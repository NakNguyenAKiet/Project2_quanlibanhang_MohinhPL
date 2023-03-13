package Utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class CustomJButton {
    private Color buttonBackgroundColor;
    private Color buttonForegroundColor;
    private String buttonFont;
    private int buttonFontStyle;
    private int buttonFontSize;
    private Color buttonBorderColor;
    private int buttonBorderWeight;
    private int buttonBorderRadius;
    private Icon buttonIcon;

    public void setButtonBackgroundColor(Color buttonBackgroundColor) {
        this.buttonBackgroundColor = buttonBackgroundColor;
    }

    public void setButtonForegroundColor(Color buttonForegroundColor) {
        this.buttonForegroundColor = buttonForegroundColor;
    }

    public void setButtonFont(String buttonFont) {
        this.buttonFont = buttonFont;
    }

    public void setButtonFontStyle(int buttonFontStyle) {
        this.buttonFontStyle = buttonFontStyle;
    }

    public void setButtonFontSize(int buttonFontSize) {
        this.buttonFontSize = buttonFontSize;
    }

    public void setButtonBorderColor(Color buttonBorderColor) {
        this.buttonBorderColor = buttonBorderColor;
    }

    public void setButtonBorderWeight(int buttonBorderWeight) {
        this.buttonBorderWeight = buttonBorderWeight;
    }

    public void setButtonBorderRadius(int buttonBorderRadius) {
        this.buttonBorderRadius = buttonBorderRadius;
    }

    public void setButtonIcon(Icon buttonIcon) {
        this.buttonIcon = buttonIcon;
    }
    
    public void custom(JButton button) {
        button.setBackground(buttonBackgroundColor);
        button.setForeground(buttonForegroundColor);
        button.setFont(new Font(buttonFont, buttonFontStyle, buttonFontSize));
        button.setBorder(new RoundedBorder(buttonBorderColor, buttonBorderWeight));
        button.setIcon(buttonIcon);  
                
    }   
    
    class RoundedBorder extends LineBorder {
        RoundedBorder(Color c, int thickness) {
            super(c, thickness, true);
        }
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            if ((this.thickness >= 0) && (g instanceof Graphics2D)) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                Color oldColor = g2d.getColor();
                g2d.setColor(this.lineColor);

                Shape outer;
                Shape inner;

                int offs = this.thickness;
                int size = offs + offs;
                outer = new RoundRectangle2D.Float(x, y, width, height, 0, 0);
                inner = new RoundRectangle2D.Float(x + offs, y + offs, width - size, height - size, buttonBorderRadius, buttonBorderRadius);
                Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
                path.append(outer, false);
                path.append(inner, false);
                g2d.fill(path);
                g2d.setColor(oldColor);
            }
        }
    }
}
