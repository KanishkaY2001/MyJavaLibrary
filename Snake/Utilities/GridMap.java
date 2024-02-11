package Snake.Utilities;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridMap extends JFrame
{
    public GridMap(int x, int y)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setFocusable(true);

        // Creating the game's grid map
        this.setLayout(new GridLayout(x, y));
        for (int i = 0; i < x*y; ++i)
        {
            JButton l = new JButton("");
            l.setEnabled(false);
            this.add(l);
        }
        
        this.setVisible(true);
    }
}
