package services.dataServices;


import converters.TenantConverter;
import dto.TenantDto;
import entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import services.controllerServices.TenantServiceImpl;

@Service
public class TenantDataService {

    @Autowired
    private TenantServiceImpl tenantServiceImp;

    @Autowired
    private TenantConverter tenantConverter;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void saveTenant(TenantDto tenantDto) {
        Tenant tenant = tenantServiceImp.addTenant(tenantConverter.convertToEntity(tenantDto));
    }


}
