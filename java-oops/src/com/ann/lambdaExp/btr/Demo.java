// BEFORE LAMBDA EXPRESSION

//package com.ann.lambdaExp.btr;
//
//@FunctionalInterface
//interface  A{
//   void show();
//}
//
//class B implements A{
//    public void show() {
//        System.out.println("hi");
//    }
//}
//public class Demo {
//    public static void main(String[] args) {
//
//        A obj = new A ();
//        obj.show();
//    }
//}


// MODIFICATIONS IN JAVA 7

//package com.ann.lambdaExp.btr;
//
//@FunctionalInterface
//interface  A{
//    void show();
//}
//
//// No need of class B anymore
//
//public class Demo {
//    public static void main(String[] args) {
//
//        // it is known as ANONYMOUS INNER CLASS
//        A obj = new A () {
//            public void show() {
//                System.out.println("hi in j7");
//            }
//        };
//        obj.show();
//    }
//}

// LAMBDA EXPRESSION
package com.ann.lambdaExp.btr;

@FunctionalInterface
interface  A{
    void show();
}

public class Demo {
    public static void main(String[] args) {

        A obj = () -> {
            System.out.println("hi i am lambda");

        };
        obj.show();
    }
}
