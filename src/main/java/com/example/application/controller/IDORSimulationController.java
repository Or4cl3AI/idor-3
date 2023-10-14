```java
package com.example.application.controller;

import com.example.application.model.IDORAttempt;
import com.example.application.service.IDORSimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/idor")
public class IDORSimulationController {

    private final IDORSimulationService idorSimulationService;

    @Autowired
    public IDORSimulationController(IDORSimulationService idorSimulationService) {
        this.idorSimulationService = idorSimulationService;
    }

    @GetMapping("/attempts")
    public List<IDORAttempt> getIDORAttempts() {
        return idorSimulationService.getIDORAttempts();
    }
}
```
