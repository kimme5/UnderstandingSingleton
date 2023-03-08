package singleton;

public class Sample6 {

    public static void main(String[] args) {
        /*
         * Singleton6 클래스의 생성자가 private으로 정의되어 있어
         * 아래와 같이 해당 클래스의 instance를 직접 생성하는 것이 불가함
         * Singleton6 singleton6 = new Singleton6();
         * 대신, Singleton6 클래스에서 static으로 정의한 getInstance() 메소드를 통해만
         * Singleton6의 instance 생성이 가능함
         */
        Singleton6 singleton6 = Singleton6.getInstance();
    }

}

class Singleton6 {

    // private 생성자이므로 외부 클래스에서 instance 생성이 불가함
    private Singleton6() {
    }

    /*
     * 해당 클래스의 instance를 생성하는 메소르를 static으로 생성하여
     * 외부 클래스에서는 해당 메소드 호출을 통해 Singleton6 instance에 접근이 가능함
     */
    public static Singleton6 getInstance() {
        return new Singleton6();
    }

}