package Problems.LinkList;

public class InnerLList {

    public static LList newNode(LList node,int x){
        LList newHead = new LList(x);
        newHead.next = node;
        return newHead;
    }
    public static void printnode(LList node){
        while(node!=null){
            System.out.println(node.data);
                node = node.next;
        }
    }
    public static void main(String[] args) {
        LList node= new LList(10);
        node.next = new LList(20);
        node.next.next = new LList(30);
        node.next.next.next = new LList(40);

        printnode(node);
         System.out.println("null");
        node = newNode(node,5);
        printnode(node);
 }
}
    
