package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/8/7.
 */
public class ThreadPoolMain {
    public static void main(String[] args) {
        /**
         * 创建线程池
         * @param corePoolSize:核心线程数；
         * @param maximumPoolSize:最大线程数；
         * @param keepAliveTime:线程等待销毁时间
         * @param TimeUnit 线程等待销毁时间单位
         * @param Queue 等待队列
         * */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,200,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        for(int i = 0;i<15;i++){
            MyRunnable myRunnable = new MyRunnable("myRunnable"+i);
            threadPoolExecutor.execute(myRunnable);
        }
        threadPoolExecutor.shutdown();
        System.out.println("线程池中线程数目："+threadPoolExecutor.getPoolSize()+",队列中等待的任务数目："+threadPoolExecutor.getQueue().size()
                +",已执行完成的任务数目："+threadPoolExecutor.getCompletedTaskCount());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程池中线程数目："+threadPoolExecutor.getPoolSize()+",队列中等待的任务数目："+threadPoolExecutor.getQueue().size()
                +",已执行完成的任务数目："+threadPoolExecutor.getCompletedTaskCount());

    }
}
