import java.util.Scanner;
public class P11799 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        int tCase = sc.nextInt();
        
        for (int count = 1 ; count <= tCase ; count++){
            int cCount = sc.nextInt();
            int cSpeed [] = new int [cCount];
            
            for (int count2 = 0 ; count2 < cCount ; count2++){
                cSpeed [count2] = sc.nextInt();
            }
            
            int maxYet = cSpeed [0];
            for (int count2 = 1 ; count2 < cCount ; count2++){
                if (cSpeed [count2] > maxYet){
                    maxYet = cSpeed [count2];
                }
            }
            System.out.printf("Case %d: %d\n",count,maxYet);
        }
    }
}