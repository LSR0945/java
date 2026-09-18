public class add2array {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,3,6,5,7,8,9,10};
        int arr2[] = {11,12,13,14,15};
        int arr3[] = new int[arr1.length + arr2.length];

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
    for(int i =0;i<arr3.length;i++){
        for(int j =0;j<arr3.length-1-i;j++){
            if(arr3[j]>arr3[j+1]){
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