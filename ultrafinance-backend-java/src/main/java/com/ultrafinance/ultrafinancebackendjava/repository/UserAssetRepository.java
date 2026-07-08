package com.ultrafinance.ultrafinancebackendjava.repository;

import com.ultrafinance.ultrafinancebackendjava.entity.UserAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAssetRepository extends JpaRepository<UserAsset,Long> {
}
