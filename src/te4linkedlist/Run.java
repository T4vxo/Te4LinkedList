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
public class Run {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //vi testar
            Te4LinkedList list = new Te4LinkedList();
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(1);
            
            list.show();
    }
}
