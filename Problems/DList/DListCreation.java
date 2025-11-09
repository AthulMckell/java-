package Problems.DList;

public class DListCreation {
    public static void main(String[] args) {
        Dlist head = new Dlist(1);
        head.next = new Dlist(2);
        head.prev = head;
        head.next.next = new Dlist(3);
        head.next.prev = head.next;

        Dlist temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
