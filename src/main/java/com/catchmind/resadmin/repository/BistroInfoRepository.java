package com.catchmind.resadmin.repository;

import com.catchmind.resadmin.model.entity.BistroInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BistroInfoRepository extends JpaRepository<BistroInfo, Long> {
}
