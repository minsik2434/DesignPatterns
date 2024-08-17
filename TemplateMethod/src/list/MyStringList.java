package list;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private String[] myList;


    public MyStringList(String[] myList) {
        this.myList = myList;
    }
    //subList() 템플릿 메서드를 구현하기 위한 get()과 size()를 구현
    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }
    public String set(int index, String item){
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "RedHead Duck", "RubberDuck", "DecoyDuck"};
        MyStringList duckList = new MyStringList(ducks);
        List<String> ducksSubList = duckList.subList(2,3);

        System.out.println("ducksSubList = " + ducksSubList);
    }
}
