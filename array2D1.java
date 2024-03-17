public class array2D1 {
    public static void main(String[] args) {
        // int [][]arr=new int[1][2];
        // int[][] arr1=new int[2][5];
        // int arr2[][]=new int[5][5];
        // int []arr3[]=new int[2][5];
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 2, 4, 6, 8, 10 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

}
