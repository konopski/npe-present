package options.guava;


import io.atlassian.fugue.Option;

public class UnBrokenFugue {
    public static void main(String[] args) {
        Option<String> optional = Option.some("aaa");
        System.out.println("option = " + optional);

        Option<String> transformed = optional.map(x -> null);
        System.out.println("mapped = " + transformed);
    }
}
