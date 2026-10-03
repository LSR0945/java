public class  Commandline {
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("No arguments passed");
            return;
        }
        System.out.println("arguments passed are:");
        for(int i=0;i<args.length;i++){
            System.out.println("argumments is["+i+"]:"+args[i]);
        }
        
        int sum = 0;
        for(int i=0;i<args.length;i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("Sum of arguments is: " + sum);
    }
}
