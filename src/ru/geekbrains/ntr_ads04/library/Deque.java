package ru.geekbrains.ntr_ads04.library;

public interface Deque<E> {
    void addFirst(E obj);

    void addLast(E obj);

    E getFirst();

    E getLast();

    boolean offerFirst(E obj);

    boolean offerLast(E obj);

    E peekFirst();

    E peekLast();

    E pollFirst();

    E pollLast();

    E pop();

    void push(E element);

    E removeFirst();

    E removeLast();

    boolean removeFirstOccurrence(E obj);

    boolean removeLastOccurrence(E obj);
}
