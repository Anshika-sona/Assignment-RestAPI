package com.liveasy.repository;

import com.liveasy.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransporterRepository extends JpaRepository<Transporter, Long> {
    // Add custom query methods if needed
}
