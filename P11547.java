import java.util.Scanner;

public class P11547 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int count = sc.nextInt();
        
        for (int c = 1 ; c <= count ; c++) {
            int n = sc.nextInt() ;
            
            n *= 567;
            n /= 9;
            n += 7492;
            n *= 235;
            n /= 47;
            n -= 498;
            
            String s = String.format ("%d",n) ;
            
            System.out.println(s.charAt(s.length()-2));
            
        }
    }
}
