package multithreading;

/**
 * 实现Runnable接口实现多线程
 */
public class MyRunnable implements Runnable {
    String name = null;
    public MyRunnable(String name){
        this.name = name;
    }
   @Override
    public synchronized void run() {
       for(int i =0;i< 10;i++){
           System.out.println(Thread.currentThread().getName()+"-"+this.name+"-"+i);
           try{
               if("myRunnable1".equals(this.name)){
                   Thread.sleep(100);
               }
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}
