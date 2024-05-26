package com.jossegonnza.finanzasPersonales.controller;

import com.jossegonnza.finanzasPersonales.entity.Movements;
import com.jossegonnza.finanzasPersonales.service.MovementsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movements")
public class MovementsController {

    @Autowired
    private MovementsServiceImpl movementsService;

    @GetMapping
    public List<Movements> getAllMovements() {
        return movementsService.findAllMovements();
    }



}
