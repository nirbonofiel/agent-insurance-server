package agentinsurancesystem.controllers;

import agentinsurancesystem.services.InsuranceForAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InsuranceForAgentController {
    @Autowired
    private InsuranceForAgentService insuranceForAgentService;
    @GetMapping("/insuranceForAgent")
    public List<Map<String, Object>> insuranceForAgent() {
        return insuranceForAgentService.getInsurancesForAgent();
    }
}
