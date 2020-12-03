/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.AbstractClass;

/**
 *
 * @author Chrissie
 */
public class Main {

    public static void main(String[] args) {

        MyLinkList list = new MyLinkList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        
        MyLinkList list2 = new MyLinkList(null);
         String stringData2 = "9 1 3 2 5 4 8 6 7 5";
         String[] data2 = stringData2.split(" ");
        for (String s : data2) {
            list2.addItem(new Node(s));
        }
        list2.traverse(list2.getRoot());
        list2.removeItem(new Node("7"));
        list2.traverse(list2.getRoot());
        

    }

}
