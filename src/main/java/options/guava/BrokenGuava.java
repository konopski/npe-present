package options.guava;

import com.google.common.base.Optional;

public class BrokenGuava {
    public static void main(String[] args) {
        Optional<String> optional = Optional.fromNullable("aaa");
        System.out.println("optional = " + optional);

        Optional<String> transformed = optional.transform(x -> null);
        System.out.println("transformed = " + transformed);
    }
}
