package staticfield;

public class Sample2 {
    public static void main(String[] args) {
        /*
         * 동일한 Counter 클래스는 Heap 메모리에 서로 다른 instance를 생성함
         * 참조변수 c1, c2, c3는 각각의 instance를 가리킴
         * 서로 다른 instance에서 선언된 count 변수는 각각 1로 출력됨
         */
        Counter2 c1 = new Counter2();   // 1
        Counter2 c2 = new Counter2();   // 1
        Counter2 c3 = new Counter2();   // 1
    }
}

class Counter2 {
    int count = 0;
    Counter2() {
        this.count++;
        System.out.println(this.count);
    }
}
