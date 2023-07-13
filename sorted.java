import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int numbers[]=new int[size];

        //input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }
        boolean isAssending=true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]>numbers[i+1]) { //for decending order
                isAssending=false;

              
            }
           // System.out.println(numbers[i]);  
        }
        if (isAssending) {
            System.out.println("array is sorted in assending ordeer");
        } else {
            System.out.println("not sorted");
        }
       //System.out.println(numbers[i]);


    }
}
