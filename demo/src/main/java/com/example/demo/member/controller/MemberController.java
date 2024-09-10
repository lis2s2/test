package com.example.demo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.member.dto.MemberDTO;
import com.example.demo.member.service.MemberService;

@Controller
public class MemberController {
	

//    @Autowired
//    MemberService service;

	@GetMapping("/")
	public String membership() {
		System.out.println("test");
		return "membership";
	}
	
//	@PostMapping("/membership")
//	public String membershipPost(MemberDTO dto, RedirectAttributes redirectAttributes) {
//
//		boolean isSuccess = service.register(dto);
//
//		if(isSuccess) {
//			return "redirect:/";
//		} else {
//			redirectAttributes.addFlashAttribute("msg", "아이디가 중복되어 등록에 실패하였습니다");
//			return "redirect:/member/membership"; // 주소 수정
//		}
//
//	}
}
