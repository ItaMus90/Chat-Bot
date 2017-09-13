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
                    {"how re you", "what up","how are u"},
                    {"good","doing well"},
                    //Default
                    {"shut up","you right","noob", "stop talking", "you don't understand noting", "go home"},
                };
    }

    public String[][] getChatBot()
    {
        return chatBot;
    }

}
