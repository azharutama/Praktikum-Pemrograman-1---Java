package latihan5;

public class tesRemoveHead {


        public static void main(String[] args) {
            StrukturList2 myList = new StrukturList2();

            // Tambah elemen 7 di awal list
            myList.addTail(7);

            // Tambah elemen 9
            myList.addTail(9);

            // Tambah elemen 2 di akhir list
            myList.addTail(2);

            // Tampilkan elemen list
            myList.displayElement();
            // Output: 
            System.out.println("");
            myList.removehead();
            myList.displayElement();
        }
    }

