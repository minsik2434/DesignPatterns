package templatemethod;

// 추상 클래스로 선언되므로 실제 연산을 구현해주는 서브 클래스로 만들어야한다
public abstract class AbstractClass {


    //템플릿 메서드.
    //서브 클래스가 알고리즘의 각 단계를 수정하지 못하게 final로 만들어야한다
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    final void concreteOperation(){ // 구상 단계는 추상 클래스 내에서 정의된다 final로 선언된 이
        // 메서드는 서브 클래스에서 오버라이드 할 수 없다 이 메서드는 템플릿 메서드에서 직접 호출할 수 있고 서브 클래스에서 호출될 수 도 있다
    }

    // 아무것도 하지 않는 메서드를 정의할 수 도 있다 이는 훅이라고 부르고 서브 클래스에서 오버라이드 할 수 도 하지 않을 수 도 있다
    void hook(){
    }

}
