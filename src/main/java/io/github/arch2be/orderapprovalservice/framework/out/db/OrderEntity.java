package io.github.arch2be.orderapprovalservice.framework.out.db;

import io.github.arch2be.orderapprovalservice.application.domain.model.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.PersistenceCreator;

import java.util.UUID;

@Entity(name = "order_table")
class OrderEntity {

    @Id
    @UuidGenerator
    private UUID uuid;

    @PersistenceCreator
    public OrderEntity() {
    }

    Order toDomain() {
        return null;
    }
}
