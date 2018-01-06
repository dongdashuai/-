package com.ds.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.manager.pojo.TbItem;
import com.ds.manager.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
       
	  @RequestMapping("/findById/{itemId}")
	  @ResponseBody
	  public TbItem findById(@PathVariable Long itemId){
		  TbItem item = itemService.findById(itemId);
		  return item;
	  }
}
