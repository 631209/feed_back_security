package com.cognizant.fms_api.repository;

import com.cognizant.fms_api.entity.VolunteerEnrollmentDetailsUnregistered;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VolunteerEnrollmentDetailsUnregisteredRepository extends ReactiveMongoRepository<VolunteerEnrollmentDetailsUnregistered,Integer> {

}