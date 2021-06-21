package com.mercadolivre.studentDraw.infra.seed;


import com.mercadolivre.studentDraw.infra.entity.StudentEntity;
import com.mercadolivre.studentDraw.infra.repository.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDb {
    private StudentRepository dbService;

    public ConfigDb(StudentRepository dbService) {
        this.dbService = dbService;
    }

    @Bean
    public boolean instantiateDatabase() {
     /*   for(int i = 1000 ; i < 100000; i++){
            dbService.save(new StudentEntity("Aluno " + i));
        }*/
        return true;
    }
}