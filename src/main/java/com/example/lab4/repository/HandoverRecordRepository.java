package com.example.lab4.repository;

import com.example.lab4.model.HandoverRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandoverRecordRepository extends JpaRepository<HandoverRecord, Long> {
}