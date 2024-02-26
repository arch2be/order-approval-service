package io.github.arch2be.orderapprovalservice.application.port.out;

import io.github.arch2be.orderapprovalservice.application.domain.model.Order;

public interface OnSubmitOrderHandlerPort {

    void handle(Order order);
}
