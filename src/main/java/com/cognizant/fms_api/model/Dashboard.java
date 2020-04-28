package com.cognizant.fms_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dashboard {

    private Integer totalEvents;
    private Integer livesImpacted;
    private Integer totalVolunteers;
    private Integer totalParticipants;
}
