package com.stackroute;
import java.util.Scanner;

public class AdditionOfMatrics {
    public static void main(String args[]) {
        int rows, cols, holdrows, holdcols;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        rows = in.nextInt();
        cols= in.nextInt();

        int first[][] = new int[rows][cols];
        int second[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("Enter the elements of first matrix");

        for (holdrows= 0; holdrows < rows; holdrows++)
            for (holdcols = 0; holdcols< cols; holdcols++)
                first[holdrows][holdcols] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (holdrows= 0; holdrows< rows; holdrows++)
            for (holdcols = 0; holdcols< cols; holdcols++)
                second[holdrows][holdcols] = in.nextInt();

        for (holdrows= 0; holdrows < rows; holdrows++)
            for (holdcols= 0; holdcols < cols; holdcols++)
                sum[holdrows][holdcols] = first[holdrows][holdcols] + second[holdrows][holdcols];

        System.out.println("Sum of the matrices:");

        for (holdrows = 0; holdrows < rows; holdrows++) {
            for (holdcols= 0; holdcols < cols; holdcols++)
                System.out.print(sum[holdrows][holdcols] + "\t");

            System.out.println();
        }
    }
}




