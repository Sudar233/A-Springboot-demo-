package com.epc.mapper;

import com.epc.pojo.domain.Login;
import com.epc.pojo.domain.LoginCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LoginMapper {
    int countByExample(LoginCriteria example);

    int deleteByExample(LoginCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExampleWithRowbounds(LoginCriteria example, RowBounds rowBounds);

    List<Login> selectByExample(LoginCriteria example);

    Login selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginCriteria example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginCriteria example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}