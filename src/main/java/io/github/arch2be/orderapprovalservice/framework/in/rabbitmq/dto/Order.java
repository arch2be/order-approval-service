package io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

public class OrderDTO implements Serializable {
    private UUID uuid;
    private CustomerDetailsDTO customerDetails;
    private Set<ProductDTO> productToInstall;

    public OrderDTO() {
    }

    public OrderDTO(final UUID uuid, final CustomerDetailsDTO customerDetails, final Set<ProductDTO> productToInstall) {
        this.uuid = uuid;
        this.customerDetails = customerDetails;
        this.productToInstall = productToInstall;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(final UUID uuid) {
        this.uuid = uuid;
    }

    public CustomerDetailsDTO getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(final CustomerDetailsDTO customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Set<ProductDTO> getProductToInstall() {
        return productToInstall;
    }

    public void setProductToInstall(final Set<ProductDTO> productToInstall) {
        this.productToInstall = productToInstall;
    }
}
