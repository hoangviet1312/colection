import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(2);
        listInteger.add(6);
        listInteger.add(4);
        listInteger.add(5);

        listInteger.remove(5);

        listInteger.printList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);


//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
    }
}
