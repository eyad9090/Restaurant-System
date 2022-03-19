package Employee;

import Eyad.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class info_order extends Eyad.Connection implements Database
{

    public info_order()
    {
         super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");
    }

    @Override
    public ArrayList<String> Search(String search)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> ListTable()
    {
        List<String> list = new ArrayList<>();
        try
        {
            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from OrderInfo";
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                list.add(result.getString("NoOrder"));
                list.add(result.getString("Name"));
                list.add(result.getString("id"));
                list.add(result.getString("Price"));
                list.add(result.getString("count"));
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
            String sql = "insert into OrderInfo(NoOrder ,Name , id  , Price , count)" + "values(?,?,?,?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            statement.setString(4, insert[3]);
            statement.setString(5, insert[4]);
            statement.executeUpdate();
            c.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            return false;
        }
        return true;
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
