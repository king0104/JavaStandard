public class ch6_20 {

}

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv);
        MemberCall c = new MemberCall(); // 객체 생성
        System.out.println(c.iv); // 객체 생성으로 인해 인스턴스 변수가 생성되었음이 보장되었으므로,
        // 클래스 메서드에서 인스턴스 변수 사용 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 멤버 간의 호출, 참조는 항상 가능
        // 왜냐하면, 하나의 인스턴스 멤버가 존재한다는 것은 인스턴스가 이미 생성되어있다는 걸 보장하므로.
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod2();
        instanceMethod1();
    }


}
