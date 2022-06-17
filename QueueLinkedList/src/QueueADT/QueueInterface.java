/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueADT;

/**
 *
 * @author Poten
 */
public interface QueueInterface<T>
{
    public void enqueue(T element);
    public T dequeue();
    public T first();
    public boolean isEmpty();
    public int size();
}
