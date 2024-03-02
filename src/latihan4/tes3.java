package latihan4;

public class tes3 {
    public static void main(String[] args) {
        StrukturList2 myList = new StrukturList2();

        // Tambah elemen 2.1 di awal list
        myList.addMid(2.1, 2);

        // Tambah elemen 3.4 di awal list
        myList.addHead(3.4);

        // Tambah elemen 1.1 di awal list
        myList.addMid(1.1,3);

        // Tambah elemen 5.5 di tengah list
        myList.addTail(5.5);

        // Tambah elemen 4.5 di tengah list
        myList.addMid(4.5, 4);

        // Tampilkan elemen list
        myList.displayElement(); // Output: 1.1 2.1 3.4 4.5 5.5
    }

}
