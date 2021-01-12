package sec3;

import java.io.FileNotFoundException;

public class WordCount implements Runnable{
    private Task task;
    private String fileName;


    WordCount(String fileName){
        this.fileName = fileName;
        task = new Task(fileName);
    }

    @Override
    public void run() {
        try {
            task.countWord();
            System.out.println(fileName + ": " + task.getCount());
            Thread.sleep(1);
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getTotalCount(){
        return task.getCount();
    }

}
