package com.architecure.hexagonal_Infrastructure_far_from_Domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "hexagonal")
public class HexagonalConfigurationProperties {

    private long transferThreshold = Long.MAX_VALUE;

}
