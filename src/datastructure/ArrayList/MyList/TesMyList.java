package datastructure.ArrayList.MyList;

import datastructure.ArrayList.MyList.MyList;

public class TesMyList {
    public static void main(String[] args) {
        MyList myList = new MyList();

        myList.add(1);
        myList.add("A");
        myList.add(true);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

        myList.get(5);
        System.out.println(myList.get(5));

        myList.get(-1);
        System.out.println(myList.get(-1));
    }
}
