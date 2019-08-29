package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        System.out.println("The values you entered will be averaged.");
        int n1 = ap.nextInt("Value for n1?");
        int n2 = ap.nextInt("Value for n2?");
        double n3 = (n1 + n2) / 2.0;
        System.out.println("The average of your values is " + n3);
    }
}
