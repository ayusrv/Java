import java.util.Scanner;

public class FaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String dn = sc.nextLine();
//        String dl = sc.nextLine();
//        String tn = sc.nextLine();
        int km = sc.nextInt();
        float fare=5000;
        if(km==0){
            System.out.println("Total fare is: "+fare);
            return;
        }
        else if(km>1000){
            fare+=km*10;
        } else if (km>100 && km<1000) {
            fare+=km*11;
        } else if (km>51 && km<101) {
            fare+=km*12;
        }
        else if(km>10 && km<51){
            fare+=km*14;
        }

        else{
            fare+=km*15;
        }
        fare*=1.18;
        fare*=1.12;
        System.out.println("Total fare is: "+fare);
    }
}
