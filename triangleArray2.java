public class triangleArray2 {



        public static int[][] result = new int[10][];

        public static void main(String[] args) {
            //напишите тут ваш код
            for (int i = 0; i < result.length; i++) {
                result[i] = new int[i + 1];
                for (int j = 0; j < result[i].length; j++){
                    result[i][j] = i+j;
                    System.out.print(result[i][j]+" " );
                }
                System.out.println();

            }
            System.out.println("ALL GOOD i change email");
        }
    }


