package sec3;

import java.util.ArrayList;
import java.util.List;

public class E22_7 {
    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        List<WordCount> tasks = new ArrayList<>();
        int combinedCount = 0;

        // add the argument in the fileNames list
        for (int i=0; i<args.length; i++){
            fileNames.add(args[i]);

        }

        /*

         */

        for (String file: fileNames){

            var task = new WordCount(file);
            tasks.add(task);

            var thread = new Thread(task);
            thread.start();
            threads.add(thread);

        }

        for (var thread: threads){
            try {
                thread.join();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }


        for (WordCount task: tasks){
            combinedCount += task.getTotalCount();
        }

        System.out.println("Combined count: " + combinedCount);

    }
}
