package com.jossegonnza.finanzasPersonales.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JDBCMovementRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public int update(Movements2 movements) {
        String sql = "UPDATE movements SET type = ?, name = ?, quantity = ?, category_id = ? WHERE id = ?";

        return jdbcTemplate.update(sql,
                movements.getType().name(),
                movements.getName(),
                movements.getQuantity(),
                movements.getCategory_id(),
                movements.getId());
    }



}
