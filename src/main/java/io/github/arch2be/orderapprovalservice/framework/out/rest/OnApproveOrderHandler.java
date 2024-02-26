package io.github.arch2be.orderapprovalservice.framework.out.rest;

import io.github.arch2be.orderapprovalservice.application.domain.model.Order;
import io.github.arch2be.orderapprovalservice.application.port.out.OnApproveOrderHandlerPort;
import org.springframework.stereotype.Component;

@Component
class OnApproveOrderHandler implements OnApproveOrderHandlerPort {

    @Override
    public void handle(final Order order) {

    }
}
