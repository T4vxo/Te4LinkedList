/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te4linkedlist;

/**
 *
 * @author Daniel Lundberg
 */
public class Te4LinkedList {

   Node head; 
   public void insert(int data){
       Node node = new Node();
       node.data = data; 
       
       if(head == null){
           head = node; 
       }else{
           Node n = head; 
           while(n.next !=null){
               n=n.next;
           }
           n.next = node; 
       }
   }
   
   public void show(){
       Node node = head; 
       while(node != null){
           System.out.println(node.data);
           node = node.next;
       }
   }
    
}
