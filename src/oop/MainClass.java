package oop;

class ClassB { //A regular block is executed, when u create an object of the class
    static int i = 100;

    static //static block this executed when the class is loaded into the memory
    {
        i = i-- - --i;
        // i = 100 - 99 = 1
        System.out.println("First "+i);
    }
    {
        i = i++ + ++i;
        // i = 100 + 101 = 201
        System.out.println("Second "+i);
    }
}

class ClassC extends ClassB{
    static
    {
        i = --i - i--;
        //99 - 100 = -1
        System.out.println("Third "+i);
    }
    {
        i = ++i + i++;
        //101 + 100 = 201
        System.out.println("Forth "+i);
    }

}

public class MainClass{
    public static void main(String[] args){
        ClassC  c= new ClassC();
        System.out.println(c.i);
    }
}
