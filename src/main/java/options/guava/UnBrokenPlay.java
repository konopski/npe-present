package options.guava;

import play.libs.F;

public class UnBrokenPlay {
    public static void main(String[] args) {
        F.Option<String> optional = F.Some("aaa");
        System.out.println("option = " + optional);

        F.Option<String> transformed = optional.map(x -> null);
        System.out.println("mapped = " + transformed);
    }
}
