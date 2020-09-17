import java.util.*;
public class P12289  {
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int testCase = sc.nextInt() ;
        
        for ( int count = 0 ; count <= testCase ; count ++ ) {
            String s = sc.nextLine() ;
            
            if (s.length() == 3) {
                
                Character c1 = s.charAt(0) ;
                Character c2 = s.charAt(1) ;
                Character c3 = s.charAt(2) ;
                
                if ((c3.equals('o') && c1.equals('t')) || (c1.equals('t') && c2.equals('w')) || (c3.equals('o') && c2.equals('w')) ) {
                    System.out.println ("2") ;
                }
                else {
                    System.out.println ("1") ;
                }
            }
            else if (s.length() == 5) {
                System.out.println ("3") ;
            }
        }
    }
}