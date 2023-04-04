import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convert(s));
    }

    public static int convert(String s){
        int a=0;
        boolean flag = false;
        if(!(s.charAt(0)==' ' || s.charAt(0)=='0' || s.charAt(0)=='1' || s.charAt(0)=='2' ||s.charAt(0)=='3' ||s.charAt(0)=='4' ||s.charAt(0)=='5' ||s.charAt(0)=='6' ||s.charAt(0)=='7' ||s.charAt(0)=='8' ||s.charAt(0)=='9')){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='-'){
                flag = true;
            }
            else if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' ||s.charAt(i)=='3' ||s.charAt(i)=='4' ||s.charAt(i)=='5' ||s.charAt(i)=='6' ||s.charAt(i)=='7' ||s.charAt(i)=='8' ||s.charAt(i)=='9'){
                a = a*10+(s.charAt(i));
            }
            else if(s.charAt(i)==' '){
                continue;
            }
            else{
                break;
            }
        }
        if(flag){
            return a;
        }
        else {
            return a * -1;
        }
    }
}
