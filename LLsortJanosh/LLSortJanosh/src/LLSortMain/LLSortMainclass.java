/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LLSortMain;
import linkedlistadt.LinkedListADT;
import linkedlistadt.Node;

public class LLSortMainclass 
{

    private static LinkedListADT<Integer> myList = new LinkedListADT<Integer>();
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {      
        DisplayStats();
        
        myList.addFront(6);
        DisplayStats();
        
        myList.addFront(10);
        DisplayStats();
        
        myList.append(7);
        DisplayStats();       
                
        /*myList.RemoveEnd();
        DisplayStats();
        
        myList.RemoveFront();
        DisplayStats();
        myList.RemoveFront();
        DisplayStats();
        myList.RemoveFront();
        DisplayStats();        */
        
        Integer value;
        value = myList.GetValueFront();
        System.out.println("Front value is "  + value);
        value = myList.GetValueEnd();
        System.out.println("End value is "  + value);    
        
        value = myList.GetValue(0);
        System.out.println("Value is "  + value);
        value = myList.GetValue(2);
        System.out.println("Value is "  + value);
        value = myList.GetValue(1);
        System.out.println("Value is "  + value);
        value = myList.GetValue(22);
        System.out.println("Value is "  + value);        
    }
    
    private static void DisplayStats()
    {
        System.out.println("Size of list is " + myList.size());
        if(myList.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("List is NOT empty");
        
        System.out.println(myList);
    }
    
    
    public void bubbleSort(LinkedListADT<Node> myList) 
    {
        Node current;
        Node temp;
        
        if(myList.isEmpty())
            System.out.println("List empty.");
        else if (myList.size() == 1)
            System.out.println("List sorted.");
        else 
        {
            current = myList.GetValueFront();
            Node counter = current;
            boolean swapped = true;
            
            while(counter.getNext().getNext() != null && swapped) 
            {
                current = myList.GetValueFront();
                swapped = false;
                while(current.getNext() != null) 
                {
                    if(current.getValue()).compareTo(current.getNext().getValue()) 
                    {
                        temp = current.GetValue();
                        current.setValue(current.getNext().getValue());
                        current.getNext().setValue(temp);
                        swapped = true;
                    }
                    current = current.getNext();
                }
                counter = counter.getNext();
            }
        }
    }  
    
    /*
    public static void InsertionSort(LinkedListADT<Node> myList)
    {
        Integer value;
        int position;
        
        for(int index = 1; index < myList.size(); index++)
        {
            value = myList.SetValue(index);
            position = index;
            while(position > 0 && myList[position-1] > key)
            {
                myList[position] = myList[position-1];
                position--;
            }
            myList[position] = value;
        }
    }
    */
    
    public void InsertionSortTwo(Node front, int nodeValue)
    {
        Node newNode = new Node();
        newNode.value = nodeValue;
        
        Node temp = front;
        
        if (temp == null)
        {
            front = newNode;
        }
        else if (temp.nodeValue > newNode.nodeValue)
        {
            newNode.setNext() = temp;
            temp.setPrevious() = newNode;
            front = newNode;
        }
        else
        {
            Node nextNode = front.getNext();
            
            while (nextNode != null && nextNode.nodeValue <= newNode.nodeValue)
            {
                temp = nextNode;
                nextNode = nextNode.getNext();
            }
            
            temp.getNext() = nextNode;
            newNode.getPrevious() = temp;
            
            if (nextNode != null)
            {
                nextNode.getPrevious() = newNode;
                newNode.getNext() = nextNode;
            }
        }
        
        return front;
    }
}
