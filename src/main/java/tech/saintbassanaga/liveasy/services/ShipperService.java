package tech.saintbassanaga.liveasy.services;

import org.springframework.stereotype.Service;
import tech.saintbassanaga.liveasy.entity.Shipper;
import tech.saintbassanaga.liveasy.repository.ShipperRepository;

@Service
public class ShipperService {

    private final ShipperRepository shipperRepository;

    public String createShipper(Shipper shipper) {
      shipperRepository.save(shipper);
      return "Shipper created";
    }


    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }
}
