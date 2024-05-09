package tech.saintbassanaga.liveasy.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * DTO for {@link tech.saintbassanaga.liveasy.entity.PayLoad}
 */
public record PayLoadDto(UUID id, String loadingPoint, String unloadingPoint, String productType, String truckType,
                         String noOfTrucks, Long weight, String comment, UUID shipperId,
                         Date date) implements Serializable {
}