

    public class Caculator {
        public static double sum (double n1, double n2) {
            return n1+n2;
        }

        public static double avr (double n3, double n4){
            return (n3+n4)/2;
        }

        public static double product (double n5, double n6){
            return n5*n6;
        }

        public static int factorial (int a){
            int result=1;
            while (a>1){
                result=result*a;
                a--;
            }
            return result;
        }
        public static double sum(double [] numArr1) {
            double result = 0;
            for(int i = 0; i < numArr1.length; i++) {
                result = result + numArr1[i];
            }
            return result;
        }
        public static double average(double [] numArr1) {
            double result = (Caculator.sum(numArr1) / (numArr1.length));
            return result;
        }
        public static double multiply(double [] numArr1) {
            double result = 1;
            for(int i = 0; i < numArr1.length; i++) {
                result = result * numArr1[i];
            }
            return result;
        }
    }


