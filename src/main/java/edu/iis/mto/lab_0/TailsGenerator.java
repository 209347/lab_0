package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return Collections.emptyList();
        }

        List<String> cutString = new ArrayList<String>(value.length() + 1);
        for (int i = 0; i < value.length() + 1; i++) {
            cutString.add(value.substring(i));
        }
        return cutString;
    }

}
