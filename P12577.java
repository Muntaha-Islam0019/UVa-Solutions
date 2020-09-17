import java.util.*;
public class P12577 {
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        for ( int count = 1 ; count >= 0 ; count ++ ) {
            
            String s = sc.nextLine() ;
            
            if ( s.equals("Hajj") ) {
                System.out.printf ( "Case %d: Hajj-e-Akbar\n" , count ) ;
            }
            else if ( s.equals("Umrah") ) {
                System.out.printf ( "Case %d: Hajj-e-Asghar\n" , count ) ;
            }
            else if ( s.equals("*") ) {
                break;
            }
        }
    }
}