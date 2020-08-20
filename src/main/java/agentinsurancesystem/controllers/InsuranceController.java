package agentinsurancesystem.controllers;

import agentinsurancesystem.services.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InsuranceController {
    @Autowired
    private InsuranceService insuranceService;
    @GetMapping("/insurance")
    public List<Map<String, Object>> insurance() {
        return insuranceService.getInsurances();
    }
}
