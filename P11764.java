import java.util.Scanner;
public class P11764 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int tCase = sc.nextInt();
        
        for (int count = 1 ; count<=tCase ; count++){
            // Getting Wall
            int wallC = sc.nextInt();
            int [] wall = new int [wallC];
            for (int count2 = 0 ; count2<wall.length ; count2++){
                wall[count2]=sc.nextInt();
            }
            // Jumping Wall
            int lJump = 0 ;
            int sJump = 0 ;
            for (int count3 = 0 ; count3<wall.length ; count3++){
                if (count3 == wall.length-1){
                    break;
                }
                if (wall[count3]<wall[count3+1]){
                    lJump++;
                }
                else if (wall[count3]>wall[count3+1]){
                    sJump++;
                }
            }
            System.out.println("Case "+count+": "+lJump+" "+sJump);
        }
    }
}
