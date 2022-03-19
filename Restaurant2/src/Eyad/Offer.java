/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eyad;

import java.sql.*;
import java.util.*;

public class Offer extends Connection implements Database
{
    public Offer () {
       super ( "jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;" , "projectpl2" , "1234");
    }
    @Override
    public ArrayList<String> Search(String search)
    {
        List<String> list = new ArrayList<>();
        try {

            java.sql.Connection c = (java.sql.Connection) super.getConnect();
            String sql = "select *from offer where promoCode=" + search;
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                list.add(result.getString("promoCode"));
                list.add(result.getString("offerValue"));
            }

            c.close();

        } catch (SQLException e) {

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
            String sql = "select *from offer";
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next())
            {
                list.add(result.getString("promoCode"));
                list.add(result.getString("offerValue"));
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
            String sql = "insert into offer (promoCode,offerValue)" + "values(?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, insert[0]);
            statement.setString(2, insert[1]);

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
            String sql="delete from offer where promoCode='"+delete+"'";
            Statement statement=c.createStatement();
            int rows=statement.executeUpdate(sql);
            if(rows>0)
            {
                return true;
            }
            c.close();
        }
        catch(Exception e)
        {
            System.out.println("Wrong:"+e.toString());
            return false;
        }
        return false;
    }

    @Override
    public boolean Update(String[] update)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
