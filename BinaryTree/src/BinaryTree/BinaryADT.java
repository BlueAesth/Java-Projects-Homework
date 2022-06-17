/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Iterator;

/**
 *
 * @author Poten
 */
public interface BinaryADT <T>
{
    public T getRootElement();
    public boolean isEmpty();
    public int size();
    public boolean contains(T target);
    public int find(T target);
    public Iterator<T> iterator();
    public Iterator<T> iteratorInOrder();
    public Iterator<T> iteratorPreOrder();
    public Iterator<T> iteratorPostOrder();
}
