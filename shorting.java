// Ye code Bubble Sort Algorithm ka hai (Array ko ascending order me sort karne ke liye)
import java.util.Scanner;

class shorting {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int arr[];
        arr = new int [size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"elemet os aarray");
            arr[i]=input.nextInt();
        }
        for(int i = 0 ;i<=arr.length-1 ; i++){
            for(int j = 0 ; j <arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = tem;
                }
               
            }
        }
        System.out.println("shorted array");
        for(int i =0 ;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
