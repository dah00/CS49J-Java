package sec1;

public class Utils {

    public static<T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }


    public static void printUsers(GenericList<?> users){

    }

//    public static <K, V> void print(K key, V value){
//        System.out.println(key + "=" + value);
//    }
}
