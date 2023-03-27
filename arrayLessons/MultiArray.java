package arrayLessons;

import java.util.Scanner;

public class MultiArray {

    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int [n][];
        for (int i = 0; i < multiArray.length; i++){
            int t = sc.nextInt();
            multiArray[i] = new int[t];
        }
    }
}

