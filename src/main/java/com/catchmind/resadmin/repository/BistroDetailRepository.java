package com.catchmind.resadmin.repository;


import com.catchmind.resadmin.model.entity.BistroDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BistroDetailRepository extends JpaRepository<BistroDetail, Long> {
}
