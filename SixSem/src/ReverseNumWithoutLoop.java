//Reverse a number without using Loop or Array or recursion
//Digit is provided
import java.util.Scanner;

public class ReverseNumWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b,c,d,e,f,g,sum,rev;

        a = n%10;
        n/=10;
        b = n%10;
        n/=10;
        c = n%10;
        n/=10;
        d = n%10;
        n/=10;
        e = n%10;
        n/=10;
        f = n%10;
        n/=10;
        g = n%10;
        sum = a+b+c+d+e+f+g;
        rev = a*1000000 + b*100000 + c*10000 + d*1000 + e*100 + f*10 + g;
        System.out.println(sum+" "+rev);
    }

}
