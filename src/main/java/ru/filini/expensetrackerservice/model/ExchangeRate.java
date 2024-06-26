package ru.filini.expensetrackerservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exchange_rates")
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source_currency", nullable = false)
    private String sourceCurrency;

    @Column(name = "target_currency", nullable = false)
    private String targetCurrency;

    @Column(nullable = false)
    private BigDecimal rate;

    @Column(nullable = false)
    private LocalDate date;

    public ExchangeRate(String sourceCurrency, String targetCurrency, BigDecimal rate, LocalDate date) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
        this.date = date;
    }
}
