package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.JapanService;
import com.bdi.sp.vo.Japan;

@Controller
public class JapanController {

	@Autowired
	private JapanService js;
	
	@RequestMapping (value="/japans", method=RequestMethod.GET)
		public String getJapanList(Japan jp, Model model){
			model.addAttribute("jList", js.selectJapanList(jp));
			return "japan/test";
		}
	
	@RequestMapping (value="/japans/{jpnum}", method=RequestMethod.GET)
	public String getJapanOne(@PathVariable int jpnum, Model model){
		model.addAttribute("j", js.selectJapan(jpnum));
		return "japan/view";
	}
}
