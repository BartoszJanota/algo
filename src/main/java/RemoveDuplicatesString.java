/**
 * Created by bartoszjanota-prv on 27/02/16.
 */
public class RemoveDuplicatesString {

    public static void removeDuplicates(char [] chars){
        if (chars.length <= 1){
            return;
        }
        int mid = 1;
        for(int i = 1; i < chars.length; ++i){
            int j = 0;
            for(j = 0; j < mid; ++j){
                if (chars[j] == chars[i]){
                    break;
                }
            }
            if (j == mid){
                chars[mid] = chars[i];
                mid++;
            }
        }
        chars[mid] = 0;
    }

    public static void main(String[] args) {
        char [] chars = {'a', 'b', 'a', 'd', 'd', 'f'};

        removeDuplicates(chars);

        System.out.println(chars);
        System.out.println((char) 65);
    }
}
