
package resturant;
public class Operation {
    
    public String calc( String s ){
        String s1="",s2;
        double m,n;
        if ( s.charAt(0) == '+' || s.charAt(0) == '-')
            s1 +=s.charAt(0);
        else
             s1 += s.charAt(0);
        for( int i = 1 ; i < s.length();i++ ){
            
            if ( s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '.'  ) 
                s1 += s.charAt(i);
            else if ( s.charAt(i) == '+' ){
                 s2 = s.substring(i+1);
                 m = summation(Double.parseDouble(s1),Double.parseDouble(s2));
                 return Double.toString(m);
            }
             else if ( s.charAt(i) == '-' ){
                 s2 = s.substring(i+1);
                 m = subtraction(Double.parseDouble(s1),Double.parseDouble(s2));
                 return Double.toString(m);
            }
             else if ( s.charAt(i) == '*' ){
                 s2 = s.substring(i+1);
                 m = multipe(Double.parseDouble(s1),Double.parseDouble(s2));
                 return Double.toString(m);
            }
             else if ( s.charAt(i) == '%' ){
                 s2 = s.substring(i+1);
                 m = modulas(Double.parseDouble(s1),Double.parseDouble(s2));
                 return Double.toString(m);
            }
             else if ( s.charAt(i) == '/' ){
                 s2 = s.substring(i+1);
                 if( s2 == "0")
                     return "Not valid";
                 else{
                    m = div(Double.parseDouble(s1),Double.parseDouble(s2));
                    return Double.toString(m);
            }
            
            }
            
        }    
        return s;
            
        
            
   }
    public double summation ( double n1 ,double n2){
        return n1 + n2;
    }
    public double subtraction ( double n1 ,double n2){
        return n1 - n2;
    }
    public double multipe ( double n1 ,double n2){
        return n1 * n2;
    }
    public double modulas ( double n1 ,double n2){
        return n1 % n2;
    }
    public double div ( double n1 , double n2 ){ 
       return n1/n2; 
    }    
     

}
    

