package com.example.lab4.repository;

import com.example.lab4.model.ItemClaim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemClaimRepository extends JpaRepository<ItemClaim, Long> {
}