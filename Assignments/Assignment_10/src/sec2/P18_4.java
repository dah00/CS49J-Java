package sec2;


import java.util.ArrayList;

public class P18_4 {

    public static void main(String[] args) {

        ArrayList<Measurable<Number>> array = new ArrayList<>();

        array.add(new Measure<Integer>(3));
        array.add(new Measure<Integer>(6));
        array.add(new Measure<Integer>(9));

        Measurable largest = PairUtil.getLargest(array);

        System.out.println(largest);

    }

}