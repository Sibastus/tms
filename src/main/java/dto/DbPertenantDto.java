package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DbPertenantDto {

    private Long id;
    private String idTenant;
    private String servicesName;
    private String dbName;
    private String userLogin;
    private String userPassword;
    private boolean isActive;
}
