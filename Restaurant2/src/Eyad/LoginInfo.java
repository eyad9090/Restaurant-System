package Eyad;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginInfo extends Eyad.Connection implements Database
{

    public LoginInfo()
    {
        super("jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;", "projectpl2", "1234");
    }

    public boolean Search(String Name, String Password, String Job)
    {
        ArrayList<String> a = new ArrayList<>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select*from Accounts where Job='" + Job + "' And Username='" + Name + "' And Password='" + Password+"'";
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                a.add(result.getString("Username"));
                a.add(result.getString("Password"));
                a.add(result.getString("Job"));
            }
            if (a.size() > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public ArrayList<String> Search(String search)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            System.out.println("connected");
            String sql = "insert into Accounts(Username,Password,Job)" + "values(?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            //--checking---------------------
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            int rows = statement.executeUpdate();
            if (rows > 0)
            {
                return true;
            }
            c.close();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
