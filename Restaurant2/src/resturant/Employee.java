
package resturant;
import Eyad.*;
import Resturant.Validation;
import Employee.*;
//import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.swing.*;
import java.awt.*;
import static java.awt.Frame.NORMAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
public class Employee extends JFrame{
    int k;
    JButton [] BMeals  = new JButton[100];
    int x = 5 , y = 10 , i = 1; int s = 200;
    JTextField [] t= new JTextField[100];
    JLabel [] L  = new JLabel[100];
    JPanel [] p  = new JPanel[100];
    JButton [] b = new JButton[100]; 
    JPanel first = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel(); 
    DefaultTableModel model = new DefaultTableModel();   
    JTable table = new JTable(model);
    DefaultTableModel modelBilling = new DefaultTableModel();   
    JTable tableBilling = new JTable(modelBilling);
    DefaultTableModel modelBillingInfo = new DefaultTableModel();   
    JTable tableBillingInfo = new JTable(modelBillingInfo);
    DefaultTableModel modelCustomer = new DefaultTableModel();   
    JTable tableCustomer = new JTable(modelCustomer);
     DefaultTableModel modelCustomerBillings = new DefaultTableModel();   
    JTable tableCustomerBillings = new JTable(modelCustomerBillings);
    JPanel sp = new JPanel();
    JScrollPane pr = new JScrollPane(sp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JScrollPane pr7 , pr8 , pr2 , pr4 , pr5 ;
    public Employee() {
     
         
        
        this.setTitle("Resturant");
        this.setSize(1980,1080); 
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        b[0] = new JButton("Orders");
        b[1] = new JButton("Custmers");
        b[2] = new JButton("Billing");
        b[3] = new JButton ("NewCustmer");
        b[4] = new JButton("LogOut");
        b[0].setBounds(30,15,150,100); b[1].setBounds(30,130,150,100); b[2].setBounds(30,245,150,100);b[3].setBounds(30,360,150,100);b[4].setBounds(30,800, 150, 100);
        b[0].setBackground(Color.BLACK);b[0].setForeground(Color.YELLOW); b[1].setBackground(Color.BLACK);b[1].setForeground(Color.YELLOW);
        b[2].setBackground(Color.BLACK);b[2].setForeground(Color.YELLOW); b[3].setBackground(Color.BLACK);b[3].setForeground(Color.YELLOW);
        b[4].setBackground(Color.BLACK);b[4].setForeground(Color.YELLOW);
        b[0].setFont( new Font("",NORMAL,20) {
        });
        b[1].setFont( new Font("",NORMAL,20));
        b[2].setFont( new Font("",NORMAL,20));
        b[3].setFont( new Font("",NORMAL,20));
        b[4].setFont( new Font("",NORMAL,20));
        model.addColumn("Name");model.addColumn("ID");model.addColumn("Price");model.addColumn("Count");
        modelBilling.addColumn("Order ID");modelBilling.addColumn("Name");modelBilling.addColumn("Phone");modelBilling.addColumn("Total");
        modelBillingInfo.addColumn("Order ID");modelBillingInfo.addColumn("Name");modelBillingInfo.addColumn("Id");modelBillingInfo.addColumn("price");
        modelBillingInfo.addColumn("Coint");
        modelCustomer.addColumn("Name");modelCustomer.addColumn("Phone");modelCustomer.addColumn("Email");modelCustomer.addColumn("Address");
        p5.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        add(b[0]);add(b[1]);add(b[2]);add(b[3]);add(b[4]);  
        ACtion A = new ACtion(); 
        b[1].addActionListener(A);b[0].addActionListener(A);b[3].addActionListener(A);b[4].addActionListener(A);b[2].addActionListener(A);
        
        
        
        // new Cutomer declaration
        L[9] = new JLabel("Name"); L[10] = new JLabel("Phone");L[11] = new JLabel("Email"); L[14] = new JLabel("Adress");L[15] = new JLabel("Number of Home");
        L[16] = new JLabel("Street"); L[17] = new JLabel("city");L[18] = new JLabel("country");
        t[7] = new JTextField(); t[8] = new JTextField(); t[9] = new JTextField(); t[11] = new JTextField(); t[12] = new JTextField(); t[13] = new JTextField();t[14] = new JTextField(); 
        b[12] = new JButton("Confirm");b[13] = new JButton("Reset");
        newCustomerAction a = new newCustomerAction();
        b[12].addActionListener(a);b[13].addActionListener(a);
        
       
        // customer Declaration
        L[23] = new JLabel("Name");L[24] = new JLabel("Phone");L[25] = new JLabel("Email");L[26] = new JLabel("Adress");t[18] = new JTextField();
        t[19] = new JTextField();t[20] = new JTextField();t[21] = new JTextField();t[22] = new JTextField();b[27] = new JButton("Search");
        b[28] = new JButton("All Cutomer");b[29] = new JButton("Cutomes's details");b[30] = new JButton("Remove Customer");
        b[31] = new JButton("Billing Details"); b[32] = new JButton("Customer's Billings");
        pr7 = new JScrollPane(tableCustomerBillings, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pr8 = new JScrollPane(tableCustomer, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        actionCustomer c = new actionCustomer();
        b[28].addActionListener(c); b[29].addActionListener(c);b[27].addActionListener(c);b[31].addActionListener(c);b[32].addActionListener(c);b[30].addActionListener(c);
        
        // order declaration
        Object[] s;
        String tab ;
        ArrayList<String> list = new Meal1().ListTable();
        s = list.toArray();
        for (int i = 1; i < list.size(); i += 3) {
           tab = s[i].toString();;
            NewMeal(tab);
        }
        L[0] = new JLabel("Meal Name");t[0] = new JTextField();b[5] = new JButton("add");L[1] = new JLabel("Custmor Phone");t[1] = new JTextField();
        L[2] = new JLabel("Custmor Name");t[2] = new JTextField();L[3] = new JLabel("Address");t[3] = new JTextField();b[6] = new JButton("New order");
        b[7] = new JButton("show Offer");b[8] = new JButton("Remove item");b[9] = new JButton("Custmer profil");b[10] = new JButton("Cancel");
        pr2= new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        L[4] = new JLabel("Total");t[4] = new JTextField();L[5] = new JLabel("Discont"); t[5] = new JTextField();L[6] = new JLabel("Required");t[6] = new JTextField();
        L[8] = new JLabel("Price");t[10] = new JTextField();b[11] = new JButton("Confirm");b[15] = new JButton("Calcolator");
        ACtion Ax = new ACtion();b[11].addActionListener(Ax);b[15].addActionListener(Ax);
        actionOrder or = new actionOrder();
        b[6].addActionListener(or);b[8].addActionListener(or);b[10].addActionListener(or);b[11].addActionListener(or);b[7].addActionListener(or);
        
        
        // Billing declaration
        pr4= new JScrollPane(tableBillingInfo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        pr5= new JScrollPane(tableBilling,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        L[20] = new JLabel("Billing's ID");t[15] = new JTextField();b[20] = new JButton("Search");L[21] = new JLabel("Custmor Phone");
        t[16] = new JTextField();b[21] = new JButton("Custome's billings");
        b[23] = new JButton("Remove item");b[24] = new JButton("delete Order");b[25] = new JButton("All Billing");
        actionBilling ar = new actionBilling();
        b[25].addActionListener(ar);b[20].addActionListener(ar);b[21].addActionListener(ar);b[24].addActionListener(ar);
        
        Orders();
        
    }
    
    
    
    
    public void Orders(){
           first.setBounds(200,0, 1980, 1000);
           this.add(first);
           first.setBackground(Color.yellow);
           first.setLayout(null);
           
          
           pr.setBounds(50, 250, 700, 650);
           sp.setPreferredSize( new Dimension(600,1200));
           sp.setBackground(Color.WHITE);
           first.add(pr);
          sp.setLayout(null);
         
          this.setLocation(0,0);
          
          L[0].setBounds(60, 200 , 150 , 30);L[0].setFont( new Font("",Font.BOLD,20));first.add(L[0]);
          t[0].setBounds(200,200 ,250, 40);first.add(t[0]);t[0].setFont( new Font("",NORMAL,20));first.add(L[0]);
          b[5].setBounds(460,200 ,100, 40);first.add(b[5]);b[5].setBackground(Color.black);b[5].setForeground(Color.red);
          L[1].setBounds(1000, 50 , 150 , 30);L[1].setFont( new Font("",Font.BOLD,20));first.add(L[1]);
          t[1].setBounds(1170,50 ,250, 40);first.add(t[1]);t[1].setFont( new Font("",NORMAL,20));
          L[2].setBounds(1000, 100 , 150 , 30);L[2].setFont( new Font("",Font.BOLD,20));first.add(L[2]);
          t[2].setBounds(1170,100 ,250, 40);first.add(t[2]);t[2].setFont( new Font("",NORMAL,20));
          L[3].setBounds(1000, 150 , 150 , 30);L[3].setFont( new Font("",Font.BOLD,20));first.add(L[3]);
          t[3].setBounds(1170,150 ,250, 40);first.add(t[3]);t[3].setFont( new Font("",NORMAL,20));
          b[6].setBounds(1500,80,150, 70);b[6].setFont( new Font("",NORMAL,20));first.add(b[6]);
          b[6].setBackground(Color.BLACK);b[6].setForeground(Color.red);
          b[7].setBounds(1550,260,150, 70);b[7].setFont( new Font("",NORMAL,20));first.add(b[7]);
          b[7].setBackground(Color.BLACK);b[7].setForeground(Color.red);
          b[8].setBounds(1550,340,150, 70);b[8].setFont( new Font("",NORMAL,20));first.add(b[8]);
          b[8].setBackground(Color.BLACK);b[8].setForeground(Color.red);
          b[9].setBounds(1550,420,150, 70);b[9].setFont( new Font("",NORMAL,15));first.add(b[9]);
          b[9].setBackground(Color.BLACK);b[9].setForeground(Color.red);
          b[10].setBounds(1550,500,150, 70);b[10].setFont( new Font("",NORMAL,20));first.add(b[10]);
          b[10].setBackground(Color.BLACK);b[10].setForeground(Color.red);
          
          table.setRowHeight(30);
          table.setFont( new Font("",NORMAL,15) {
          });
          pr2.setBounds(1000, 220 ,545 , 600);first.add(pr2);
          JLabel img = new JLabel(new ImageIcon("C:\\Users\\eslam\\Desktop\\k.jpg"));
          img.setBounds(10, 10, 200, 150);
          first.add(img);
          /*table = new JTable(data,colums);
          table.setFillsViewportHeight(true);
          table.setPreferredSize( new Dimension(600,1200));
          table.setBackground(Color.WHITE);*/
          L[4].setBounds(1100, 840 , 150 , 30);L[4].setFont( new Font("",Font.BOLD,20));first.add(L[4]);
          t[4].setBounds(1250,840 ,250, 40);first.add(t[4]);t[4].setFont( new Font("",NORMAL,20));
          L[5].setBounds(1100, 890 , 150 , 30);L[5].setFont( new Font("",Font.BOLD,20));first.add(L[5]);
          t[5].setBounds(1250,890 ,250, 40);first.add(t[5]);t[5].setFont( new Font("",NORMAL,20));
          L[6].setBounds(1100, 940 , 150 , 30);L[6].setFont( new Font("",Font.BOLD,20));first.add(L[6]);
          t[6].setBounds(1250,940,250, 40);first.add(t[6]);t[6].setFont( new Font("",NORMAL,20));
          t[6].setBackground(Color.CYAN);t[5].setBackground(Color.ORANGE);t[4].setBackground(Color.green);
          L[8].setBounds(100, 940 , 150 , 30);L[8].setFont( new Font("",Font.BOLD,20));first.add(L[8]);
          t[10].setBounds(250,940,250, 40);first.add(t[10]);t[10].setFont( new Font("",NORMAL,20));first.add(t[10]);
          t[10].setBackground(Color.CYAN);
          b[11].setBounds(1550, 825, 150 , 80);first.add(b[11]);b[11].setFont(  new Font("",NORMAL,20));b[11].setBackground(Color.BLUE);
          b[11].setForeground(Color.YELLOW);
       
          
          
          b[15].setBounds(1550,910,150,80);
          
          first.add(b[15]);b[15].setBackground(Color.GREEN);b[15].setFont( new Font("",NORMAL,20));b[15].setForeground(Color.red);
          /*table.addMouseListener(new java.awt.event.MouseAdapter() {
              public void mouseClicked ( java.awt.event.MouseEvent evt){
                  k = table.getSelectedRow();
                 
              }
          });*/
         
       
        
        
        
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void  NewMeal( String Name){
        if ( i % 11 == 0){
            x = x +180;
            y = 10;
        }
        AddMeal m = new AddMeal();
        BMeals[i] = new JButton(Name);
        BMeals[i].setBounds(x, y, 150, 100);
        BMeals[i].setFont( new Font ("",NORMAL,20));
        BMeals[i].setBackground(Color.BLACK);BMeals[i].setForeground(Color.red);
        BMeals[i].addActionListener(m);
        sp.add(BMeals[i]);
        i++;
        y += 120;
    }
    
    
    
    
    
    public void NewCustomer(){
        p3.setBounds(200,0, 1980, 1000);
        p3.setBackground(Color.ORANGE);
        this.add(p3);
        p3.setLayout(null);
        JLabel img = new JLabel(new ImageIcon("C:\\Users\\eslam\\Desktop\\h.png"));
        L[9] = new JLabel("Name");L[9].setBounds(200, 100, 150, 50);p3.add(L[9]);L[9].setFont( new Font("",NORMAL,20));
        L[10] = new JLabel("Phone");L[10].setBounds(200, 170, 150, 50);p3.add(L[10]);L[10].setFont( new Font("",NORMAL,20));
        L[11] = new JLabel("Email");L[11].setBounds(200, 240, 150, 50);p3.add(L[11]);L[11].setFont( new Font("",NORMAL,20));
        L[14] = new JLabel("Adress");L[14].setBounds(200, 380, 150, 50);p3.add(L[14]);L[14].setFont( new Font("",NORMAL,20));
        L[15] = new JLabel("Number of Home");L[15].setBounds(200, 450, 150, 50);p3.add(L[15]);L[15].setFont( new Font("",NORMAL,20));
        L[16] = new JLabel("Street");L[16].setBounds(460, 450, 150, 50);p3.add(L[16]);L[16].setFont( new Font("",NORMAL,20));
        L[17] = new JLabel("city");L[17].setBounds(200, 530 , 150, 50);p3.add(L[17]);L[17].setFont( new Font("",NORMAL,20));
        L[18] = new JLabel("country");L[18].setBounds(520, 530 , 150, 50);p3.add(L[18]);L[18].setFont( new Font("",NORMAL,20));
        t[7].setBounds(350, 100, 250, 40);p3.add(t[7]);t[7].setBackground(Color.green);t[7].setFont( new Font("",NORMAL,20));
        t[8].setBounds(350, 170, 250, 40);p3.add(t[8]);t[8].setBackground(Color.green);t[8].setFont( new Font("",NORMAL,20));
        t[9].setBounds(350, 240, 350, 40);p3.add(t[9]);t[9].setBackground(Color.green);t[9].setFont( new Font("",NORMAL,20));
        t[11].setBounds(360, 450, 80, 40);p3.add(t[11]);t[11].setBackground(Color.green);t[11].setFont( new Font("",NORMAL,20));
        t[12].setBounds(540, 450, 250, 40);p3.add(t[12]);t[12].setBackground(Color.green);t[12].setFont( new Font("",NORMAL,20));
        t[13].setBounds(300, 530, 200, 40);p3.add(t[13]);t[13].setBackground(Color.green);t[13].setFont( new Font("",NORMAL,20));
        t[14].setBounds(600, 530, 200, 40);p3.add(t[14]);t[14].setBackground(Color.green);t[14].setFont( new Font("",NORMAL,20));
        b[12].setBounds(300,700, 150, 50);p3.add(b[12]);b[12].setBackground(Color.PINK);b[12].setFont( new Font("",NORMAL,20));
        b[13].setBounds(500,700, 150, 50);p3.add(b[13]);b[13].setBackground(Color.PINK);b[13].setFont( new Font("",NORMAL,20));
        img.setBounds(1000, 200, 500, 600);
        p3.add(img);
       
        
        
   }
    
    
    
    public void Customer(){
        p5.setBounds(200,0, 1980, 1000);
        p5.setBackground(Color.PINK);
        this.add(p5);
        p5.setLayout(null);
        L[23].setBounds(50, 100, 150, 50);p5.add(L[23]);L[23].setFont( new Font("",NORMAL,20));
        L[24].setBounds(50, 170, 150, 50);p5.add(L[24]);L[24].setFont( new Font("",NORMAL,20));
        L[25].setBounds(50, 240, 150, 50);p5.add(L[25]);L[25].setFont( new Font("",NORMAL,20));
        L[26].setBounds(50, 310, 150, 50);p5.add(L[26]);L[26].setFont( new Font("",NORMAL,20));
        t[18].setBounds(220, 100, 250, 40);p5.add(t[18]);t[18].setBackground(Color.green);t[18].setFont( new Font("",NORMAL,20));
        t[19].setBounds(220, 170, 250, 40);p5.add(t[19]);t[19].setBackground(Color.green);t[19].setFont( new Font("",NORMAL,20));
        t[20].setBounds(220, 240, 350, 40);p5.add(t[20]);t[20].setBackground(Color.green);t[20].setFont( new Font("",NORMAL,20));
        t[21].setBounds(220, 310, 350, 40);p5.add(t[21]);t[21].setBackground(Color.green);t[21].setFont( new Font("",NORMAL,20));
        t[22].setBounds(80, 30 , 300 , 40);;p5.add(t[22]);t[22].setBackground(Color.WHITE);t[22].setFont( new Font("",NORMAL,20));
        b[27].setBounds(379,30, 120, 40);p5.add(b[27]);b[27].setBackground(Color.CYAN);b[27].setFont( new Font("",NORMAL,20));
        b[28].setBounds(790,30, 200, 50);p5.add(b[28]);b[28].setBackground(Color.CYAN);b[28].setFont( new Font("",NORMAL,20));
        b[29].setBounds(790,90, 200, 50);p5.add(b[29]);b[29].setBackground(Color.CYAN);b[29].setFont( new Font("",NORMAL,20));
        b[30].setBounds(790,150, 200, 50);p5.add(b[30]);b[30].setBackground(Color.CYAN);b[30].setFont( new Font("",NORMAL,20));
        b[31].setBounds(790,360, 200, 50);p5.add(b[31]);b[31].setBackground(Color.CYAN);b[31].setFont( new Font("",NORMAL,20));
        b[32].setBounds(790,420, 200, 50);p5.add(b[32]);b[32].setBackground(Color.CYAN);b[32].setFont( new Font("",NORMAL,20));
        tableCustomerBillings.setFont(new Font("", NORMAL, 15) {
        });
        tableCustomerBillings.setRowHeight(30);
       
        pr7.setBounds(50, 360, 700, 600);
        p5.add(pr7);

        tableCustomer.setRowHeight(30);
        tableCustomer.setFont(new Font("", NORMAL, 15) {
        });
        pr8.setBounds(1000, 30, 700, 600);
        p5.add(pr8);
       
       
   }
    
    
    
    
    
   public   void BILLING (){
           
          p4.setBounds(200,0, 1980, 1000);
          this.add(p4);
           p4.setBackground(Color.BLACK);
           p4.setLayout(null);
           
          
          tableBillingInfo.setFont( new Font("",NORMAL,15) {
          });
          tableBillingInfo.setRowHeight(30);  
          pr4.setBounds(50, 250, 700, 650);p4.add(pr4);
          ACtion A = new ACtion();
          this.setLocation(0,0);
          
          L[20].setBounds(60, 200 , 150 , 30);L[20].setFont( new Font("",Font.BOLD,20));p4.add(L[20]);L[20].setForeground(Color.YELLOW);
          t[15].setBounds(200,200 ,250, 40);p4.add(t[15]);t[15].setFont( new Font("",NORMAL,20));
          b[20].setBounds(449,200 ,150, 40);p4.add(b[20]);b[20].setBackground(Color.CYAN);b[20].setForeground(Color.red);
          L[21].setBounds(1000, 75 , 150 , 30);L[21].setFont( new Font("",Font.BOLD,20));p4.add(L[21]);L[21].setForeground(Color.YELLOW);
          t[16].setBounds(1170,75 ,250, 40);p4.add(t[16]);t[16].setFont( new Font("",NORMAL,20));
          b[21].setBounds(1500,70,200, 60);b[21].setFont( new Font("",NORMAL,20));p4.add(b[21]);
          b[21].setBackground(Color.PINK);b[21].setForeground(Color.red);
          
          
          tableBilling.setRowHeight(30);
          tableBilling.setFont( new Font("",NORMAL,15) {
          }); 
          pr5.setBounds(1000, 180 ,650 , 700);p4.add(pr5);
          JLabel img = new JLabel(new ImageIcon("C:\\Users\\eslam\\Desktop\\k.jpg"));
          img.setBounds(10, 10, 200, 150);
          p4.add(img);
         
          b[23].setBounds(100,920,200,60);b[23].setBackground(Color.PINK);p4.add(b[23]);b[23].setFont( new Font("",NORMAL,20));
          b[24].setBounds(350,920,200,60);b[24].setBackground(Color.PINK);p4.add(b[24]);b[24].setFont( new Font("",NORMAL,20));
          b[25].setBounds(795,180 ,200, 50);p4.add(b[25]);b[25].setBackground(Color.YELLOW);b[25].setForeground(Color.red);
          b[25].setFont( new Font("",NORMAL,20));
          
          
          
          tableBilling.addMouseListener(new java.awt.event.MouseAdapter() {
                     @Override
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                  modelBillingInfo.setRowCount(0);
                  String r = (String) tableBilling.getValueAt(tableBilling.getSelectedRow(), 0);
                  info_order io = new info_order();
                  String[] s = new String[5];
                  Object[] n;
                  ArrayList<String> list = io.ListTable();
                  n = list.toArray();
                  for (int i = 0; i < list.size(); i += 5) {
                      s[0] = n[i].toString();
                      if (s[0].equals(r)) {
                          s[0] = n[i].toString();
                          s[1] = n[i + 1].toString();
                          s[2] = n[i + 2].toString();
                          s[3] = n[i + 3].toString();
                          s[4] = n[i + 4].toString();
                          modelBillingInfo.addRow(s);
                      }
                  }
                        
                    }
          });
          
   }


    
            
    
  
    @SuppressWarnings("unchecked")
    
    public void tableMouseClicked(java.awt.event.MouseEvent evt){
        if (evt.getSource() == model){
            System.out.println(table.getSelectedRow());        }
    }
    
    
    
    
    private  class ACtion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
           if (e.getSource() == b[0]){
               first.setVisible(true);
               p5.setVisible(false);
               p3.setVisible(false);
                p4.setVisible(false);
               Orders();
           }
           if (e.getSource() == b[3]){
               p5.setVisible(false);
               first.setVisible(false);
                p4.setVisible(false);
               p3.setVisible(true);
               NewCustomer();
           }
           if ( e.getSource() == b[2]){
               p5.setVisible(false);
               first.setVisible(false);
               p3.setVisible(false);
               p4.setVisible(true);
               BILLING();
           }
            if (e.getSource() == b[1]){
               p5.setVisible(true);
               first.setVisible(false);
               p4.setVisible(false);
               p3.setVisible(false);
               Customer();
               
           }
           if(e.getSource() == b[4]){
               dispose();
               new login();
           }
           /*if(e.getSource() == BMeals[5]){
              String s = BMeals[5].getText();
               System.out.println(s);
              
           }*/
           if(e.getSource() == b[15] ){
               new Calcolator();
           }
           if(e.getSource() == b[11] ){
                 String[][] s = new String[10][10];
                 for ( int i = 0 ; i < model.getRowCount() ; i++ ){
                     for(int j = 0 ; j < model.getColumnCount() ; j++){
                         s[i][j] = model.getValueAt(i,j).toString();
                         
                     }
                 }

             //  System.out.println(s[1][1]);
               //System.out.println(model.getRowCount());
           }
           
        }
       

        
    }
    
    
    
    
    
    private class newCustomerAction implements ActionListener {
       CustomerInfo Ci  = new CustomerInfo();
        @Override
        public void actionPerformed(ActionEvent e) {
            if ( e.getSource() == b[12] ){
                String [] s = new String[7];
                int c = 0 ;
                if ( Validation.checkPhone(t[8].getText())){
                    s[0] = t[8].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "phone isn't correct");
                    t[8].setText("");
                    c++;
                }
                if ( Validation.checkName(t[7].getText())){
                    s[1] = t[7].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "name isn't correct");
                    t[7].setText("");
                    c++;
                }
                if ( Validation.checkEmail(t[9].getText())){
                    s[2] = t[9].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "Email isn't correct");
                    t[9].setText("");
                    c++;
                }
                if (true){
                    s[4] = t[12].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "phone isn't correct");
                    t[12].setText("");
                    c++;
                }
                if ( Validation.checkHomeNumber(t[11].getText())){
                    s[3] = t[11].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "HomeNumber isn't correct");
                    t[11].setText("");
                    c++;
                }
                if ( Validation.checkCity(t[13].getText())){
                    s[5] = t[13].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "City isn't correct");
                    t[13].setText("");
                    c++;
                }
                if ( Validation.checkCountry(t[14].getText())){
                    s[6] = t[14].getText();
                }
                else{
                    JOptionPane.showMessageDialog(p3, "Country isn't correct");
                    t[14].setText("");
                    c++;
                }
                if ( c == 0 ){
                    if ( Ci.Insert(s) ){
                        t[7].setText("");t[8].setText("");t[9].setText("");t[11].setText("");t[12].setText("");t[13].setText("");t[14].setText("");
                        JOptionPane.showMessageDialog(p3, "Customer adding  successfully");
                    }
                    else
                        JOptionPane.showMessageDialog(p3,"Error in database");
                }
                else
                    JOptionPane.showMessageDialog(p3, "Enter correct data");
            }
            if(e.getSource() == b[13] ){
                t[7].setText("");t[8].setText("");t[9].setText("");t[11].setText("");t[12].setText("");t[13].setText("");t[14].setText("");
            }
        }
        
    }
    
    
    private class actionOrder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) { 
            CustomerInfo CI = new CustomerInfo();
            int i;
            if ( e.getSource() == b [6] ){
                if ( Validation.checkPhone(t[1].getText())){
                    ArrayList<String> sc = new CustomerInfo().Search(t[1].getText());
                    Object [] s = sc.toArray();
                    for ( i = 0 ; i < 7 ; i++ ){
                        if ( sc.size() == 0 || ((String) s[i] == null) )
                            break;
                    } 
                    if ( i == 7 ){
                        t[2].setText((String)s[1]);
                        t[3].setText( (String) s[3] + "-" + s[4] + "-" + s[5]);
                    }
                    else{
                        t[1].setText("");
                        JOptionPane.showMessageDialog(first, "Customer isn't found in Resturant");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(first,"Phone isn't Corret");
                    t[1].setText("");
                }
                
                    
            }
            if ( e.getSource() == b[7] ){
                String str = "";
                Offer of = new Offer();
                ArrayList<String> list = of.ListTable();
                Object [] ob = list.toArray();
                for ( int  r = 0 ; r < list.size() ; r +=2 ){
                    str += ob[r].toString() + "     " + ob[r+1].toString()+"%\n";
                }
                JOptionPane.showMessageDialog(first,str);
                
            }
            
            if ( e.getSource() == b[8]){
                model.removeRow(table.getSelectedRow());
            }
            
            if ( e.getSource() == b[10] ){
                model.setRowCount(0);
                t[1].setText("");t[2].setText("");t[3].setText("");t[10].setText("");t[4].setText("");
            }
            if ( e.getSource() == b[11]){
               int Ran; int z; int j;
               Billing Br = new Billing();
               info_order io = new info_order();
               String [] s = new String[5];
               Object [] n;
               ArrayList<String> list =  Br.ListTable();
               n = list.toArray();
               String [] str = new String[4];
               Ran = 100  + (int)(Math.random()*9900);
               s[0] = Integer.toString(Ran);
               str[0] = Integer.toString(Ran);
               for (  j = 0 ;  j > 0 ;  j++ ){
                    Ran = 100  + (int)(Math.random()*9900);
                    s[0] = n[0].toString();
                   for (   z = 0 ; z < list.size() ; z +=4 ){
                       if ( s[0].equals(Integer.toString(Ran)))
                           break;
                   }
                   if ( z > list.size()){
                       s[0] = Integer.toString(Ran);
                       str[0] = Integer.toString(Ran);
                       break;
                   }   
                   
               }
               z = 0;
               if ( table.getRowCount() == 0 )
                   JOptionPane.showMessageDialog(first, "The Order is Empty");
               if ( table.getRowCount() > 0 ) {
                       if (Validation.checkPhone(t[1].getText())) {
                           str[2] = t[1].getText();
                       } else {
                           t[1].setText("");z++;
                           JOptionPane.showMessageDialog(first, "phone is not correct");
                       }
                       if (Validation.checkName(t[2].getText())) {
                           str[1] = t[2].getText();
                       } else {
                           t[2].setText("");z++;
                           JOptionPane.showMessageDialog(first, "Name is not corrct");
                       }
                       str[3] = t[4].getText();
                       t[3].setText("");
                       if (str[1] == null || str[1].equals("") || str[2] == null || str[2].equals("") || str[3] == null || str[3].equals("")) {
                           JOptionPane.showMessageDialog(first, "Enter corrcet data");
                       } else {
                           Br.Insert(str);
                       }
                      
                       
                }
                for (  j = 0 ; j < table.getRowCount() && z == 0;  ){
                         s[1] = (String) table.getValueAt(j, 0);
                         s[2] = (String) table.getValueAt(j, 1);
                         s[3] = (String) table.getValueAt(j, 2);
                         s[4] = (String) table.getValueAt(j, 3);
                         if ( table.getRowCount() == 1 ){
                             JOptionPane.showMessageDialog(first, "Order confirmed");
                         }
                         if ( io.Insert(s))
                            model.removeRow(j);
                         else
                            JOptionPane.showMessageDialog(first, "Error in database"); 
                         t[4].setText("");
                        
                }
              
               t[10].setText("");t[1].setText("");t[2].setText("");t[3].setText("");
            }
        }
        
    }
    
    
    
    
    
    
    
    private  class actionBilling implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       if ( e.getSource() == b[25]){
           modelBilling.setRowCount(0);
           Billing Br = new Billing();
            info_order io = new info_order();
            String [] s = new String[4];
            Object [] n;
            ArrayList<String> list =  Br.ListTable();
            n = list.toArray();
            for ( int i = 0 ; i < list.size() ; i += 4 ){
                s[0] =  n[i].toString();
                s[1] =  n[i+1].toString();
                s[2] =  n[i+2].toString();
                s[3] =  n[i+3].toString();
                modelBilling.addRow(s);
            }
            
       }
        if (e.getSource() == b[20]) {
            modelBillingInfo.setRowCount(0);
            String r = t[15].getText();
            info_order io = new info_order();
            String[] s = new String[5];
            Object[] n;
            ArrayList<String> list = io.ListTable();
            n = list.toArray();
            for (int i = 0; i < list.size(); i += 5) {
                s[0] = n[i].toString();
                if (s[0].equals(r)) {
                    s[0] = n[i].toString();
                    s[1] = n[i + 1].toString();
                    s[2] = n[i + 2].toString();
                    s[3] = n[i + 3].toString();
                    s[4] = n[i + 4].toString();
                    modelBillingInfo.addRow(s);
                }
            }
        }
        if ( e.getSource() == b[21] ){
            modelBilling.setRowCount(0);
            String str;
            CustomerInfo ci = new CustomerInfo();
            if ( Validation.checkPhone(t[16].getText())){
                str = t[16].getText();
                ArrayList  stu = ci.Search(str);
                Object [] st = stu.toArray();
                if ( stu.size() == 0 || st[0] == null || st[0] == "" )
                    JOptionPane.showMessageDialog(p4, "Customer not found in Restueant");
                else{
                  modelBilling.setRowCount(0);
                  Billing br = new Billing();
                  info_order io = new info_order();
                  String[] s = new String[4];
                  Object[] n;
                  ArrayList<String> list = br.ListTable();
                  n = list.toArray();
                  for (int i = 0; i < list.size(); i += 4) {
                      s[2] = n[i+2].toString();
                      if (s[2].equals(str)) {
                          s[0] = n[i].toString();
                          s[1] = n[i + 1].toString();
                          s[2] = n[i + 2].toString();
                          s[3] = n[i + 3].toString();
                          modelBilling.addRow(s);
                      }
                  }
                  if ( tableBilling.getRowCount() == 0 )
                      JOptionPane.showMessageDialog(p4, "Customer hasn't own billing");
                }
            }
            else{
                t[16].setText("");
                JOptionPane.showMessageDialog(p4, "Phone isn't Correct");
            }
        }
        if ( e.getSource() == b[24] ){
            String str = (String) modelBillingInfo.getValueAt(0,0);
            new Billing().Delete(str);
            modelBillingInfo.setRowCount(0);
            modelBilling.removeRow(tableBilling.getSelectedRow());
            JOptionPane.showMessageDialog(p4,"Order and Billing removed successfully");
        }
    }
    
   }
    
    
    
    
    
    
    
    
    private class actionCustomer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           CustomerInfo ci = new CustomerInfo();
           if ( e.getSource() == b[28]){
                 modelCustomer.setRowCount(0);
                  String[] s = new String[4];
                  Object[] n;
                  ArrayList<String> list = ci.ListTable();
                  n = list.toArray();
                  for (int i = 0; i < list.size(); i += 7) {

                     s[0] = n[i+1].toString();
                     s[1] = n[i].toString();
                     s[2] = n[i + 2].toString();
                     s[3] = n[i + 3].toString() + " " + n[i + 4].toString() + "-" + n[i + 5].toString() + "-" + n[i + 6].toString();
                     modelCustomer.addRow(s);
                 }
           }
           if ( e.getSource() == b[29] ){
               int r = tableCustomer.getSelectedRow();
               modelCustomerBillings.setColumnCount(0);
               modelCustomerBillings.setRowCount(0);
               t[18].setText((String) tableCustomer.getValueAt(r,0));
               t[19].setText((String) tableCustomer.getValueAt(r,1));
               t[20].setText((String) tableCustomer.getValueAt(r,2));
               t[21].setText((String) tableCustomer.getValueAt(r,3));
               modelCustomerBillings.addColumn("ID order");modelCustomerBillings.addColumn("Name");modelCustomerBillings.addColumn("Phone");
               modelCustomerBillings.addColumn("Total");
               String str =  t[19].getText();
               Billing br = new Billing();
               String[] s = new String[4];
               Object[] n;
               ArrayList<String> list = br.ListTable();
               n = list.toArray();
               for (int i = 0; i < list.size(); i += 4){
                   s[0] = n[i+2].toString();
                    if (s[0].equals(str)) {
                        s[0] = n[i].toString();
                        s[1] = n[i + 1].toString();
                        s[2] = n[i + 2].toString();
                        s[3] = n[i + 3].toString();
                        modelCustomerBillings.addRow(s);
                    }
               }
           }
           if ( e.getSource() == b[27]){
               CustomerInfo Ci =  new CustomerInfo();
               if ( Validation.checkPhone(t[22].getText())){
                   ArrayList<String> su = Ci.Search(t[22].getText());
                   Object []s = su.toArray();
                   if ( su.size() == 0 || ((String)s[0] == null) || "".equals((String)s[0]))
                       JOptionPane.showMessageDialog(p5, "Customer isn't found in Resturant");
                   else{
                       modelCustomerBillings.setRowCount(0);modelCustomerBillings.setColumnCount(0);
                       t[18].setText((String)s[1]);
                       t[19].setText((String)s[0]);
                       t[20].setText((String)s[2]);
                       t[21].setText((String)s[3] + " " + s[4] + "-" + s[5] + "-" + s[6]);
                       modelCustomerBillings.addColumn("ID order");modelCustomerBillings.addColumn("Name");modelCustomerBillings.addColumn("Phone");
                       modelCustomerBillings.addColumn("Total");
                       String str = t[19].getText();
                       Billing br = new Billing();
                       String[] sr = new String[4];
                       Object[] n;
                       ArrayList<String> list = br.ListTable();
                       n = list.toArray();
                       for (int i = 0; i < list.size(); i += 4) {
                           sr[0] = n[i + 2].toString();
                           if (sr[0].equals(str)) {
                               sr[0] = n[i].toString();
                               sr[1] = n[i + 1].toString();
                               sr[2] = n[i + 2].toString();
                               sr[3] = n[i + 3].toString();
                               modelCustomerBillings.addRow(sr);
                           }
                       }
                   }
               }
               else{
                   JOptionPane.showMessageDialog(p5, "Phone isn't Correct");
               }
               t[22].setText("");
           }
           if( e.getSource() == b[31] ){
               int k = tableCustomerBillings.getSelectedRow();
               String r = (String) tableCustomerBillings.getValueAt(k, 0);
               modelCustomerBillings.setColumnCount(0);modelCustomerBillings.setRowCount(0);
               modelCustomerBillings.addColumn("Order's id"); modelCustomerBillings.addColumn("Name"); modelCustomerBillings.addColumn("ID");
               modelCustomerBillings.addColumn("Price"); modelCustomerBillings.addColumn("Count");
               info_order io = new info_order();
               String[] s = new String[5];
               Object[] n;
               ArrayList<String> list = io.ListTable();
               n = list.toArray();
               for (int i = 0; i < list.size(); i += 5) {
                   s[0] = n[i].toString();
                   if (s[0].equals(r)) {
                       s[0] = n[i].toString();
                       s[1] = n[i + 1].toString();
                       s[2] = n[i + 2].toString();
                       s[3] = n[i + 3].toString();
                       s[4] = n[i + 4].toString();
                       modelCustomerBillings.addRow(s);
                   }
               }
           }
           if ( e.getSource() == b[32]){
               modelCustomerBillings.setRowCount(0);
               modelCustomerBillings.setColumnCount(0);
               modelCustomerBillings.addColumn("ID order");
               modelCustomerBillings.addColumn("Name");
               modelCustomerBillings.addColumn("Phone");
               modelCustomerBillings.addColumn("Total");
               String str = t[19].getText();
               Billing br = new Billing();
               String[] sr = new String[4];
               Object[] n;
               ArrayList<String> list = br.ListTable();
               n = list.toArray();
               for (int i = 0; i < list.size(); i += 4) {
                   sr[0] = n[i + 2].toString();
                   if (sr[0].equals(str)) {
                       sr[0] = n[i].toString();
                       sr[1] = n[i + 1].toString();
                       sr[2] = n[i + 2].toString();
                       sr[3] = n[i + 3].toString();
                       modelCustomerBillings.addRow(sr);
                   }
               }
           }
           if ( e.getSource() == b[30] ){
               CustomerInfo Ci = new CustomerInfo();
               if ( t[19].getText() == "" || t[19].getText() == null){
                   int k = tableCustomer.getSelectedRow();
                   String str = (String) tableCustomer.getValueAt(k, 1);
                   Ci.Delete(str);
                   modelCustomer.removeRow(k);
               }
               else{
                    int k = tableCustomer.getSelectedRow();
                   String Str = t[19].getText();
                   Ci.Delete(Str);
                   t[18].setText("");t[19].setText("");t[20].setText("");t[21].setText("");
                   modelCustomer.removeRow(k);
               }
           }
           
        }
        
    }

    
    
    
    
    
    
    
    
    
    
    
    private class AddMeal implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int i;String str; double m;
            if(e.getSource() == BMeals[1]){ 
                String name = BMeals[1].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ 
                String [] a = new String[4];
                a[0] = (String)s[1]; a[1] = (String)s[0];a[2] = (String)s[2]; 
                a[3] = "1"; model.addRow(a);}
                t[10].setText((String)s[2]);  
                str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String)s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String)s[2]);
                    t[4].setText( Double.toString(m));
                }
            }
            if(e.getSource() == BMeals[2]){
                String name = BMeals[2].getText();
                ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){
                String [] a = new String[4]; 
                a[0] = (String)s[1]; a[1] = (String)s[0];a[2] = (String)s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String)s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String)s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String)s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[3]){ 
                String name = BMeals[3].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){
                String [] a = new String[4];
                a[0] = (String)s[1]; a[1] = (String)s[0];a[2] = (String)s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String)s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String)s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String)s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[4]){ 
                String name = BMeals[4].getText();
                ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object [] s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){
                String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[5]){ 
                String name = BMeals[5].getText();
                ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ 
                String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);
                }
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[6]){ String name = BMeals[6].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[7]){ String name = BMeals[7].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[8]){ String name = BMeals[8].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[9]){ String name = BMeals[9].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[10]){ String name = BMeals[10].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[11]){ String name = BMeals[11].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[12]){ String name = BMeals[12].getText();
             ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[13]){ String name = BMeals[13].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[14]){ String name = BMeals[14].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[15]){ String name = BMeals[15].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[16]){ String name = BMeals[16].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[17]){ String name = BMeals[17].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[18]){ String name = BMeals[18].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            if(e.getSource() == BMeals[19]){ String name = BMeals[19].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[20]){ String name = BMeals[20].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[21]){ String name = BMeals[21].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[22]){ String name = BMeals[22].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[23]){ String name = BMeals[23].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            if(e.getSource() == BMeals[24]){ String name = BMeals[24].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[25]){ String name = BMeals[25].getText(); ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[26]){ String name = BMeals[26].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[27]){ String name = BMeals[27].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]);str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }   
            }
            if(e.getSource() == BMeals[28]){ String name = BMeals[28].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            if(e.getSource() == BMeals[30]){ String name = BMeals[30].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             if(e.getSource() == BMeals[31]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
              if(e.getSource() == BMeals[32]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            
             if(e.getSource() == BMeals[33]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }  
           
             if(e.getSource() == BMeals[34]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             
             if(e.getSource() == BMeals[35]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            } 
            
             if(e.getSource() == BMeals[36]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            
             
             if(e.getSource() == BMeals[37]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             
             if(e.getSource() == BMeals[38]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             
             if(e.getSource() == BMeals[39]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             
             if(e.getSource() == BMeals[40]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
            
             if(e.getSource() == BMeals[41]){ String name = BMeals[29].getText();  ArrayList<String> su = new Eyad.Meal1().Search2(name);
                Object []s = su.toArray();
                for (  i = 0 ; i < table.getRowCount() ; i++ ){
                    if ( name.equals(table.getValueAt(i,0))){
                        String c = (String) table.getValueAt(i,3);
                        int n = Integer.parseInt(c);
                        c = Integer.toString(++n);
                        table.setValueAt(c, i, 3);
                        break;
                        
                    }
                }
                if ( i == table.getRowCount()){ String [] a = new String[4];
                a[0] = (String) s[1]; a[1] = (String) s[0];a[2] = (String) s[2]; a[3] = "1"; model.addRow(a);}
                t[10].setText((String) s[2]); str = t[4].getText();
                if ( str == null || str.equals("")){
                    t[4].setText((String) s[2]);
                }
                else{
                    m = Double.parseDouble(str);
                    m += Double.parseDouble((String) s[2]);
                    t[4].setText( Double.toString(m));
                }  
            }
             
        }
        
    }
   
}


    
    
    
    
    
    
    
    
    
    
    

