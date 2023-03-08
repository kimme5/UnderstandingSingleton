package staticmethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample5 {
    public static void main(String[] args) {
        /*
         * Util 클래스에서 getCurrentDate 메소드가 static으로 선언되었기 때문에,
         * Util 클래스에 대한 instance 생성없이 직접 호출이 가능함
         */
        System.out.println(Util.getCurrentDate("yyyy/MM/dd"));
    }
}

// static 메소드는 유틸리티성 메소드를 작성할 때 많이 사용함
// 예를 들어, "오늘날짜 구하기", "숫자에 콤마추가하기" 등의 메소드를 작성할 때 클래스 메소드를 사용하는 것이 유리함
class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fmt);
        return simpleDateFormat.format(new Date());
    }
}
