package tdd.hellotdd;

public class HelloTddOldStyle {
    public static void test(Boolean condition) {
        if (condition == false) throw new IllegalStateException();
    }

    public static void main(String[] args) {
        String message = "Hello Tdd";
        test(message.equals("Wrong Hello Tdd"));
        test(message.equals("Hello Tdd"));
    }
}
