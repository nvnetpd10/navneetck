public class SyncThreads {
    private static final Object lock = new Object();
    static boolean turn = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                synchronized(lock){
                    while(!turn) {
                        try{lock.wait();}catch(Exception e){}
                    }
                    System.out.println(2*i);
                    turn = false;
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                synchronized(lock){
                    while(turn) {
                        try{lock.wait();}catch(Exception e){}
                    }
                    System.out.println(4*i);
                    turn = true;
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
