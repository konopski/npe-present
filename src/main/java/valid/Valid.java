package valid;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Valid {

    public static void main(String[] args) {
        Customer customer = new Customer();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Customer>> violations = validator.validateProperty(customer, "name");
        for(ConstraintViolation<Customer> v : violations) {
            System.out.println(v.getMessage());
        }
    }
}
