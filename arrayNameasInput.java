import java.util.Scanner;

public class arrayNameasInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size= sc.nextInt();
        String name[]=new String[size];
        //input
        System.out.println("enter names:  ");
        for (int i = 0; i < name.length; i++) {
           
            name[i]=sc.next();
        }
        //output
        for (int j = 0; j < name.length; j++) {
            System.out.println("name "+(j+1)+ " is :"+name[j]);
        }
    }
}