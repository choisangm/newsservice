package com.xmrwjstk.newsservice.repository;

import com.xmrwjstk.newsservice.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
