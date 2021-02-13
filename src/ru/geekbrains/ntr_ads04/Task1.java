package ru.geekbrains.ntr_ads04;

import ru.geekbrains.ntr_ads04.library.LinkedList;
import ru.geekbrains.ntr_ads04.library.SimpleLinkedListImpl;

public class Task1 {
    public static void main(String[] args) {

        //SimpleLinkedListImpl
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.display(); //[1, 2, 3, 4, 5]
        System.out.println(linkedList.getFirst()); //1
        System.out.println(linkedList.contains(3)); //true
        linkedList.remove(2);
        System.out.println(linkedList.contains(2)); //false
        linkedList.removeFirst();
        linkedList.display(); //[3, 4, 5]


    }
}
