package com.cognizant.fms_api.repository;

import com.cognizant.fms_api.entity.OutreachEventSummary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;


public interface OutreachEventSummaryRepository extends ReactiveMongoRepository<OutreachEventSummary, Integer> {

    Mono<OutreachEventSummary> findByEventId(String eventId);

}
