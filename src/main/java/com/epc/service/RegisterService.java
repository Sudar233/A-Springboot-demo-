package com.epc.service;

import com.epc.pojo.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {

    public Boolean insertInfo(RegisterDTO registerDTO);

}
