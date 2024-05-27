package com.jossegonnza.finanzasPersonales.controller;

import com.jossegonnza.finanzasPersonales.entity.Movements;
import com.jossegonnza.finanzasPersonales.repository.JDBCMovementRepository;
import com.jossegonnza.finanzasPersonales.repository.Movements2;
import com.jossegonnza.finanzasPersonales.repository.MovementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movements")
public class MovementsController {

    @Autowired
    private MovementsRepository movementsRepository;

    @Autowired
    private JDBCMovementRepository jdbcMovementRepository;

    @GetMapping
    public List<Movements> getAllMovements() {
        return movementsRepository.findAll();
    }

    @PutMapping("/update")
    public int updateMovement(@RequestBody Movements2 movements) {
        return jdbcMovementRepository.update(movements);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovement(@PathVariable Long id) {
        movementsRepository.deleteById(id);
    }

}
