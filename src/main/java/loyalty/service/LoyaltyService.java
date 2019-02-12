package loyalty.service;

import java.util.UUID;

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

    private static String uuid = UUID.randomUUID().toString();

    @Autowired
    private LoyaltyRepository loyaltyRepository;


    public void store() {
        loyaltyRepository.save(new LoyaltyDomain(uuid, 666223));
    }

    public LoyaltyDTO getLoyalty() {
        LoyaltyDomain ld = loyaltyRepository.findByUuid(uuid);

        LoyaltyDTO loyaltyDTO = new LoyaltyDTO();
        loyaltyDTO.setUuid(ld.getUuid());
        loyaltyDTO.setLoyaltyPoints(ld.getLoyaltyPoints());

        return loyaltyDTO;
    }
}
