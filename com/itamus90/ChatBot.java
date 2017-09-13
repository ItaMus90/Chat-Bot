package com.itamus90;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Itamar on 14-Sep-17.
 */
public class ChatBot extends JFrame implements KeyListener
{

    private JPanel jPanel = new JPanel();
    private JTextArea dialog = new JTextArea(20,50);
    private JTextArea input = new JTextArea(1,50);
    private JScrollPane scrollPane = new JScrollPane(dialog, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    public ChatBot()
    {
        super("Chat Bot");
        setSize(600,400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        dialog.setEditable(false);

        jPanel.add(scrollPane);
        jPanel.add(input);
        jPanel.setBackground(new Color(255,200,0));
        add(jPanel);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    public static void main(String[] args)
    {
        new ChatBot();
    }
}
