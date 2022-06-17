package QueueADT;
import linkedlistadt.LinkedListADT;

/**
 * Look at LinkedListADT
 * @author Poten
 */
public class QueueADT<T> implements QueueInterface <T>
{
    private LinkedListADT<T> queue;
    
    public QueueADT()
    {
        queue = new LinkedListADT<T>();        
    }

    @Override
    public void enqueue(T element) 
    {
        queue.append(element);
    }

    @Override
    public T dequeue() 
    {
       T temp= null;
       
       temp = queue.GetValueFront();
       queue.RemoveFront();        
             
       return temp;
    }

    @Override
    public T first() 
    {
       T temp= null;
       
       temp = queue.GetValueFront();  //Just change this to end if you want to get the end      
             
       return temp;        
    }

    @Override
    public boolean isEmpty() 
    {
        return queue.isEmpty();        
    }

    @Override
    public int size() 
    {
        return queue.size();        
    }

    @Override
    public String toString() //Will print entire queue, using linkedlistadt's tostring, becuase queue is a linkedlist
    {
        return "QueueADT{" + "queue=" + queue + '}';
    }

}
