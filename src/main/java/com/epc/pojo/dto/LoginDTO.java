package com.epc.pojo.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel("登录所需的数据")
public class LoginDTO {
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空")
    private String name;

    @ApiModelProperty("密码")
    @NotNull(message="密码不能为空")
    private String password;

}
