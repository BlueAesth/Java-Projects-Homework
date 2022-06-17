package queuelinkedlist;
import QueueADT.QueueADT;
/**
 *
 * @author Poten
 */
public class QueueLinkedList 
{
    private static QueueADT<Integer> myQueue = new QueueADT<Integer>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int temp;
        
        displayQueueStats();
        myQueue.enqueue(10);
        myQueue.enqueue(50);
        myQueue.enqueue(100);
        displayQueueStats();
        
        temp = myQueue.dequeue();
        System.out.println(temp);
        displayQueueStats();
        
        myQueue.first();
        displayQueueStats();
        
        temp = myQueue.dequeue();
        System.out.println(temp);
        displayQueueStats();
        
        temp = myQueue.dequeue();
        System.out.println(temp);
        displayQueueStats();              
                                
    }
    
    private static void displayQueueStats()
    {
        System.out.println("Queue is empty. " + myQueue.isEmpty());
        System.out.println("The size is " + myQueue.size());
        System.out.println(myQueue);
        
    }
    
}
