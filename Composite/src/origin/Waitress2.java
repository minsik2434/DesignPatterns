package origin;

import java.util.Iterator;
import java.util.List;

public class Waitress2 {
    List<Menu> menus;

    public Waitress2(List<Menu> menus) { // 각 메뉴(팬케이크 하우스 메뉴, 디너메뉴, 카페 메뉴)를 목록으로 받아온다
        this.menus = menus;
    }

    public void printMenu(){ //각 메뉴에 반복작업 수행
        Iterator<Menu> menuIterator = menus.iterator();// 메뉴 목록의 iterator로 반복 작업 수행
        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next(); //메뉴를 꺼내서
            printMenu(menu.creatIterator()); //printMenu()함수의 인자로 menu의 iterator를 전달
        }
    }

    void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
