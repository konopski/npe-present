package npe1;

import com.google.common.base.MoreObjects;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;


public class StaticHelpers {

    public static void main(String[] args) {
        String.valueOf(null);
        java.util.Objects.toString(null, "default");
        ObjectUtils.toString(null, "default");
        Objects.equals(null, "not");
        Objects.hashCode(null);
        Objects.isNull(null);
        StringUtils.isEmpty("");
        StringUtils.isEmpty(null);
        StringUtils.isAnyEmpty("more", "than", null);

    }
}
