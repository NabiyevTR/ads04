package ru.geekbrains.ntr_ads04;

import ru.geekbrains.ntr_ads04.library.iterator.LinkIterator;
import ru.geekbrains.ntr_ads04.library.iterator.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);
        itr.insertBefore("Anna", 15);
        itr.insertAfter("Svetlana", 23);
        itr.insertBefore("Prokhor", 90);

        list.display();

        System.out.println(itr.getCurrent());
        System.out.println("----------------------------------------");

        itr.reset();

        System.out.println(itr.getCurrent());
        System.out.println("----------------------------------------");

        itr.nextLink();

        System.out.println(itr.getCurrent());
        System.out.println("----------------------------------------");

        itr.atEnd();

        System.out.println(itr.getCurrent());
        System.out.println("----------------------------------------");

        itr.deleteCurrent();

        list.display();

    }
}
