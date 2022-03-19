package resturant;
import Employee.Billing;
import Employee.CustomerInfo;
import Employee.info_order;
import Employee.*;
import Eyad.*;
import Resturant.Validation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Eyad.Employee1;
//import com.sun.org.apache.bcel.internal.generic.AALOAD;
public class Manager extends JFrame {
    int k;
    JPanel Meal = new JPanel();
    Validation v = new Validation(); 
    JButton [] b = new JButton[100];
    JPanel hire = new JPanel();
    JPanel Employee = new JPanel();
    JLabel [] L = new JLabel[100];
    JTextField co,co2;
    JTextField [] t = new JTextField[100];
    JPanel p5 = new JPanel();
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);  
    DefaultTableModel modelMeal = new DefaultTableModel();
    JTable MealTable = new JTable(modelMeal);
    JPanel sp = new JPanel();
    JPanel sp2 = new JPanel();
    JTextArea tr = new JTextArea("Report Employee");
    JScrollPane pr = new JScrollPane(sp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JScrollPane pr2 = new JScrollPane(sp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JScrollPane scroll,pr3,pr7,pr8;
    DefaultTableModel modelCustomer = new DefaultTableModel();
    JTable tableCustomer = new JTable(modelCustomer);
     DefaultTableModel modelCustomerBillings = new DefaultTableModel();   
    JTable tableCustomerBillings = new JTable(modelCustomerBillings);
    JTextArea air = new JTextArea();
    public Manager(){
        
        
       this.setTitle("Resturant");
       this.setSize(1980,1080);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       this.setLayout(null);
        model.addColumn("Name");model.addColumn("ID");model.addColumn("Phone");model.addColumn("Brach name");model.addColumn("salary");
        modelMeal.addColumn("Name");modelMeal.addColumn("ID");modelMeal.addColumn("Price");
        b[0] = new JButton("Hire");
        b[1] = new JButton("Employees");
        b[3] = new JButton ("Meals");
        b[4] = new JButton("LogOut");
        b[0].setBounds(30,15,150,100); b[1].setBounds(30,130,150,100); b[3].setBounds(30,245,150,100);b[4].setBounds(30,800, 150, 100);
        b[0].setBackground(Color.BLACK);b[0].setForeground(Color.YELLOW); b[1].setBackground(Color.BLACK);b[1].setForeground(Color.YELLOW);
        b[4].setBackground(Color.BLACK);b[4].setForeground(Color.YELLOW);b[3].setBackground(Color.BLACK);b[3].setForeground(Color.YELLOW);
        b[5] = new JButton("Customers");
        b[5].setBackground(Color.BLACK);b[5].setForeground(Color.YELLOW);b[5].setBounds(30,360,150,100);
        b[0].setFont( new Font("",NORMAL,20) {
        });
        b[1].setFont( new Font("",NORMAL,20));
        b[3].setFont( new Font("",NORMAL,20));
        b[4].setFont( new Font("",NORMAL,20));
        b[5].setFont( new Font("",NORMAL,20));
       
        
        
        // hire declaration
        
       L[7] = new JLabel("Employee Id");L[9] = new JLabel("Name");L[10] = new JLabel("Phone"); L[11] = new JLabel("Email");L[13] = new JLabel ("Age"); L[14] = new JLabel("Adress");
       L[15] = new JLabel("Number of Home");L[16] = new JLabel("Street");L[17] = new JLabel("city");L[18] = new JLabel("country");L[19] = new JLabel("Gender");
       L[20] = new JLabel("Branch Name");L[21] = new JLabel("Branch Id");L[22] = new JLabel("Salary");
       t[5] = new JTextField();t[7] = new JTextField();t[8] = new JTextField(); t[9] = new JTextField(); t[10] = new JTextField();
       t[11] = new JTextField(); t[12] = new JTextField();  t[13] = new JTextField();  t[14] = new JTextField();   t[15] = new JTextField();
       t[16] = new JTextField(); t[17] = new JTextField();
       co = new JTextField();
       actionHire ar = new actionHire();
       b[12] = new JButton("Hire");b[13] = new JButton("Reset");
       b[12].addActionListener(ar);b[13].addActionListener(ar); 
       
       
       
       //employee declaration
       table = new JTable(model);
       scroll= new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
       co2 = new JTextField();
       L[26] = new JLabel("Employee Id");L[27] = new JLabel("Name"); L[28] = new JLabel("Phone");  L[29] = new JLabel("Email");  L[24] = new JLabel ("Age"); L[30] = new JLabel("Adress");
       L[32] = new JLabel("Number of Home"); L[33] = new JLabel("Street");  L[34] = new JLabel("city");  L[35] = new JLabel("country"); L[36] = new JLabel("Gender");
       L[37] = new JLabel("Branch Name"); L[38] = new JLabel("Branch Id"); L[39] = new JLabel("Salary");
       t[21] = new JTextField(); t[22] = new JTextField(); t[23] = new JTextField();t[24] = new JTextField(); t[25] = new JTextField();
       t[26] = new JTextField(); t[27] = new JTextField();t[28] = new JTextField(); t[29] = new JTextField();
       t[30] = new JTextField();t[31] = new JTextField();t[32] = new JTextField();
       t[38] = new JTextField();
       b[14] = new JButton("Update Data"); b[15] = new JButton("Fire Employee");  b[16] = new JButton("Search");
       b[17] = new JButton("All Employee");b[18] = new JButton("Save Report");b[36] = new JButton("Update Report");b[37] = new JButton("Show Report");
       actionEmployee a = new actionEmployee();
       b[14].addActionListener(a);b[16].addActionListener(a);b[17].addActionListener(a); b[15].addActionListener(a);b[18].addActionListener(a);b[37].addActionListener(a);
       b[36].addActionListener(a);
       
       
       
       //Meals 
       pr3= new JScrollPane(MealTable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       L[40] = new JLabel("Name");L[41] = new JLabel("ID");L[42] = new JLabel("Price");L[50] = new JLabel("Promo Code");L[51] = new JLabel("offer Value");
       t[35] = new JTextField();t[36] = new JTextField(); t[37] = new JTextField();t[38] = new JTextField();
       b[20] = new JButton("Update Data");
       b[21] = new JButton("Fire Meal");
       b[22] = new JButton("Add Meal");
       b[23] = new JButton("Search");
       b[24] = new JButton("All Meal");
       b[41] = new JButton("add offer");b[42] = new JButton("Delete promo");
       MealTable.addMouseListener(new java.awt.event.MouseAdapter() {
                     @Override
                     public void mouseClicked ( java.awt.event.MouseEvent evt){
                        k = MealTable.getSelectedRow();   
                    }
                    });
          actionMeal m = new actionMeal();
          b[22].addActionListener(m);b[20].addActionListener(m);b[23].addActionListener(m);b[24].addActionListener(m);b[21].addActionListener(m);b[41].addActionListener(m);
          b[42].addActionListener(m);
       
          
          // customer declaration
           // customer Declaration
        L[45] = new JLabel("Name");L[46] = new JLabel("Phone");L[47] = new JLabel("Email");L[48] = new JLabel("Adress");t[40] = new JTextField();
        t[41] = new JTextField();t[42] = new JTextField();t[43] = new JTextField();t[44] = new JTextField();b[27] = new JButton("Search");
        t[46] = new JTextField();t[47] = new JTextField();
        b[28] = new JButton("All Cutomer");b[29] = new JButton("Cutomes's details");b[30] = new JButton("Remove Customer");b[40] = new JButton("Show Report");
        b[31] = new JButton("Billing Details"); b[32] = new JButton("Customer's Billings");b[33] = new JButton("Save Report");b[34] = new JButton("Updaten Report");
        pr7 = new JScrollPane(tableCustomerBillings, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pr8 = new JScrollPane(tableCustomer, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        actionCustomer c = new actionCustomer();
        b[28].addActionListener(c); b[29].addActionListener(c);b[27].addActionListener(c);b[31].addActionListener(c);b[32].addActionListener(c);b[30].addActionListener(c);
        b[33].addActionListener(c);b[34].addActionListener(c);b[40].addActionListener(c);
       
        
        
        
        hire.setVisible(false);
        add(b[0]);add(b[1]);add(b[3]);add(b[4]);this.add(b[5]);
        employee();
        Action A = new Action();
        b[0].addActionListener(A);b[1].addActionListener(A);b[4].addActionListener(A);b[3].addActionListener(A);b[5].addActionListener(A);
        Meal.setVisible(false);
        modelCustomer.addColumn("Name");modelCustomer.addColumn("Phone");modelCustomer.addColumn("Email");modelCustomer.addColumn("Address");
    }
    
    
    public void hire(){
        hire.setBounds(200,0, 1980, 1000);
       this.add(hire);
       hire.setBackground(Color.yellow);
       hire.setLayout(null);
       JLabel img = new JLabel(new ImageIcon("C:\\Users\\eslam\\Desktop\\h.png"));
       img.setBounds(1000, 200, 500, 600);
       hire .add(img);
      
       L[7].setBounds(620, 170, 150, 50);hire.add(L[7]);L[7].setFont( new Font("",NORMAL,20));
       //L[6] = new JLabel("Email");L[11].setBounds(200, 240, 150, 50);hire.add(L[11]);L[11].setFont( new Font("",NORMAL,20));
       L[9].setBounds(200, 100, 150, 50);hire.add(L[9]);L[9].setFont( new Font("",NORMAL,20));
       L[10].setBounds(200, 170, 150, 50);hire.add(L[10]);L[10].setFont( new Font("",NORMAL,20));
       L[11].setBounds(200, 240, 150, 50);hire.add(L[11]);L[11].setFont( new Font("",NORMAL,20));
       L[13].setBounds(200, 310, 150, 50);hire.add(L[13]);L[13].setFont( new Font("",NORMAL,20));
       L[14].setBounds(200, 380, 150, 50);hire.add(L[14]);L[14].setFont( new Font("",NORMAL,20));
       L[15].setBounds(200, 450, 150, 50);hire.add(L[15]);L[15].setFont( new Font("",NORMAL,20));
       L[16].setBounds(460, 450, 150, 50);hire.add(L[16]);L[16].setFont( new Font("",NORMAL,20));
       L[17].setBounds(200, 530 , 150, 50);hire.add(L[17]);L[17].setFont( new Font("",NORMAL,20));
       L[18].setBounds(520, 530 , 150, 50);hire.add(L[18]);L[18].setFont( new Font("",NORMAL,20));
       L[19].setBounds(200, 600 , 150, 50);hire.add(L[19]);L[19].setFont( new Font("",NORMAL,20));
       L[20].setBounds(200, 670 , 150, 50);hire.add(L[20]);L[20].setFont( new Font("",NORMAL,20));
       L[21].setBounds(200, 740 , 150, 50);hire.add(L[21]);L[21].setFont( new Font("",NORMAL,20));
       L[22].setBounds(200, 810 , 150, 50);hire.add(L[22]);L[22].setFont( new Font("",NORMAL,20));
       
      
       t[5].setBounds(780, 170, 250, 40);hire.add(t[5]);t[5].setBackground(Color.green);t[5].setFont( new Font("",NORMAL,20));
       t[7].setBounds(350, 100, 250, 40);hire.add(t[7]);t[7].setBackground(Color.green);t[7].setFont( new Font("",NORMAL,20));
       t[8].setBounds(350, 170, 250, 40);hire.add(t[8]);t[8].setBackground(Color.green);t[8].setFont( new Font("",NORMAL,20));
       t[9].setBounds(350, 240, 350, 40);hire.add(t[9]);t[9].setBackground(Color.green);t[9].setFont( new Font("",NORMAL,20));
       t[10].setBounds(350, 310, 100, 40);hire.add(t[10]);t[10].setBackground(Color.green);t[10].setFont( new Font("",NORMAL,20));
       t[11].setBounds(360, 450, 80, 40);hire.add(t[11]);t[11].setBackground(Color.green);t[11].setFont( new Font("",NORMAL,20));
       t[12].setBounds(540, 450, 250, 40);hire.add(t[12]);t[12].setBackground(Color.green);t[12].setFont( new Font("",NORMAL,20));
       t[13].setBounds(300, 530, 200, 40);hire.add(t[13]);t[13].setBackground(Color.green);t[13].setFont( new Font("",NORMAL,20));
       t[14].setBounds(600, 530, 200, 40);hire.add(t[14]);t[14].setBackground(Color.green);t[14].setFont( new Font("",NORMAL,20));
       t[15].setBounds(350, 670, 250, 40);hire.add(t[15]);t[15].setBackground(Color.green);t[15].setFont( new Font("",NORMAL,20));
       t[16].setBounds(350,740, 250, 40);hire.add(t[16]);t[16].setBackground(Color.green);t[16].setFont( new Font("",NORMAL,20));
       t[17].setBounds(350,810, 250, 40);hire.add(t[17]);t[17].setBackground(Color.green);t[17].setFont( new Font("",NORMAL,20));
        
       
       
       
       co.setBounds(350,600, 150, 40);hire.add(co);co.setBackground(Color.GREEN);
       
        b[12].setBounds(1000,850, 200, 50);hire.add(b[12]);b[12].setBackground(Color.PINK);b[12].setFont( new Font("",NORMAL,20));
        b[13].setBounds(1220,850, 200, 50);hire.add(b[13]);b[13].setBackground(Color.PINK);b[13].setFont( new Font("",NORMAL,20));
        
    }
    
    
    public void employee(){
       Employee.setBounds(200,0, 1980, 1000);
       this.add(Employee);
       Employee.setBackground(Color.black);
       Employee.setLayout(null);
       
          
          
         
      table.setRowHeight(30);
      table.setFont( new Font("",NORMAL,15) {
       });  
       scroll.setBounds(890, 20 ,800, 700);Employee.add(scroll);
       
       L[26].setBounds(470, 170, 150, 50);Employee.add(L[26]);L[26].setFont( new Font("",NORMAL,20));L[26].setForeground(Color.YELLOW);
       //L[6] = new JLabel("Email");L[11].setBounds(200, 240, 150, 50);hire.add(L[11]);L[11].setFont( new Font("",NORMAL,20));
       L[27].setBounds(50, 100, 150, 50);Employee.add(L[27]);L[27].setFont( new Font("",NORMAL,20));L[27].setForeground(Color.YELLOW);
       L[28].setBounds(50, 170, 150, 50);Employee.add(L[28]);L[28].setFont( new Font("",NORMAL,20));L[28].setForeground(Color.YELLOW);
       L[29].setBounds(50, 240, 150, 50);Employee.add(L[29]);L[29].setFont( new Font("",NORMAL,20));L[29].setForeground(Color.YELLOW);
       L[24].setBounds(50, 310, 150, 50);Employee.add(L[24]);L[24].setFont( new Font("",NORMAL,20));L[24].setForeground(Color.YELLOW);
       L[30].setBounds(50, 380, 150, 50);Employee.add(L[30]);L[30].setFont( new Font("",NORMAL,20));L[30].setForeground(Color.YELLOW);
       L[32].setBounds(50, 450, 150, 50);Employee.add(L[32]);L[32].setFont( new Font("",NORMAL,20));L[32].setForeground(Color.YELLOW);
       L[33].setBounds(300, 450, 150, 50);Employee.add(L[33]);L[33].setFont( new Font("",NORMAL,20));L[33].setForeground(Color.YELLOW);
       L[34].setBounds(50, 530 , 150, 50);Employee.add(L[34]);L[34].setFont( new Font("",NORMAL,20));L[34].setForeground(Color.YELLOW);
       L[35].setBounds(370, 530 , 150, 50);Employee.add(L[35]);L[35].setFont( new Font("",NORMAL,20));L[35].setForeground(Color.YELLOW);
       L[36].setBounds(50, 600 , 150, 50);Employee.add(L[36]);L[36].setFont( new Font("",NORMAL,20));L[36].setForeground(Color.YELLOW);
       L[37].setBounds(50, 670 , 150, 50);Employee.add(L[37]);L[37].setFont( new Font("",NORMAL,20));L[37].setForeground(Color.YELLOW);
       L[38].setBounds(50, 740 , 150, 50);Employee.add(L[38]);L[38].setFont( new Font("",NORMAL,20));L[38].setForeground(Color.YELLOW);
       L[39].setBounds(50, 810, 150, 50);Employee.add(L[39]);L[39].setFont( new Font("",NORMAL,20));L[39].setForeground(Color.yellow);
      
       
      
       t[21].setBounds(620, 170, 250, 40);Employee.add(t[21]);t[21].setBackground(Color.green);t[21].setFont( new Font("",NORMAL,20));
       t[22].setBounds(200, 100, 250, 40);Employee.add(t[22]);t[22].setBackground(Color.green);t[22].setFont( new Font("",NORMAL,20));
       t[23].setBounds(200, 170, 250, 40);Employee.add(t[23]);t[23].setBackground(Color.green);t[23].setFont( new Font("",NORMAL,20));
       t[24].setBounds(200, 240, 350, 40);Employee.add(t[24]);t[24].setBackground(Color.green);t[24].setFont( new Font("",NORMAL,20));
       t[25].setBounds(200, 310, 100, 40);Employee.add(t[25]);t[25].setBackground(Color.green);t[25].setFont( new Font("",NORMAL,20));
       t[26].setBounds(210, 450, 80, 40);Employee.add(t[26]);t[26].setBackground(Color.green);t[26].setFont( new Font("",NORMAL,20));
       t[27].setBounds(390, 450, 250, 40);Employee.add(t[27]);t[27].setBackground(Color.green);t[27].setFont( new Font("",NORMAL,20));
       t[28].setBounds(150, 530, 200, 40);Employee.add(t[28]);t[28].setBackground(Color.green);t[28].setFont( new Font("",NORMAL,20));
       t[29].setBounds(450, 530, 200, 40);Employee.add(t[29]);t[29].setBackground(Color.green);t[29].setFont( new Font("",NORMAL,20));
       t[30].setBounds(200, 670, 250, 40);Employee.add(t[30]);t[30].setBackground(Color.green);t[30].setFont( new Font("",NORMAL,20));
       t[31].setBounds(200,740, 250, 40);Employee.add(t[31]);t[31].setBackground(Color.green);t[31].setFont( new Font("",NORMAL,20));
       t[32].setBounds(200,810, 250, 40);Employee.add(t[32]);t[32].setBackground(Color.green);t[32].setFont( new Font("",NORMAL,20));
       tr.setBounds(600, 750, 800, 200);Employee.add(tr);tr.setFont( new Font("",NORMAL,20)); 
       co2.setBounds(200,600, 150, 40);Employee.add(co2);co2.setBackground(Color.GREEN);
         table.addMouseListener(new java.awt.event.MouseAdapter() {
                     @Override
                     public void mouseClicked ( java.awt.event.MouseEvent evt){
                        k = table.getSelectedRow();   
                    }
         });
       t[38].setBounds(250, 20, 300, 40);Employee.add(t[38]);t[38].setBackground(Color.CYAN);t[38].setFont( new Font("",NORMAL,20));
       b[14].setBounds(100, 900, 200, 50);Employee.add(b[14]);b[14].setBackground(Color.PINK);b[14].setFont( new Font("",NORMAL,20));
       b[15].setBounds(320, 900, 200, 50);Employee.add(b[15]);b[15].setBackground(Color.PINK);b[15].setFont( new Font("",NORMAL,20));
       b[16].setBounds(100,20, 150, 40);Employee.add(b[16]);b[16].setBackground(Color.PINK);b[16].setFont( new Font("",NORMAL,20));
       b[17].setBounds(680,20,200,50);Employee.add(b[17]);b[17].setBackground(Color.YELLOW);b[17].setFont( new Font("",NORMAL,20));
       b[18].setBounds(1480, 900, 200, 50);Employee.add(b[18]);b[18].setBackground(Color.YELLOW);b[18].setFont( new Font("",NORMAL,20));
       b[36].setBounds(1480, 820, 200, 50);Employee.add(b[36]);b[36].setBackground(Color.YELLOW);b[36].setFont( new Font("",NORMAL,20));
       b[37].setBounds(1480, 730, 200, 50);Employee.add(b[37]);b[37].setBackground(Color.YELLOW);b[37].setFont( new Font("",NORMAL,20));
     
    }
    
    public void Meals(){
        
         Meal.setBounds(200,0, 1980, 1000);
         this.add( Meal);
         Meal.setBackground(Color.black);
         Meal.setLayout(null);
          /*modelMeal.addColumn("Id");
          modelMeal.addColumn("name");
         modelMeal.addColumn("Price");
          modelMeal.addRow( colums);
          modelMeal.addRow(Row);*/
          MealTable.setRowHeight(30);
          MealTable.setFont( new Font("",NORMAL,15) {
          });
             
          pr3.setBounds(890, 20 ,800, 700);Meal.add(pr3);
          L[40].setBounds(50, 250, 150, 50);Meal.add(L[40]);L[40].setFont( new Font("",NORMAL,20));L[40].setForeground(Color.YELLOW);
          L[41].setBounds(50, 320, 150, 50);Meal.add(L[41]);L[41].setFont( new Font("",NORMAL,20));L[41].setForeground(Color.YELLOW);
          L[42].setBounds(50, 390, 150, 50);Meal.add(L[42]);L[42].setFont( new Font("",NORMAL,20));L[42].setForeground(Color.YELLOW);
          L[50].setBounds(50,700,150,50);Meal.add(L[50]);L[50].setFont( new Font("",NORMAL,20));L[50].setForeground(Color.YELLOW);
          L[51].setBounds(50,760,150,50);Meal.add(L[51]);L[51].setFont( new Font("",NORMAL,20));L[51].setForeground(Color.YELLOW);
          
          t[35].setBounds(200, 250, 250, 40);Meal.add(t[35]);t[35].setBackground(Color.green);t[35].setFont( new Font("",NORMAL,20));
          t[36].setBounds(200, 320, 250, 40);Meal.add(t[36]);t[36].setBackground(Color.green);t[36].setFont( new Font("",NORMAL,20));
          t[37].setBounds(200, 390, 250, 40);Meal.add(t[37]);t[37].setBackground(Color.green);t[37].setFont( new Font("",NORMAL,20));
          t[38].setBounds(250, 20, 300, 40);Meal.add(t[38]);t[38].setBackground(Color.CYAN);t[38].setFont( new Font("",NORMAL,20));
          t[46].setBounds(200, 700, 150, 50);Meal.add(t[46]);t[46].setBackground(Color.CYAN);t[46].setFont( new Font("",NORMAL,20));
          t[47].setBounds(200, 760, 150, 50);Meal.add(t[47]);t[47].setBackground(Color.CYAN);t[47].setFont( new Font("",NORMAL,20));
          
          
          b[20].setBounds(100, 500, 200, 50);Meal.add(b[20]);b[20].setBackground(Color.PINK);b[20].setFont( new Font("",NORMAL,20));
          b[21].setBounds(320, 500, 200, 50);Meal.add(b[21]);b[21].setBackground(Color.PINK);b[21].setFont( new Font("",NORMAL,20));
          b[22].setBounds(540, 500, 200, 50);Meal.add(b[22]);b[22].setBackground(Color.PINK);b[22].setFont( new Font("",NORMAL,20));
          b[23].setBounds(100,20, 150, 40);Meal.add(b[23]);b[23].setBackground(Color.PINK);b[23].setFont( new Font("",NORMAL,20));
          b[24].setBounds(680,20,200,50);Meal.add(b[24]);b[24].setBackground(Color.YELLOW);b[24].setFont( new Font("",NORMAL,20));
          b[41].setBounds(50,820,200,50);Meal.add(b[41]);b[41].setBackground(Color.YELLOW);b[41].setFont( new Font("",NORMAL,20));
          b[42].setBounds(300,820,200,50);Meal.add(b[42]);b[42].setBackground(Color.YELLOW);b[42].setFont( new Font("",NORMAL,20));
         
    }
    
    
    public void Customer(){
        p5.setBounds(200,0, 1980, 1000);
        p5.setBackground(Color.PINK);
        this.add(p5);
        p5.setLayout(null);
        L[45].setBounds(50, 100, 150, 50);p5.add(L[45]);L[45].setFont( new Font("",NORMAL,20));
        L[46].setBounds(50, 170, 150, 50);p5.add(L[46]);L[46].setFont( new Font("",NORMAL,20));
        L[47].setBounds(50, 240, 150, 50);p5.add(L[47]);L[47].setFont( new Font("",NORMAL,20));
        L[48].setBounds(50, 310, 150, 50);p5.add(L[48]);L[48].setFont( new Font("",NORMAL,20));
        t[40].setBounds(220, 100, 250, 40);p5.add(t[40]);t[40].setBackground(Color.green);t[40].setFont( new Font("",NORMAL,20));
        t[41].setBounds(220, 170, 250, 40);p5.add(t[41]);t[41].setBackground(Color.green);t[41].setFont( new Font("",NORMAL,20));
        t[42].setBounds(220, 240, 350, 40);p5.add(t[42]);t[42].setBackground(Color.green);t[42].setFont( new Font("",NORMAL,20));
        t[43].setBounds(220, 310, 350, 40);p5.add(t[43]);t[43].setBackground(Color.green);t[43].setFont( new Font("",NORMAL,20));
        t[44].setBounds(80, 30 , 300 , 40);;p5.add(t[44]);t[44].setBackground(Color.WHITE);t[44].setFont( new Font("",NORMAL,20));
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
        air.setBounds(800,650,650,300);p5.add(air);air.setFont(new Font("",NORMAL,20) {
        });
        b[33].setBounds(1480, 900, 200, 50);p5.add(b[33]);b[33].setBackground(Color.YELLOW);b[33].setFont( new Font("",NORMAL,20));
        b[34].setBounds(1480, 820, 200, 50);p5.add(b[34]);b[34].setBackground(Color.YELLOW);b[34].setFont( new Font("",NORMAL,20));
        b[40].setBounds(1480, 740, 200, 50);p5.add(b[40]);b[40].setBackground(Color.YELLOW);b[40].setFont( new Font("",NORMAL,20));
        
       
   }
    
    
   
    
private class Action implements ActionListener{
    Employee1 er = new Employee1();
    @Override
    public void actionPerformed(ActionEvent e) {
    
            if(e.getSource() == b[1]){
                hire.setVisible(false);
                Employee.setVisible(true);
                Meal.setVisible(false);
                p5.setVisible(false);
                employee();
                
            }
            if( e.getSource() == b[0]){
                hire.setVisible(true);
                Employee.setVisible(false);
                p5.setVisible(false);
                Meal.setVisible(false); 
                hire();
            }
            if( e.getSource() == b[4] ){
                dispose();
                new login();
            }
            if(e.getSource() == b[3]){
               hire.setVisible(false);
               Employee.setVisible(false);
               p5.setVisible(false);
               Meal.setVisible(true); 
               Meals();
            }
            if ( e.getSource() == b[5]){
               hire.setVisible(false);
               Employee.setVisible(false);
               Meal.setVisible(false);
               p5.setVisible(true);
               Customer();
            }
          
        
    }
    
        }
        
    
    
 private class actionEmployee implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
            Employee1 er = new Employee1();
            if( e.getSource() == b[14]){
                String [] s = new String[13]; 
                if( Validation.checkId(t[21].getText())){
                    s[0] = t[21].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " id isn't correct");
                      t[21].setText("");
                }
                if( Validation.checkName(t[22].getText())){
                    s[1] = t[22].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Name isn't correct");
                      t[22].setText("");
                }
                if( Validation.checkPhone(t[23].getText())){
                    s[2] = t[23].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Phone isn't correct");
                      t[23].setText("");
                }
                if( Validation.checkEmail(t[24].getText())){
                    s[4] = t[24].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Email isn't correct");
                      t[24].setText("");
                }
                if( Validation.checkAge(t[25].getText())){
                    s[5] = t[25].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, "  Age isn't correct");
                      t[25].setText("");
                }
                if( Validation.checkHomeNumber(t[26].getText())){
                    s[6] = t[26].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Home Number isn't correct");
                      t[26].setText("");
                }
                if( Validation.checkCountry(t[29].getText())){
                    s[8] = t[29].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Country isn't correct");
                      t[29].setText("");
                }
                if( Validation.checkCity(t[28].getText())){
                    s[9] = t[28].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " City isn't correct");
                      t[28].setText("");
                }
                if( Validation.checkCountry(t[30].getText())){
                    s[10] = t[30].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Branch Name isn't correct");
                      t[30].setText("");
                }
                if( Validation.checkId(t[31].getText())){
                    s[11] = t[31].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " BranchId isn't correct");
                      t[31].setText("");
                }
                if( Validation.checkSalary(t[32].getText())){
                    s[12] = t[32].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Salary isn't correct");
                      t[32].setText("");
                }
                if( Validation.checkGender(co2.getText())){
                    s[3] = co2.getText();
                }
                else{
                     JOptionPane.showMessageDialog(hire, " Gender isn't correct");
                      co2.setText("");
                }
                s[7] = t[27].getText(); int i;
                for ( i = 0 ; i < 13 ; i++ ){
                    if(s[i] == null || "".equals(s[i]))
                        break;
                    else
                        System.out.println(s[i]);
                }
                if( i == 13){
                    //Employee1 er = new Employee1();
                    if (er.Update(s)){
                         t[21].setText("");t[22].setText("");t[23].setText("");t[24].setText("");t[25].setText("");t[26].setText("");t[27].setText("");t[28].setText("");
                         t[32].setText("");t[31].setText("");t[30].setText("");t[29].setText("");co2.setText("");
                         JOptionPane.showMessageDialog(hire, "Data is updating successfully");
                    }     
                    else
                        JOptionPane.showMessageDialog(hire, "Error in Data base");
                        
                }
                else
                    JOptionPane.showMessageDialog(hire, "Enter Correct data");
                
                
                
            
            }
            if ( e.getSource() == b[36] ){
                Report re = new Report();
                if (Validation.checkId(t[21].getText())){
                    String [] sr = {t[21].getText(),tr.getText()};
                    boolean x = re.Update(sr);
                    if ( x ){
                        JOptionPane.showMessageDialog(Employee, "Report  updated Successfully");
                        tr.setText("");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(Employee, "choose save Report");
                    }
                }
                else
                    JOptionPane.showMessageDialog(Employee, "Id is not correct");
                
            }
            if ( e.getSource() == b[37] ){
                Report re = new Report();
                if (Validation.checkId(t[21].getText())){
                    ArrayList<String> x = new ArrayList<String>();
                    x = re.Search(t[21].getText());
                    if ( x.size() == 0 ){
                        JOptionPane.showMessageDialog(Employee, "Customer haven,t Reprts or id not corrcet");
                    }
                    else
                    {
                      
                      Object [] sr;
                      String str1 = "";
                     sr = x.toArray();
                     for ( int i = 0 ; i < x.size() ; i++ ){
                         String str = sr[i].toString();
                         str1 +=str + "\n";
                     }
                     
                     tr.setText(str1);
                    }
                }
                else
                    JOptionPane.showMessageDialog(Employee, "Id is not correct");
                
            }
            if ( e.getSource() == b[18]){
                if (Validation.checkId(t[21].getText())){
                   //System.out.println(t[21].getText());
                   Report re = new Report();
                   String [] sr = {t[21].getText(),tr.getText()};
                   boolean mn = re.Insert(sr);
                   if ( mn ){
                       t[21].setText("");
                       JOptionPane.showMessageDialog(Employee, "Report added");
                   }
                   else
                       JOptionPane.showMessageDialog(Employee, "Error in data base");
                       
                   
                }
                else
                    JOptionPane.showMessageDialog(Employee, "Please choose Employee");
            }
            if(e.getSource() == b[15] ){
                
                if(Validation.checkId(t[21].getText())){
                    String id =  t[21].getText();
                    new Eyad.Employee1().Delete(id);
                    model.removeRow(k);
                    JOptionPane.showMessageDialog(hire, "Employee fire successfully");
                    t[21].setText("");t[22].setText("");t[23].setText("");t[24].setText("");t[25].setText("");t[26].setText("");t[27].setText("");t[28].setText("");
                    t[32].setText("");t[31].setText("");t[30].setText("");t[29].setText("");co2.setText("");
                   
                }
                else
                    JOptionPane.showMessageDialog(hire, "Id is not coorect");
                
            }
            if(e.getSource() == b[16]){
                if(Validation.checkId(t[38].getText())){
                    ArrayList<String> str = er.Search(t[38].getText());
                    Object[]  s = str.toArray();
                    if( s[1] == null)
                        JOptionPane.showMessageDialog(Employee, "NOT Found");
                    else{
                        String [] tab = new String[5];tab[0] = (String)s[1]; tab[1] = (String)s[0]; tab[2] = (String)s[2]; tab[3] = (String)s[10]; tab[4] = (String)s[12]; 
                        t[21].setText((String)s[0]);t[22].setText((String)s[1]);t[23].setText((String)s[2]);t[24].setText((String)s[4]);
                        t[25].setText((String)s[5]);t[26].setText((String)s[6]);t[27].setText((String)s[7]);
                        t[28].setText((String)s[8]);t[29].setText((String)s[9]);t[30].setText((String)s[10]);
                        t[31].setText((String)s[11]);t[32].setText((String)s[12]);t[26].setText((String)s[6]);co2.setText((String)s[3]);
                        model.setRowCount(0);
                        model.addRow(tab);
                        
                    }
                }
                else{
                    JOptionPane.showMessageDialog(Employee, "Id is not Correct");
                    t[38].setText("");
                }    
            }
            if( e.getSource() == b[17] ){
                model.setRowCount(0);
                Object [] s;
                String [] tab = new String[5];
                ArrayList<String> list = er.ListTable();
                
                s = list.toArray();
                for ( int i = 0 ; i < list.size() ; i +=5 ){
                    for(  int j = 0 ; j < 1 ; j++ ){
                        tab[j] = s[i+1].toString();
                        tab[j+1] = s[i].toString();
                        tab[j+2] = s[i+2].toString();
                        tab[j+3] = s[i+3].toString();
                        tab[j+4] = s[i+4].toString();
                        model.addRow(tab);
                    }
                }
                table.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked ( java.awt.event.MouseEvent evt){
                  int k = table.getSelectedRow();
                  String id = table.getValueAt(k,1).toString();
                  ArrayList<String> str = er.Search(id);
                  Object [] s = str.toArray();
                  t[21].setText((String)s[0]);t[22].setText((String)s[1]);t[23].setText((String)s[2]);t[24].setText((String)s[4]);
                  t[25].setText((String)s[5]);t[26].setText((String)s[6]);t[27].setText((String)s[7]);
                  t[28].setText((String)s[8]);t[29].setText((String)s[9]);
                  t[30].setText((String)s[10]);t[31].setText((String)s[11]);t[32].setText((String)s[12]);t[26].setText((String)s[6]);
                  co2.setText((String)s[3]);
                  
                }
                });
           }     
       
    }
 }   
    private class actionHire implements ActionListener{
       Employee1 er = new Employee1();
       @Override
       public void actionPerformed(ActionEvent e) {
           if( e.getSource() == b[12]){
                String [] s = new String[13]; 
                if( Validation.checkId(t[5].getText())){
                    s[0] = t[5].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " id isn't correct");
                      t[5].setText("");
                }
                if( Validation.checkName(t[7].getText())){
                    s[1] = t[7].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Name isn't correct");
                      t[7].setText("");
                }
                if( Validation.checkPhone(t[8].getText())){
                    s[2] = t[8].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Phone isn't correct");
                      t[8].setText("");
                }
                if( Validation.checkEmail(t[9].getText())){
                    s[4] = t[9].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Email isn't correct");
                      t[9].setText("");
                }
                if( Validation.checkAge(t[10].getText())){
                    s[5] = t[10].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, "  Age isn't correct");
                      t[10].setText("");
                }
                if( Validation.checkHomeNumber(t[11].getText())){
                    s[6] = t[11].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Home Number isn't correct");
                      t[11].setText("");
                }
                if( Validation.checkCountry(t[14].getText())){
                    s[8] = t[14].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Country isn't correct");
                      t[14].setText("");
                }
                if( Validation.checkCity(t[13].getText())){
                    s[9] = t[13].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " City isn't correct");
                      t[13].setText("");
                }
                if( Validation.checkCountry(t[15].getText())){
                    s[10] = t[15].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Branch Name isn't correct");
                      t[15].setText("");
                }
                if( Validation.checkId(t[16].getText())){
                    s[11] = t[16].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " BranchId isn't correct");
                      t[11].setText("");
                }
                if( Validation.checkSalary(t[17].getText())){
                    s[12] = t[17].getText();
                }
                else{
                      JOptionPane.showMessageDialog(hire, " Salary isn't correct");
                      t[17].setText("");
                }
                if( Validation.checkGender(co.getText())){
                    s[3] = co.getText();
                }
                else{
                     JOptionPane.showMessageDialog(hire, " Gender isn't correct");
                      co.setText("");
                }
                s[7] = t[12].getText(); int i;
                for ( i = 0 ; i < 13 ; i++ ){
                    if(s[i] == null || "".equals(s[i]))
                        break;
                }
                if( i == 13){
                    Employee1 emp = new Employee1();
                    if (emp.Insert(s)){
                         t[5].setText("");t[7].setText("");t[8].setText("");t[9].setText("");t[10].setText("");t[11].setText("");t[12].setText("");t[13].setText("");
                         t[17].setText("");t[16].setText("");t[15].setText("");t[14].setText("");
                         JOptionPane.showMessageDialog(hire, "Data is adding sussefully");
                    }     
                    else
                        JOptionPane.showMessageDialog(hire, "Error in Data base");
                        
                }
                else
                    JOptionPane.showMessageDialog(hire, "Enter Correct data");
                
                
                
            }
            
            if(e.getSource() == b[13]){
                 t[5].setText("");t[7].setText("");t[8].setText("");t[9].setText("");t[10].setText("");t[11].setText("");t[12].setText("");t[13].setText("");
                 t[17].setText("");t[16].setText("");t[15].setText("");t[14].setText("");
     
            }
            
        
            
       }
       
     
    }
    
    
    
    private class actionMeal implements ActionListener{
        Eyad.Meal1 mr = new Eyad.Meal1();
        @Override
        public void actionPerformed(ActionEvent e) {
            String [] sn = new String[3];
            if( e.getSource() == b[22]){
                int check = 0;
                if ( Validation.checkId(t[36].getText())){
                    sn[0] = t[36].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "Id isn't Correct");
                    t[36].setText("");
                    check++;
                }
                if( Validation.checkName(t[35].getText())){
                    sn[1] = t[35].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "Name is not correct");
                    t[35].setText("");
                    check++;
                }
                if( Validation.checkPrice(t[37].getText())){
                    sn[2] = t[37].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal,"Price isn't correct");
                    t[37].setText("");
                    check++;
                }
                if( check == 0 ){
                    if ( mr.Insert(sn)){
                        JOptionPane.showMessageDialog(Meal, "Meal is adding successfully");
                        t[35].setText("");t[36].setText("");t[37].setText("");
                    }
                    else
                        JOptionPane.showMessageDialog(Meal, "ERRor in database");
                }
                else
                    JOptionPane.showMessageDialog(Meal, "Enter correct data");
                
            }
            if ( e.getSource() == b[41] ){
                String [] s = new String[2];
                s[0] = t[46].getText();
                if ( Validation.checkOffer(t[47].getText())){
                    s[1] = t[47].getText();
                    Offer of = new Offer();
                    boolean b = of.Insert(s);
                    if ( b ){
                        JOptionPane.showMessageDialog(Meal, "the promo code add sucessfully");
                        t[46].setText("");t[47].setText("");
                    }
                    else
                        JOptionPane.showMessageDialog(Meal, "Error in data base");
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "the value  of offer is not valid");
                }
                
            }
            if  ( e.getSource() == b[42] ){
                String s = t[46].getText();
                Offer of = new Offer();
                boolean b = of.Delete(s);
                if ( b ){
                    JOptionPane.showMessageDialog(Meal, "the prommo Delete successfully");
                    t[46].setText("");t[47].setText("");
                }
                else
                    JOptionPane.showMessageDialog(Meal, "the promo is not exsist");
               
            }
            if ( e.getSource() == b[20] ){
                int check = 0;
                if ( Validation.checkId(t[36].getText())){
                    sn[0] = t[36].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "Id isn't Correct");
                    t[36].setText("");
                    check++;
                }
                if( Validation.checkName(t[35].getText())){
                    sn[1] = t[35].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "Name is not correct");
                    t[35].setText("");
                    check++;
                }
                if( Validation.checkPrice(t[37].getText())){
                    sn[2] = t[37].getText();
                }
                else{
                    JOptionPane.showMessageDialog(Meal,"Price isn't correct");
                    t[37].setText("");
                    check++;
                }
                if( check == 0 ){
                    if ( mr.Update(sn)){
                        JOptionPane.showMessageDialog(Meal, "Meal is updating successfully");
                        t[35].setText("");t[36].setText("");t[37].setText("");
                    }
                    else
                        JOptionPane.showMessageDialog(Meal, "ERRor in database");
                }
                else
                    JOptionPane.showMessageDialog(Meal, "Enter correct data");
                 
            }
            if ( e.getSource() == b[23] ){
                 if(Validation.checkId(t[38].getText())){
                    ArrayList<String> str = mr.Search(t[38].getText());
                    Object [] s = str.toArray();
                    if( str.size() == 0)
                        JOptionPane.showMessageDialog(Meal, "NOT Found");
                    else{
                        String [] tab = new String[3];tab[0] = (String)s[1]; tab[1] = (String)s[0]; tab[2] = (String)s[2];  
                        t[35].setText((String)s[1]);t[36].setText((String)s[0]);t[37].setText((String)s[2]);
                        modelMeal.setRowCount(0);
                        modelMeal.addRow(tab);
                        
                    }
                }
                else{
                    JOptionPane.showMessageDialog(Meal, "Id is not Correct");
                    t[38].setText("");
                }    
            }
            if ( e.getSource() == b[24] ){
                modelMeal.setRowCount(0);
                Object [] s;
                String [] tab = new String[3];
                ArrayList<String> list = mr.ListTable();
                
                s = list.toArray();
                for ( int i = 0 ; i < list.size() ; i +=3 ){
                    for(  int j = 0 ; j < 1 ; j++ ){
                        tab[j] = s[i+1].toString();
                        tab[j+1] = s[i].toString();
                        tab[j+2] = s[i+2].toString();
                        modelMeal.addRow(tab);
                    }
                }
                MealTable.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked ( java.awt.event.MouseEvent evt){
                  int k = MealTable.getSelectedRow();
                  String id = MealTable.getValueAt(k,1).toString();
                  ArrayList<String> str = mr.Search(id);
                  Object[] s1 = str.toArray();
                  t[35].setText((String)s1[1]);t[36].setText((String)s1[0]);t[37].setText((String)s1[2]);
                  
                }
                });
            }
            if( e.getSource() == b[21] ){
                if(Validation.checkId(t[36].getText())){
                    String id =  t[36].getText();
                    new Eyad.Meal1().Delete(id);
                    modelMeal.removeRow(k);
                    JOptionPane.showMessageDialog(Meal, "Meal fire successfully");
                    t[35].setText("");t[36].setText("");t[37].setText("");
                   
                }
                else{
                    JOptionPane.showMessageDialog(hire, "Id is not coorect");
                    t[36].setText("");
                }    

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
               air.setText("");
               t[40].setText((String) tableCustomer.getValueAt(r,0));
               t[41].setText((String) tableCustomer.getValueAt(r,1));
               t[42].setText((String) tableCustomer.getValueAt(r,2));
               t[43].setText((String) tableCustomer.getValueAt(r,3));
               modelCustomerBillings.addColumn("ID order");modelCustomerBillings.addColumn("Name");modelCustomerBillings.addColumn("Phone");
               modelCustomerBillings.addColumn("Total");
               String str =  t[41].getText();
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
               if ( Validation.checkPhone(t[44].getText())){
                  ArrayList<String>  sl = Ci.Search(t[44].getText());
                  Object [] s = sl.toArray();
                  if ( sl.size() == 0 || s[0] == "")
                       JOptionPane.showMessageDialog(p5, "Customer isn't found in Resturant");
                   else{
                       modelCustomerBillings.setRowCount(0);modelCustomerBillings.setColumnCount(0);
                       t[40].setText((String)s[1]);
                       t[41].setText((String)s[0]);
                       t[42].setText((String)s[2]);
                       t[43].setText((String)s[3] + " " + s[4] + "-" + s[5] + "-" + s[6]);
                       modelCustomerBillings.addColumn("ID order");modelCustomerBillings.addColumn("Name");modelCustomerBillings.addColumn("Phone");
                       modelCustomerBillings.addColumn("Total");
                       String str = t[41].getText();
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
               String str = t[41].getText();
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
               if ( t[41].getText() == "" || t[41].getText() == null){
                   int k = tableCustomer.getSelectedRow();
                   String str = (String) tableCustomer.getValueAt(k, 1);
                   Ci.Delete(str);
                   modelCustomer.removeRow(k);
               }
               else{
                    int k = tableCustomer.getSelectedRow();
                   String Str = t[41].getText();
                   Ci.Delete(Str);
                   t[40].setText("");t[41].setText("");t[42].setText("");t[43].setText("");
                   modelCustomer.removeRow(k);
               }
           }
           if ( e.getSource() == b[34] ){
                Report_Customer re = new Report_Customer();
                if (Validation.checkId(t[41].getText())){
                    String [] su = {t[41].getText(),tr.getText()};
                    boolean x = re.Update(su);
                    if ( x ){
                        JOptionPane.showMessageDialog(p5, "Report  updated Successfully");
                        air.setText("");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(p5, "choose save Report");
                    }
                }
                else
                    JOptionPane.showMessageDialog(p5, "Id is not correct");
                
            }
            if ( e.getSource() == b[40] ){
                Report_Customer re = new Report_Customer();
                if (Validation.checkId(t[41].getText())){
                    ArrayList<String> x = new ArrayList<String>();
                    x = re.Search(t[41].getText());
                    if ( x.size() == 0 ){
                        JOptionPane.showMessageDialog(p5, "Customer haven,t Reprts or id not corrcet");
                    }
                    else
                    {
                      
                      Object [] sr;
                      String str1 = "";
                     sr = x.toArray();
                     for ( int i = 0 ; i < x.size() ; i++ ){
                         String str = sr[i].toString();
                         str1 += str + "\n";
                     }
                     
                     air.setText(str1);
                    }
                }
                else
                    JOptionPane.showMessageDialog(Employee, "Id is not correct");
                
            }
            if ( e.getSource() == b[33]){
                if (Validation.checkId(t[41].getText())){
                   //System.out.println(t[21].getText());
                   Report_Customer re = new Report_Customer();
                   String [] su = {t[41].getText(),air.getText()};
                   boolean mn = re.Insert(su);
                   if ( mn ){
                       air.setText("");
                       JOptionPane.showMessageDialog(p5, "Report added");
                   }
                   else
                       JOptionPane.showMessageDialog(p5, "Error in data base");
                       
                   
                }
                else
                    JOptionPane.showMessageDialog(p5, "Please choose Employee");
            }

           
        }
        
    }  
   
        
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    







