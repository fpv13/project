package arrayLessons;

public class triangleArray {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[10];

        array[1] = new int[50];

        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}