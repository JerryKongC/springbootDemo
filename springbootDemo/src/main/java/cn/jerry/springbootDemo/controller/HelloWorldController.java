package cn.jerry.springbootDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("api")
@Api(value = "Hello World")
public class HelloWorldController
{
    @ApiOperation(value = "测试 springboot Hello World")
    @RequestMapping(value = "/hello", method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld()
    {
        return "Hello World";
    }
}
