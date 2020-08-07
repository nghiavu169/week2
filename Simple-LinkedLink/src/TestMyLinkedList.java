
public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(0);
        ll.add(1,1);
        ll.add(2,3);
        ll.add(3,4);
        ll.add(2,2);
        Object sss = ll.get(1);
        System.out.println(sss);
        ll.printList();

    }
}
