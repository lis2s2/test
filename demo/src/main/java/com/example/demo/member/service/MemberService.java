package com.example.demo.member.service;

import java.lang.reflect.Member;
import java.util.List;

import com.example.demo.member.dto.MemberDTO;

public interface MemberService {

	List<Member> getList();
	
	boolean register(MemberDTO dto);
}
