package com.cognizant.fms_api.repository;

import com.cognizant.fms_api.entity.OutreachEventInformation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface OutreachEventInformationRepository extends ReactiveMongoRepository<OutreachEventInformation, Integer> {
}
