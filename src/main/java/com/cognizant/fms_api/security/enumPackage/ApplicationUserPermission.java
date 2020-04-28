package com.cognizant.fms_api.security.enumPackage;

public enum ApplicationUserPermission {

    POC_READ("poc:read"),
    POC_POST("poc:post"),

    PMO_READ("pmo:read"),
    PMO_POST("pmo:post"),

    ADMIN_READ("admin:read"),
    ADMIN_POST("admin:post"),
    ADMIN_DELETE("admin:delete");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

}
