package converters;

import dto.DbPertenantDto;
import entity.DbPertenant;

public class DbPertenantConverter {

    public DbPertenant dbPertenantDtoToDbPertenant (DbPertenantDto dbPertenantDto) {
        DbPertenant dbPertenant = new DbPertenant();
        dbPertenant.setIdTenant(dbPertenantDto.getIdTenant());
        dbPertenant.setServicesName(dbPertenantDto.getServicesName());
        dbPertenant.setDbName(dbPertenantDto.getDbName());
        dbPertenant.setUserLogin(dbPertenantDto.getUserLogin());
        dbPertenant.setUserPassword(dbPertenantDto.getUserPassword());
        dbPertenant.setActive(dbPertenantDto.isActive());
        return dbPertenant;
    }

    public DbPertenantDto dbPertenantToDbPertenantDto (DbPertenant dbPertenant) {
        DbPertenantDto dbPertenantDto = new DbPertenantDto();
        dbPertenantDto.setIdTenant(dbPertenant.getIdTenant());
        dbPertenantDto.setServicesName(dbPertenant.getServicesName());
        dbPertenantDto.setDbName(dbPertenant.getDbName());
        dbPertenantDto.setUserLogin(dbPertenant.getUserLogin());
        dbPertenantDto.setUserPassword(dbPertenant.getUserPassword());
        dbPertenantDto.setActive(dbPertenant.isActive());
        return  dbPertenantDto;
    }



}
