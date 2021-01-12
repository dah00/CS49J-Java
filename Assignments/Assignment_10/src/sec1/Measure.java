package sec1;


class Measure<T> implements Measurable{
    private T value;

    Measure(T value){
        this.value = value;
    }

    @Override
    public double getMeasure() {
        if (value instanceof Integer)
            return ((Integer)value);
        else
            return ((Double)value);
    }


}
