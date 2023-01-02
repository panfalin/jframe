package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame =new JFrame("我的第一个窗口");
        // frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,600,400);
        frame.setVisible(true);
    }
}
