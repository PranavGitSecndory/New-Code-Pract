package keywords;
class ParentStatic {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class ChildStatic extends ParentStatic {
    static void display() {
        System.out.println("Static method in Child");
    }
}

public class Static_test {
    public static void main(String[] args) {
        ParentStatic obj = new ChildStatic();
        obj.display();
    }

}
