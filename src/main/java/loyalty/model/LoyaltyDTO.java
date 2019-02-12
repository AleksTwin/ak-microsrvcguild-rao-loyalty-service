package loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

/**
 * @author aleksey.kovalenko@accenture.com
 */
@ApiModel
public class LoyaltyDTO {

    @JsonProperty
    String uuid;
    @JsonProperty
    Integer loyaltyPoints;


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
