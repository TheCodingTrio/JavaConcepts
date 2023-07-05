package oop;

public class ClassA {

    ClassA(){
        this(0);
        System.out.println("Hi");
    }
    ClassA(int x){
        this(0,0);
        System.out.println("Hello");
    }
    public ClassA(int x, int y) {
        System.out.println("How are you");
    }

    public static void main(String[] args){
        ClassA obj = new ClassA();
    }
}

/*
he print statements are printed in reverse order because of the way the constructors are chained in the code.

Let's go through the sequence of events:

The main method creates an instance of the ClassA class using the default constructor ClassA().
Inside the default constructor, this(0) is called, which invokes the constructor ClassA(int x).
Inside the constructor ClassA(int x), this(0, 0) is called, which invokes the constructor ClassA(int x, int y).
Inside the constructor ClassA(int x, int y), the statement System.out.println("How are you"); is executed, printing "How are you".
After the this(0, 0) statement in the ClassA(int x) constructor, the statement System.out.println("Hello"); is executed, printing "Hello".
After the this(0) statement in the default constructor ClassA(), the statement System.out.println("Hi"); is executed, printing "Hi".
So, the output is in reverse order: "How are you" -> "Hello" -> "Hi".


If you want the output to be in the original order, you can modify the constructors as follows:
public class ClassA {

    ClassA() {
        System.out.println("Hi"); //printing first
        this(0); //then calling the constructor
    }

    ClassA(int x) {
        System.out.println("Hello");
        this(0, 0);
    }

    public ClassA(int x, int y) {
        System.out.println("How are you");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
    }
}
In this modified code, the order of the statements inside the constructors is rearranged so that the output will be "Hi" -> "Hello" -> "How are you", matching the original order of the print statements.




 */