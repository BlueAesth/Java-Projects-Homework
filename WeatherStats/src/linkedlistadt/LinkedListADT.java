/*
Fill in the rest of the methods for homework
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
            
            /*Node temp = new Node(front, null, obj);
            front.setPrevious(temp);
            front = temp;*/
        }
        size++;
    }

    public String toString()
    {
        String msg = "Linked List \n";
                
        Node<T> current = front;
        
        while (current != null)
        {
            msg += current.getValue().toString() + " ";
            current = current.getNext();
        }
        
        return msg;
    }
    @Override
    public void Insert(T obj, int index) {//Do this first, used for inserting objects and keeping the list in order, where the obj belongs, looking to where itll be placed in at. sorted order. 
        //sorted list figure out, value coming in, compare values to, less goes in before the original obj, greater goes behind. must keep track of next and prev number, to connect them right. 
        //insert will append, method will have loop, NOT SORTED ORDER, just putting it in somewhere. 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Insert(T obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//this will figure out the index, will possibly reuse code, keeping it sorted, finding the location, call the other insert
    }

    @Override
    public boolean RemoveEnd() 
    {
        boolean result = false;
        //Break the links between, set back to prev back,  set prev back to null, 
        if(!isEmpty())
        {
            if (front == back)//only one node in list
            {
                back = front = null;//"removes, or sets first node to null
            }
            else
            {
                Node<T> temp = back.getPrevious();
                temp.setNext(null);//break bottom link
                back.setPrevious(null);//break top link
                back = temp;
                
            }
            size--;
            result = true;
        }
        
        return result;
    }

    @Override
    public boolean RemoveFront() 
    {
                boolean result = false;
        //Break the links between, set back to prev back,  set prev back to null, 
        if(!isEmpty())
        {
            if (front == back)//only one node in list
            {
                back = front = null;//"removes, or sets first node to null
            }
            else
            {
                Node<T> temp = front.getNext();
                front.setNext(null);//break bottom link
                temp.setPrevious(null);//break top link
                front = temp;
                
            }
            size--;
            result = true;
        }
        
        return result;
    }

    @Override
    public boolean RemoveAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            else if (obj.equals(back.getValue()))            
                result = RemoveEnd();            
            else
            {            
                temp = front;
                
                while (temp.getNext() != null && !(temp.getValue().equals(obj)))
                {
                    temp = temp.getNext();
                }
                   
                if (temp.getValue().equals(obj))
                {
                    
                    temp2 = temp.getPrevious();
                    temp3 = temp.getNext();

                    temp2.setNext(temp3);
                    temp3.setPrevious(temp3);

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
    public boolean RemoveAll(T obj) {//provided index pos, physically rmeove it, fixing all the connections, remove all 6's keeps calling until turned false(looking through list and removeing obj)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            value = (T) back.getValue();
        }        
        return value;
    }

    @Override
    public T GetValueFront() {
        T temp = null;
        if(front != null)
        {
            temp = front.getValue();
        }
        return temp;
    }
    
}
