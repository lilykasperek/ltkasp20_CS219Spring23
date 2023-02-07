package HW1;

// 1. create a new program called Time.java
public class Time {
    public static void main(String [] args) {
        // put the code for exercise 2.3
        // use 3:23 and 20 seconds
        // use 24-hour clock, so 3 is 15
        // #5: take the number of seconds that passed today and divide it by
        // total number of seconds in a day
        // use Math.round()
        // don't do #6

        // 2. assign values for assigned time
        int hour = 15;
        int minute = 23;
        int second = 20;

        // 3. make a program that calculates and displays the number of seconds since midnight
        // computation
        int ssm = (hour * 60 + minute) * 60 + second;

        // print value of seconds since midnight
        System.out.print(hour);
        System.out.print(":" + minute);
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.print(" is ");
        System.out.print(ssm);
        System.out.println(" seconds since midnight");

        // 4. calculate and display the number of seconds left in the day
        // computation
        // find hours left in day
        int hours = (24 - hour);

        // convert hours left in day to minutes
        // subtract minutes out for minutes left in day
        // convert minutes to seconds
        // subtract out seconds
        int slid = (((hours * 60) - minute) * 60) - second;

        // print statement
        System.out.print("There are ");
        System.out.print(slid);
        System.out.println(" seconds left in the day");

        // 5. calculate and display the percentage of day that has passed
        // computation
        // cast as double
        double spt = ((double) ssm / (double) (slid + ssm));

        // print statement
        System.out.print(Math.round(spt * 100));
        System.out.println("% of the day has elapsed");
    }
}
