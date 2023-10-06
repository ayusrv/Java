public class StringQues {
    public static void main(String[] args) {
        String s = "Hell1o, 1th1e, fir2st1 t1e1st2t";
        String[] ch = s.split(" ");
        for (int i=0;i<ch.length;i++){
            int num=0;
            String cc = ch[i];
            for(int j=0;j<cc.length();j++){
                if(Character.isDigit(cc.charAt(i))){
                    num+=cc.charAt(i);
                }
            }

        }

    }
}
