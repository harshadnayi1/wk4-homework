package Week4_homework;

     // Java code to demonstrate star patterns
    public class LeftTriangle {

        // Function to demonstrate printing pattern
        public static void printStars(int n) {
            int row, colm;

            // outer loop to handle number of rows
            //  n in this case
            for(row=1; row<=n; row++) {
                //  inner loop to handle number of columns
                //  values changing acc. to outer loop
                //for every row, run the colm
                for(colm=1; colm<=row; colm++)
                {
                    // printing stars
                    System.out.print("* ");
                }

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


