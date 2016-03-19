package options.guava;

import scala.Option;
import scala.Some;
import scala.runtime.AbstractFunction1;

public class UnBrokenScala {
    public static void main(String[] args) {
        Option<String> optional = Some.apply("aaa");
        System.out.println("option = " + optional);

        AbstractFunction1<String, String> x_to_null = new AbstractFunction1<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };
        Option<String> transformed = optional.map(x_to_null);
        System.out.println("mapped = " + transformed);
    }
}
