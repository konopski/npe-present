package options;

import jedi.option.Option;
import jedi.option.OptionMatcher;
import jedi.option.Options;
import npe1.stubs.User;

import java.util.HashMap;

public class Jedi {
    public static void main(String[] args) {
        Option<String> o = Options.option(null);

        o.unsafeGet();

        o.match(new OptionMatcher<String>() {
            @Override public void caseSome(String s) {
            }

            @Override public void caseNone() {
            }
        });

        Option<User> userOption = Options.get(new HashMap<String, User>(), "id");

    }
}
