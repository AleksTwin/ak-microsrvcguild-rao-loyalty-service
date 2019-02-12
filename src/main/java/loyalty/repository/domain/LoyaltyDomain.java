package loyalty.repository.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author aleksey.kovalenko@accenture.com
 */
@Entity
public class LoyaltyDomain {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String uuid;
    private Integer loyaltyPoints;

    public LoyaltyDomain() {
    }

    public LoyaltyDomain(String uuid, Integer loyaltyPoints) {
        this.uuid = uuid;
        this.loyaltyPoints = loyaltyPoints;
    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
