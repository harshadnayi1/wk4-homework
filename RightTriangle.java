package Week4_homework;

import java.sql.SQLOutput;

// Java code to demonstrate star patterns
public class RightTriangle {

    // Function to demonstrate printing pattern
    public static void printStars(int n) {
        int row, colm, space;

        // outer loop to handle number of rows
        //  n in this case
        for(row=1; row<=n; row++) {

            for(space=0; space<(n-row); space++) {
                // printing space
                System.out.print(" ");
            }
            for (colm = row; colm>=1; colm--){

                System.out.print("*");

            }
//            for (colm = 2; colm <= row; colm++){
//                System.out.print(colm);
//
//
//            }
            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 4;
        printStars(n);
    }
}


