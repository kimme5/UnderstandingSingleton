package staticmethod;

public class Sample4 {
    public static void main(String[] args) {
        Counter4 c1 = new Counter4();
        Counter4 c2 = new Counter4();
        Counter4 c3 = new Counter4();
        System.out.println(Counter4.getInstance());
    }
}

class Counter4 {
    static int count = 0;
    Counter4() {
        count++;
        System.out.println(count);
    }
    // static 메소드 안에서는 일반 변수 접근이 불가능하나, count 변수 역시 static으로 선언되었기 때문에 호출이 가능함
    public static int getInstance() {
        return count;
    }
}