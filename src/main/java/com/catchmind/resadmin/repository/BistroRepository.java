package com.catchmind.resadmin.repository;

import com.catchmind.resadmin.model.entity.Bistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BistroRepository extends JpaRepository<Bistro, Long> {
}
