 //WAP to find whether the inputted number is even or odd

import java.util.Scanner;
class evenodd{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int num = sc.nextInt();
        
        if(num %2 == 0){
         System.out.println( num+ " number is even");
        }
        else{
          System.out.println(num + " number is odd");     
        }
        sc.close();

    }
}