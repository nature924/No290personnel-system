package com.dao;

import com.entity.BumenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenxinxiVO;
import com.entity.view.BumenxinxiView;


/**
 * 部门信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface BumenxinxiDao extends BaseMapper<BumenxinxiEntity> {
	
	List<BumenxinxiVO> selectListVO(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	
	BumenxinxiVO selectVO(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	
	List<BumenxinxiView> selectListView(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);

	List<BumenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	
	BumenxinxiView selectView(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	
}
