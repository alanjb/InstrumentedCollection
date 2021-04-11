package swe619.java;
import java.util.Collection;
import java.util.Iterator;

public class ForwardingCollection<E> implements Collection<E> {

    private final Collection<E> s;

    public ForwardingCollection(Collection<E> s){
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

//    @Override
//    public  boolean equals(Object o){
//        System.out.println(s.getClass());
//        return s.equals(o);
//    }

    @Override
    public int hashCode(){
        return s.hashCode();
    }

    @Override
    public String toString(){
        return s.toString();
    }
}