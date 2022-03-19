package Employee;

import resturant.*;
import java.sql.*;
import java.util.*;
import Eyad.*;

public class Billing extends Eyad.Connection implements Database
{
    
    public Billing()
    {
         super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");
    }
    @Override
    public ArrayList<String> Search(String search)
    {
        List<String> list = new ArrayList<>();
        try
        {

            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from Billing where Phone=" + search;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next())
            {
                list.add(result.getString("NoOrder"));
                list.add(result.getString("Name"));
                list.add(result.getString("Phone"));
                list.add(result.getString("Price"));

            }

            c.close();
        }
        catch (SQLException e)
        {

            System.out.println(e.toString());
        }
        return (ArrayList<String>) list;
    }

    @Override
    public ArrayList<String> ListTable()
    {
        List<String> list = new ArrayList<>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from Billing";
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next())
            {
                list.add(result.getString("NoOrder"));
                list.add(result.getString("Name"));
                list.add(result.getString("Phone"));
                list.add(result.getString("Price"));
            }
            c.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return (ArrayList<String>) list;
    }

    @Override
    public boolean Insert(String[] insert)
    {
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            System.out.println("Connected");
            String sql = "insert into Billing(NoOrder ,Name , Phone  , Price)" + "values(?,?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            statement.setString(4, insert[3]);
            statement.executeUpdate();
            c.close();

            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean Delete(String delete)
    {
        try
        {

            java.sql.Connection c = (java.sql.Connection) super.getConnect();

            String sql = "delete from Billing where NoOrder=" + delete;
            Statement statement = c.createStatement();
            statement.executeUpdate(sql);
            c.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public boolean Update(String[] update)
    {
        try
        {

            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "update Billing set Name=? , Phone = ?  , Price = ?" + " where NoOrder =" + update[0];
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, update[1]);
            statement.setString(2, update[2]);
            statement.setString(3, update[3]);
            statement.executeUpdate();
            c.close();
            return true;
        }
        catch (SQLException e)
        {
            return false;
        }
    }
}
