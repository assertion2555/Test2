public class constructor {
    public static void main(String[] args) {
        int[]x ={10,50};
        System.out.println(x);
        Demo demo=new Demo();
        int n =demo.i;
        int[][] twoDarray=new int[2][4];
        twoDarray[1][2]=34;
        twoDarray[0][3]=64;
        for (int i=0; i<twoDarray.length;i++){
            for (int j=0; j<twoDarray[0].length;j++){
                System.out.print(twoDarray[i][j] + " ");
            }
            System.out.println();

    }
    }
}
class Demo{
int i=10;
}