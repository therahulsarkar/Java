import java.util.*;
public class PC {
    static Stack<Integer> stack = new Stack<>();
    static final int MAX_SIZE = 5;

    static class Producer extends Thread{
        public void run(){
            synchronized(stack){
            while(true){
                while(stack.size() == MAX_SIZE){
                    System.out.println("Stack full...");
                    try {
                        stack.wait();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                Random rand = new Random();
                int data = rand.nextInt();
                stack.push(data);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.printf(data+"Pushed!");
                stack.notify();
                }
            }
        }
    }

    static class Consumer extends Thread{
        public void run(){
            synchronized(stack){
            while(true){
                while(stack.isEmpty()){
                    System.out.println("Stack empty...");
                    try {
                        stack.wait();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                int data = stack.pop();
                System.out.printf(data+"Pushed!");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                stack.notify();
                }
            }
        }
    }
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer();

        p.start();
        c.start();
    }
    
}
