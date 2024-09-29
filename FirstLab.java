import java.util.Arrays;
import java.util.Random;

public class FirstLab {
    public static void main(String[] args){
        Random rand = new Random();
        short[] z = new short[14];
        for (short i = 0; i < 14; i++){
            z[i] = (short) (19 - i);
        }
        float[] x = new float[19];
        for (int i = 0; i < 19; i++){
            x[i] = rand.nextFloat(-5, 9);
            }
        double[][] z1 = new double[14][19];
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 19; j++){
                z1[i][j] = calculations(z[i], x[j]);
            }
        }
        print(z1);
    }
    static double calculations(short z, float x){
        short[] numbers = new short[]{6, 7, 8, 10, 11, 17, 19};
        if (z == 14){
            return Math.log(Math.pow(3*Math.sqrt(Math.abs(x)), Math.cbrt(Math.pow(x +  0.5, 2))));
        }
        else if (Arrays.binarySearch(numbers, z) == 1){
            return Math.log(Math.pow(Math.tan(Math.cos((x + 1) / x)), 2));
        }
        else{
            return Math.pow((((4/(Math.sin(Math.cos(x)))-1) / 3) / 4), 2);
        }
    }
    static void print(double[][] mas){
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 19; j++){
                System.out.printf("%-10.4f", mas[i][j]);
            }
            System.out.println();
        }
    }
}

