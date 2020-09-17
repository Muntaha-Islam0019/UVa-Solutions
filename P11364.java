import java.util.*;
public class P11364 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in) ;
        
        int tCase = sc.nextInt() ;
        
        for (int c=1 ; c <= tCase ; c++){
            int shops = sc.nextInt() ;
            int [] arr = new int [shops] ;
            for (int x=0 ; x<arr.length ; x++){
                arr[x] = sc.nextInt();
            }
            Arrays.sort(arr);
            int distance = arr[arr.length - 1] - arr [0] ;
            System.out.println (distance*2) ;
        }
    }
}
