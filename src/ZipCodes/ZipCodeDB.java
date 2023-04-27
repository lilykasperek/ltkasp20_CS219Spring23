package ZipCodes;
import Utility.Util;

import java.util.ArrayList;
import java.util.Collections;
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
                    parts[1].substring(1, parts[1].length() - 1),
                    parts[2].substring(1, parts[2].length() - 1),
                    parts[3].substring(1, parts[3].length() - 1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5])
            );
            codes.add(code);
        } // while

        Collections.sort(codes);

    } // load

    // TODO what if there is more than one entry
    // for a code? Return an arraylist of ZipCode objects
    public ZipCode findByZip(String code) {
        for (ZipCode zc : codes)
            if (zc.getCode().equals(code))
                return zc;
        return null;
    }

    // TODO return an arraylist of zipcodes that match code
    public ZipCode bsearch(String code) {
        int pos = Collections.binarySearch(codes, new ZipCode(code, "", "", 0, 0));

        if (pos == -1)
            return null;
         else
             return codes.get(pos);
    }

    public void findDuplicates() {
        for (int i = 0; i < codes.size() - 1; i++)
            for (int j = i + 1; j < codes.size(); j++)
                if (codes.get(i).getCode().equals(codes.get(j).getCode())) {
                    System.out.println(codes.get(i));
                    System.out.println(codes.get(j));
                }
    }

}
