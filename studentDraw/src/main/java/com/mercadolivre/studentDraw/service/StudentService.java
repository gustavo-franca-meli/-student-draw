package com.mercadolivre.studentDraw.service;

import com.mercadolivre.studentDraw.response.StudentsRaffle;
import org.springframework.web.servlet.function.EntityResponse;

public interface StudentService {

    StudentsRaffle shuffle();

    StudentsRaffle shuffleWithCollection();
}
