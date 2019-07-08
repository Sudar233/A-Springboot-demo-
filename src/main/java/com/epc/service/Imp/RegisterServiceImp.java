package com.epc.service.Imp;

import com.epc.mapper.LoginMapper;
import com.epc.pojo.domain.Login;
import com.epc.pojo.dto.RegisterDTO;
import com.epc.service.RegisterService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com.epc.mapper")
public class RegisterServiceImp implements RegisterService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Boolean insertInfo(RegisterDTO registerDTO) {
        //new一个登录对象
        Login login = new Login();
        //将传入的值传给登录对象
        BeanUtils.copyProperties(registerDTO,login);

        //将对象通过Mapper插入数据库
        try{
            loginMapper.insertSelective(login);
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
