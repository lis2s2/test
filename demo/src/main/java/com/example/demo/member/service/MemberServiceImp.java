package com.example.demo.member.service;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.member.dto.MemberDTO;
import com.example.demo.member.mapper.memberMapper;

@Transactional
@Service
public class MemberServiceImp implements MemberService {

	@Override
	public boolean register(MemberDTO dto) {

		if (dto.getMemEmail() == null || dto.getMemberPwd() == null || dto.getMemberName() == null) {
			return false;
		}

//        if (repository.existsById(dto.getMemId()) || repository.existsByMemEmail(dto.getMemEmail())) {
//            return false;
//        }
//
//        entity.setMemRole("ROLE_USER");
//
//        String enPw = passwordEncoder.encode(entity.getMemPwd());
//        entity.setMemPwd(enPw);
//
//        repository.save(entity);
		return true;
	}

	@Override
	public List<Member> getList() {
		
//		List<Member> memberList = member.getList();

		return null;
	}

}
