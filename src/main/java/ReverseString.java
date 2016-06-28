/**
 * Created by bartoszjanota-prv on 30/03/16.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("abfds"));
    }

    static String reverse(String s){
        if (s == null) return null;
        else if (s.length() > 0){
            char curr = s.charAt(s.length() - 1);
            return curr + reverse(s.substring(0, s.length() - 1));
        } else return "";
    }
}
