package Eyad;

import java.sql.*;
import java.util.*;

public class Meal1 extends Connection implements Database
{

    public Meal1()
    {
        super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");
    }

    /*
    public boolean add_meal(String[] a) {
        try {
            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            System.out.println("Connected");
            String sql = "insert into Meals(Id ,Name,Price)" + "values(?,?,?)";
            PreparedStatement statement = myConnection.prepareStatement(sql);

            statement.setString(1, a[0]);
            statement.setString(2, a[1]);
            statement.setString(3, a[2]);
            statement.executeUpdate();
            myConnection.close();
            
        } catch (Exception e) {
            return false;
        }
        return true;

    }
    public String [] SelectRow(String Id)
    {
        String []a=new String[3];
        try {
            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            String sql="select*from Meals where Id="+Id;
            Statement statement=c.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next())
            {
                a[0]=result.getString("Id");
                a[1]=result.getString("Name");
                a[2]=result.getString("Price");
            }
        } catch (Exception e) {
            a[0] = "0";
        }
        return a;
    }
    
    
    public String [] SelectMeal(String Name)
    {
        String []elements=new String[3];
        try {
            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            String sql="select *from Meals where Name='"+Name+"'";
            Statement statement=myConnection.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next())
            {
                elements[0]=result.getString("Id");
                elements[1]=result.getString("Name");
                elements[2]=result.getString("Price");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return elements;
    }

    
    public ArrayList<String> list_meal() {
        List<String> list = new ArrayList<>();
        try {

            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            String sql = "select *from meals";
            Statement statement = myConnection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                list.add(result.getString("id"));
                list.add(result.getString("name"));
                list.add(result.getString("price"));

            }
             
            myConnection.close();

        } catch (SQLException e) {

            System.out.println(e.toString());
        }

        return (ArrayList<String>) list;
    }

    public boolean update_meal(String[] a) {
        try {

            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            String sql = "update meals set name=? , price = ? " + " where id=" + a[0];
            PreparedStatement statement = myConnection.prepareStatement(sql);
            statement.setString(1, a[1]);
            statement.setString(2, a[2]);
            statement.executeUpdate();
            myConnection.close();

        } catch (SQLException e) {

            return false;
        }
        return true;

    }

    public boolean delete_meal(String ID) {

        try {
            java.sql.Connection myConnection= (java.sql.Connection) super.getConnect();
            String sql = "delete from meals where id=" + ID;
            Statement statement = myConnection.createStatement();
           statement.executeUpdate(sql);
            myConnection.close();
        } catch (Exception e) {

            return false;
        }
        return true;
    }
     */
    @Override
    public ArrayList<String> Search(String search)
    {
        //String []a=new String[3];
        ArrayList<String> a = new ArrayList<>();
        try
        {
            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            String sql = "select*from Meals where Id=" + search;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                a.add(result.getString("Id"));
                a.add(result.getString("Name"));
                a.add(result.getString("Price"));
            }
        }
        catch (Exception e)
        {
            //a[0] = "0";
        }
        return a;
    }

    public ArrayList<String> Search2(String search)
    {
        ArrayList<String> elements = new ArrayList<>();
        try
        {
            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            String sql = "select *from Meals where Name='" + search + "'";
            Statement statement = myConnection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                elements.add(result.getString("Id"));
                elements.add(result.getString("Name"));
                elements.add(result.getString("Price"));
              
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return elements;
    }

    @Override
    public ArrayList<String> ListTable()
    {
        List<String> list = new ArrayList<>();
        try
        {

            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            String sql = "select *from meals";
            Statement statement = myConnection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next())
            {
                list.add(result.getString("id"));
                list.add(result.getString("name"));
                list.add(result.getString("price"));

            }

            myConnection.close();

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
            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            System.out.println("Connected");
            String sql = "insert into Meals(Id ,Name,Price)" + "values(?,?,?)";
            PreparedStatement statement = myConnection.prepareStatement(sql);

            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);
            statement.setString(3, insert[2]);
            statement.executeUpdate();
            myConnection.close();

        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean Delete(String delete)
    {
        try
        {
            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            String sql = "delete from meals where id=" + delete;
            Statement statement = myConnection.createStatement();
            statement.executeUpdate(sql);
            myConnection.close();
        }
        catch (Exception e)
        {

            return false;
        }
        return true;
    }

    @Override
    public boolean Update(String[] update)
    {
        try
        {

            java.sql.Connection myConnection = (java.sql.Connection) super.getConnect();
            String sql = "update meals set name=? , price = ? " + " where id=" + update[0];
            PreparedStatement statement = myConnection.prepareStatement(sql);
            statement.setString(1, update[1]);
            statement.setString(2, update[2]);
            statement.executeUpdate();
            myConnection.close();

        }
        catch (SQLException e)
        {

            return false;
        }
        return true;
    }

  
}
