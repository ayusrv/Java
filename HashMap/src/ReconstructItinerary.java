//https://leetcode.com/problems/reconstruct-itinerary/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReconstructItinerary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> tickets= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> s = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                s.add(sc.next());
            }
            tickets.add(s);
        }
        // [[Chennai, Bangalore], [Bombay, Delhi], [Goa, Chennai], [Delhi, Goa]]
        System.out.println(findItinerary(tickets));

    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        List<String> ans = new ArrayList<String>();
        HashMap<String, String> hm = new HashMap<>();
        int si = tickets.size();

        //Put every value in hashmap as a key value the source is the key and the destination is the value
        for (int i = 0; i < si; i++) {
            hm.put(tickets.get(i).get(0), tickets.get(i).get(1));
        }

        //hm-> {Chennai, Bangalore},{Bombay, Delhi},{Goa, Chennai},{Delhi,Goa}

        //Make a boolean variable to make destination false and get the source value
        HashMap<String, Boolean> map = new HashMap<>();
        for(String src:hm.keySet()){
            //making all the destination false and putting it inot the map
            String des = hm.get(src);
            map.put(des,false);

            //check if the source is already false and not in the destination then make it true
            if(!map.containsKey(src)){
                map.put(src,true);
            }
        }

        //map -> {Chennai, false}, {Bangalore, false}, {Bombay, true}, {Delhi, false}, {Goa, false}

        String src="";
        for(String ss: map.keySet()){

            //if the boolean value is true for the data it means it is the source the src as the ss
            if(map.get(ss)){
                src = ss;
                break;
            }
        }

        while(true){

            //making the destination as source and printing the value every time we get the destination of that source and adding it to the ans list
            if(hm.containsKey(src)){
                ans.add(src);
                src = hm.get(src);
            }

            //Bombay-> Delhi-> Goa-> Chennai-> Bangalore 

            //if there will be no source then break the loop
            else {
                break;
            }
        }
        return ans;
    }

}