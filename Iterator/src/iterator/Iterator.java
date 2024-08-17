package iterator;

public interface Iterator {
    //hasNext() 는 반복 잡업을 수행할 항목이 있으면 그 결과를 불리언 값으로 반환
    boolean hasNext();
    //next()는 다음 항목을 반환
    MenuItem next();
}
