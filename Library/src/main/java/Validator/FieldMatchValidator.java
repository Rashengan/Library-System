package Validator;

import org.springframework.validation.Errors;

import Model.Book;
import Model.User;


public class FieldMatchValidator {
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		User u = (User)target;
		if(u.getUserName().equals(u.getPassword()) == false)
			errors.rejectValue("textField3", "my.custom.err");		
	}
}
