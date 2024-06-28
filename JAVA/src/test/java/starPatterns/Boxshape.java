package starPatterns;

import java.util.Scanner;

public class Boxshape {
    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//         for (int j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){   //rows
         for (int j=0;j<n;j++){   //columns
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
