package tech.saintbassanaga.liveasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.saintbassanaga.liveasy.dtos.PayLoadDto;
import tech.saintbassanaga.liveasy.entity.PayLoad;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PayLoadRepository extends JpaRepository<PayLoad, UUID> {
    Optional<PayLoadDto> findPayLoadById(UUID id);

    Optional<List<PayLoadDto>> findPayLoadsByShipperId(UUID userId);

    void deletePayLoadById(UUID id);
}