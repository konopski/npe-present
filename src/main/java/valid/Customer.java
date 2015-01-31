package valid;

import javax.validation.constraints.NotNull;

public class Customer {

    @NotNull
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
