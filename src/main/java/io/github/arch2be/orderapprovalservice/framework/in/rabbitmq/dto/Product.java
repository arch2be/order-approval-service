package io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private ProductType type;
    private String details;

    public ProductDTO() {
    }

    public ProductType getType() {
        return type;
    }

    public void setType(final ProductType type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(final String details) {
        this.details = details;
    }
}
