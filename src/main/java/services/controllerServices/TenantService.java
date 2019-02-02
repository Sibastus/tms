package services.controllerServices;

import entity.Tenant;

public interface TenantService {

    Tenant addTenant(Tenant tenant);
    Tenant getByTenantId(String tenantId);
    void updateTenant (String tenantId, String tenantAlias, String tenantDescription);
    void inactiveTenant (String tenantId, boolean active);
}
