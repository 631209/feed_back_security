package com.cognizant.fms_api.service;

import com.cognizant.fms_api.entity.OutreachEventSummary;
import com.cognizant.fms_api.model.Dashboard;
import com.cognizant.fms_api.repository.OutreachEventSummaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminService {

    private final OutreachEventSummaryRepository outreachEventSummaryRepository;

    public Dashboard getAdminDashBoard() {


        List<OutreachEventSummary> eventList = outreachEventSummaryRepository.findAll().collectList().block();

        Dashboard d= new Dashboard(0,0,0,0);

        d.setTotalEvents((int)eventList.stream().map(OutreachEventSummary::getEventId).distinct()
                .count());



        int count = (int)eventList.stream().count();



        return null;

    }


}
