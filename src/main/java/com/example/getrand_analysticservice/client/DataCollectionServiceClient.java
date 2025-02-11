package com.example.getrand_analysticservice.client;

import com.example.getrand_analysticservice.dto.DefaultPastOYResponseDTO;
import com.example.getrand_analysticservice.dto.RealTimeTrendResponseDTO;
import com.example.getrand_analysticservice.dto.RelatedQueriesResponseDTO;
import com.example.getrand_analysticservice.dto.RelatedTopicsResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "datacollectionservice", url = "http://192.168.56.113/datacollectionservice")
public interface DataCollectionServiceClient {
    @GetMapping("/defaultPastOY/findall")
    public List<DefaultPastOYResponseDTO> getAllDefaultPastOY();

    @GetMapping("/defaultPastOY/update")
    public List<DefaultPastOYResponseDTO> updateDefaultPastOY();

    @GetMapping("/realTimeTrend/findall")
    public List<RealTimeTrendResponseDTO> getAllRealTimeTrend();

    @GetMapping("/realTimeTrend/update")
    public List<RealTimeTrendResponseDTO> updateRealTimeTrend();

    @GetMapping("/relatedTopics/findall")
    public List<RelatedTopicsResponseDTO> getAllRelatedTopics();

    @GetMapping("/relatedTopics/update")
    public List<RelatedTopicsResponseDTO> updateRelatedTopics();

    @GetMapping("/relatedQueries/findall")
    public List<RelatedQueriesResponseDTO> getAllRelatedQueries();

    @GetMapping("/relatedQueries/update")
    public List<RelatedQueriesResponseDTO> updateRelatedQueries();
}
