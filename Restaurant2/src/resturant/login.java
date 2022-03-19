package resturant;

import Eyad.LoginInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public class login extends JFrame
{

    //------other pages----
    //manager Manager;
    //--------actions------
    connectTo myConnection;

    //----------image------------------
    Toolkit t = Toolkit.getDefaultToolkit();
    int x = t.getScreenSize().width;
    int y = t.getScreenSize().height;
    ImageIcon image1;
    Image change1;
    JLabel labelImage1;
    JPanel panel1;
    //----------------------------
    JPanel panel2;
    JLabel title, label1, label2, label3, label4, label5, label6, label7, label8, label9;
    JRadioButton radio1, radio2;
    ButtonGroup group1;
    JButton buttonLogin;
    JTextField text;
    JPasswordField pass;

    public login()
    {
        myConnection = new connectTo();
        //------------the image background----------------------
        image1 = new ImageIcon(getClass().getResource("/resturant/folder/title.png"));
        change1 = image1.getImage();
        change1 = change1.getScaledInstance(380, 85, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(change1);
        labelImage1 = new JLabel(image1);
        panel1 = new JPanel();
        //------------------------------------------------
        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(8.0f), Color.decode("#e67300")));
        title = new JLabel("Memeber login");
        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        group1 = new ButtonGroup();
        label1 = new JLabel("Id :");
        label2 = new JLabel("Password :");
        label3 = new JLabel("Manager");
        label4 = new JLabel("Employee");
        buttonLogin = new JButton("Login");
        text = new JTextField();
        pass = new JPasswordField();
        //-------------------------------------
        label5 = new JLabel("Name from 4 to 18 characters");
        label6 = new JLabel("Password 4 to 15 characteres");
        label7 = new JLabel("Id is empty");
        label8 = new JLabel("Password is empty");
        //-------------
        label9 = new JLabel();
        showIt();
    }

    public void showIt()
    {
        //--------------image------------//
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        panel1.setLayout(null);
        panel1.add(labelImage1);
        labelImage1.setBounds(x - (380 + 30), 0, 380, 85);
        panel1.setBounds(0, 0, x, y);
        panel1.setBackground(Color.decode("#331212"));
        this.add(panel1);
        //---------------BackGround2-------------------------
        panel2.setBackground(Color.white);
        panel1.add(panel2);
        int panel2Width = (int) (.35 * x);
        int panel2Height = (int) (.70 * y);
        panel2.setBounds((x / 2) - (panel2Width / 2), ((y / 2) - (panel2Height / 2)) - 30, panel2Width, panel2Height);
        panel2.setLayout(null);
        //-------------------Title------------------------
        panel2.add(title);
        title.setFont(new Font("", Font.BOLD, 35));
        title.setForeground(Color.decode("#e67300"));
        title.setBounds((panel2Width / 2) - (250 / 2), (int) (.05 * panel2Height), 250, 45);
        //-----------------text and 3labels-----------------
        Color c = Color.decode("#000000");
        Font f = new Font("", Font.BOLD, 25);
        panel2.add(label1);
        panel2.add(text);
        panel2.add(label5);
        panel2.add(label7);
        label1.setFont(f);
        label1.setForeground(c);
        label1.setBounds((int) ((panel2Width / 2) - (.30 * panel2Width)), (int) (.27 * panel2Height), 90, 30);
        text.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.28 * panel2Height), 200, 25);
        label5.setFont(new Font("", Font.BOLD, 18));
        label5.setForeground(Color.red);
        label5.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.33 * panel2Height), 500, 22);
        label7.setFont(new Font("", Font.BOLD, 18));
        label7.setForeground(Color.red);
        label7.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.33 * panel2Height), 200, 22);
        label5.hide();
        label7.hide();
        Font f2 = new Font("", Font.BOLD, 18);
        text.setFont(f2);
        //-------------password and 3labels----------------
        panel2.add(label2);
        panel2.add(pass);
        panel2.add(label6);
        panel2.add(label8);
        label2.setFont(f);
        label2.setForeground(c);
        label2.setBounds((int) ((panel2Width / 2) - (.42 * panel2Width)), (int) (.47 * panel2Height), 140, 30);
        pass.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.48 * panel2Height), 200, 25);
        label6.setFont(new Font("", Font.BOLD, 18));
        label6.setForeground(Color.red);
        label6.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.53 * panel2Height), 500, 25);
        label8.setFont(new Font("", Font.BOLD, 18));
        label8.setForeground(Color.red);
        label8.setBounds((int) ((panel2Width / 2) - (.1 * panel2Width)), (int) (.53 * panel2Height), 200, 25);
        label6.hide();
        label8.hide();
        pass.setFont(f2);
        //-----------------radio button1 and 1 label----------------
        panel2.add(radio1);
        panel2.add(label3);
        radio1.setBounds((int) ((panel2Width / 2) - (.39 * panel2Width)), (int) (.60 * panel2Height), 20, 20);
        radio1.setBackground(Color.white);
        label3.setBounds((int) ((panel2Width / 2) - (.34 * panel2Width)), (int) (.59 * panel2Height), 160, 30);
        label3.setFont(f);
        label3.setForeground(c);
        //-----------------------radio button2 and 1 label--------------------------
        panel2.add(radio2);
        panel2.add(label4);
        radio2.setBounds((int) ((panel2Width / 2) - (-.05 * panel2Width)), (int) (.60 * panel2Height), 20, 20);
        radio2.setBackground(Color.white);
        label4.setBounds((int) ((panel2Width / 2) - (-.1 * panel2Width)), (int) (.59 * panel2Height), 160, 30);
        label4.setFont(f);
        label4.setForeground(c);
        group1.add(radio1);
        group1.add(radio2);
        //--------------ButtonLogin and Adding actions---------------------------------
        label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login1.png")));
        panel2.add(label9);
        label9.setBounds((int) ((panel2Width / 2) - 75), (int) (.75 * panel2Height), 165, 60);
        label9.addMouseListener(myConnection);
        text.addKeyListener(myConnection);
        pass.addKeyListener(myConnection);
        radio1.addKeyListener(myConnection);
        radio2.addKeyListener(myConnection);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        //--------------------------------------------
    }

    //---AcTIONS Class-------------------------------------
    private class connectTo implements MouseListener, KeyListener
    {

        LoginInfo l2 = new LoginInfo();

        //-------------------------MOUSE--------------
        @Override
        public void mouseClicked(MouseEvent e)
        {
            if (radio1.isSelected())
            {
                String name = text.getText();
                if (name.length() <= 18 && name.length() >= 4)
                {
                    char[] entered = pass.getPassword();
                    String password = "";
                    for (int i = 0; i < entered.length; i++)
                    {
                        password = password + entered[i];
                    }
                    if (password.length() <= 15 && password.length() >= 4)
                    {
                        if (l2.Search(name, password, "Manager"))
                        {
                            UIManager ui = new UIManager();
                            ui.put("OptionPane.messageForeground", Color.decode("#2db300"));
                            JOptionPane.showMessageDialog(null, "Logined successfully as Manager");
                            new Manager();
                            dispose();
                        }
                        else
                        {
                            UIManager um = new UIManager();
                            um.put("OptionPane.messageForeground", Color.red);
                            JOptionPane.showMessageDialog(null, "Failed to Login\nReason : Wrong name or password");
                        }
                    }
                    else
                    {
                        if (password.length() == 0)
                        {
                            label8.setVisible(true);
                        }
                        else
                        {
                            label6.setVisible(true);
                        }
                    }
                }
                else
                {
                    if (name.length() == 0)
                    {
                        label7.setVisible(true);
                    }
                    else
                    {
                        label5.setVisible(true);
                    }
                }

            }
            else if (radio2.isSelected())
            {
                String name = text.getText();
                if (name.length() <= 18 && name.length() >= 4)
                {
                    char[] entered = pass.getPassword();
                    String password = "";
                    for (int i = 0; i < entered.length; i++)
                    {
                        password = password + entered[i];
                    }
                    if (password.length() <= 15 && password.length() >= 4)
                    {
                        if (l2.Search(name, password, "Employee"))
                        {
                            //JOptionPane.showMessageDialog(panel2, "Logined successfully as Employee");
                            UIManager ui = new UIManager();
                            ui.put("OptionPane.messageForeground", Color.decode("#2db300"));
                            JOptionPane.showMessageDialog(null, "Logined successfully as Employee");
                            new resturant.Employee();
                            dispose();

                        }
                        else
                        {
                            UIManager um = new UIManager();
                            um.put("OptionPane.messageForeground", Color.red);
                            JOptionPane.showMessageDialog(null, "Failed to Login\nReason : Wrong name or password");
                        }
                    }
                    else
                    {
                        if (password.length() == 0)
                        {
                            label8.setVisible(true);
                        }
                        else
                        {
                            label6.setVisible(true);
                        }
                    }
                }
                else
                {
                    if (name.length() == 0)
                    {
                        label7.setVisible(true);
                    }
                    else
                    {
                        label5.setVisible(true);
                    }
                }

            }
            else
            {
                UIManager um = new UIManager();
                um.put("OptionPane.messageForeground", Color.red);
                JOptionPane.showMessageDialog(null, "Please enter your job");
            }
        }

        @Override
        public void mousePressed(MouseEvent e)
        {
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login2.png")));
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login1.png")));
        }

        //-------------------------------------------------
        //---------------------------------KEYBOARD--------
        @Override
        public void keyTyped(KeyEvent e)
        {
        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            int k = e.getKeyCode();
            switch (k)
            {
                case KeyEvent.VK_ENTER:
                    label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login2.png")));
                    if (radio1.isSelected())
                    {
                        //JOptionPane.showMessageDialog(panel2, "thank you");
                        String name = text.getText();
                        if (name.length() <= 18 && name.length() >= 4)
                        {
                            char[] entered = pass.getPassword();
                            String password = "";
                            for (int i = 0; i < entered.length; i++)
                            {
                                password = password + entered[i];
                            }
                            if (password.length() <= 15 && password.length() >= 4)
                            {
                                if (l2.Search(name, password, "Manager"))
                                {
                                    UIManager ui = new UIManager();
                                    ui.put("OptionPane.messageForeground", Color.decode("#2db300"));
                                    JOptionPane.showMessageDialog(null, "Logined successfully as Manager");
                                    new Manager();
                                    dispose();
                                }
                                else
                                {
                                    UIManager um = new UIManager();
                                    um.put("OptionPane.messageForeground", Color.red);
                                    JOptionPane.showMessageDialog(null, "Failed to Login\nReason : Wrong name or password");
                                }
                            }
                            else
                            {
                                if (password.length() == 0)
                                {
                                    label8.setVisible(true);
                                }
                                else
                                {
                                    label6.setVisible(true);
                                }
                            }
                        }
                        else
                        {
                            if (name.length() == 0)
                            {
                                label7.setVisible(true);
                            }
                            else
                            {
                                label5.setVisible(true);
                            }
                        }

                    }
                    else if (radio2.isSelected())
                    {
                        //JOptionPane.showMessageDialog(panel2, "thank you");
                        String name = text.getText();
                        if (name.length() <= 18 && name.length() >= 4)
                        {
                            char[] entered = pass.getPassword();
                            String password = "";
                            for (int i = 0; i < entered.length; i++)
                            {
                                password = password + entered[i];
                            }
                            if (password.length() <= 15 && password.length() >= 4)
                            {
                                if (l2.Search(name, password, "Employee"))
                                {
                                    UIManager ui = new UIManager();
                                    ui.put("OptionPane.messageForeground", Color.decode("#2db300"));
                                    JOptionPane.showMessageDialog(null, "Logined successfully as Employee");
                                    new resturant.Employee();
                                    dispose();
                                }
                                else
                                {
                                    UIManager um = new UIManager();
                                    um.put("OptionPane.messageForeground", Color.red);
                                    JOptionPane.showMessageDialog(null, "Failed to Login\nReason : Wrong name or password");
                                }
                            }
                            else
                            {
                                if (password.length() == 0)
                                {
                                    label8.setVisible(true);
                                }
                                else
                                {
                                    label6.setVisible(true);
                                }
                            }
                        }
                        else
                        {
                            if (name.length() == 0)
                            {
                                label7.setVisible(true);
                            }
                            else
                            {
                                label5.setVisible(true);
                            }
                        }

                    }
                    else
                    {
                        UIManager um = new UIManager();
                        um.put("OptionPane.messageForeground", Color.red);
                        JOptionPane.showMessageDialog(null, "Please enter your job");
                        label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login1.png")));
                    }
                    break;

            }
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setIcon(new ImageIcon(getClass().getResource("/resturant/folder/login1.png")));
        }
        //--------------------------------------
    }

}
