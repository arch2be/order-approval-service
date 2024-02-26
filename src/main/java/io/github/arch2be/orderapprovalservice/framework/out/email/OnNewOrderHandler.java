package io.github.arch2be.orderapprovalservice.framework.out.email;

import io.github.arch2be.orderapprovalservice.application.domain.model.Order;
import io.github.arch2be.orderapprovalservice.application.port.out.NotifyAgentOnNewOrderPort;
import org.springframework.stereotype.Component;


@Component
class NotifyAgentOnNewOrder implements NotifyAgentOnNewOrderPort {

    @Override
    public void notify(final Order order, final String email) {

    }
}
