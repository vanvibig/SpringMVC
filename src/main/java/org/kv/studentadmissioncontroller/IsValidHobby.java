package org.kv.studentadmissioncontroller;


import org.springframework.messaging.handler.annotation.Payload;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * Created by KV on 23/12/2016.
 */

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";

	String message() default "Please provide a valid Hobby; " +
			"accepted hobbies are - {1} (choose anyone)";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
