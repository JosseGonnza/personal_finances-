package com.jossegonnza.finanzasPersonales.repository;

import com.jossegonnza.finanzasPersonales.entity.Movements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementsRepository extends JpaRepository<Movements, Long> {
}
