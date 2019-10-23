import java.sql.SQLOutput;
import java.util.*;
public class M2Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int m = n/2;
        boolean flog =true;
        for(int i =2;i<=m;i++){
            if (n%i==0){
                flog =false;
            }
        }
        if (flog){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}