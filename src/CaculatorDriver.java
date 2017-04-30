
public class CaculatorDriver {

    public static void main(String[] args) {
        System.out.println(Caculator.sum(3.3, 5.5));
        System.out.println(Caculator.avr(1.5, 4.3));
        System.out.println(Caculator.product(2.5, 5.6));
        System.out.println(Caculator.factorial(5));

        double [] sumArr = {12.3, 4, 34, 9.11, 7, 3.5, 2.6, 6.9};

        System.out.println( Caculator.sum(sumArr));

        System.out.println(Caculator.average(sumArr));

        System.out.println( Caculator.multiply(sumArr));
    }

}

