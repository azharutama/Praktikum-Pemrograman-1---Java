package latihan4;

public class tes2 {


        public static void main(String[] args) {
            StrukturList2 myList = new StrukturList2();

            // Tambah elemen 2.1 di awal list
            myList.addHead(2.1);

            // Tambah elemen 3.4
            myList.addMid(3.4, 2);

            // Tambah elemen 4.5 di akhir list
            myList.addTail(4.5);

            // Tampilkan elemen list
            myList.displayElement(); // Output: 2.1 3.4 4.5
        }
    }

