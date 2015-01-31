package object;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Avoid {

    public static void main(String[] args) {

        List<String> results = getResults();
        process();
    }

    static void process(List<String> results) {

        for(String r : results) {
            ///...
            r.toString();
        }
    }


    static List<String> getResults() {
        return Collections.emptyList();
    }

    static void process(String ... results) {
        for(String r : results) {
            ///...
            r.toString();
        }
    }


}
