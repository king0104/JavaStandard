class TestClass{
    // tip. 같은 클래스 내부에서는 인스턴스 생성하지 않고 각 멤버끼리 참조, 호출 가능하다.
    void instanceMethod() { }
    static void staticMethod () { }

    void instanceMethod2(){ // 인스턴스 메서드
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2 () { // 클래스 메서드
        //instanceMethod(); // 인스턴스 메서드는 나중에 만들어지기 때문에,
        // 클래스 메서드를 정의할 때 인스턴스 메서드를 참조할 수 없다.
        // 클래스 메서드가 실행될 때 인스턴스 메서드가 만들어지지 않았을 수 있기 때문이다.
        staticMethod();
    }
}

class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod() {
        //System.out.println(iv);// 인스턴스 변수는 나중에 만들어지기 때문에,
        // 클래스 메서드 안에서 사용될 수 없다.
        // 클래스 메서드가 실행될 때, 만들이지지 않았을 수 있기 때문이다.
        System.out.println(cv);
    }
}



public class ch6_3_12 {
}
