import java.util.LinkedList;

public class LinkedListOperationUsingCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.addFirst("am");
        link.addFirst("I");
        link.addLast("The");
        link.addLast("Best");
        link.removeFirst();
        link.removeLast();
        link.add(2,"hey");
        link.remove(2);


        System.out.println(link.get(1));

        for(String s: link)
        {
            System.out.print(s + " --> ");
        }
        System.out.println("null");
    }
}
