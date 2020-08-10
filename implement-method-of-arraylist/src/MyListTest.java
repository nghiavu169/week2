public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> listing = new MyList<>();
        listing.add(0,1);
        listing.add(1,2);
        listing.add(2,"A");
        listing.add(3,"B");
        //listing.clear();
        //listing.ensureCapacity(15);
        //System.out.println(listing.indexOf("A"));
        //System.out.println(listing.get(1));
        listing.remove(0);
        System.out.println(listing.toString());

    }
}
