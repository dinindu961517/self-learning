public class MatrixAddition {
    public static void addition(int[][] inputMatrix1, int[][] inputMatrix2) {
        int[][] resultMatrix = new int[inputMatrix1.length][inputMatrix1[0].length];

        for (int i = 0; i < inputMatrix1.length; i++) {
            for (int j = 0; j < inputMatrix1[0].length; j++) {
                resultMatrix[i][j] = inputMatrix1[i][j] + inputMatrix2[i][j];
                System.out.print(resultMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] inputMatrix1 = {{1,2,3},{4,5,6}};
        int[][] inputMatrix2 = {{1,2,3},{4,5,6}};
        addition(inputMatrix1,inputMatrix2);


    }
}
