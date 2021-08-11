package com.transfersrealizationservice.repository;

import com.transfersrealizationservice.model.entity.TransferRealization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface TransferRealizationRepository extends JpaRepository<TransferRealization, Long> {
}
