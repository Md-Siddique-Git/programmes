import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entsr size of row");
        int row=sc.nextInt();
        System.out.println("enter size of column");
        int column=sc.nextInt();

        int[][] numbers =new int[row][column];

        System.out.println("enter numbers ");

        //row
        for(int i= 0;i<row;i++ ){
            for (int j = 0; j <column; j++) {
                
                numbers[i][j]= sc.nextInt();
            }
        }
        //  for(int i= 0;i<row;i++ ){
        //     for (int j = 0; j <column; j++) {
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println(); 
        // }
        System.out.println("enter number for search");
        int x =sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(numbers[i][j]==x) {
                    System.out.println(x+" found at ("+i+","+j+")");
                }
            }
            
        }
    }
}
