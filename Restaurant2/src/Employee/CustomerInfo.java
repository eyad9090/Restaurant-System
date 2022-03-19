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

public class CustomerInfo extends Eyad.Connection implements Database
{

    public CustomerInfo()
    {
         super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");

    }
    @Override
    public ArrayList<String> Search(String search)
    {
        ArrayList <String>a=new ArrayList<>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from Customer where Phone=" + search;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                a.add(result.getString("Phone"));
                a.add(result.getString("Name"));
                a.add(result.getString("Email"));
                a.add(result.getString("NumberOfHomer"));
                a.add(result.getString("Street"));
                a.add(result.getString("City"));
                a.add(result.getString("Country"));
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
        }
        return a;
    }

    @Override
    public ArrayList<String> ListTable()
    {
        ArrayList<String> x = new ArrayList<String>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from Customer";
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                x.add(result.getString("Phone"));
                x.add(result.getString("Name"));
                x.add(result.getString("Email"));
                x.add(result.getString("NumberOfHomer"));
                x.add(result.getString("Street"));
                x.add(result.getString("City"));
                x.add(result.getString("Country"));
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
        }
        return x;
    }

    @Override
    public boolean Insert(String[] insert)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "insert into customer (Phone,Name,Email,NumberOfHomer,Street,City,Country)" + "values(?,?,?,?,?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            statement.setString(4, insert[3]);
            statement.setString(5, insert[4]);
            statement.setString(6, insert[5]);
            statement.setString(7, insert[6]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
            return false;
        }
        return false;
    }

    @Override
    public boolean Delete(String delete)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "delete from Customer where Phone=" + delete;
            Statement statement = c.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
            return false;
        }
        return false;
    }

    @Override
    public boolean Update(String[] update)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "update Customer set Phone=?,Name=?,Email=?,NumberOfHomer=?,Street=?,City=?,Country=?" + " where Phone=" + update[0];
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, update[0]);
            statement.setString(2, update[1]);
            statement.setString(3, update[2]);
            statement.setString(4, update[3]);
            statement.setString(5, update[4]);
            statement.setString(6, update[5]);
            statement.setString(7, update[6]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong:" + e.toString());
            return false;
        }
        return false;
    }
}
