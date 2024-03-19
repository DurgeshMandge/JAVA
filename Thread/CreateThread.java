public class CreateThread extends Thread{

    static Thread t1 = new Thread(()->{
        for(int i=0;i<10;i++){System.out.println(i);}
    },"t1");

    static Thread t2 = new Thread(()->{
        for(int i=10;i<20;i++){System.out.println(i);}
    },"t2");
    public static void main(String[] args) throws Exception {
        t1.start();
        System.out.println(t1.getName()+" is started");
        // try{Thread.sleep(500);}catch(Exception e){}
        t2.start();
        System.out.println(t2.getName()+" is started");
        t1.join();
        System.out.println(t1.getName() + " finished");
        System.out.println("main is this");
        t2.join();
        System.out.println(t2.getName()+ " finished");
        t1.setPriority(1);
        System.out.println(t2.getPriority());
        System.out.println(t2.isAlive());
    }
}
