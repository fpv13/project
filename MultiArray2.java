public class MultiArray2 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < multiArray.length; i++)
        {
//            System.out.println(multiArray[i]);
            for (int j = 0; j < multiArray[i].length; j++)
            {
//                System.out.println(multiArray[i][j]);
                for (int k = 0; k < multiArray[i][j].length; k++)
                    System.out.println(multiArray[i][j][k]);
            }
        }
    }
}