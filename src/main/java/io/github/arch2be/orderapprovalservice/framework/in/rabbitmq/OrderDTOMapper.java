package io.github.arch2be.orderapprovalservice.framework.in.rabbitmq;

import io.github.arch2be.orderapprovalservice.application.domain.model.CustomerDetails;
import io.github.arch2be.orderapprovalservice.application.domain.model.Order;
import io.github.arch2be.orderapprovalservice.application.domain.model.Product;
import io.github.arch2be.orderapprovalservice.application.domain.model.ProductType;
import io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto.CustomerDetailsDTO;
import io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto.OrderDTO;
import io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
class OrderMapper {

    Order toDomain(OrderDTO orderDTO) {
        return new Order(toCustomerDetails(orderDTO.getCustomerDetails()), toProductsInstall(orderDTO.getProductToInstall()));
    }

    private Set<Product> toProductsInstall(final Set<ProductDTO> productsDTO) {
        return productsDTO.stream()
                .map(this::toProduct)
                .collect(Collectors.toSet());
    }

    private Product toProduct(final ProductDTO productRequest) {
        return new Product(
                ProductType.valueOf(productRequest.getType().name()),
                productRequest.getDetails());
    }

    private CustomerDetails toCustomerDetails(final CustomerDetailsDTO customerDetailsDTO) {
        return new CustomerDetails(
                customerDetailsDTO.getClientName(),
                customerDetailsDTO.getClientSurname(),
                customerDetailsDTO.getInstallationAddress(),
                customerDetailsDTO.getPreferredInstallationDate(),
                customerDetailsDTO.getTimeSlotDetails());
    }
}
