package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;

/**
 * service层
 * @author LuoYongLiang
 * @date   2019年1月26日 下午2:43:48
 * @version  1.0
 */

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper; 

	@Override
	public TbItem selectByPrimaryKey(Long itemId) {
		//根据主键编号查询商品信息
		/*TbItem tbItem=itemMapper.selectByPrimaryKey(itemId);
		return tbItem;*/
		
		//设置查询条件
		TbItemExample example=new TbItemExample();
		Criteria createCriteria = example.createCriteria();	
		createCriteria.andIdEqualTo(itemId);
		
		List<TbItem> selectByExample = itemMapper.selectByExample(example);
		if (selectByExample != null && selectByExample.size()>0) {
			return selectByExample.get(0);
		}	
		return null;
	}	
}
