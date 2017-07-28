package com.dilaverdemirel.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dilaverd on 7/28/2017.
 */
@RestController("hello")
@Api("Rest Hello Endpoint")
public class HelloController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ApiOperation(value = "Hello to everyone.")
    public String sayHelloToEveryone(String name) {
        return "Hello everyone.";
    }

    @RequestMapping(value = "/sayHello",method = RequestMethod.POST)
    @ApiOperation(value = "Hello to you.")
    public String sayHello(String name) {
        return new StringBuilder().append("Hello ").append(name).toString();
    }

    @RequestMapping(value = "/sayHello",method = RequestMethod.DELETE)
    @ApiOperation(value = "Hello to anyone.")
    public String sayHelloToAnyone() {
        return "Goodbye.";
    }
}
