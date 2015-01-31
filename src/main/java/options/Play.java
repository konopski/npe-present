package options;


import play.libs.F;

import java.net.MalformedURLException;
import java.net.URL;

public class Play {
    public static void main(String[] args) throws MalformedURLException {
        F.Option<String> o = option(null);
        o.isDefined();
        o.isEmpty();

        for(String some : o) {
            System.out.println(some);
        }

        F.Option<String> mapped = o.map(new F.Function<String, String>() {
            @Override public String apply(String s) throws Throwable {
                return s.toUpperCase();
            }
        });

        o.contains(new URL("http://www.google.com"));

        o.toArray();

        System.out.println(mapped.get());
    }


    private static <T> F.Option<T> option(T mayBeNull) {
        return null==mayBeNull ? F.Option.<T>None() : F.Option.Some(mayBeNull);
    }
}
