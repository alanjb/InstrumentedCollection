package swe619.java;

import java.util.Collection;

public class InstrumentedCollection<E> extends ForwardingCollection<E> {
    private int addCount = 0;

    public InstrumentedCollection (Collection<E> s) {
        super(s);
    }

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
