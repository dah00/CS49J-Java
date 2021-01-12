package Volatile;

public class DownloadStatus {
    private boolean isDone;

    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
        synchronized (totalBytesLock){
            totalBytes++;
        }
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
