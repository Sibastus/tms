package controller;


import dto.TenantDto;
import entity.Tenant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class TenantController {


    @RequestMapping(value = "/api/tenant", method = RequestMethod.POST)
    public void addTenant(@Valid @RequestBody Tenant tenant) {

    }


}
