package examproto;

public class BookExam {

    public static void main(String[] args) {
        /*
         * 생성자가 호출되면 heap 메모리에 instance가 생성됨
         * book1은 생성한 instance를 참조하는 reference field임
         * 이렇게 개발자가 instance를 직접 생성하고 사용하는 것은 bean이 아님
         */
        Book book1 = new Book("즐거운 자바", 20000);

        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());
    }
}
