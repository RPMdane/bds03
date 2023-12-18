package com.devsuperior.bds03.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    
    List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldMessage, String message) {
        errors.add(new FieldMessage(fieldMessage, message));
    }

    
}
