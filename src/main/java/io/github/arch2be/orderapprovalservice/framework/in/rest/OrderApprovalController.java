package io.github.arch2be.orderapprovalservice.framework.in.rest;

import io.github.arch2be.orderapprovalservice.application.domain.OnOrderApproveUseCase;
import io.github.arch2be.orderapprovalservice.application.port.out.OnApproveOrderHandlerPort;
import io.github.arch2be.orderapprovalservice.application.port.out.OrderRepositoryPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/order")
class OrderApprovalController {
    private final OnOrderApproveUseCase onOrderApproveUseCase;

    OrderApprovalController(final OrderRepositoryPort orderRepositoryPort,
                            final OnApproveOrderHandlerPort onApproveOrderHandlerPort) {
        this.onOrderApproveUseCase = new OnOrderApproveUseCase(orderRepositoryPort, onApproveOrderHandlerPort);
    }

    @GetMapping(value = "/{orderId}/approve")
    void approve(@PathVariable("orderId") UUID orderId) {
        onOrderApproveUseCase.process(orderId);
    }
}
