package com.wx.mapper;

import com.wx.pojo.Accesslog;
import com.wx.pojo.AccesslogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccesslogMapper {
    int countByExample(AccesslogExample example);

    int deleteByExample(AccesslogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accesslog record);

    int insertSelective(Accesslog record);

    List<Accesslog> selectByExample(AccesslogExample example);

    Accesslog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Accesslog record, @Param("example") AccesslogExample example);

    int updateByExample(@Param("record") Accesslog record, @Param("example") AccesslogExample example);

    int updateByPrimaryKeySelective(Accesslog record);

    int updateByPrimaryKey(Accesslog record);
}