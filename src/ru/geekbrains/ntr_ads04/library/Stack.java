package ru.geekbrains.ntr_ads04.library;

public interface Stack<E> {

    void push(E value);

    E pop();

    E peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}
