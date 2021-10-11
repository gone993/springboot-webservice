package com.gone993.book.springboot.domain.menus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenusRepository extends JpaRepository<Menus, Long> {

    @Query("SELECT * FROM Menus")
    List<Menus> load();
}
