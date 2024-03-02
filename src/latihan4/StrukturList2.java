package latihan4;

public class StrukturList2 {
    private Node HEAD;

    public StrukturList2() {
        this.HEAD = null; // Menginisialisasi HEAD dengan null
    }

    public void addHead(double data) {
        Node newNode = new Node(data); // Buat node baru dengan data yang diberikan

        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, node baru menjadi kepala
        } else {
            newNode.setNext(HEAD); // Atur node berikutnya dari node baru sebagai HEAD yang sekarang
            HEAD = newNode; // Atur node baru sebagai HEAD
        }
    }

    public void addMid(double data, int position) {

        //deklarasi variable
        Node newNode = new Node(data);
        Node posNode = null;
        Node curNode = HEAD;
        int i = 1;

        // Jika linked list kosong atau position adalah 1
        if (HEAD == null || position == 1) {
            newNode.setNext(HEAD); // Menetapkan node berikutnya dari newNode menjadi HEAD yang sekarang
            HEAD = newNode; // Menetapkan HEAD sebagai newNode
        } else {
            // Jika linked list tidak kosong dan position bukan di awal
            while (curNode != null && i < position) {
                posNode = curNode; // Menetapkan node saat ini sebagai posNode
                curNode = curNode.getNext(); // Maju ke node berikutnya
                i++; // Menambahkan nilai i untuk menghitung posisi saat ini
            }

            posNode.setNext(newNode); // Menetapkan node berikutnya dari posNode sebagai newNode
            newNode.setNext(curNode); // Menetapkan node berikutnya dari newNode sebagai curNode
        }
    }
    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;

            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            curNode.setNext(newNode);
        }
    }

    private boolean isEmpty() {
        return HEAD == null;
    }

    public void displayElement() {
        Node curNode = HEAD;

        while (curNode != null) {
            System.out.print(curNode.getData() + " "); // Menambahkan spasi setelah setiap elemen
            curNode = curNode.getNext();
        }
    }
}
