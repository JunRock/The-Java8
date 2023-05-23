package java2;

public class Runnable_Class implements Runnable{

    public static void main(String[] args) {
        Runnable runnable= () -> System.out.println("Thread: "+Thread.currentThread().getName());
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("Thread1: "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
