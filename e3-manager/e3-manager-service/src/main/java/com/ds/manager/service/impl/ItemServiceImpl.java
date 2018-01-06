package com.ds.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.manager.mapper.TbItemMapper;
import com.ds.manager.pojo.TbItem;
import com.ds.manager.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findById(Long id) {
		
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
