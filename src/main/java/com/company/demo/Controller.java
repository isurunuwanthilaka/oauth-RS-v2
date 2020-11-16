package com.company.demo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value="/hello",method=RequestMethod.GET)
	@PreAuthorize("#oauth2.hasScope('READ')")
    public String helloSecured() {
        return "Hello - Secured";
    }
}
