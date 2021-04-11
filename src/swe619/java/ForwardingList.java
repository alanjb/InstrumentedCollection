package swe619.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardingList<E> implements List<E> {

    private final List<E> s;

    public ForwardingList(List<E> s){
        this.s = s;
    }

    public void clear(){
        s.clear();
    }

    public boolean contains(Object o){
        return s.contains(o);
    }

    public boolean isEmpty(){
        return s.isEmpty();
    }

    public int size(){
        return s.size();
    }

    public Iterator<E> iterator(){
        return s.iterator();
    }

    public boolean add(E e){
        return s.add(e);
    }

    public boolean remove(Object o){
        return s.remove(o);
    }

    public boolean containsAll(Collection<?> c){
        return s.containsAll(c);
    }

    public boolean addAll(Collection<? extends E> c){
        return s.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c){
        return s.removeAll(c);
    }

    public boolean retainAll(Collection<?> c){
        return s.retainAll(c);
    }

    public Object[] toArray(){
        return s.toArray();
    }

    public <T> T[] toArray(T[] a){
        return s.toArray(a);
    }

    @Override
    public  boolean equals(Object o){
        return s.equals(o);
    }

    @Override
    public int hashCode(){
        return s.hashCode();
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString(){
        return s.toString();
    }
}