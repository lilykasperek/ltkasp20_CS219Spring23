package OOP;

// properties of one particle
public class Particle {

    // non-static variables declared
    // in a class is called
    // instance data
    // instance variables should be
    // inaccessible outside of the object
    private double x, y, dx, dy;

    // constructor: is a function with the same name
    // as the class and is used to create objects for
    // the class
    public Particle(double x, double y, double dx, double dy) {

        // keyword this refers to the object
        // that was used on the left-hand side
        // of the dot.
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    // getter method for x
    public double getX() {
        return x; // not in constructor
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    // @Override is a IntelliJ extension indicating that
    // the toString method is overriding the
    // toString method in the base class
    public String toString() {
        return "Particle{" +
                "x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }

    public void move() {
        x = x + dx;
        y = y + dy;

    }

    public double origin() {
         return Math.sqrt(x*x + y*y);
    }

    public double dist(Particle p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));

    }
}
