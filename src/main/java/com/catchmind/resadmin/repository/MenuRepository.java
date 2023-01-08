package com.catchmind.resadmin.repository;



import com.catchmind.resadmin.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    Optional<Menu> findByMeName(String meName);
    Optional<Menu> findByMeIdx(Long meIdx);
}
