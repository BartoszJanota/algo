/**
 * Created by bartoszjanota-prv on 28/02/16.
 */
public class Anagrams {

    static boolean areAnagrams(String s1, String s2){
        if (s1 == null || s1 == null) return false;
        if (s1.length() != s2.length()) return false;
//(int) ‘A’ == 65; (int) ‘a’ == 97;
        int [] chars = new int[56];
        for (int i = 0; i < s1.length(); ++i){
            chars[s1.charAt(i) - 65]++;
        }
        for (int i = 0; i < s2.length(); ++i){
            if(--chars[s2.charAt(i) - 65] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "BarteK";
        String s2 = "treBKa";
        String s3 = "abcdse";
        String s4 = "sdf";


        System.out.println(areAnagrams(s1, s2));
        System.out.println(areAnagrams(s1, s3));
        System.out.println(areAnagrams(s1, s4));
    }
}
