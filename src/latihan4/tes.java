package latihan4;

public class tes {


    public static void main(String[] args) {

        StrukturList2 myList = new StrukturList2();

                // Tambah elemen 3 di akhir list
                myList.addTail(3);

                // Tambah elemen 4 di akhir list
                myList.addTail(4);

                // Tambah elemen 7 di index 2
                myList.addMid(7, 2);

                // Tambah elemen 8 di index 2
                myList.addMid(8, 2);

                // Tambah elemen 5 di awal list
                myList.addHead(5);

                // Tampilkan elemen list
                myList.displayElement();
            }
        }
