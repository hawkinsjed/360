
package cit360;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

   class ExecutorDemo implements Runnable {
   private Thread t;
   private final String threadName;
   
   ExecutorDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   @Override
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   

   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestExecutor {
    
    public static void main(String[] args) 
    {
        //Use the executor created by the newCachedThreadPool() method 
        //only when you have a reasonable number of threads 
        //or when they have a short duration.
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i <= 5; i++) 
        {
            ExecutorDemo e1 = new ExecutorDemo("Task " + i);
            System.out.println("A new task has been added : ");
            executor.execute(e1);
        }
        executor.shutdown();
    }
    
}