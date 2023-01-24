import java.util.Random;
import java.util.Stack;

class ProducerConsumer {
    static Stack<Integer> stack = new Stack<>();
    static final int MAX_SIZE = 5;

    static class Producer extends Thread {
        public void run() {
            while (true) {
                synchronized (stack) {
                    while (stack.size() == MAX_SIZE) {
                        System.out.println("Stack is full, producer is waiting...");
                        try {
                            stack.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Random rand = new Random();
                    int value = rand.nextInt();
                    stack.push(value);
                    System.out.println("Produced: " + value);
                   

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stack.notify();
                }
            }
        }
    }

    static class Consumer extends Thread {
        public void run() {
            while (true) {
                synchronized (stack) {
                    while (stack.isEmpty()) {
                        System.out.println("Stack is empty, consumer is waiting...");
                        try {
                            stack.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = stack.pop();
                    System.out.println("Consumed: " + value);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stack.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
    }
}
