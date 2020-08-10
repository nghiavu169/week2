import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private static class Node {
        private MyLinkedList.Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private MyLinkedList.Node head;
    private int numNodes = 1;

   public MyLinkedList() {}

    public void add(int index, E element) {
        MyLinkedList.Node temp = head;
        for(int i = 0; i < index - 1 && temp.next != null; ++i) {
            temp = temp.next;
        }
        MyLinkedList.Node holder = temp.next;
        temp.next = new MyLinkedList.Node(element);
        temp.next.next = holder;
        ++numNodes;
    }

    public void addFirst(E element) {
       head = new Node(element);
       numNodes ++;
    }

    public void addLast(E element) {
       if (head == null) {
           addFirst(element);
       }else {
           Node temp = head;
           while (temp.next != null) {
               temp = temp.next;
           }
           temp.next = new MyLinkedList.Node(element);
       }
       numNodes ++;
    }

    public E remove(int index) {
       if (index < 0 || index > numNodes) return null;
       MyLinkedList.Node temp = head;
       MyLinkedList.Node removed = temp.next;
       for (int i = 0; i < index - 1; i++) {
           temp.next = temp.next.next;
       }
       numNodes --;
       return (E) removed;
    }

//    public boolean remove(Object element) {
//
//    }

    public int getSize() {
       return numNodes;
    }

    public E clone() {
       return (E) new MyLinkedList<E>();
    }

    public boolean contains(E object) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp == object) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E object) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp == object) {
                return 
            }
        }
    }

    public void printList() {
        for(MyLinkedList.Node temp = this.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }

    }
}

