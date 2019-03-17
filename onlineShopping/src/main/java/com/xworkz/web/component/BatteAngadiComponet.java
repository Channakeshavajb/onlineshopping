package com.xworkz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BatteAngadiComponet {

	public BatteAngadiComponet() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}
	
	@RequestMapping("kharidi")
	public String onClickKharidi() {
		System.out.println("onclick of kharidi");
		System.out.println("returning to same page");
		return "BatteAngadi.jsp";
	}
}
