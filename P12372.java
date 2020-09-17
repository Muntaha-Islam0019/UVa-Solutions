import java.util.Scanner;
public class P12372 {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner (System.in) ;
        
        int tCase = sc.nextInt();
        for (int c = 1 ; c <= tCase ; c++) {
            
            int l = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            
            if (l<=20 && w<=20 && h<=20) {
                System.out.printf ("Case %d: good\n" , c) ;
            }
            else {
                System.out.printf ("Case %d: bad\n" , c) ;
            }
        }
    }
}
