package Swing5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
    JButton b;
    ImageIcon icon;

    public MyFrame()
    {
        setVisible(true);
        setTitle("Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        //button = new JButton("LOVE to Write Programme");
        //icon = new ImageIcon("C:\\Users\\Walton\\Desktop\\Photos\\1693588496298-01.jpeg");

        b = new JButton("Click Here to Login...");
        b.setBounds(50,50,250,250);

        add(b);

        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Welcome");
            }
        });

    }

}


