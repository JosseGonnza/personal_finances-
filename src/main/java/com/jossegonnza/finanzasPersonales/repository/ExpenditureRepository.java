package com.jossegonnza.finanzasPersonales.repository;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenditureRepository extends JpaRepository<Expenditure, Long> {

    List<Expenditure> findByCategoryId(Long categoryId);

}
