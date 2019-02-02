package entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tenant")
public class Tenant {

    @Id
    private Long id;

    private String tenantId;

    private String tenantAlias;

    private String discription;

    private boolean active;

    private DbPertenant dbPertenant;
}
