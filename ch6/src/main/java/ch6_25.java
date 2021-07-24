public class ch6_25 {
}

class Car{
    String color;
    String gearType;
    int door;

    // 1. 생성자에서 생성자 호출
    Car(){
        this("white", "auto", 4);
    }
    Car(String color){
        this.color = color; // 인스턴스 자신을 가리키는 참조변수
        this.gearType = gearType; // 얘내는 뭐임?????
        this.door = door;
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Main{
    public static void main(String[] args) {
        Car c = new Car("black");
        System.out.println(c.gearType); // 아 그냥 null값 나오네
    }
}
