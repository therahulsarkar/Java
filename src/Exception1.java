public class Exception1  {

    public static void arry() throws ArrayIndexOutOfBoundsException {
        int arr[] = {1,2,3,4,5};
        int value = arr[10];
    }

    public static void num() throws ArithmeticException {
        int a = 10, b = 0;
        int c = a/b;
    }

    public static void main(String[] args) {
        try {
            arry();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(e.getMessage());
        } 
        finally{
            System.out.print("Finally done!");
        }

        try {
            num();}
 catch(ArithmeticException e){
            System.out.print(e.getMessage());
        }
        finally{
            System.out.print("Finally done!");
        }
    }
    
}
