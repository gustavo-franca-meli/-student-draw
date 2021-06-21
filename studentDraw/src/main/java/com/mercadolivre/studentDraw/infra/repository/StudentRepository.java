package com.mercadolivre.studentDraw.infra.repository;

import com.mercadolivre.studentDraw.infra.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
