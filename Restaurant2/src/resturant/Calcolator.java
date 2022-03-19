/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calcolator extends JFrame {

    JPanel p1, p2;
    JTextArea r1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    vn v = new vn();

    public Calcolator() {
        p1 = new JPanel();
        p2 = new JPanel();
        r1 = new JTextArea();
        b1 = new JButton("C");
        b2 = new JButton("X");
        b3 = new JButton("%");
        b4 = new JButton("/");
        b5 = new JButton("7");
        b6 = new JButton("8");
        b7 = new JButton("9");
        b8 = new JButton("*");
        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");
        b13 = new JButton("1");
        b14 = new JButton("2");
        b15 = new JButton("3");
        b16 = new JButton("+");
        b17 = new JButton("?");
        b18 = new JButton("0");
        b19 = new JButton(".");
        b20 = new JButton("=");

        this.setTitle("Calcolator");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(1000, 300);
        this.setLayout(null);
        p1.setBounds(0, 0, 400, 200);
        p1.setBackground(Color.lightGray);
        p2.setBounds(0, 200, 400, 400);
        p2.setBackground(Color.lightGray);
        this.add(p1);
        this.add(p2);
        p1.setLayout(null);
        r1.setBounds(0, 100, 400, 100);
        r1.setBackground(Color.lightGray);
        r1.setFont(new Font("", NORMAL, 40));
        p1.add(r1);
        p2.setLayout(null);
        b1.setBounds(10, 2, 90, 70);
        b2.setBounds(102, 2, 90, 70);
        b3.setBounds(194, 2, 90, 70);
        b4.setBounds(286, 2, 90, 70);
        b5.setBounds(10, 74, 90, 70);
        b6.setBounds(102, 74, 90, 70);
        b7.setBounds(194, 74, 90, 70);
        b8.setBounds(286, 74, 90, 70);
        b9.setBounds(10, 146, 90, 70);
        b10.setBounds(102, 146, 90, 70);
        b11.setBounds(194, 146, 90, 70);
        b12.setBounds(286, 146, 90, 70);
        b13.setBounds(10, 218, 90, 70);
        b14.setBounds(102, 218, 90, 70);
        b15.setBounds(194, 218, 90, 70);
        b16.setBounds(286, 218, 90, 70);
        b17.setBounds(10, 290, 90, 70);
        b18.setBounds(102, 290, 90, 70);
        b19.setBounds(194, 290, 90, 70);
        b20.setBounds(286, 290, 90, 70);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        b1.setFont(new Font("", NORMAL, 25));
        b2.setFont(new Font("", NORMAL, 25));
        b3.setFont(new Font("", NORMAL, 25));
        b4.setFont(new Font("", NORMAL, 25));
        b5.setFont(new Font("", NORMAL, 25));
        b6.setFont(new Font("", NORMAL, 25));
        b7.setFont(new Font("", NORMAL, 25));
        b8.setFont(new Font("", NORMAL, 25));
        b9.setFont(new Font("", NORMAL, 25));
        b10.setFont(new Font("", NORMAL, 25));
        b11.setFont(new Font("", NORMAL, 25));
        b12.setFont(new Font("", NORMAL, 25));
        b13.setFont(new Font("", NORMAL, 25));
        b14.setFont(new Font("", NORMAL, 25));
        b15.setFont(new Font("", NORMAL, 25));
        b16.setFont(new Font("", NORMAL, 25));
        b17.setFont(new Font("", NORMAL, 25));
        b18.setFont(new Font("", NORMAL, 25));
        b19.setFont(new Font("", NORMAL, 25));
        b20.setFont(new Font("", NORMAL, 25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.yellow);
        b2.setBackground(Color.black);
        b2.setForeground(Color.yellow);
        b3.setBackground(Color.black);
        b3.setForeground(Color.yellow);
        b4.setBackground(Color.black);
        b4.setForeground(Color.yellow);
        b5.setBackground(Color.black);
        b5.setForeground(Color.yellow);
        b6.setBackground(Color.black);
        b6.setForeground(Color.yellow);
        b7.setBackground(Color.black);
        b7.setForeground(Color.yellow);
        b8.setBackground(Color.black);
        b8.setForeground(Color.yellow);
        b9.setBackground(Color.black);
        b9.setForeground(Color.yellow);
        b10.setBackground(Color.black);
        b10.setForeground(Color.yellow);
        b11.setBackground(Color.black);
        b11.setForeground(Color.yellow);
        b12.setBackground(Color.black);
        b12.setForeground(Color.yellow);
        b13.setBackground(Color.black);
        b13.setForeground(Color.yellow);
        b14.setBackground(Color.black);
        b14.setForeground(Color.yellow);
        b16.setBackground(Color.black);
        b16.setForeground(Color.yellow);
        b15.setBackground(Color.black);
        b15.setForeground(Color.yellow);
        b17.setBackground(Color.black);
        b17.setForeground(Color.yellow);
        b18.setBackground(Color.black);
        b18.setForeground(Color.yellow);
        b20.setBackground(Color.black);
        b20.setForeground(Color.yellow);
        b19.setBackground(Color.black);
        b19.setForeground(Color.yellow);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        b1.addActionListener(v);
        b2.addActionListener(v);
        b3.addActionListener(v);
        b4.addActionListener(v);
        b5.addActionListener(v);
        b6.addActionListener(v);
        b7.addActionListener(v);
        b8.addActionListener(v);
        b9.addActionListener(v);
        b10.addActionListener(v);
        b11.addActionListener(v);
        b12.addActionListener(v);
        b13.addActionListener(v);
        b14.addActionListener(v);
        b15.addActionListener(v);
        b16.addActionListener(v);
        b17.addActionListener(v);
        b18.addActionListener(v);
        b19.addActionListener(v);
        b20.addActionListener(v);
        addKeyListener(v);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
    }

    private class vn implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = "", s2 = "";
            if (e.getSource() == b13) {
                s1 = r1.getText().toString() + "1";
                r1.setText(s1);
            }
            if (e.getSource() == b14) {
                s1 = r1.getText().toString() + "2";
                r1.setText(s1);
            }
            if (e.getSource() == b15) {
                s1 = r1.getText().toString() + "3";
                r1.setText(s1);
            }
            if (e.getSource() == b9) {
                s1 = r1.getText().toString() + "4";
                r1.setText(s1);
            }
            if (e.getSource() == b10) {
                s1 = r1.getText().toString() + "5";
                r1.setText(s1);
            }
            if (e.getSource() == b11) {
                s1 = r1.getText().toString() + "6";
                r1.setText(s1);
            }
            if (e.getSource() == b5) {
                s1 = r1.getText().toString() + "7";
                r1.setText(s1);
            }
            if (e.getSource() == b6) {
                s1 = r1.getText().toString() + "8";
                r1.setText(s1);
            }
            if (e.getSource() == b7) {
                s1 = r1.getText().toString() + "9";
                r1.setText(s1);
            }
            if (e.getSource() == b18) {
                s1 = r1.getText().toString() + "0";
                r1.setText(s1);
            }
            if (e.getSource() == b8) {
                s1 = r1.getText();
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                        Operation c1 = new Operation();
                        r1.setText(c1.calc(s1));
                        break;
                    }
                }
                s1 = r1.getText() + "*";
                r1.setText(s1);
            }
            if (e.getSource() == b16) {
                s1 = r1.getText();
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                        Operation c1 = new Operation();
                        r1.setText(c1.calc(s1));
                        break;
                    }
                }
                s1 = r1.getText().toString() + "+";
                r1.setText(s1);

            }
            if (e.getSource() == b12) {
                s1 = r1.getText();
                for (int i = 0; i < s1.length() - 1; i++) {
                    if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                        Operation c1 = new Operation();
                        r1.setText(c1.calc(s1));
                        break;
                    }
                }
                s1 = r1.getText().toString() + "-";
                r1.setText(s1);

            }
            if (e.getSource() == b4) {
                s1 = r1.getText();
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                        Operation c1 = new Operation();
                        r1.setText(c1.calc(s1));
                        break;
                    }
                }
                s1 = r1.getText().toString() + "/";
                r1.setText(s1);

            }
            if (e.getSource() == b1) {
                s1 = "";
                r1.setText(s1);

            }
            if (e.getSource() == b2) {
                s1 = r1.getText();
                s2 = "";
                for (int i = 0; i < s1.length() - 1; i++) {
                    s2 += s1.charAt(i);
                }
                r1.setText(s2);
            }
            if (e.getSource() == b3) {
                s1 = r1.getText();
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                        Operation c1 = new Operation();
                        r1.setText(c1.calc(s1));
                        break;
                    }
                }
                s1 = r1.getText().toString() + "%";
                r1.setText(s1);
            }
            if (e.getSource() == b19) {
                s1 = r1.getText().toString() + ".";
                r1.setText(s1);
            }
            if (e.getSource() == b20) {
                s1 = r1.getText();
                Operation c1 = new Operation();
                r1.setText(c1.calc(s1));
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            String s1 = "", s2 = "";
            int k = e.getKeyCode();
            switch (k) {
                case KeyEvent.VK_1: {
                    s1 = r1.getText().toString() + "1";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_2: {
                    s1 = r1.getText().toString() + "2";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_3: {
                    s1 = r1.getText().toString() + "3";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_4: {
                    s1 = r1.getText().toString() + "4";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_5: {
                    s1 = r1.getText().toString() + "5";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_6: {
                    s1 = r1.getText().toString() + "6";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_7: {
                    s1 = r1.getText().toString() + "7";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_8: {
                    s1 = r1.getText().toString() + "8";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_9: {
                    s1 = r1.getText().toString() + "9";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD1: {
                    s1 = r1.getText().toString() + "1";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD2: {
                    s1 = r1.getText().toString() + "2";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD3: {
                    s1 = r1.getText().toString() + "3";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD4: {
                    s1 = r1.getText().toString() + "4";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD5: {
                    s1 = r1.getText().toString() + "5";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD6: {
                    s1 = r1.getText().toString() + "6";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD7: {
                    s1 = r1.getText().toString() + "7";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD8: {
                    s1 = r1.getText().toString() + "8";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD9: {
                    s1 = r1.getText().toString() + "9";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_0: {
                    s1 = r1.getText().toString() + "0";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_NUMPAD0: {
                    s1 = r1.getText().toString() + "0";
                    r1.setText(s1);
                    break;
                }
                case KeyEvent.VK_BACK_SPACE: {
                    s1 = r1.getText();

                    s2 = "";
                    for (int i = 0; i < s1.length() - 1; i++) {
                        s2 += s1.charAt(i);
                    }
                    r1.setText(s2);
                    break;
                }
                case KeyEvent.VK_SUBTRACT: {
                    s1 = r1.getText();
                    for (int i = 0; i < s1.length() - 1; i++) {
                        if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                            Operation c1 = new Operation();
                            r1.setText(c1.calc(s1));
                            break;
                        }
                    }
                    s1 = r1.getText().toString() + "-";
                    r1.setText(s1);

                }
                case KeyEvent.VK_ADD: {
                    s1 = r1.getText();
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                            Operation c1 = new Operation();
                            r1.setText(c1.calc(s1));
                            break;
                        }
                    }
                    s1 = r1.getText().toString() + "+";
                    r1.setText(s1);
                }
                case KeyEvent.VK_MULTIPLY: {
                    s1 = r1.getText();
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                            Operation c1 = new Operation();
                            r1.setText(c1.calc(s1));
                            break;
                        }
                    }
                    s1 = r1.getText() + "*";
                    r1.setText(s1);
                }
                case KeyEvent.VK_DIVIDE: {
                    s1 = r1.getText();
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) == '+' || s1.charAt(i) == '*' || s1.charAt(i) == '/' || s1.charAt(i) == '%') {
                            Operation c1 = new Operation();
                            r1.setText(c1.calc(s1));
                            break;
                        }
                    }
                    s1 = r1.getText().toString() + "/";
                    r1.setText(s1);
                }
                case KeyEvent.VK_EQUALS: {
                    s1 = r1.getText();
                    Operation c1 = new Operation();
                    r1.setText(c1.calc(s1));
                }
                case KeyEvent.VK_ENTER : {
                    s1 = r1.getText();
                    Operation c1 = new Operation();
                    r1.setText(c1.calc(s1));
                }
               
               

            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }

    }

}
