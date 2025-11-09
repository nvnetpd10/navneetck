import java.util.concurrent.*;

public class ExecutorExample {
    private static final Object lock = new Object();
    static boolean turn = true;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Runnable r1 = () -> {
            for(int i=1;i<=10;i++){
                synchronized(lock){
                    while(!turn){
                        try{lock.wait();}catch(Exception e){}
                    }
                    System.out.println(2*i);
                    turn = false;
                    lock.notify();
                }
            }
        };

        Runnable r2 = () -> {
            for(int i=1;i<=10;i++){
                synchronized(lock){
                    while(turn){
                        try{lock.wait();}catch(Exception e){}
                    }
                    System.out.println(4*i);
                    turn = true;
                    lock.notify();
                }
            }
        };

        service.submit(r1);
        service.submit(r2);
        service.shutdown();
    }
}
