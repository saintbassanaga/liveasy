package tech.saintbassanaga.liveasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.liveasy.entity.Shipper;

import java.util.Optional;
import java.util.UUID;

public interface ShipperRepository extends JpaRepository<Shipper, UUID> {
    Optional<Shipper> findByEmail(String email);
    Optional<Shipper> findShipperById(UUID uuid);
}