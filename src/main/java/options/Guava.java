package options;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public class Guava {

    public static void main(String[] args) {
        Optional<String> o = Optional.of(null);
        Optional<String> o1 = Optional.fromNullable(null);

        if(o.isPresent()) {
            System.out.println(o.get());
        }

        for(String some : o.asSet()) {
            System.out.println(  some.toUpperCase() );
        }

        o.get();
        o.or("default");

        o = Optional.of("some");
        o.transform(new Function<String, String>() {
            @Override  public String apply(String input) {

                return input.toUpperCase();
            }
        });

        Iterable<String> presentStrings = Optional.presentInstances(ImmutableList.of(o, o1));

    }
}
