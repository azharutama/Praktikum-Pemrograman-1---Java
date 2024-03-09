package latihan5;

public class tesRemoveMid {

    public static void main(String[] args) {
        StrukturList2 myList = new StrukturList2();

        // Tambah elemen 5.5 di tengah list
        // Menambahkan beberapa elemen ke linked list
        myList.addTail(2);
        myList.addTail(6);
        myList.addTail(3);
        myList.addTail(5);
        myList.addTail(1);
      

       
        myList.displayElement();
        System.out.println();

        // Menghapus elemen tengah dengan nilai 3.0
        myList.removeMid(3);

        // Menampilkan elemen-elemen dalam linked list setelah penghapusanSystem.out.print("Elemen dalam linked list setelah penghapusan: ");
        myList.displayElement();
        System.out.println();


        // Tambah elemen 5.5 di tengah list




    }

}


