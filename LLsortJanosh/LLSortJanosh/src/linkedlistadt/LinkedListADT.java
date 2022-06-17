/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistadt;

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
    public void Insert(T obj, int index)
    {
        Node<T> current;
        Node<T> previous;
        int count = 0;
        
        if(index == 0)
            addFront(obj);
        else if (index > size)
            append(obj);
        else
        {
            current = front;
            previous = current.getPrevious();
            
            while (current != null && count < index)
            {
                previous = current;
                current = current.getNext();
                count++;
            }
            
            Node<T> temp = new Node(current, previous, obj);
            if(current != null)
            {
                current.setPrevious(temp);
            }
            else
                back = temp;
            
            previous.setNext(temp);
            size++;
        }
            
    }

    @Override
    public void Insert(T obj) 
    {
        int count = 0;
        Node<T> current = front;
        Node<T> previous = current.getPrevious();
        Comparable temp = (Comparable)current.getValue();
        while(current != null && temp.compareTo((Comparable)obj) < 0)
        {
            previous = current;
            current = current.getNext();
            temp = (Comparable) current.getValue();
            count++;
        }
        
        Insert(obj, count);
        
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
        Node<T> temp = front;
        boolean result = false;
        
        if(!isEmpty() && index < size)
        {
            for(int count = 0; count < index; count++)
            {
                temp = temp.getNext();
            }
            result = Remove(temp.getValue());
        }
        return result;
    }

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
                    temp3.setPrevious(temp2);
                    
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
        boolean result = false;
        boolean result2 = false;
        
        do
        {
            result = Remove(obj);
            if(result)
                result2 = true;
            
        }while(result);
        
        return result2;
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
