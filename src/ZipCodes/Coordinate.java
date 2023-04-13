package ZipCodes;

public class Coordinate {

    private double lng, lat;

    public Coordinate(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;

    }
    @Override
    public String toString() {
        return "Coordinate{" +
                "lng=" + lng +
                ", lat=" + lat +
                '}';
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    public double dist(Coordinate that) {

        double R = 6371000;

        double x = Math.pow(Math.sin(Math.toRadians(that.lat - this.lat / 2)), 2) + Math.cos(Math.toRadians(this.lat)) * Math.cos(Math.toRadians(that.lat)) *
                Math.pow(Math.toRadians(Math.sin(that.lng - this.lng / 2)), 2);

        double y = 2*Math.atan2(Math.sqrt(x), (Math.sqrt(1 - x)));

        return R * y / 1000;

    }

    public static void main(String[] args) {
        Coordinate boston = new Coordinate(71.02, 42.38);
        Coordinate canton = new Coordinate(75.16, 44.59);

        System.out.println(boston.dist(canton));
    }

} // clas// s coordinate
