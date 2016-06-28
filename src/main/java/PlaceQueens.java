/**
 * Created by bartoszjanota-prv on 05/03/16.
 */
public class PlaceQueens {
    public static void main(String[] args) {
        placeQueens(new int[8], 0);
    }

    static void placeQueens(int [] columnForRow, int row){
        if(row == 8) {
            print(columnForRow);
            return;
        } else {
            for (int i = 0; i < 8; ++i){
                columnForRow[row] = i;
                if (isAvailable(columnForRow, row)){
                    placeQueens(columnForRow, row + 1);
                }
            }
        }
    }

    private static void print(int[] columnForRow) {
        System.out.println("Board:");
        for(int i = 0; i < 8; ++i){
            char [] chars = {'_','_','_','_','_','_','_','_',};
            chars[columnForRow[i]] = '*';
            System.out.println(chars);
        }
    }

    static boolean isAvailable(int [] columnForRow, int row){
        for(int i = 0; i < row; ++i){
            if (i != row){
                int diff = Math.abs(columnForRow[i] - columnForRow[row]);
                if (diff == 0 || diff == Math.abs(i - row)){
                    return false;
                }
            }
        }
        return true;
    }
}
