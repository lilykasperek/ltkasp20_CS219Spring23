package OOP;

import ZipCodes.ZipCodeDB;

import static LoopExercises.Checksum.checksum;

public class Main {

    public static void main(String[] args) {
        Checksum cs = new IntegerChecksum();
        System.out.println(cs.checksum(12345)  == 15);

        Checksum scs = new StringChecksum();
        System.out.println(scs.checksum("Hello"));

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

        ZipCodeDB db = new ZipCodeDB();
        db.load();
        System.out.println(db.findByZip("13617"));
        System.out.println(db.findByZip("Apple"));


    }

} // Main
