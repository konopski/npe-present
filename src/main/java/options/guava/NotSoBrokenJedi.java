package options.guava;

import jedi.option.Option;
import jedi.option.Options;

public class NotSoBrokenJedi {
    public static void main(String[] args) {
        Option<String> optional = Options.some("aaa");
        System.out.println("option = " + optional);

        Option<String> transformed = optional.map(x -> null);
        System.out.println("mapped = " + transformed);
    }
}
