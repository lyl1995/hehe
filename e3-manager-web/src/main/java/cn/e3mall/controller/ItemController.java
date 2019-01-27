package cn.e3mall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 控制层或者表现层
 * @author LuoYongLiang
 * @date   2019年1月26日 下午2:54:31
 * @version  1.0
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
@Controller
public class ItemController {
   
    @Autowired
    private ItemService itemService;
    
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem selectByPrimaryKey(@PathVariable Long itemId){
    	System.out.println("进来了");
    	TbItem selectByPrimaryKey = itemService.selectByPrimaryKey(itemId);
    	return selectByPrimaryKey;
    }
}
