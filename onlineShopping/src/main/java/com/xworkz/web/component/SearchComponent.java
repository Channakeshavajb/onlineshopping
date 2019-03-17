package com.xworkz.web.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.web.MySpringComponent;

//@Controller
//@Component
@MySpringComponent
@RequestMapping("/")
public class SearchComponent {

	private List<String> items = new ArrayList<String>();

	@PostConstruct
	public void initItems() {
		System.out.println("Invoked init items");
		items.add("Jackets");
		items.add("Pants");
		items.add("Tishirts");
		items.add("Seere");
		items.add("Angi");
		items.add("Lungi");
	}

	public SearchComponent() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/search")
	public String onSearch(@RequestParam String item, ModelMap model) {
		model.addAttribute("itemList", items);
		model.addAttribute("item", item);
		System.out.println("invoked onSearch with items\t" + item);
		if (item != null && !item.isEmpty()) {
			for (String tempItems : items) {
				if (tempItems.equalsIgnoreCase(item)) {
					System.out.println("Item found");
					model.addAttribute("message", "Item Found");
					break;
				} else {
					System.out.println("Item not  found");
					model.addAttribute("message", "Item not found");
				}
			}
		}

		return "Search.jsp";

	}

	@PreDestroy
	public void clear() {
		System.out.println("invoked clear");
		this.items.clear();
	}
}
