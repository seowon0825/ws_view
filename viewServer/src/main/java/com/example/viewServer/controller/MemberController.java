package com.example.viewServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	//로그인이 끝난 상태 -> 서비스를 이용하는 단계(멤버메인페이지) -> 게시물을 보거나 등록하는 것.
	@GetMapping("/main")
	public String main() {
		return "member/main";
	}
	
	@GetMapping("/regBoard")
	public String regBoard() {
		return "member/regBoardForm";
	}
	
	@GetMapping("/getBoardList")
	public String getBoardList() {
		return "member/boardList";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("bno") int bno, Model model) {
		return "member/getBoard";
	}
	
}
