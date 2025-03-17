package Day06.Review;

public class Ex07_FamilyTest {
    
    static class Parent { // Marked static for instantiation inside static method
        Parent() {
            System.out.println("Parent 1");
        }

        Parent(String str) {
            System.out.println("Parent 2");
        }
    }

    static class Child extends Parent { // Marked static for instantiation inside static method
        Child() {
            super("some string");  // Explicitly calling Parent(String)
            System.out.println("Child 1");
        }

        Child(String str) {
            super(str);  // Explicitly calling Parent(String)
            System.out.println("Child 2");
        }
    }

    public static void main(String[] args) {
        Child c1 = new Child();  // Calls Child(), which calls Parent("some string") first
        Child c2 = new Child("a");  // Calls Child(String), which calls Parent("a") first
    }
}