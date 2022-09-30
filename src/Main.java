public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        int var1;
        var1 = 5;

        int var2;
        var2 = 6;

        System.out.println("The result is: " + (var1 + var2));
        
        /* Just Testing to see if it works properly */
        double[] arr = {1,2,3};

        System.out.println("Result: " + sum( arr ));

    }

    public static double sum(double[] args){

        double result;

        result = 0;
        for (double arg : args) {
            result += arg;
        }

        return result;
    }


}
