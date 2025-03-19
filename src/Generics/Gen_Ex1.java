package Generics;

public class Gen_Ex1 {
    public static void main(String[] args) {
        MyCustomList list = new MyCustomList();
        list.addElement("Element1");
        list.addElement("Element2");
        list.addElement("Element3");
        System.out.println(list);
    }
}
