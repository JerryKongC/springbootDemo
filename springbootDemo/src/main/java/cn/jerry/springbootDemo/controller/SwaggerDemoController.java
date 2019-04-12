package cn.jerry.springbootDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Api("SwaggerDemoController 相关的Api")
public class SwaggerDemoController
{
    @ApiOperation(value = "用户登录",notes = "")
    @ApiImplicitParam(name = "用户名", value = "userName", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value = "/login",method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public String login()
    {
        return "登录成功";
    }

}
