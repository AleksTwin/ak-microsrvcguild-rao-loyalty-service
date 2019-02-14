package loyalty.service;

import java.util.Optional;

import loyalty.model.LoyaltyDTO;
import loyalty.repository.LoyaltyRepository;
import loyalty.repository.domain.LoyaltyDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aleksey.kovalenko@accenture.com
 */
@Service
public class LoyaltyService {

    @Autowired
    private LoyaltyRepository loyaltyRepository;


    public void initialize() {
        String uuid1 = "b0bceb97-edfa-4b59-9255-16a2733404e4";
        loyaltyRepository.save(new LoyaltyDomain(uuid1, 25));

        String uuid2 = "12d0c490-0f2e-429a-a376-30669146f422";
        loyaltyRepository.save(new LoyaltyDomain(uuid2, 60));

        String uuid3 = "2c126d5a-96bb-441a-89b0-3a87bba4c6cc";
        loyaltyRepository.save(new LoyaltyDomain(uuid3, 47));
    }

    public LoyaltyDTO getLoyalty(String uuid) {
        LoyaltyDTO loyaltyDTO = new LoyaltyDTO();
        loyaltyDTO.setUuid(uuid);

        Optional<LoyaltyDomain> ld = Optional.ofNullable(loyaltyRepository.findByUuid(uuid));
        ld.ifPresent((domain) -> {
            loyaltyDTO.setLoyaltyPoints(domain.getLoyaltyPoints());
        });

        return loyaltyDTO;
    }
}
