package converters;


import dto.TenantDto;
import entity.Tenant;
import org.springframework.stereotype.Component;

@Component
public class TenantConverter {

    public Tenant convertToEntity (TenantDto tenantDto) {
        Tenant tenant = new Tenant();
        tenant.setTenantId(tenantDto.getTenantId());
        tenant.setTenantAlias(tenantDto.getTenantAlias());
        tenant.setDiscription(tenantDto.getDiscription());
        tenant.setActive(tenantDto.isActive());
        return tenant;
    }

    public TenantDto convertToDto (Tenant tenant) {
        TenantDto tenantDto = new TenantDto();
        tenantDto.setTenantId(tenant.getTenantId());
        tenantDto.setTenantAlias(tenant.getTenantAlias());
        tenantDto.setDiscription(tenant.getDiscription());
        tenantDto.setActive(tenant.isActive());
        return tenantDto;
    }

}
