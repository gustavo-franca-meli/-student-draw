package com.mercadolivre.studentDraw.service.impl;

import com.mercadolivre.studentDraw.infra.repository.StudentRepository;
import com.mercadolivre.studentDraw.response.StudentResponse;
import com.mercadolivre.studentDraw.response.StudentsRaffle;
import com.mercadolivre.studentDraw.service.StudentService;
import org.hibernate.mapping.Set;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private static Object apply(Integer a) {
        System.out.println(a.toString());
        return a;
    }

    @Override
    public StudentsRaffle shuffle() {
        var count = studentRepository.count();

        HashSet<Long> setInteger = new HashSet<Long>();
        Random rand = new Random(0);

        Long bound = count - 1;
        for(int i = 0; i < 10; i++){
            setInteger.add( new Long(rand.nextInt((int) (count - 1)) + 0));
        }
        System.out.println(setInteger);
        var sortedStudents = studentRepository.findAllById(setInteger);

        var responseStudents = sortedStudents.stream().map((s)-> new StudentResponse(s.getName())).collect(Collectors.toList());
        return new StudentsRaffle(responseStudents);

    }


    @Override
    public StudentsRaffle shuffleWithCollection() {
        var count = studentRepository.findAll();
        Collections.shuffle(count);
        var sortedStudents = count.subList(0,10);
        var responseStudents = sortedStudents.stream().map((s)-> new StudentResponse(s.getName())).collect(Collectors.toList());
        return new StudentsRaffle(responseStudents);

    }
}
