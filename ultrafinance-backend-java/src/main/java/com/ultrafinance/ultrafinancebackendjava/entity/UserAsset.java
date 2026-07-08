package com.ultrafinance.ultrafinancebackendjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_assets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="crypto_id", nullable = false)
    private CryptoCurrency cryptoCurrency;

    private double Quantity;
}
