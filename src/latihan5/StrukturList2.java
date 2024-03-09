package latihan5;

import latihan.Node;

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

    public void removehead(){
        if(isEmpty()){
            System.out.println("list kosong");
        }else{
            Node temp =  HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
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

    public void removeMid(double e) {
        Node preNode = null;
        Node tempNode = HEAD;

        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            boolean ketemu = false;

            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                }
            }

            if (ketemu) {
                if (preNode == null) { // Jika node yang akan dihapus berada di HEAD
                    HEAD = tempNode.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
                }
                dispose(tempNode);
            } else {
                System.out.println("Elemen tidak ditemukan");
            }
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

    public void removeTail(){

        Node preNode = null;
        Node lastNode = null;

        if (HEAD != null){
            if(HEAD.getNext() == null){
                HEAD = null;
            }else{
                lastNode=HEAD;
                while(lastNode.getNext() != null){
                    preNode =lastNode;
                    lastNode= preNode.getNext();
                }


                preNode.setNext(null);
                dispose(lastNode);
            }
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
