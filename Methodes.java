import java.util.Arrays;

public class Methodes {
    public static void main(String[] args) {


            int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            printArray(array);
            reverseArray(array);
            printArray(array);
        }

        public static void reverseArray(int[] array) {
            //напишите тут ваш код
            int[] array2 = Arrays.copyOf(array,array.length);
            int j = 0;
            for(int i=(array.length-1);i>=0;i--){
                array[i]=array2[j];
                j++;
            }
        }

        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }

    }
