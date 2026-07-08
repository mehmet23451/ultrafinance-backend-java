package com.ultrafinance.ultrafinancebackendjava.repository;

import com.ultrafinance.ultrafinancebackendjava.entity.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency,Long> {
}
