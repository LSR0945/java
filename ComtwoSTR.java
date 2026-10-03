public class ComtwoSTR {

    public static void main(String[] args) {
        String student1[] = {"satish", "varish", "pankaj", "jitendra", "rajesh"};
        String student2[] = {"santosh", "sandeep", "sachin", "satyam", "saurabh"};
        String student3[] = new String[student1.length + student2.length];
        
        System.out.println("student3 length: " + student3.length);
        
        // दोनों एरे को कंबाइन करना
        int index = 0;
        for (String student : student1) {
            student3[index++] = student;
        }
        for (String student : student2) {
            student3[index++] = student;
        }

        // सही बबल सॉर्ट लॉजिक (Bubble Sort Logic Fix)
        for (int i = 0; i < student3.length - 1; i++) {
            for (int j = 0; j < student3.length - 1 - i; j++) {
                // यहाँ j और j+1 की तुलना होगी
                if (student3[j].compareTo(student3[j+1]) > 0) {
                    // स्वैपिंग भी j और j+1 के बीच होगी
                    String temp = student3[j];
                    student3[j] = student3[j+1];
                    student3[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for(int i = 0; i < student3.length; i++) {
            System.out.print(student3[i] + " ");
        }
    }
}
