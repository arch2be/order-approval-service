package io.github.arch2be.orderapprovalservice.framework.in.rabbitmq.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CustomerDetailsDTO implements Serializable {
    private String clientName;
    private String clientSurname;
    private String installationAddress;
    private LocalDateTime preferredInstallationDate;
    private String timeSlotDetails;

    public CustomerDetailsDTO() {
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(final String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getInstallationAddress() {
        return installationAddress;
    }

    public void setInstallationAddress(final String installationAddress) {
        this.installationAddress = installationAddress;
    }

    public LocalDateTime getPreferredInstallationDate() {
        return preferredInstallationDate;
    }

    public void setPreferredInstallationDate(final LocalDateTime preferredInstallationDate) {
        this.preferredInstallationDate = preferredInstallationDate;
    }

    public String getTimeSlotDetails() {
        return timeSlotDetails;
    }

    public void setTimeSlotDetails(final String timeSlotDetails) {
        this.timeSlotDetails = timeSlotDetails;
    }
}