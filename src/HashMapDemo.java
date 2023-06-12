import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println(map.isEmpty());
           map.put(1,"krishna");
           map.put(2,"vinita");
           map.put(3,"eva");
           map.put(4,"mona");

           System.out.println(map);

           for(Integer i: map.keySet()) {
               System.out.println("keys is : " +i);

           }
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }

}
