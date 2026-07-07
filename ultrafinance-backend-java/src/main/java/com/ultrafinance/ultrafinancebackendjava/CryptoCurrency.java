package com.ultrafinance.ultrafinancebackendjava;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
