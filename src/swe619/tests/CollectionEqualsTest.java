package swe619.tests;

import org.junit.Test;
import swe619.java.InstrumentedCollection;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionEqualsTest {

    @Test
    public void testCollectionEquals(){
        Collection<String> list = new ArrayList<>();
        InstrumentedCollection<String> col = new InstrumentedCollection<>(list);
        col.add("one");
        col.add("two");
        col.add("three");

        Collection<String> list1 = new ArrayList<>();
        InstrumentedCollection<String> col1 = new InstrumentedCollection<>(list1);
        col1.add("four");
        col1.add("five");
        col1.add("six");

        for(String x : col){
            System.out.println(x);
        }

        for(String x : col1){
            System.out.println(x);
        }

//        assertNotEquals(col, col);
        assertNotEquals(col, col1);
        assertNotEquals(col1, col);
    }

    @Test
    public void testCollectionEquals2(){
        Collection<String> list = new ArrayList<>();
        Collection<String> set = new HashSet<>();

        InstrumentedCollection<String> col = new InstrumentedCollection<>(list);
        col.add("one");
        col.add("two");
        col.add("three");

        InstrumentedCollection<String> col1 = new InstrumentedCollection<>(set);
        col1.add("one");
        col1.add("two");
        col1.add("three");

        assertNotEquals(col, col1);
    }
}
