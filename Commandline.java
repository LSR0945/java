public class Commandline {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed");
            return;
        }

        System.out.println("arguments passed are:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arguments is[" + i + "]:" + args[i]);
        }

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number at position " + i + ": " + args[i]);
                return;
            }
        }

        System.out.println("Sum of arguments is: " + sum);
    }
}
