public class Thread3  {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "Thread 1");
        Thread t2 = new Thread(new MyThread(), "Thread 2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
    
}

class MyThread implements Runnable{
    public void run(){
        System.out.print(Thread.currentThread().getName() + "has priority ->" + Thread.currentThread().getPriority() + "\n");
    } 
}
