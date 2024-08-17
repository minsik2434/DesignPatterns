package origin;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.creatIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.creatIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.creatIterator();

        System.out.println("MENU\n---\n아침 식사");
        printMenu(pancakeIterator);
        System.out.println("MENU\n---\n점심 식사");
        printMenu(dinerIterator);
        System.out.println("MENU\n---\n저녁 식사");
        printMenu(cafeMenuIterator);
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
