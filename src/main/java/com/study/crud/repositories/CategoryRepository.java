package com.study.crud.repositories;

import com.study.crud.entities.Category;
import com.study.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}