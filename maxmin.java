import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //input
        System.out.println("enter numbers for array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) {
                min=numbers[i];
            }
            if (numbers[i]>max) {
                max=numbers[i];
                
            }
        }
        System.out.println("largest number is "+max);
        System.out.println("smallest number is "+min);

    }
}
