package origin;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    int position = 0; // 반복처리 위치
    MenuItem[] items;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목을 지울 수 없습니다");
    }
}
