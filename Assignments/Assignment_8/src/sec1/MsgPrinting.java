package sec1;

public class MsgPrinting implements Runnable {
    private String msg;
    public MsgPrinting(String msg) {
        this.msg = msg;

    }
    public void run() {
        System.out.println(msg);

    }
    public static void main(String[] args) {
        for (int i = 0;i< 3;i++) {
            Thread thread = new Thread(new MsgPrinting("Hello World" + i));
            thread.start();
        }
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new MsgPrinting("Goodby World" + i));
            thread.start();
        }

    }
}