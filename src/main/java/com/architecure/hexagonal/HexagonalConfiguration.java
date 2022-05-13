package com.architecure.hexagonal;

import com.architecure.hexagonal.account.application.service.MoneyTransferProperties;
import com.architecure.hexagonal.account.domaincore.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HexagonalConfigurationProperties.class)
public class HexagonalConfiguration {

    /**
     * Adds a use-case-specific {@link MoneyTransferProperties} object to the application context. The properties
     * are read from the Spring-Boot-specific {@link HexagonalConfigurationProperties} object.
     */
    @Bean
    public MoneyTransferProperties moneyTransferProperties(HexagonalConfigurationProperties hexagonalConfigurationProperties){
        return new MoneyTransferProperties(Money.of(hexagonalConfigurationProperties.getTransferThreshold()));
    }

}