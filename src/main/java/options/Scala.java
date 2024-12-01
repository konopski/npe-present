package options;

import scala.Option;


public class Scala {
    public static void main(String[] args) {

        System.out.println(Option.apply(null));
        System.out.println(Option.apply("value"));

        System.out.println(Option.apply(null).getClass());
        System.out.println(Option.apply("value").getClass());

        var o = Option.apply(null);
        if(o.isEmpty()) {
            System.out.println(o.get());
        }



    }

}
