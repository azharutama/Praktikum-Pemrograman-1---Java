package latihan5;

public class tesRemoveTail {
    public static void main(String[] args) {
        StrukturList2 myList = new StrukturList2();

       
            myList.addTail(2);
            myList.addTail(6);
            myList.addTail(3);
            myList.addTail(5);
            myList.addTail(1);;
            myList.displayElement();
            System.out.println("");
            myList.removeTail();
            myList.displayElement();
            System.out.println("");
            myList.removehead();
            myList.displayElement();
    }

}
