public class LinearSearch {
    public static int linearSearch(int arr[],int target){
        for(int  i =0 ; i<arr.length;i++){
            if(arr[i]==target){
                // return arr[i]; // ye return karne se value milegi
                return i;         // ye return karne se index milega
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6,7,8,109,9};
      int target = 109 ;

    //   for (int i=0;i<arr.length;i++){
    //     if(arr[i]==target){
    //         System.out.println("mil gya sher index ="+ i);
    //         break;
    //     }
    //   }

    System.out.println(linearSearch(arr,target));
    }

    

    
}
