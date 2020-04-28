package com.cognizant.fms_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class VolunteerEnrollmentDetailsNotAttend {

    @Id
    private String volunteerEnrollmentDetailsNotAttendId;

    public String eventId;


    public String eventName;


    public String beneficiaryName;


    public String baseLocation;


    public Date eventDate;

    public Integer employeeId;

    private LocalDateTime createdTimeStamp;

    private LocalDateTime updatedTimeStamp;
}
