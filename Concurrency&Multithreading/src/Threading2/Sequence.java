package Threading2;

public class Sequence {
    private int value = 0;

    public int getNext(){
        synchronized (this){
            value++;
            return value;
        }

    }
}
