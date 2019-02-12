package loyalty.repository;

import loyalty.repository.domain.LoyaltyDomain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aleksey.kovalenko@accenture.com
 */
@Repository
public interface LoyaltyRepository extends CrudRepository<LoyaltyDomain, Long> {

    LoyaltyDomain findByUuid(String uuid);
}
