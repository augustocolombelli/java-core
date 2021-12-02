package com.apitest.controller.localdatetime.validator;

import org.apache.tomcat.jni.Local;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class SpecificDataValidator implements
        ConstraintValidator<SpecificDataConstraint, LocalDateTime> {

    @Override
    public void initialize(SpecificDataConstraint constraintAnnotation) {}

    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {
        return value != null &&
                value.isAfter(LocalDateTime.of(1300, 1, 1, 10, 00)) && //1300-1-1 10:00
                value.isBefore(LocalDateTime.of(3050, 1, 1, 10, 00)); //3050-1-1 10:00
    }
}
