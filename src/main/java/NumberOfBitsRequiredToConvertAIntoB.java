/**
 * Created by bartoszjanota-prv on 03/03/16.
 */
public class NumberOfBitsRequiredToConvertAIntoB {
    public static void main(String[] args) {
        System.out.println(howManyBitsAreRequired(31,14));
        System.out.println(howManyBitsAreRequiredShort(31,14));
        System.out.println(howManyBitsAreRequired(1232,345));
        System.out.println(howManyBitsAreRequiredShort(1232,345));
    }

    static int howManyBitsAreRequired(int a, int b){
        int counter = 0;
        while (a != 0 || b !=0){
            counter += (a & 1) ^ (b & 1);
            a >>= 1;
            b >>= 1;
        }
        while(a!=0){
            counter++;
            a >>= 1;
        }
        while(b!=0){
            counter++;
            b >>= 1;
        }
        return counter;
    }

    static int howManyBitsAreRequiredShort(int a, int b){
        int xor = a ^ b;
        int counter = 0;
        while(xor != 0){
            counter += xor & 1;
            xor >>= 1;
        }
        return counter;
    }

}
