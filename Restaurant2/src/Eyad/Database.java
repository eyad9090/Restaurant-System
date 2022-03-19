package Eyad;
import java.util.*;
public interface Database
{
    public ArrayList<String> Search ( String search );
    public ArrayList<String> ListTable ();
    public boolean Insert ( String [] insert );
    public boolean Delete ( String delete );
    public boolean Update ( String [] update );
}
