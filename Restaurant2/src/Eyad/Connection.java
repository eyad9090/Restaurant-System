package Eyad;

import java.sql.*;
import java.util.*;

public class Connection
{

    java.sql.Connection c;
    private String url;
    private String user;
    private String pass;
    public Connection()
    {
        String url ="jdbc:sqlserver://DESKTOP-TCDD467;databaseName=restaurant;";
        String user = "projectpl2";
        String pass = "1234";
    }

    public Connection(String url, String user, String pass)
    {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public java.sql.Connection getConnect()
    {
        try
        {
            c = (java.sql.Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("connected");
        }
        catch (Exception e)
        {
            System.out.println("there is somthing wrong\n");
            System.out.println(e.toString());
        }
        return (java.sql.Connection) c;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUser()
    {
        return user;
    }

    public String getPass()
    {
        return pass;
    }
}
