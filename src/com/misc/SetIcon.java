
package com.misc;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class SetIcon {

    public void setIcon(JFrame frame){
        frame.setIconImage( new ImageIcon(getClass().getClassLoader().getResource("resources/icon.png")).getIma‌​ge() );
    }
}
