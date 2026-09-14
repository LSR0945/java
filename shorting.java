import java.util.*;
public class shorting {
    public static void main(String[] args) {
        // int arr[] = {5, 2, 8, 1, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num= sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int v = n-1;
       for(int i=0;i<v;i++){
            for(int j=0;j<v-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("ASENDING");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
