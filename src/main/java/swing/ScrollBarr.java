
package swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class ScrollBarr extends JScrollBar{
        public ScrollBarr() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}
