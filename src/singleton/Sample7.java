package singleton;

public class Sample7 {
    public static void main(String[] args) {
        Singleton7 objSingleton1 = Singleton7.getInstance();
        Singleton7 objSingleton2 = Singleton7.getInstance();
        // Singleton 클래스이므로, 각각의 참조변수가 가리키는 인스턴스는 동일함!!
        if(objSingleton1 == objSingleton2) {
            System.out.println("Same Instance!");
        } else {
            System.out.println("Different Instance!");
        }
    }
}

class Singleton7 {

    private static Singleton7 objOne;
    private Singleton7() {
    }
    
    // 이렇게 생성된 instance가 Singleton형태의 java bean임
    public static Singleton7 getInstance() {
        /*
         * Singleton7 클래스의 참조변수 objOne이 null인 경우에만 Singleton7 클래스의  
         * instance를 새롭게 생성하여 이를 objOne 변수로 가리키게 하고
         * 해당 참조변수가 null이 아닌 경우에는 곧바로 objOne 변수를 반환함
         */
        if(objOne == null) {
            objOne = new Singleton7();
        }
        return objOne;
    }

}
