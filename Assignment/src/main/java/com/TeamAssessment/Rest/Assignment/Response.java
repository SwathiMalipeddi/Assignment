package com.TeamAssessment.Rest.Assignment;

import java.util.ArrayList;
import java.util.List;


public class Response {

    private List<String> errors = new ArrayList<>();
    private String status;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
