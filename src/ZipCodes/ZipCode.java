package ZipCodes;

public class ZipCode implements Comparable<ZipCode> {
    private String code; // zipcode
    private String state; // two character state code
    private String city; // city name
    private Coordinate coord; // lng/lat

    public ZipCode(String code,
                   String state,
                   String city,
                   Coordinate coord) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.coord = coord;
    }

    public ZipCode(String code,
                   String state,
                   String city,
                   double lng, double lat) {
        // Call the above constructor
        this(code, state, city, new Coordinate(lng, lat));

    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public Coordinate getCoord() {
        return coord;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", coord=" + coord +
                '}';
    }

    public double dist(ZipCode that) {
        return this.coord.dist(that.coord);
    }


    // TODO how do we order by combination of the zip code and state
    @Override
    public int compareTo(ZipCode that) {
        return this.code.compareTo(that.code);
        //return this.city.compareTo(that.city);
        // TODO fix the statement below to return -1, 0, or 1 instead true or false
        // return this.coord.getLat() < that.coord.getLat();
    }
}

