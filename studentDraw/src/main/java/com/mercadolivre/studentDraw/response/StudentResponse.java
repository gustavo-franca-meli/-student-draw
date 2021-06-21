package com.mercadolivre.studentDraw.response;

import lombok.Data;

@Data
public class StudentResponse {
    private String name;

    public StudentResponse(String name) {
        this.name = name;
    }
}
