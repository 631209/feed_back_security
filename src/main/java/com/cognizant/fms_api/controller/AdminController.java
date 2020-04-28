package com.cognizant.fms_api.controller;

import com.cognizant.fms_api.model.Dashboard;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AdminController {

    @GetMapping("/admin/dashboard")
    @PreAuthorize("hasAuthority('admin:read')")
    public Dashboard getAdminDashboard() {
        return new Dashboard(5, 5, 5, 5);
    }

    @GetMapping("/poc/dashboard")
    @PreAuthorize("hasAnyAuthority('poc:read','admin:read')")
    public Dashboard getPOCDashboard() {
        return new Dashboard(3, 3, 3, 3);
    }

    @GetMapping("/pmo/dashboard")
    @PreAuthorize("hasAnyAuthority('pom:read','admin:read')")
    public Dashboard getPMODashboard() {
        return new Dashboard(1, 1, 1, 1);
    }
}
