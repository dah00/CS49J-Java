package Confinement;

import java.util.ArrayList;
import java.util.List;


public class ThreadDemo {
    public static void show(){
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i<10; i++){
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        int totalBytes = 0;
//
//        for (var task : tasks){
//            totalBytes += task.getStatus().getTotalBytes();
//        }


        var totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum);

        System.out.println(totalBytes);
    }
}
