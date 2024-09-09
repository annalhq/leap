package file;

@FunctionalInterface
interface A {
    void show();
}
public class demo {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("hi");
        };
        obj.show();
    }
}
