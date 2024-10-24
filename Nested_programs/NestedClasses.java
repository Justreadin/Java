package Nested_programs;

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
