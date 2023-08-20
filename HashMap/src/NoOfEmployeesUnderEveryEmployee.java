import java.util.HashMap;
import java.util.HashSet;

public class NoOfEmployeesUnderEveryEmployee {
    public static void main(String[] args) {

    }

    public static void findCount(HashMap<String, String> map){
        HashMap<String, HashSet<String>> tree = new HashMap<>();
        String ceo="";
        for(String emp: map.keySet()){
            String man = map.get(emp);
            if(man.equals(emp)){
                ceo = man;
            }
            else{
                if(tree.containsKey(man)){
                    HashSet<String> emps = tree.get(man);
                    emps.add(emp);
                }
                else{
                    HashSet<String> emps = new HashSet<>();
                    emps.add(emp);
                    tree.put(man, emps);
                }
            }
        }
    }
}
