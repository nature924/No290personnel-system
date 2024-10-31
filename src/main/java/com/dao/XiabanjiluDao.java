package com.dao;

import com.entity.XiabanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiabanjiluVO;
import com.entity.view.XiabanjiluView;


/**
 * 下班记录
 * 
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface XiabanjiluDao extends BaseMapper<XiabanjiluEntity> {
	
	List<XiabanjiluVO> selectListVO(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
	
	XiabanjiluVO selectVO(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
	
	List<XiabanjiluView> selectListView(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);

	List<XiabanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
	
	XiabanjiluView selectView(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
	
}
