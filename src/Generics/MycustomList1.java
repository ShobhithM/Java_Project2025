package Generics;

import java.util.ArrayList;

class MyCustomList1<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }
    public T get(int index){
        return list.get(index);
    }
}
