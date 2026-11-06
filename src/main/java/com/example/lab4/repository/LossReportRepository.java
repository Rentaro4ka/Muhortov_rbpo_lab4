package com.example.lab4.repository;

import com.example.lab4.model.LossReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LossReportRepository extends JpaRepository<LossReport, Long> {
}