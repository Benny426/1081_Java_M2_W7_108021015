import java.util.*;
public class M2Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        float MaxVal = v1;
        float MinVal = v1;
        for (int i = 1; i < 10; i++) {
            v1 = scn.nextFloat();
            if (MaxVal < v1) {
                MaxVal = v1;
            } else if ( MinVal > v1){
                MinVal = v1;
            }
        }
        System.out.printf("Max=%.2f\n",MaxVal);
        System.out.printf("Min%.2f\n",MinVal);
    }
}