import java.util.List;
import java.util.ArrayList;

public class ListStates {
    public static void main(String[] args){
        List<String> States = new ArrayList<>();
        States.add("Kerala");
        States.add("Goa");
        States.add("Pondicherry");
        States.add("Tamil nadu");
        for (String state : States) {
            System.out.println(state);
        }
    }
}
