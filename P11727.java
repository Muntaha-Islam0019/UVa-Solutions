import java.util.*;
public class P11727 {
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int n = sc.nextInt() ;
       
        for ( int count = 1 ; count <= n ; count ++ ) {
            
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            
            if ( s1 < s2 && s2 < s3 ) {
                System.out.printf ( "Case %d: %d\n" , count , s2 ) ;
            }
            else if ( s2 < s3 && s3 < s1 ) {
                System.out.printf ( "Case %d: %d\n" , count , s3 ) ;
            }
            else if ( s3 < s1 && s1 < s2 ) {
                System.out.printf ( "Case %d: %d\n" , count , s1 ) ;
            }
            else if ( s1 > s2 && s2 > s3 ) {
                System.out.printf ( "Case %d: %d\n" , count , s2 ) ;
            }
            else if ( s2 > s3 && s3 > s1 ) {
                System.out.printf ( "Case %d: %d\n" , count , s3 ) ;
            }
            else if ( s3 > s1 && s1 > s2 ) {
                System.out.printf ( "Case %d: %d\n" , count , s1 ) ;
            }
        }
        
        sc.close() ;
    }
}