//Program to demonstrate the use of Local, Instance, and Static variables
class Var3 {
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    void display() {
        // Local variable
        int localVar = 30;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Var3 obj = new Var3();
        obj.display(); // Calling method to display values
    }
}
