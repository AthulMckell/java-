package Problems.Hash;
import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<Integer,String>();

        hm1.put("Athul", 1);
        hm1.put("Abhipsa", 2);
        
        hm2.put(1, "Me");
        hm2.put(2, "Her");

        System.out.println(hm1);
        System.out.println(hm2);

        for (Map.Entry<String,Integer> e : hm1.entrySet()) {
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
        }
    }
}
