package com.mercadolivre.studentDraw.response;


import lombok.Data;

import java.util.List;

@Data
public class StudentsRaffle {

    private List<StudentResponse> student;

    public StudentsRaffle(List<StudentResponse> student) {
        this.student = student;
    }
}
