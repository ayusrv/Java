import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class boxes{
    int no_of_box;
    int box_per_unit;
    public boxes(int no_of_box,int box_per_unit){
        this.no_of_box=no_of_box;
        this.box_per_unit=box_per_unit;
    }
}
class mycompareforboxes implements Comparator<boxes> {
    public int compare(boxes item1,boxes item2){
        if(item1.box_per_unit<item2.box_per_unit) {return 1;}
        if(item1.box_per_unit>item2.box_per_unit) {return -1;}
        else return 0;
    }
}
public class MaximumUnitOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int no_of_box[] = new int[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++) {
            no_of_box[i] = boxTypes[i][0];
        }
        int unit_per_box[] = new int[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++) {
            unit_per_box[i] = boxTypes[i][1];
        }
        ArrayList<boxes> list=new ArrayList<>();
        for (int i = 0; i <unit_per_box.length ; i++) {
            list.add(new boxes(no_of_box[i],unit_per_box[i] ));
        }
        mycompareforboxes mc_for_boxes=new mycompareforboxes();
        Collections.sort(list,mc_for_boxes);

        int total=0;

        for (int i = 0; i <list.size() ; i++) {
            int box_number=list.get(i).no_of_box;
            int box_per_unit=list.get(i).box_per_unit;
//            System.out.println(truckSize);
            if(truckSize-box_number>=0){
                truckSize=truckSize-box_number;
                total=total+box_per_unit*box_number;
            }
            else {
                if(box_number-truckSize>=0){
                    total=total +truckSize*box_per_unit;
                    truckSize=truckSize-truckSize;
                }
            }
        }
        return total;
    }
}