package com.example.activemq.repository;

import com.example.activemq.domain.UprUzenet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UprUzenetRepository extends JpaRepository<UprUzenet, Long> {
}
