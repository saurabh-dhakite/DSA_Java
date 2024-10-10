import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 34, 6, 34, 8, 9, 0, 11};
//        int target = 314;
//        int index = LinearSearch(arr, target);
//        System.out.println(index);

        int[][] arr = {
                {11, 2, 21},
                {10, 5},
                {22, 45, 9, 12}
        };

        int target = 45;

        int[] ans = Search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int LinearSearch(int[] arr, int element){
        //Check the array length

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }

        return -1;
    }

    static int[] Search2D(int[][] arr, int target){
        if (arr.length == 0){
            return new int[] {-1, -1};
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
