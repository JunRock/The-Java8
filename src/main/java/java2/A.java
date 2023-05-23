package java2;
public class A{
    public static Object process1;
    public static Object process2;
public static class Thread_Class extends Thread {
    @Override
    public void run() {
        synchronized (process1) {
            System.out.println(Thread.currentThread().getName() + ": process1 자원 작업중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ": process2자원 대기 중");
            synchronized (process2) {
                System.out.println(Thread.currentThread().getName() + ": process1 & process2 작업 중");
            }
        }

    }
}
    private static class Thread_Class2 extends Thread {
        @Override
        public void run() {
            synchronized ("process2") {
                System.out.println(Thread.currentThread().getName() + ": process2 자원 작업중");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + ": process1자원 대기 중");
                synchronized ("process1") {
                    System.out.println(Thread.currentThread().getName() + ": process1 & process2 작업 중");
                }
            }
        }
    }
    public static void main(String[] args){
    Thread_Class thread_class=new Thread_Class();
    Thread_Class2 thread_class2=new Thread_Class2();
    thread_class.start();
    thread_class2.start();
        System.out.println(thread_class.getState());
        System.out.println(thread_class2.getState());
    }
}




