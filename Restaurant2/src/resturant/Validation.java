
package Resturant;

public class Validation {
    
    // function check phone enter corrc=ect or not
    public static boolean checkPhone( String phone ){
        if(phone.length() != 11  || phone.charAt(0) != '0' || phone.charAt(1) != '1' ){ // if number of phone != 11 or first and second digit != 01 the phone isnot correct
            return false;
        }
        else
        {
            for(int i = 2 ; i < 11 ; i++ ){ // check number from digit 3 to digit 11
                if( phone.charAt(i) >= '0' && phone.charAt(i) <= '9' || phone.charAt(i) == ' ' ) 
                    continue;
                else // if any character is not digit that mean the phone isnot correct
                    return false;
        }
            return true; // if function arrrive to this line that mean the phone is correct
        }  
    }
    
    
    
    // function cheack id enter correct  or not
    public static boolean checkId ( String Id ){
        if ( Id.length() > 30 ){ // if length of id > 30 that mean the ID isnot correct
            return false;
        }
        else{
            for( int i = 0 ; i < Id.length() ; i++ ){
                if( Id.charAt(i) >= '0' && Id.charAt(i) <= '9'  || Id.charAt(i) == ' ') 
                    continue;
                else // if any character is not digit that mean the phone isnot correct
                    return false;  
            }
            return true;// if function arrrive to this line that mean the Id is correct
        }
    }
    
    public static Boolean checkOffer ( String offer ){
        if ( offer.length() > 2 || offer.length() == 0 )
            return false;
        else{
            for ( int i = 0 ; i < offer.length() ; i++ ){
                if( offer.charAt(i) >= '0' && offer.charAt(i) <= '9' )
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
    
    
    
    
    
    
    
    
    public static boolean checkEmail ( String email ){
        byte n = 0, m = 0 ;
        if ( email.length() > 100 || email.length() < 7 )
            return false;
        
        for ( int i = 0 ; i < email.length() ; i++ ){
            if ( email.charAt(i) == '@')
                n++;
            if ( email.charAt(i) == '.' )
                m++;
        }
        if ( n == 1 && m > 0 )
            return true;
        else
            return false;
    }
    
    
    
    
    
    
    public static  boolean checkName ( String name ){
        if ( name.length() > 100  || name.length() < 3 )
            return false;
        
        for ( int i = 0 ; i < name.length() ; i++ ){
            if ( ( name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || ( name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || name.charAt(i) == ' ' )
                continue;
            else
                return false;
            
        }
        return true;
    }
    
    
    
    
    
    
    public static boolean checkPersonPosition ( String personPosition ){
        if ( personPosition.length() > 30 || personPosition.length() < 3 )
            return false;
        
        for ( int i = 0 ; i < personPosition.length() ; i++ ){
            if ( ( personPosition.charAt(i) >= 'A' && personPosition.charAt(i) <= 'Z') || ( personPosition.charAt(i) >= 'a' && personPosition.charAt(i) <= 'z') || personPosition.charAt(i) == ' ' )
                continue;
            else
                return false;
            
        }
        return true;
    }
    
    
    
    
    
    public static boolean checkGender ( String gender ){
        if ( gender.equals("Male") || gender.equals("Female") )
            return true;
        else
            return false;
    }
    
    
    
    
    public static boolean checkHomeNumber ( String homeNumber ){
       if ( homeNumber.length() > 5 )
           return false;
       
       for ( int i = 0 ; i < homeNumber.length() ; i++ ){
           if ( homeNumber.charAt(i) >= '0' && homeNumber.charAt(i) <= '9' )
               continue;
           else
               return false;
       }
       return true ; 
       
    }
    
    
    
    
    public static boolean chechStreet ( String street ){
        if ( street.length() > 150 || street.length() < 3 )
            return false;
        
        for( int i = 0 ; i < street.length() ; i++ ){
            if ( ( street.charAt(i) >= 'a' && street.charAt(i) <= 'z' ) || ( street.charAt(i) >= 'A' && street.charAt(i) <= 'Z' ) || ( street.charAt(i) >= '0' && street.charAt(i) <= '9' )
                    || street.charAt(i) == ' ' || street.charAt(i) == '-' )
                continue;
            else
                return false;
        }
        return true;
    }
    
    
    
    
    
    
    public static boolean checkCity ( String city ){
        if ( city.length() > 50 || city.length() < 3 )
            return false;
        
        for ( int i = 0 ; i < city.length() ; i++ ){
            
             if ( ( city.charAt(i) >= 'a' && city.charAt(i) <= 'z' ) || ( city.charAt(i) >= 'A' && city.charAt(i) <= 'Z' ) || city.charAt(i) == ' ' )
                 continue;
             else
                 return false;
        }
        return true;
    }
    
    
    
    
    
    
    public static boolean checkCountry ( String country ){
       if ( country.length() > 50 || country.length() < 3 )
           return false;
       
       for ( int i = 0 ; i < country.length() ; i++ ){
            
             if ( ( country.charAt(i) >= 'a' && country.charAt(i) <= 'z' ) || ( country.charAt(i) >= 'A' && country.charAt(i) <= 'Z' ) || country.charAt(i) == ' ' )
                 continue;
             else
                 return false;
        }
        return true;
    }
    
    
    
    
    public static boolean checkNeighbourhood ( String NBH ){
          if ( NBH.length() > 50 || NBH.length() < 3 )
           return false;
       
       for ( int i = 0 ; i < NBH.length() ; i++ ){
            
             if ( ( NBH.charAt(i) >= 'a' && NBH.charAt(i) <= 'z' ) || ( NBH.charAt(i) >= 'A' && NBH.charAt(i) <= 'Z' ) || NBH.charAt(i) == ' ' )
                 continue;
             else
                 return false;
        }
        return true;
    }
    
    
    
    
    public static boolean checkSalary(String Salary){
        if( Salary.length() != 4 || Salary.charAt(0) == '0')
            return false;
        for( int i  = 0 ; i < 4 ; i++ ){
            if(Salary.charAt(i) >= '0' && Salary.charAt(i) <= '9' )
                continue;
            else
                return false;
        }
        return true;
                
    }
    
    
    
    public static boolean checkAge ( String Age ){
        for ( int i = 0 ; i < Age.length() ; i++ ){
          if( Age.charAt(i) >= '0' && Age.charAt(i) <= '9')
            continue;
          else
             return false;
            
        }
        int i = Integer.parseInt(Age);
        if( i >= 18 && i <= 80 )
            return true;
        else
            return false;
        
    }
    
    
    
    
    public static boolean checkPrice ( String price){
        int k=0;
        if( price.length() > 10 ){
            return false;
        }
        else{
            for( int i = 0 ; i < price.length() ; i++ ){
                if ( price.charAt(i) == '.')
                    k++;
                else if ( price.charAt(i) >= '0' && price.charAt(i) <= '9')
                    continue;
                else
                    return false;
                
            }
            if( k > 1 )
                return false;
            else
                return true;
        }
    }


    
}
    
    
