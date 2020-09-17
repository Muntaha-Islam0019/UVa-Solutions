import java.util.*;

public class P11172 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int testCase = sc.nextInt() ;
        
        for (int count = 1 ; count <= testCase ; count++) {
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            
            if (a>b){
                System.out.println(">");
            }
            else if (a<b){
                System.out.println("<");
            }
            else {
                System.out.println("=");
            }
        }
    }
    
}