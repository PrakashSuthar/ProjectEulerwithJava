import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumMultiplesOfThreeAndFive{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long div3=(n-1)/3;
            long div5=(n-1)/5;
            long div15=(n-1)/15;
            long sum3=0,sum5=0,sum15=0;
            if(div3==1){
                sum3=3;
            }
            else
                sum3=((3+3*div3)*div3)/2;
            if(div5==1){
                sum5=5;
            }
            else
                sum5=((5+5*div5)*div5)/2;
            if(div15==1){
                sum15=15;
            }
            else
                sum15=((15+15*div15)*div15)/2;
            long sum_of_3_5prime=sum3+sum5-sum15;
            System.out.println(sum_of_3_5prime);
        }//end of for loop
    }
}
