package Problems.Hash;
import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(1);
        hs.add(2);
        for(int n: hs){
            System.out.println(n);
        }
        System.out.println(hs.size());
        System.out.println(hs);
        hs.remove(1);
        System.out.println(hs);
    }
}
