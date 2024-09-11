package com.example.demo.member.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface memberMapper {
	
	public boolean register();
	
	public int countByMemEmail(String email);
}
