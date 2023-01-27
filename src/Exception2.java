class NegativeException extends Exception{
    NegativeException(String msg){
        super(msg);
    }
}
public class Exception2 {
    int[] arr;
    int size;

    public Exception2(int size){
        arr = new int[size];
    }

    public void add(int data) throws NegativeException{
        if(data <0){ 
            throw new NegativeException("Negative values are not allowed!");}
        else{
            arr[size++] = data;
        }
    }
    public static void main(String[] args) {
        Exception2 myArr = new Exception2(10);
        // System.out.println(myArr.arr.length);
        try {
            myArr.add(-10);
        } catch (NegativeException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
    
}
