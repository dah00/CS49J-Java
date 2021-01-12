package sec2;

import java.util.ArrayList;

public class PairUtil<T>{

    public static <T extends Measurable> T getLargest(ArrayList<T> arrayList){
        T largest = arrayList.get(0);

        for (var index = 1; index<arrayList.size(); index++){
            T element = arrayList.get(index);
            if (largest.getMeasure()<element.getMeasure()){
                largest = element;
            }
        }

        return largest;
    }

}
