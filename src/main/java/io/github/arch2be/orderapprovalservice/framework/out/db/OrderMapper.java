package io.github.arch2be.orderapprovalservice.framework.out.db;

import io.github.arch2be.orderapprovalservice.application.domain.model.Order;
import org.springframework.stereotype.Component;

@Component
class OrderMapper {

    Order toDomain(OrderEntity entity) {
        return entity.toDomain();
    }

    OrderEntity toEntity(Order order) {
        return null;
    }
}
