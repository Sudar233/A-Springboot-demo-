package com.epc.controller;

import com.epc.pojo.dto.LoginDTO;
import com.epc.pojo.dto.RegisterDTO;
import com.epc.service.LoginService;
import com.epc.service.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description = "注册登录")
@RestController
public class indexController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

    @ResponseBody
    @ApiOperation(value = "登录" , notes = "登录")
    @PostMapping(path = "test")
    public String index() {
        return "Hello World";
    }

    @ResponseBody
    @ApiOperation(value = "注册",notes = "注册")
    @PostMapping(path ="register")
    public String register(@RequestBody RegisterDTO registerDTO){
        Boolean isResgiter = registerService.insertInfo(registerDTO);
        if(isResgiter == true){
            return "注册成功";
        }else{
            return "注册失败";
        }

    }


    @ResponseBody
    @ApiOperation(value = "登录", notes = "注册")
    @PostMapping(path = "login")
    public String login(@RequestBody LoginDTO loginDTO){

        Boolean isLogin = loginService.verifyLoginInfo(loginDTO);
        if(isLogin == true){
            return "登录成功";
        }else{
            return "登录失败";
        }
    }






}




