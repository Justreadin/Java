Nested Classes, Access Modifiers, and Anonymous Classes in Java
This Java program demonstrates the concepts of nested classes, access modifiers, and anonymous classes.

Nested Classes
Nested classes are classes defined within another class. They can be either inner classes or static inner classes.

Inner classes:

Can only be accessed from within their enclosing class.
Have access to the private members of their enclosing class.
Static inner classes:

Can be accessed from anywhere in the program.
Do not have access to the non-static members of their enclosing class.
Access Modifiers
Access modifiers control the visibility of classes, methods, and variables. The four access modifiers in Java are:

public: Accessible from anywhere.
private: Accessible only within the same class.
protected: Accessible within the same package and its subclasses.   
default: Accessible within the same package.
Anonymous Classes
Anonymous classes are classes that are defined without a name. They are typically used to implement interfaces or extend classes.

Code Explanation
The NestedClasses class demonstrates the usage of nested classes, access modifiers, and anonymous classes:

Java
public class NestedClasses {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.printMessage();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.printMessage();

        AnonymousClass anonymousClass = new AnonymousClass() {
            @Override
            public void printMessage() {
                System.out.println("This is an anonymous class");
            }
        };
        anonymousClass.printMessage();
    }

    public static class Outer {

        public class Inner {

            public void printMessage() {
                System.out.println("This is an inner class");
            }
        }

        public static class StaticInner {

            public void printMessage() {
                System.out.println("This is a static inner class");
            }
        }
    }

    public interface AnonymousClass {

        void printMessage();
    }
}


The Outer class contains two nested classes: Inner and StaticInner.
The Inner class is an inner class that can only be accessed from within the Outer class.
The StaticInner class is a static inner class that can be accessed from anywhere in the program.
The AnonymousClass interface is implemented by an anonymous class in the main method.

- Output:

This is an inner class
This is a static inner class
This is an anonymous class

- Usage
Clone this repository.
Compile the Java file using javac NestedClasses.java.
Run the compiled class using java NestedClasses.

- Acknowledgments:
Flexisaf Internship

- Contributing
Contributions to this project are welcome. Please feel free to fork the repository and submit pull requests.
