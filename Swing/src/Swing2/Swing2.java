package Swing2;

import javax.swing.*;
import java.awt.*;

public class Swing2
{
    public static void main(String[] args)
    {
        new myFrame();
    }
}


class myFrame extends JFrame
{
    JLabel l = new JLabel("lOVE for CODE");
    JLabel l2 = new JLabel("lOVE to write CODE");

    public myFrame()
    {
        super("The Title");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        //setLocation(500, 200);
        //setSize(400, 500);
        setBounds(100, 100, 450, 300);
        l.setText("Jony");
        Font font = new Font("Courier New", Font.ITALIC, 25);
        l.setFont(font);
        add(l);
        add(l2);

    }
}