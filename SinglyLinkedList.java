
/**
 * SinglyLinkedList
 */
public class SinglyLinkedList implements LinkedList {

    public Node head, tail;
    private int size = 0;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public void addFirst(Object inputData) {
        Node baru = new Node(inputData);
        if (isEmpty()) {
            head = baru;
            tail = baru;
            size++;
        } else {
            baru.pointer = head;
            head = baru;
            size++;
        }
    }

    public void addLast(Object inputData) {
        Node baru = new Node(inputData);
        if (isEmpty()) {
            head = baru;
            tail = baru;
            size++;
        } else {
            tail.pointer = baru;
            tail = baru;
            size++;
        }
    }

    public void addAfter(int index, Object inputData) {
        Node baru = new Node(inputData);
        Node C = head;
        for (int i = 0; i < index; i++) {
            C = C.pointer;
        }
        baru.pointer = C.pointer;
        C.pointer = baru;
        size++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.err.println("Linked list kosong");
        } else if (size == 1) {//else if(head==tail)
            head = null;
            tail = null;
            size--;
        } else {
            head = head.pointer;
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.err.println("Linked list kosong");
        } else if (size == 1) {//else if(head==tail)
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.pointer;
            }
            tail = temp;
            tail.pointer = null;
            size--;
        }
    }

    public void deleteAfter(int index) {
        if (isEmpty()) {
            System.err.println("Linked list kosong");
        } else if (size == 1) {//else if(head==tail)
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.pointer;
            }
            temp.pointer = temp.pointer.pointer;
            size--;
        }
    }

    public void print() {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println(currentNode.data);
            currentNode = currentNode.pointer;
        }
    }

    @Override
    public Object get(int index) {
        // TODO digunakan untuk mengembalikan data pada index ke-i dimulai dari head. Head memiliki index 0
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.pointer;
        }
        return current.data;
    }

    @Override
    public int indexOf(Object targetData) {
        // TODO digunakan mencari kemunculan pertama targetData pada linked list dan mengembalikan indeksnya. Indeks dari head adalah 0. Jika tidak ada targetData pada linked list, kembalikan nilai -1 
        Node current = head;
        for (int i = 0; i < size; i++) {
            // Memeriksa null safe equality
            if ((targetData == null && current.data == null)
                    || (targetData != null && targetData.equals(current.data))) {
                return i;
            }
            current = current.pointer;
        }
        return -1;
    }

    @Override
    public void printReverse() {
        // TODO digunakan untuk mencetak data pada linked list dengan urutan terbalik, dari tail ke head.
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        Object[] arr = toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public boolean remove(Object targetData) {
        // TODO digunakan untuk mencari dan menghapus node dengan data=targetData pada linked list serta mengembalikan nilai True jika berhasil, dan False jika targetData tidak ada di linkedList
        return false;
    }

    @Override
    public Object[] toArray() {
        // TODO digunakan untuk mendapatkan keseluruhan data pada node-node di linked list dalam bentuk array. Data-data pada array disusun secara urut mulai dari head sampai dengan tail.
        return null;
    }
}
