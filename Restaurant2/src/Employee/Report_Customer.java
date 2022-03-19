/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import Eyad.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Report_Customer extends Eyad.Connection implements Database {

    public Report_Customer () {
         super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");
    }
    @Override
    public ArrayList<String> Search(String search)
    {
        ArrayList<String> x=new ArrayList<String>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql="select *from Customer_reoprt where Phone="+search;
            Statement statement=c.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next())
            {
                x.add(result.getString("report"));
            }
            c.close();
        }
        catch(Exception e)
        {
            System.out.println("Wrong:"+e.toString());
        }
        return x;
    }

    @Override
    public ArrayList<String> ListTable()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(String[] insert)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            PreparedStatement statement;
            if(insert[1].length()==0)
            {
                String sql="insert into Customer_reoprt(Phone)"+"values(?)";
                statement=c.prepareStatement(sql);
                statement.setString(1, insert[0]);
            }
            else
            {
                String sql="insert into Customer_reoprt(Phone,report)"+"values(?,?)";
                statement=c.prepareStatement(sql);
                statement.setString(1, insert[0]);
                statement.setString(2, insert[1]);
            }
            int rows=statement.executeUpdate();
            if(rows>0)
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println("Wrong:"+e.toString());
            return false;
        }
        return false;
    }

    @Override
    public boolean Delete(String delete)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(String[] update)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql="update Customer_reoprt set report=?"+" where Phone="+update[0];
            PreparedStatement statement=c.prepareStatement(sql);
            statement.setString(1,update[1]);
            int rows=statement.executeUpdate();
            if(rows>0)
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println("Wrong:"+e.toString());
            return false;
        }
        return false;
    }
}


