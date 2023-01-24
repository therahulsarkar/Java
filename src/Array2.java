import java.util.Scanner;

class Array2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m = 3, n=3, i, j;

        int array[][] = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            array[i][j] = sc.nextInt();
        }
        }

        System.out.println("Printing array");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
               System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\nRow Minimum -> ");

        for (i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (array[i][j] < min){
                    min = array[i][j];
                    
                }
            }
            System.out.println(min + ", ");
        }
        
        System.out.print("\n Column Minimum -> ");

        for (i = 0; i < m; i++) {
            int minn = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (array[j][i] < minn){
                    minn = array[j][i];
                    
                }
            }
            System.out.println(minn + ", ");
        }



        
    }
    
}
