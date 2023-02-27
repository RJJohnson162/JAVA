public class Q2_NestedLoops {

    public static void main(String[] args) {

        int numRows = 6; // number of rows in the output

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows; j++) {
                if (i == j) {
                    System.out.print("& ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // move to next line
        }
    }

}

