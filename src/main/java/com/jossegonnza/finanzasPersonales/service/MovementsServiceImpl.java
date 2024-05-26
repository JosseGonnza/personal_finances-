package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;
import com.jossegonnza.finanzasPersonales.entity.Income;
import com.jossegonnza.finanzasPersonales.entity.Movements;
import com.jossegonnza.finanzasPersonales.repository.MovementsRepository;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Optional;

@Service
public class MovementsServiceImpl implements MovementsService{

    private MovementsRepository movementsRepository;

    @Override
    public List<Movements> findAllMovements() {
        return movementsRepository.findAll();
    }

    @Override
    public Optional<Movements> findMovementById(Long id) {
        return movementsRepository.findById(id);
    }

    @Override
    public void updateMovement(Long id, Movements movements) {
        Movements movements1 = findMovementById(id).orElseThrow(() -> new InvalidParameterException("Invalid Id"));
        movements1.setName(movements.getName());
        movements1.setQuantity(movements.getQuantity());
        movementsRepository.save(movements1);
    }

    @Override
    public void deleteMovement(Long id) {
        movementsRepository.deleteById(id);
    }
}
