package com.epc.pojo.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;


// 测试不加描述时数据的问题
@Data
@ApiModel("注册时所需数据")
public class RegisterDTO {

    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空")
    private String name;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    private  String password;

}
