package adapter2;

import java.util.Enumeration;
import java.util.Iterator;

// Enumeration을 Iterator에 적응시켜야 하기 때문에 Iterator 인터페이스를 상속받아 구현한다
public class EnumerationIterator implements Iterator<Object> {
    // Enumeration 레퍼런스를 저장한다
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        //어댑터의 hasNext() 실행시 enumeration의 hasMoreElements()를 실행한다
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        //어댑터의 next() 실행시 enumeration의 nextElement()를 실행한다
        return enumeration.nextElement();
    }

    @Override
    public void remove(){
        // enumeration은 remove() 메서드 기능을 지원하지 않기 때문에 remove() 호출하면 예외를 던진다
        throw new UnsupportedOperationException();
    }
}
