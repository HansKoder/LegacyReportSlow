package org.heao.demo.accounting_report_cli.util;

import java.util.List;

public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> current;

    public CircularLinkedList(List<T> items) {
        if (items == null || items.isEmpty()) throw new IllegalArgumentException("Empty list");
        Node<T> prev = null;
        for (T item : items) {
            Node<T> node = new Node<>(item);
            if (head == null) head = node;
            if (prev != null) prev.next = node;
            prev = node;
        }
        prev.next = head;
        current = head;
    }

    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }
}