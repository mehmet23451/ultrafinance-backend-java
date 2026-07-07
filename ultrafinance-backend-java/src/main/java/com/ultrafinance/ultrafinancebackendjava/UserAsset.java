package com.ultrafinance.ultrafinancebackendjava;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Table(name = "user_assets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
