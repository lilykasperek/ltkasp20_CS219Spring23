package ZipCodes;
import Utility.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class ZipCodeDB {


    private ArrayList<ZipCode> codes;

    public ZipCodeDB() {
        codes = new ArrayList<>();
    }


    public void load() {
        Scanner s = Util.openSite("http://10.60.15.25/~ehar/cs219/zips.txt");

        if (s == null) {
            System.out.println("Error: couldn't open site.");
            return;
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] parts = line.split(",");
            ZipCode code = new ZipCode(
                    parts[1],
                    parts[2],
                    parts[3],
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5])
            );

            codes.add(code);
        }

    }
}
