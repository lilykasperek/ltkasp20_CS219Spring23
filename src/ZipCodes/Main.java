package ZipCodes;

public class Main {

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(10, 20);
        Coordinate c2 = new Coordinate(20, 30);

        System.out.println(c1);
        System.out.println(c1.dist(c2));

        // create a zip code object for Canton
        ZipCode z1 = new ZipCode("13617",
                "NY", "Canton",
                new Coordinate(75.1, 44.6));

        ZipCode z2 = new ZipCode("13676",
                "NY", "Potsdam",
                74.9, 44.6);

        System.out.println(z1.getCoord().dist(z2.getCoord()));
        System.out.println(z1.dist(z2));


        Coordinate boston = new Coordinate(71.02, 42.38);
        Coordinate canton = new Coordinate(75.16, 44.59);

        System.out.println(boston.dist(canton));

        // create ZipCode DB objects
        ZipCodeDB db = new ZipCodeDB();
        db.load();
        System.out.println(db.findByZip("13617"));
        System.out.println(db.findByZip("Apple"));

        db.findDuplicates();

        return;
    }
}
