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
@NoArgsConstructor
@AllArgsConstructor
public class OutreachEventInformation {


    @Id
    private String outreachEventInformationId;
    private String eventId;
    private String baseLocation;
    private String beneficiaryName;
    private String councilName;
    private String eventName;
    private String eventDescription;
    private Date eventDate;
    private Integer employeeId;
    private String employeeName;
    private Double volunteerHours;
    private Double travelHours;
    private Integer livesImpacted;
    private String businessUnit;
    private String status;
    private String IIEPcategory;

    private LocalDateTime createdTimeStamp;

    private LocalDateTime updatedTimeStamp;
}
