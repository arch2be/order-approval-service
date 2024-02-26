package io.github.arch2be.orderapprovalservice.application.domain.model;

import java.util.Set;
import java.util.UUID;

public class Order {
    private final CustomerDetails customerDetails;
    private final Set<Product> productToInstall;

    private OrderStatus status = OrderStatus.WAITING_FOR_APPROVAL;

    public Order(final CustomerDetails customerDetails, final Set<Product> productToInstall) {
        this.customerDetails = customerDetails;
        this.productToInstall = productToInstall;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public Set<Product> getProductToInstall() {
        return productToInstall;
    }

    public void approve() {
        status = OrderStatus.APPROVED;
    }

    public boolean isApproved() {
        return status == OrderStatus.APPROVED;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
