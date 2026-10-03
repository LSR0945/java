
import java.util.Scanner;
class CricketArray{
    public static void main(String[] args) {
        int scoreArr[] = new int [6];
        int dot=0, totalrun=0;
        Scanner sc =new Scanner(System.in);
        System.err.println("enter the runs scored by 6 players");
        for (int i=0; i<6; i++){
            System.err.println("ball"+ (i+1)+ ":");
            scoreArr[i] =sc.nextInt();
            totalrun=totalrun+scoreArr[i];
            if(scoreArr[i]==0){
                dot++;
            }

        }
        System.err.println("Number of dots: " +dot);
        System.err.println("Total runs scored " +totalrun);
    }
}