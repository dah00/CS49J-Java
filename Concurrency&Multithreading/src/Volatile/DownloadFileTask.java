package Volatile;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        for (var i=0; i<1_000_000; i++){
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }
        status.done();

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
