/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreeexample;
import BinaryTree.BinaryTreeClass;
import java.util.Iterator;
/**
 *
 * @author Poten
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BinaryTreeClass<Integer> intTree = new BinaryTreeClass<Integer>();
        Iterator<Integer> iter;
        Integer temp;
        
        
        if(intTree.isEmpty())
            System.out.println("Tree is empty");
        else
            System.out.println("Tree not empty");
        
        intTree.addElement(10);
        intTree.addElement(11);
        intTree.addElement(5);
        intTree.addElement(13);
        
         if(intTree.isEmpty())
            System.out.println("Tree is empty");
        else
            System.out.println("Tree not empty");
         
         System.out.println("Root value is: " + intTree.getRootElement());
         
         iter = intTree.iterator();
         System.out.println("In order Output: ");         
         while(iter.hasNext())
         {
             temp = iter.next();
             System.out.println(temp + " ");
         }
         System.out.println();
         
        iter = intTree.iteratorPreOrder();
         System.out.println("Pre order Output: ");         
         while(iter.hasNext())
         {
             temp = iter.next();
             System.out.println(temp + " ");
         }
         System.out.println();
         
         iter = intTree.iteratorPostOrder();
         System.out.println("Post order Output: ");         
         while(iter.hasNext())
         {
             temp = iter.next();
             System.out.println(temp + " ");
         }
         System.out.println();
    }
    
}
