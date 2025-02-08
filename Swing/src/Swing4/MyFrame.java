package Swing4;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    JButton button;
    JLabel label;

    public MyFrame()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        button = new JButton("Click Me to Enter the Portal");
        label = new JLabel("Login Page");

        add(button);
        add(label);

        button.setBounds(250, 250, 250, 250);
        label.setBounds(250, 250, 250, 250);

        button.setForeground(Color.BLUE);
        button.setBackground(Color.YELLOW);
    }

}
