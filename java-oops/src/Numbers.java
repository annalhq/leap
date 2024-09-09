public class Numbers {

    int sum(int a, int b){
        return a + b;
    }
     int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        int result1 = obj.sum(2, 4);
        int result2 = obj.sum(1, 3, 4);
        System.out.println("Sum of 2 and 4: " + result1);
        System.out.println("Sum of 1, 3, and 4: " + result2);

    }
}
