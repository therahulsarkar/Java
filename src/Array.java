
public class Array {
    public static void main(String[] args) {
        //$ Method 1
        int[] array = new int[2]; //Declaration + Memory allocation
            array[0] = 10;
            array[1] = 20;
            System.out.print(array[1]);
        
        //$ Method 2
        int[] array2 = {10, 20, 30, 40, 50};
        // for (int i = 0; i < array2.length; i++) {
        //     System.out.println(array2[i]);
        // }

        //$ Using forEach loop
        for(int data: array2){
            System.out.println(data);
        }

        //$ 2d Array 
        int[][] twoD= {{1,2,3,4,5}, {6,7,8,9,10}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println( twoD[i][j]);
            }
        }
    }
}