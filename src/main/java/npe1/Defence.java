package npe1;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.Validate;

import java.util.Objects;

public class Defence {

    static String commonsLang(String param) {
        return Validate.notNull(param);
    }

    static String guava(String param) {
        return Preconditions.checkNotNull(param);
    }

    static String java(String param) {
        return Objects.requireNonNull(param).toUpperCase();
    }

    public static void main(String[] args) {
        java(null);
    }
}
