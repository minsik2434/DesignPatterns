package origin;

import java.util.List;

public class Employee {
   PancakeHouseMenu pancakeHouseMenu;
   DinerMenu dinerMenu;

    public Employee(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void getMenuItems(){
        List<MenuItem> breakfastMenu = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchMenu = dinerMenu.getMenuItems();

        for(int i=0; i< breakfastMenu.size(); i++){
            MenuItem menuItem = breakfastMenu.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }

        for(int i=0; i<lunchMenu.length; i++){
            MenuItem menuItem = lunchMenu[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
