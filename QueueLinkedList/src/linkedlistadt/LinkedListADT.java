//Insert At(Fix), Insert, Remove at. Needs to be done.
package linkedlistadt;
import java.io.*; 

import java.util.LinkedList; 

/**
 *
 * @author speciosr
 */
public class LinkedListADT<T> implements LinkedListInterface<T>
{
    protected Node<T> front;
    protected Node<T> back;
    protected int size;
    
    public LinkedListADT()
    {
        front = back = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty() 
    {
        boolean result = false;
        
        if(front == null)
            result = true;
        
        return result;
    }

    @Override
    public int size() 
    {
        return size;
    }

    @Override
    public void append(T obj) 
    {
        if(isEmpty())
        {
            addFront(obj);
        }
        else
        {
            Node<T> temp = new Node<T>(null, back, obj);
            back.setNext(temp);
            back = temp;
            size++;
        }
    }

    @Override
    public void addFront(T obj) 
    {
        if(isEmpty())
        {
            Node<T> temp = new Node<T>(null, null, obj);
            front = back = temp;
        }
        else
        {
            front = new Node<T>(front, null, obj);
            front.getNext().setPrevious(front);
            
            /*Node<T> temp = new Node<T>(front, null, obj);
            front.setPrevious(temp);
            front = temp;*/
        }
        size++;
    }

    public String toString()
    {
        String msg = "Linked List \n";
                
        Node current = front;
        
        while (current != null)
        {
            msg += current.getValue().toString() + " ";
            current = current.getNext();
        }
        
        return msg;
    }
    @Override
    public void Insert(T obj, int index) //Fix this
    {
       
              Node<T> temp = new Node<T>(null, null,obj);
              Node<T> current = front;
        
              if (current != null)
                {
                    //Go to requested index
                    for (int i = 0; i < index && current.getNext() != null; i++)
                    {
                        current = current.getNext();
                    }
                }
                //set new node's next node, to this node
                temp.setNext(current.getNext());
                //this node next node to
                current.setNext(temp);
                size++;
       
    }

    @Override
    public void Insert(T obj) //sorting, list has 6, users inserts 8, 8 should go after because it is greater
    {
    
        Node<T> newNode = new Node<T>();
        newNode.setValue(obj);
        Node nextNode = front.getNext();
        front.setNext(newNode);
        newNode.setNext(nextNode);
        
        while (current.getNext != null && current.getNext.obj < new Node<T>(null, null,obj))
            current = current.getNext;
        
    }

    @Override
    public boolean RemoveEnd() 
    {
        boolean result = false;
        
        if(!isEmpty())
        {
            if(front == back)
            {
                back = front = null;
            }
            else
            {
                Node<T> temp = back.getPrevious();
                temp.setNext(null);
                back.setPrevious(null);
                back = temp;
               
            }
            result = true;
            size--;
        }
        
        return result;
    }

    @Override
    public boolean RemoveFront() 
    {
        boolean result = false;
        
        if(!isEmpty())
        {
            if(front == back)
            {
                back = front = null;
            }
            else
            {
                Node<T> temp = front.getNext();
                front.setNext(null);
                temp.setPrevious(null);
                front = temp;
               
            }
            result = true;
            size--;
        }
        
        return result;
    }

    @Override
    public boolean RemoveAt(int index) 
    {
        /*
        if(!isEmpty)//obj at posistion, can just call remove method, just moving through the last till you get the posistion, the node, all you gotta do is remove that obj. Can use other methods. etc.
    */
    return false;}

    @Override
    public boolean Remove(T obj) 
    {
        boolean result = false;
        Node<T> temp, temp2, temp3;
        
        if(!isEmpty())
        {
            if(obj.equals(front.getValue()))
                result = RemoveFront();
            else if(obj.equals(back.getValue()))
                result = RemoveEnd();
            else
            {
                temp = front;
                
                while(temp.getNext() != null && 
                        !(temp.getValue().equals(obj)))
                {
                    temp = temp.getNext();
                }
                
                if(temp.getValue().equals(obj))
                {
                    temp2 = temp.getPrevious();
                    temp3 = temp.getNext();
                    
                    temp2.setNext(temp3);
                    if (temp3 != null)
                        temp3.setPrevious(temp2);//will fail, the last node will be null. cant set it as such.
                    
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    result = true;
                }
                
            }
        }
        
        return result;
    }

    @Override
    public boolean RemoveAll(T obj) 
    {
       myList.clear();//Wish this worked, ugh!~
    }

    @Override
    public T GetValue(int pos) 
    {
        T temp = null;
        Node<T> temp1;
        
        if(pos < size && pos >= 0)
        {
            temp1 = front;
            for(int count = 1; count <= pos; count++)
            {
                temp1 = temp1.getNext();
            }
            
            temp = temp1.getValue();
        }
        
        return temp;
    }

    @Override
    public T GetValueEnd() 
    {
        T value = null;
        
        if(back != null)
        {
            value = back.getValue();
        }
        
        return value;
    }

    @Override
    public T GetValueFront() 
    {
        T temp = null;
        
        if(front != null)
        {
            temp = front.getValue();
        }
        
        return temp;
    }
    
}
