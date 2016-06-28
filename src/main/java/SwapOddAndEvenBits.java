/**
 * Created by bartoszjanota-prv on 04/03/16.
 */
public class SwapOddAndEvenBits {
    public static void main(String[] args) {
        int a = 13;
        System.out.println(Integer.toBinaryString(a));
        a = swapBits(a);
        System.out.println(Integer.toBinaryString(a));
    }

    static int swapBits(int a){
        int evenMask = 0xAAAAAAAA;
        int oddMask = 0x55555555;
        return ((a & evenMask) >> 1) | ((a & oddMask) << 1);

    }
}
