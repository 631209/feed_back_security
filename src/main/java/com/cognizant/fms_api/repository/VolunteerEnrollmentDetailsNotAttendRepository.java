package com.cognizant.fms_api.repository;

import com.cognizant.fms_api.entity.VolunteerEnrollmentDetailsNotAttend;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface VolunteerEnrollmentDetailsNotAttendRepository extends ReactiveMongoRepository<VolunteerEnrollmentDetailsNotAttend,Integer> {
}
