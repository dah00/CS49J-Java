package sec1;

public class Pair<T> {
    private final T min;
    private final T max;

    Pair(T min, T max){
        this.min = min;
        this.max = max;
    }


    @Override
    public String toString(){
        return "(" + min + ", " + max + ")";
    }

}
