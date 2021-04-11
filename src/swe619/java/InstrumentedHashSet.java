package swe619.java;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0; //2
    public InstrumentedHashSet() {}

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        // What to do with addCount?
        addCount += c.size(); //c.size == 2
        return super.addAll(c); //super.addAll(c) is from HashSet. Don't know impl of addAll -- addAll calls all() twice
        //dynamic dispatch --
    }
    public int getAddCount(){ return addCount; }
}
