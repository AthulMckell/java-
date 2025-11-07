package Problems.LinkList;

public class InnerLList {
    public static void main(String[] args) {
        LList node= new LList(10);
        node.next = new LList(20);
        node.next.next = new LList(30);
        node.next.next.next = new LList(40);

        while (node!=null) {
            System.out.println(node.data+" ");
            node = node.next;            
        }
    }
    
}
