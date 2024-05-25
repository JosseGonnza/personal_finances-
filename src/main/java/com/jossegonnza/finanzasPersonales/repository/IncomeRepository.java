package com.jossegonnza.finanzasPersonales.repository;

import com.jossegonnza.finanzasPersonales.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
