package options.guava;


import java.util.Optional;

public class NotSoBrokenUtil {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("aaa");
        System.out.println("optional = " + optional);

        Optional<String> transformed = optional.map(x -> null);
        System.out.println("mapped = " + transformed);
    }
}
