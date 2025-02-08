package SWING3;

import javax.swing.*;

class MyFrame extends JFrame
{
    JLabel l;
    ImageIcon ii;

    public MyFrame()
    {
        setVisible(true);
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ii = new ImageIcon("C:\\Users\\Walton\\Desktop\\Photos\\1737871211682.jpg");
        l = new JLabel(ii);

        add(l);
        pack();
    }
}