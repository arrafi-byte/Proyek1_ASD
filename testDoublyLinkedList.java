
/**
 * testSinglyLinkedList
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3 > menghasilkan nilai 4 karena hasil linkedlist 6,5,4,3,2,1 akibat penggunaan addfirst
        System.out.println(linkedList.get(12)); //Terjadi exception error > null
        System.out.println(linkedList.indexOf(4));// menghasilkan 5 > menghasilkan 2 karena input addfirst
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1 > menghasilkan 1,2,3,4,5,6 karena input addfirst
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        Object[] data = linkedList.toArray();
        System.out.print("[");
        for (int i=0;i<data.length;i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("]");
        System.out.println(); //Menghasilkan [6,5,4,3,2,1]
    }
}
