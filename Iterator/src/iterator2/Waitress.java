package iterator2;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.creatIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.creatIterator();

        System.out.println("MENU\n---\n아침 식사");
        printMenu(pancakeIterator);
        System.out.println("MENU\n---\n점심 식사");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
