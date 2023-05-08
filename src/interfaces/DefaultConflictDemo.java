package interfaces;

interface Interface1 {
    default void myMethod() {
        System.out.println("method");
    }
}

interface Interface2 {
    default void myMethod() {
        System.out.println("method");
    }
}

//class BadClass implements Interface1, Interface2 {
//}

class GoodClass implements Interface1, Interface2 {
    public void myMethod() {
        System.out.println("myMethod");
    }
}


