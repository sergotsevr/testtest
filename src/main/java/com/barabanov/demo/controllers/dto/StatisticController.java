package com.barabanov.demo.controllers.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/statistic")
public class StatisticController {

    @GetMapping("/revenue")
    private Long getRevenue(RevenueFilter revenueFilter){
        return 0L;
    }
}
