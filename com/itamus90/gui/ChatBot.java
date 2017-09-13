package com.itamus90.gui;

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
    private ContainerWords words = new ContainerWords();

    public ChatBot()
    {
        super("Chat Bot");
        setSize(600,400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        dialog.setEditable(false);
        input.addKeyListener(this);

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
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            input.setEditable(false);

        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            input.setEditable(true);

            //----Grab Quota---------
            String quote = input.getText();
            input.setText("");
            addText("-->You:\t" + quote);
            quote = quote.trim();

            //----Check for matches--------

            //----Default---------
        }
    }

    public static void main(String[] args)
    {
        new ChatBot();
    }

    private void addText(String quote)
    {
        dialog.setText(dialog.getText() + quote);
    }

    private void containSubString(String quote)
    {
        char mark = quote.charAt(quote.length() - 1);

        while (mark == '!' || mark == '.' || mark == '?')
        {
            quote = quote.substring(0,quote.length() - 1);
        }

        quote = quote.trim();
        byte response = 0;
        /*
            0: We're searching through chatBot[][] for matches
            1: We didn't find anything in chatBot[][]
            2: We didn't find something in chatBot[][]
        */
    }
}
