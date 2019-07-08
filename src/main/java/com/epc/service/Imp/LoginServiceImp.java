package com.epc.service.Imp;

import com.epc.mapper.LoginMapper;
import com.epc.pojo.domain.Login;
import com.epc.pojo.domain.LoginCriteria;
import com.epc.pojo.dto.LoginDTO;
import com.epc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Boolean verifyLoginInfo(LoginDTO loginDTO) {
        //定义查找名字相同的账号的规则
        LoginCriteria loginCriteria = new LoginCriteria();
        LoginCriteria.Criteria criteria = loginCriteria.createCriteria();
        criteria.andNameEqualTo(loginDTO.getName());

        //查找名字相同的对象列表
        List<Login> loginInfo= loginMapper.selectByExample(loginCriteria);

        //如果密码相同返回true 错误返回wrong
        if(loginDTO.getPassword().equals(loginInfo.get(0).getPassword())) {
            return true;
        }else{
            return false;
        }

    }
}
