import java.util.Scanner;
public class P10300 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;
        
        int tCase = sc.nextInt();
        
        for (int count = 1 ; count <= tCase ; count ++ ) {
            int nOfFarmers = sc.nextInt() ;
            double sumOfBudget = 0;
            
            for (int fCount = 1 ; fCount <= nOfFarmers ; fCount++) {
                int area = sc.nextInt();
                int aCount = sc.nextInt();
                int ef = sc.nextInt();
                
                double avgArea = (double)area / (double)aCount ;
                
                double budget = avgArea*ef*aCount ;
                sumOfBudget += budget;
            }
            System.out.println((int)sumOfBudget);
        }
    }
}