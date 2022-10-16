import java.util.Arrays;

public class Arrayconcept {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40};
        int[] y = new int[4];
        System.out.println(Arrays.toString(x));
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println("print an Array using for-loop");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
       //for-each loop
        System.out.println("Print the for-each loop");
        for (int i: x){

            System.out.println(i);
        }
        //2-D Array
    }
}
