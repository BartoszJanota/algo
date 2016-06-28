/**
 * Created by bartoszjanota-prv on 28/02/16.
 */
public class RotateImage {

    static void rotate90Degrees(int[][] image){
        int N = image.length - 1;
        if (N <= 1) return;
        for(int i = 0; i < image.length / 2; ++i){
            for(int j = i; j < N - i; ++j){
                int tmp = image[i][j];
                image[i][j] = image[j][N-i];
                image[j][N-i] = image[N-i][N-j];
                image[N-i][N-j] = image[N-j][i];
                image[N-j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int[][] image5 = {{1,1,1,1,1},{2,2,2,2,2},{3,3,0,3,3},{4,4,4,4,4}, {5,5,5,5,5}};
        print(image5);
        rotate90Degrees(image5);
        print(image5);
    }

    private static void print(int[][] image) {
        System.out.println();
        for(int i = 0; i < image.length; ++i){
            for( int j = 0; j < image.length; ++j){
                System.out.print(String.valueOf(image[i][j]) + ' ');
            }
            System.out.println();
        }
    }
}
