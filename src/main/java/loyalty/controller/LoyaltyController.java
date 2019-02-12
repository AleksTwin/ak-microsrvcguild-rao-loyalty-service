package loyalty.controller;

import io.swagger.annotations.Api;
import loyalty.model.LoyaltyDTO;
import loyalty.service.LoyaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aleksey.kovalenko@accenture.com
 */
@RestController
@RequestMapping("/v1/loyalty")
@Api(tags = "Loyalty")
public class LoyaltyController {

    @Autowired
    private LoyaltyService service;


    @GetMapping(produces = "application/json")
    public LoyaltyDTO getLoyalty() {
//        service.store();
        return service.getLoyalty();
    }
}
