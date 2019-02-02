package repository;

import entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TenantRepository extends JpaRepository<Tenant, Long> {

    @Query("select a from Tenant a where a.tenantId = :tenantId")
    Tenant findByTenantId(@Param("tenantId") String tenantId);
}
