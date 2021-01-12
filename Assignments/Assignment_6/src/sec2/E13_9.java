
package sec2;
public class E13_9 {
    public static void main(String[] args) {
        System.out.println(indexOf("Mississippi", "sip"));
    }
    public static int indexOf(String text, String str){
        return helper(text, str, 0);
    }

    public static int helper(String text, String str, int index ){
        if (text.length()<str.length())
            return -1;
        int strLength = str.length();
        if(!text.substring(0, strLength).equals(str)){
            return helper(text.substring(1), str, index+1);
        }
        else
            return index;
    }
}
