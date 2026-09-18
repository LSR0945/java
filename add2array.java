public class add2array {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,3,6,5,7,8,9,10};
        int arr2[] = {11,12,13,14,15};
        int arr3[] = new int[arr1.length + arr2.length];
        System.out.println("arr3 length: " + arr3.length);

        for(int i =0;i<arr3.length;i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else{
                arr3[i]=arr2[i-arr1.length];
            }
        }


        System.out.println("Combined array:");

        for(int i =0 ;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();


    System.out.println("Shorted array:");

    /** 
     this loop run (0 to 14 = 15) index and total elemensts = 15
    */
    for(int i =0;i<=arr3.length-1;i++){
        /**
         this loop run (0 to 13 = 14) index and total elemensts = 14 
         because we are compairing 1 index less than total elements
         because we are comparing arr3[j] with arr3[j+1] so we need to run this loop till 14 index only
         */
        for(int j =0;j<arr3.length-1-i;j++){
            if(arr3[j]>arr3[j+1]){   //yaha arr[j] ko arr[j+1] se compare kar rahe hai kyo ki 
                                    //13+1 = 14 tak check karega isliye isse ham is loop ko13 tak hi
                                    // chalaege 
                int temp = arr3[j];  
                arr3[j]=arr3[j+1];
                arr3[j+1]=temp;
            }
        }
        System.out.print(arr3[i]+" ");
    }
    System.out.println();

     

}
}