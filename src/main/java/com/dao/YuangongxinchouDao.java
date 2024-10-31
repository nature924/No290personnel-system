package com.dao;

import com.entity.YuangongxinchouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongxinchouVO;
import com.entity.view.YuangongxinchouView;


/**
 * 员工薪酬
 * 
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface YuangongxinchouDao extends BaseMapper<YuangongxinchouEntity> {
	
	List<YuangongxinchouVO> selectListVO(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	YuangongxinchouVO selectVO(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	List<YuangongxinchouView> selectListView(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);

	List<YuangongxinchouView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
	YuangongxinchouView selectView(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
	
}
