package com.dao;

import com.entity.JiabanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiabanjiluVO;
import com.entity.view.JiabanjiluView;


/**
 * 加班记录
 * 
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface JiabanjiluDao extends BaseMapper<JiabanjiluEntity> {
	
	List<JiabanjiluVO> selectListVO(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
	
	JiabanjiluVO selectVO(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
	
	List<JiabanjiluView> selectListView(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);

	List<JiabanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
	
	JiabanjiluView selectView(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
	
}
