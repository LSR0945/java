public class Counter{
    static int count = 0; 
    String name;

    Counter(String name){
        this.name = name;
        count++;
    }

    static void showCount(){
        System.out.println("Total objects created: " + count);
        // System.out.println("name " +count);
    }
        public static void main(String[] args) {
        //    Counter c1 = new Counter();
        //    c1.name = "satish";
        //    Counter c2 = new Counter();
        //    c2.name = "arun";
        //    Counter c3 = new Counter();
        //    c3.name = "suresh";
        //    Counter.showCount();
        Counter c1 = new Counter("satish");
        Counter c2 = new Counter("arun");
        Counter c3 = new Counter("suresh");
        Counter.showCount();
        }
    }
