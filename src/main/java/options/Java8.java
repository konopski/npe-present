package options;

import java.util.Optional;

public class Java8 {

    public static void main(String[] args) {
        Optional<String> o = Optional.of(null);

        o.map( (x) -> x.toUpperCase() );

    }
}
