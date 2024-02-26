package io.github.arch2be.orderapprovalservice.application.domain.model;

import java.time.LocalDateTime;

public record CustomerDetails(String clientName, String clientSurname, String installationAddress,
                              LocalDateTime preferredInstallationDate, String timeSlotDetails) {
}
