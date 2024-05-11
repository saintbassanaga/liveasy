package tech.saintbassanaga.liveasy.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tech.saintbassanaga.liveasy.dtos.PayLoadDto;
import tech.saintbassanaga.liveasy.entity.PayLoad;
import tech.saintbassanaga.liveasy.repository.PayLoadRepository;

import java.util.List;
import java.util.UUID;

@Service
public class PayLoadService {
    private final PayLoadRepository payLoadRepository;

    public PayLoadService(PayLoadRepository payLoadRepository) {
        this.payLoadRepository = payLoadRepository;
    }

    /**
     *
     * @param payLoad load Details Holder object
     * @return Success Message if create or an Error if it is not
     */

    public String createLoad(PayLoad payLoad){
        payLoad.setShipperId(UUID.randomUUID());
        payLoadRepository.save(payLoad);
        return "Loads details added successfully ";
    }

    /**
     *
     * @param id used to find the Load
     * @return A found not just an message if not found
     */

    public PayLoadDto findById(UUID id){
        return payLoadRepository.findPayLoadById(id).orElseThrow(
                ()->new RuntimeException("The is no loads with this Id")
        );
    }

    /**
     *
     * @param uuid : shipper Id used to find all load related with
     * @return A list of found Loads
     */

    public List<PayLoadDto> payLoadList(UUID uuid){
        return payLoadRepository.findPayLoadsByShipperId(uuid).orElseThrow(
               ()-> new RuntimeException("There is no load with for the shipper Id you provide")
       );
    }

    /**
     *
     * @param uuid : it is a Id of the payLoad to be Updated
     * @param payLoad it is the load change handler data that will be applied the founded load
     * @return payLoadCheck : The final load to be sand to the repository
     */

    public PayLoad updatePayLoad(UUID uuid, PayLoadDto payLoad){
        PayLoad payLoadChecked = payLoadRepository.findById(uuid).orElseThrow(()->  new RuntimeException("PayLoad Not Found"));
        if (payLoadChecked != null){
            payLoadChecked.setLoadingPoint(payLoad.loadingPoint());
            payLoadChecked.setUnloadingPoint(payLoad.unloadingPoint());
            payLoadChecked.setProductType(payLoad.productType());
            payLoadChecked.setTruckType(payLoad.truckType());
            payLoadChecked.setNoOfTrucks(payLoad.noOfTrucks());
            payLoadChecked.setWeight(payLoad.weight());
            payLoadChecked.setComment(payLoad.comment());
            payLoadChecked.setDate(payLoad.date());
            payLoadRepository.save(payLoadChecked);
        }
        return payLoadChecked;
    }

    /**
     *
     * @param uuid it permits to find the load to be deleted
     * @implNote  That method find the load using the provided Id and Delete if found \
     *          Or just return an Error if not found
     */

    @Transactional
    public void deletePayLoad(UUID uuid){
        PayLoad load = payLoadRepository.findById(uuid).orElseThrow(()->new RuntimeException("There is not load with that Id"));
        if (load != null)
            payLoadRepository.deletePayLoadById(uuid);
    }
}
