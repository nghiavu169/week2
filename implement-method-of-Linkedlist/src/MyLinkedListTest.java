public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList<>();
        list.addFirst(1);
        list.add(2,2);
        list.add(3,3);
        list.remove(2);
        //list.remove();
        list.printList();
    }
}
