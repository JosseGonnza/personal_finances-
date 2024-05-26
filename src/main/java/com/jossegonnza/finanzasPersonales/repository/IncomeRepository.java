package com.jossegonnza.finanzasPersonales.repository;

import com.jossegonnza.finanzasPersonales.entity.Category;
import com.jossegonnza.finanzasPersonales.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    List<Category> findByCategoryId(Long categoryId);

}
