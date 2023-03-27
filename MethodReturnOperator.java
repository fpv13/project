public class MethodReturnOperator {
        public static void main(String[] args) {
    long a = 3;
    long b = cube(a);
    System.out.println(b);
    long c = ninthDegree(3);
            System.out.println(c);
    }

        public static long cube(long a){
        return a*a*a;
    }

        //напишите тут ваш код
        public static long ninthDegree(long b){

        return cube(cube(b));
    }
    }


