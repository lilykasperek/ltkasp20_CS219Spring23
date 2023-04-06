package OOP;

public class Main {

    public static void main(String[] args) {
        Particle p1 =
                new Particle(3.2, 34.5, 2.0, -1.9);
        System.out.println(p1.getX());

        Particle p2 =
                new Particle(43.2, 77.9, -1.2, 2.3);

        System.out.println(p2.getX());
        // p1.x = 7; // not best practice

        // println automatically calls the
        // toString method
        System.out.println(p1);

        p1.move();
        p2.move();
        System.out.println(p1);

        System.out.println(p1.origin());

        System.out.println(p1.dist(p2));
        System.out.println(p2.dist(p1));
        System.out.println(p2.dist(p2));

    }



} // Main
