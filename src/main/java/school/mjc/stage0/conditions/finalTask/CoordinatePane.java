package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public static void main(String[] args) {
        printQuadrant(1, -1);
    }

    public static void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
        }
        if (x == 0 && y == 0) {
            System.out.println("zero");
        }
        if (x > 0 && y < 0) {
            System.out.println("fourth");
        }
        if (x < 0 && y < 0) {
            System.out.println("third");
        }
        if (x < 0 && y > 0) {
            System.out.println("second");
        }
    }
}
