public class ComtwoSTR {

    public static void main(String[] args) {
     String student1[] = {"satish", "varish", "pankaj", "jitendra", "rajesh"};
     String student2[] = {"santosh", "sandeep", "sachin", "satyam", "saurabh"};
     String student3[] = new String[student1.length + student2.length];
        
     System.out.println("student3 length: " + student3.length);
     System.out.println("Combined array:");
     for(int i =0;i<student3.length;i++){
        if(i<student1.length){
            student3[i]=student1[i];
        }
        else{
            student3[i]=student2[i-student1.length];
        }
     }

     for(int  i =0 ;i<=student3.length-1;i++){
        for(int j =0;j<student3.length-1-i;j++){
            if(student3[i].compareTo(student3[j+1])>0){
                String temp = student3[i];
                student3[i] = student3[j+1];
                student3[j+1] = temp;
            }
        }
     }

     System.out.println("Sorted array:");
     for(int i =0;i<student3.length;i++){
        System.out.print(student3[i]+" ");
     }

}
}
