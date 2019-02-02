package services.controllerServices;

import converters.TenantConverter;
import entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TenantRepository;

@Service
public class TenantServiceImpl implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private TenantConverter tenantConverter;

    @Override
    public Tenant addTenant(Tenant tenant) {

        tenantRepository.saveAndFlush(tenant);
        return tenant;
    }

    @Override
    public Tenant getByTenantId(String tenantId) {
        return null;
    }

    @Override
    public void updateTenant(String tenantId, String tenantAlias, String tenantDescription) {
        Tenant updateTenant = new Tenant();
        updateTenant.setTenantId(tenantId);
        updateTenant.setTenantAlias(tenantAlias);
        updateTenant.setDiscription(tenantDescription);
        tenantRepository.saveAndFlush(updateTenant);
    }

    @Override
    public void inactiveTenant(String tenantId, boolean active) {

    }
}
