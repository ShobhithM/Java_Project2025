package Generics;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList1<String> list = new MyCustomList1();
        list.addElement("Element-1");
        list.addElement("Element-2");
        String text = list.get(0);
        System.out.println(text);

        MyCustomList1<Integer> list1 = new MyCustomList1();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(9));
        Integer num = list1.get(0);
        System.out.println(num);
    }
}
