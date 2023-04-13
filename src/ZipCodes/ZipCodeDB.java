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
                    parts[1].substring(1, parts[1].length() - 1),
                    parts[2].substring(1, parts[2].length() - 1),
                    parts[3].substring(1, parts[3].length() - 1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5])
            );
            codes.add(code);
        }

    }

    public ZipCode findByZip(String code) {
        for (ZipCode zc : codes)
            if (zc.getCode().equals(code))
                return zc;
        return null;
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
