/*  Write a program that creates 2 threads - each displaying a message (Pass a
user input message as a parameter to the constructor). The threads should display the messages
continuously till the user says “Done”. */

import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence for first thread");
        String s1 = sc.nextLine();
        System.out.println("Enter the sentence for Second thread");
        String s2 = sc.nextLine();

        Mythread t1 = new Mythread(s1);
        t1.start();
        Mythread t2 = new Mythread(s2);
        t2.start();

        System.out.print("Enter X to stop execution");
        while(true){
            String msg = sc.next();
            if(msg.equalsIgnoreCase("X")){
                t1.interrupt();
                t2.interrupt();
                break;
            }
        }
    }
    
}

class Mythread extends Thread{
    String str;
    Mythread(String s){
        this.str = s;
    }
    @Override
    public void run (){
        while(!isInterrupted()){
            System.out.println(str);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.print(e);
                interrupt();
            }
        }

    } 
}
