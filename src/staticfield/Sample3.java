package staticfield;

public class Sample3 {

    public static void main(String[] args) {
        /*
         * Counter3 클래스에서 count 변수가 static으로 선언되어
         * 서로 다른 c1, c2, c3 인스턴가 메모리상에서 동일한 count 변수를 가리키게 되며
         * 이로 인해 instance가 생성될 때마다 count값이 증가하게 됨
         */
        Counter3 c1 = new Counter3();   // 1
        Counter3 c2 = new Counter3();   // 2
        Counter3 c3 = new Counter3();   // 3
    }
}

class Counter3 {
    static int count = 0;
    Counter3() {
        count++;
        System.out.println(count);
    }
}
