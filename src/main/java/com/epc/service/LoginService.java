package com.epc.service;

import com.epc.pojo.dto.LoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;




public interface LoginService {
     Boolean verifyLoginInfo(@RequestBody LoginDTO loginDTO);
}
