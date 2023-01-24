public class Thread4  {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "Thread 1");
        Thread t2 = new Thread(new MyThread(), "Thread 2");
        Thread t3 = new Thread(new MyThread(), "Thread 3");

        t1.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        t2.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        t3.start();


        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            // Thread.sleep(2000);
        }
        System.out.print("Main thread execution started!");
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());


    }
    
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Doing some work in thread " + Thread.currentThread().getName() + Thread.currentThread().isAlive());
}
}
