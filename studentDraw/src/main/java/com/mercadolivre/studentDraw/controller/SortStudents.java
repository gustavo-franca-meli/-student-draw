package com.mercadolivre.studentDraw.controller;

import com.mercadolivre.studentDraw.response.StudentsRaffle;
import com.mercadolivre.studentDraw.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RequestMapping
@RestController
public class SortStudents {

    private  final StudentService studentService;

    public SortStudents(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/shuffle")
    public ResponseEntity<StudentsRaffle> studentsShuffle(){
        return ResponseEntity.ok(studentService.shuffle());
    }
    @GetMapping("/shuffleWithCollection")
    public ResponseEntity<StudentsRaffle> studentsShuffleWithCollection(){
        return ResponseEntity.ok(studentService.shuffleWithCollection());
    }

}
