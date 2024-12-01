package options;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Optional;

public class Java8 {

    public static void main(String[] args) {
        Optional<String> o = Optional.ofNullable(null);

        o.isPresent();
        o.isEmpty();

        o.ifPresent( s -> System.out.println(s.length()) );


        o.map( (x) -> x.toUpperCase() );

        var n = new Object() {
            String i = "42";
        };

        Optional<Integer> maybeInteger = Optional.of(n).flatMap(x -> parse(x.i));
    }

    static Optional<Integer> parse(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
