package com.sist.web.controller;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

import com.sist.web.mapper.*;
// gh pr create --base develop --head feature/login --title "color change" --body "기능수정 완료"
@Controller
@RequiredArgsConstructor
public class MemberController {
	private final MemberMapper mMapper;
	
	@GetMapping("/list")
	public String member_list(Model model)
	{
		List<MemberVO> list = mMapper.memberListData();
		
		model.addAttribute("list", list);
		for(MemberVO vo : list)
		{
			System.out.println(vo.getId()+ " "+vo.getName()+" "+vo.getSex());
		}
		return "list";
	}
}
