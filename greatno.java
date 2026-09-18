// this program is  to fin the greates and smallest number in an array
class greatno {
    public static void main(String[] args) {
        int arr[] = {12, 23, 1, 2, 3, 45};
        int greatno = great(arr);
        int smallno = small(arr);
        System.out.println("The greatest number is: " + greatno);
        System.out.println("The smallest number is: " + smallno);
    }
public static int great(int arr[]){
        int greatno = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatno) {
                greatno = arr[i];
            }
        }
        return greatno;
    }
    public static int small(int arr[]){
        int smallno =arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<smallno){
                smallno= arr[i];
            }
        }
        
        return smallno;
    }
}

