package sec3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    add lock and condition
 */

public class Task{
    File myFile;
    Scanner scanFile;

    private Lock countChangeLock;
    private Condition increasedCountCondition;
    private int count;

    Task(String fileName){
        myFile = new File(fileName);
        countChangeLock = new ReentrantLock();
        increasedCountCondition = countChangeLock.newCondition();
    }

    public void countWord() throws FileNotFoundException {
        countChangeLock.lock();
        try {
            scanFile = new Scanner(myFile);
            while (scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                Scanner scanWord = new Scanner(line);
                scanWord.useDelimiter("[^A-Za-z']+");
                while(scanWord.hasNext()){
                    count++;
                    scanWord.next();
                }
                increasedCountCondition.signalAll();
            }
        }
        finally {
            countChangeLock.unlock();
        }
    }


    public int getCount() {
        return count;
    }
}
