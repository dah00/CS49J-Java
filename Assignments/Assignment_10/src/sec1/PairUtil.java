package sec1;

public class PairUtil{

    public static <T extends Measurable> Pair<T> minmax(T[] arrays){
        double max = arrays[0].getMeasure();
        double min = arrays[0].getMeasure();


        for (int index = 1; index < arrays.length; index++){
            if (arrays[index].getMeasure() > max)
                max = arrays[index].getMeasure();
            if (arrays[index].getMeasure()  < min)
                min = arrays[index].getMeasure();
        }
        return new Pair(min, max);
    }


}
