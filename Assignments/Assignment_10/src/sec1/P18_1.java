package sec1;



public class P18_1 {

    public static void main(String[] args) {

        Measurable[] array = new Measure[4];

        array[0] = new Measure<Integer>(3);
        array[1] = new Measure<Double>(5.5);
        array[2] = new Measure<Double>(99.0);
        array[3] = new Measure<Integer>(1);

        Pair<Measurable> pair = PairUtil.minmax(array);
        System.out.println(pair);
    }
}

