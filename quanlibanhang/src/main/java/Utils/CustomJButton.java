package Utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class CustomJButton {
    public void custom(JButton button) {
        int radius = 10;
        button.setBackground(new Color(50, 255, 126));
        button.setForeground(new Color(30, 39, 46));
        button.setFont(new Font("Cambria", Font.BOLD, 15));
        button.setBorder(new RoundedBorder(Color.WHITE, 1, radius));
       
        ImageIcon icon = new ImageIcon("images/no-images.png");
        button.setIcon(icon);
    }
    
    class RoundedBorder extends LineBorder {
        private int radius;
        RoundedBorder(Color c, int thickness, int radius) {
            super(c, thickness, true);
            this.radius = radius;
        }
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            if ((this.thickness > 0) && (g instanceof Graphics2D)) {
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
                inner = new RoundRectangle2D.Float(x + offs, y + offs, width - size, height - size, radius, radius);
                Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
                path.append(outer, false);
                path.append(inner, false);
                g2d.fill(path);
                g2d.setColor(oldColor);
            }
        }
    }
}