package com.itamus90.gui;

/**
 * Created by Itamar on 14-Sep-17.
 */
public class ContainerWords
{
    private String[][] chatBot;


    public ContainerWords()
    {
        chatBot = new String [][]
                {
                    //Standrad greeting
                    {"hi","hello","hola","shalom","howdy"},
                    {"hi","hello","shalom"},
                    //Question greeting
                    {"how are you", "what up","how are u"},
                    {"good","doing well"},
                    //Yes
                        {"yes"},
                        {"no","NO","No!!!!!!!!"},
                    //Default
                    {"shut up","you right","noob", "stop talking", "you don't understand noting", "go home"},
                };
    }

    public String[] getChatBotRow(int row)
    {
        return chatBot[row];
    }

    public String[][] getChatBot()
    {
        return chatBot;
    }


    public boolean inArray(String in, String[] str)
    {
        boolean isMatch = false;

        for (int i = 0; i < str.length;i++)
        {
            if (str[i].equals(in))
            {
                isMatch = true;
            }
        }

        return isMatch;
    }

}
