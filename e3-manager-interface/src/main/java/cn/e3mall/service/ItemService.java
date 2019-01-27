package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 接口类
 * @author LuoYongLiang
 * @date   2019年1月26日 下午2:45:50
 * @version  1.0
 */

public interface ItemService {
	/**
	 * 根据商品id查询商品信息
	 * @param id
	 * @return 条数
	 */
	 TbItem selectByPrimaryKey(Long itemId);
}
