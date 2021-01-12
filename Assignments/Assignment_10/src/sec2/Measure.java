package sec2;


class Measure<T> implements Measurable {
    private T largest;

    Measure(T value){
        this.largest = value;
    }

    @Override
    public double getMeasure() {
        if (largest instanceof Integer)
            return (Integer)largest;
        else
            return (double) largest;
    }

    @Override
    public String toString() {
        return "Largest Element: " + largest;
    }

}
