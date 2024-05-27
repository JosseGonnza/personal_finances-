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
        String sql = "UPDATE movements SET type = 'INGRESO', name = 'Test', quantity = 10, category_id = 1 WHERE id = 1;";

        String typeAsString = movements.getType().name();
        return jdbcTemplate.update(sql, movements.getType(), movements.getName(),
                movements.getQuantity(), movements.getCategory_id(), movements.getId());
    }


}
