package com.dao;

import com.entity.ShangbanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangbanjiluVO;
import com.entity.view.ShangbanjiluView;


/**
 * 上班记录
 * 
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface ShangbanjiluDao extends BaseMapper<ShangbanjiluEntity> {
	
	List<ShangbanjiluVO> selectListVO(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
	
	ShangbanjiluVO selectVO(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
	
	List<ShangbanjiluView> selectListView(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);

	List<ShangbanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
	
	ShangbanjiluView selectView(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
	
}
