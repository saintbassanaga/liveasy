package tech.saintbassanaga.liveasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.liveasy.entity.Load;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LoadRepository extends JpaRepository<Load, UUID> {

    List<Load> findLoadsByShipperId(UUID userId);

    void deletePayLoadById(UUID id);
}