public class WiproQ {
    public static void main(String[] args) {
        int d = 37;
        int a = 3521;
        int b = 2452;
        int c = 1352;
//        System.out.println(f(a, b, c, d));
        System.out.println(solve("AAAA", "aaaa", 561327, 2));
    }

    private static int f(int a, int b, int c, int d){
        a= rev(a);
        b = rev(b);
        c = rev(c);
        int e1 = getSum(a) + getSum(b) + getSum(c) ;
        int d1 = getDiff(a) + getDiff(b) + getDiff(c);
        return d%2==0?e1-d1:d1-e1;
    }

    private static int rev(int a){
        int num=0;
        while(a>0){
            int rem = a%10;
            num = num*10 + rem;
            a/=10;
        }
        return num;
    }

    private static int getSum(int a){
        int sum=0;
        int pos=0;
        while(a>0){
            if(pos%2==0) sum += a%10;
            pos++;
            a/=10;
        }
        return sum;
    }

    private static int getDiff(int a){
        int sum=0;
        int pos=0;
        while(a>0){
            if(pos%2!=0) sum += a%10;
            pos++;
            a/=10;
        }
        return sum;
    }

    public static String solve(String input1, String input2, int input3, int input4){
        int a = input1.length();
        int b = input2.length();
        String ans = "";
        int dig = countDig(input3);
        int x=input3;
        int v=dig-input4;
        while(v > 0){
            x/=10;
            v--;
        }
        while(input4>1){
            input3/=10;
            input4--;
        }
        if(a>b){
            ans = input2.charAt(0) + input1+ (x%10+"")+ (input3%10+"");
        }
        else if(b>a){
            ans = input1.charAt(0) + input2+ (x%10+"")+ (input3%10+"");
        }
        else{
            for (int i = 0; i < a; i++) {
                if(input1.charAt(i)<input2.charAt(i)){
                    ans = input1.charAt(0) + input2+ (x%10+"")+ (input3%10+"");
                    break;
                }
                else if(input2.charAt(i)<input1.charAt(i)){
                    ans = input2.charAt(0) + input1+ (x%10+"")+ (input3%10+"");
                    break;
                }
            }
        }
        StringBuilder aa = new StringBuilder();
        for (int i = 0; i < ans.length(); i++) {
            if(Character.isUpperCase(ans.charAt(i))){
                aa.append(Character.toLowerCase(ans.charAt(i)));
            }
            else if(Character.isLowerCase(ans.charAt(i))){
                aa.append(Character.toUpperCase(ans.charAt(i)));
            }
            else{
                aa.append(ans.charAt(i));
            }
        }
        return aa.toString();
    }

    private static int countDig(int a){
        int c=0;
        while(a>0){
            a/=10;
            c++;
        }
        return c;
    }


}
