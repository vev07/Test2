package Classes;

import java.util.Scanner;

public class VolatileTest {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        newThread.shutdown();

    }
}
class NewThread extends Thread{
    private volatile boolean running = true;

    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void shutdown(){
        this.running = false;
    }

}