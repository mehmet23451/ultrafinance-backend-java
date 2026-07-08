package com.ultrafinance.ultrafinancebackendjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "crypto_currencies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CryptoCurrency {
    @Id
    private String id;
    @Column(unique = true, nullable = false)
    private String symbol;
    @Column(nullable = false)
    private String name;
    private double currentPrice;
    private double priceChangePercentage24h;
    private String imageUrl;



}
