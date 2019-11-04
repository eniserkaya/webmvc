package eniserkaya.com.webmvc.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TCKimlikNoValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TCKimlikNo {
    String message() default "TC Kimlik numaranızı kontrol ediniz.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
