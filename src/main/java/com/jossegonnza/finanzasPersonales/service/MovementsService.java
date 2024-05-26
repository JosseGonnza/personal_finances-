package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Movements;

import java.util.List;
import java.util.Optional;

public interface MovementsService {

    List<Movements> findAllMovements();
    Optional<Movements> findMovementById(Long id);
    void createMovement(Movements movements);
    void updateMovement(Long id, Movements movements);
    void deleteMovement(Long id);

}
