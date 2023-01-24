class FibonacciThread extends Thread {
    public void run() {
        synchronized (this) {
            int a = 0, b = 1, c;
            System.out.print("Fibonacci series: ");
            for (int i = 0; i < 10; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
            notify();
        }
    }
}

class ReverseThread extends Thread {
    FibonacciThread fibonacciThread;
    ReverseThread(FibonacciThread fibonacciThread) {
        this.fibonacciThread = fibonacciThread;
    }
    public void run() {
        try {
            synchronized (fibonacciThread) {
                fibonacciThread.wait();
                System.out.print("Reverse order: ");
                for (int i = 10; i > 0; i--) {
                    System.out.print(i + " ");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseThread reverseThread = new ReverseThread(fibonacciThread);
        fibonacciThread.start();
        reverseThread.start();
    }
}
