package oop;

/*class Shape {
    void draw(){
        System.out.println("Draw a shape");
    }

    //We dont want to define the method
    //We dont want to create an object for this
    //Lets see below how we can optimize this Shape class
}*/
/*We can change the architecture of the program
* mark the class and the method as abstract
* U cannot have objects for this class*/
//abstract class Shape {
//    /*When a class is marked as abstract, u cannot create the objects
//    * But run time environment will create the object*/
//
//    /*Very important difference we are going to learn now*/
//    /*Now here we are able to create the constructor. It means the objects
//    can be constructed for the Shape class, but U cannot create.
//    RUN TIME ENVIRONMENT will be able to create that.
//    When u try to create its going to give u an error
//    */
//    /*When u run the program now u can see that before the construction of the
//    * child object, the parent object is constructed by the run time environment
//    * That means object to object inheritance.
//    * Parent object is created by the run time environment and then the child
//    * object is created.*/
//    Shape(){
//        System.out.println("Shape is constructed");
//
//    }
//    abstract void draw(); //no definition
//    //child has to define
//
//
//    /*So now we have seen how the abstract class improves the run time polymorphism
//    * But here its like the parents are imposing rules which are to be defined by the
//    * child*/
//}

/*U thought run time ploymorphism was best archieved using abstract class. NO, NO.
* Check below for the best way*/

/*we make the Shape class an interface*/
interface Shape {
    //You can see that the construtor gives us an error
    /*It means neither u nor the run time environment can create objects of
    * Shape */

    /*So for the Interfaces , neither u nor the run time environment can
    * create objects
    *
    * It means there is no object to object inheritance now
    * There is not parent-child relationship over here*/

    /*Shape(){
        System.out.println("Shape is constructed");
    }*/

    abstract void draw(); //public abstract void draw(); (by default this method is public,
    // so when u override this method u need to define it as public)

    /*So finally this is one more way of achieving a more refined Run-Time polymorphism*/
}
class Circle implements Shape{ //extends Shape{ //object to object Inheritance
    @Override
    public void draw(){ //overriding
        System.out.println("Draw a Circle");
    }
}


class Rectangle implements Shape{ //extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}
class Polygon implements Shape{ //extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw a Polygon");
    }
}
public class Test {

    public static void main(String[] args){
//        Shape s;
//        s = new Shape();
//        s.draw();
//
//        Circle c;
//        c = new Circle();
//        c.draw();
        /*As u can see in the output overriding has come into action.
It’s a basic concept. Whenever u create the object of a child, the definition of the child will come into play.
What I want to do is, reference variable belongs to the parent.
And the object belongs to the child. This is known as Polymorphic statement.
How it is a polymorphic statement?
The Shape s is point to Circle.
Shape is now behaving as circle.
*/
        //Run-time polymorphism
        Shape s;
        s= new Circle(); //Polymorphic statement
        s.draw();

        s= new Rectangle(); //Polymorphic statement
        s.draw();

        s= new Polygon(); //Polymorphic statement
        s.draw();
        /*This is run-time polymorphism.
The same method draw() over the same reference variable s, we are able to draw different different shapes dynamically at run time.
*/
        /*But having this concept below makes no sense*/
//         s= new Shape(); //We have now made  the Shape class abstract, so can't
        // create objects
//         s.draw();

         /*So what we need to understand is we need not to have an object for the
         * Shape class and we need not to have the definiton for the draw() In shape class
         * Note continued above........*/


    }
}//end of Test Class


