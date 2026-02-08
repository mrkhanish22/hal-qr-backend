package com.hal.hal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hal.hal.model.Component;

public interface ComponentRepository extends JpaRepository<Component, Long> {
}