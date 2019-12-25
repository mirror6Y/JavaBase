package cn.mirror6.source.collection.list.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mirror6
 * @description
 * @createTime 2019/12/25 15:46
 */
public class LinkedListTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("start testing");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("close testing");
    }

    @Test
    public void size() {
        System.out.println(new LinkedList<>().size);
    }

    @Test
    public void get() {
        System.out.println(new LinkedList<>().get(0));
    }

    @Test
    public void set() {
    }

    @Test
    public void add() {
    }

    @Test
    public void remove() {
    }
}