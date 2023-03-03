public class Q2_NestedLoops {

    public static void main(String[] args) {

        int numRows = 6; // number of rows in the output

        for (int row_Index = 1; row_Index <= numRows; row_Index++) {
            for (int j = 1; j <= numRows; j++) {
                if ((row_Index == j) || ((row_Index == 1) || (row_Index == 6)) ) {
                    System.out.print("& ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // move to next line
        }
    }

}

