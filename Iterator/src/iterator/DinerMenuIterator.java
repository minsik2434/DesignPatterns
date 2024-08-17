package iterator;

//Iterator 인터페이스를 구현한다
public class DinerMenuIterator implements Iterator{
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
}
