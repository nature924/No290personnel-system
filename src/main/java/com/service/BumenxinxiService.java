package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenxinxiView;


/**
 * 部门信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface BumenxinxiService extends IService<BumenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenxinxiVO> selectListVO(Wrapper<BumenxinxiEntity> wrapper);
   	
   	BumenxinxiVO selectVO(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
   	
   	List<BumenxinxiView> selectListView(Wrapper<BumenxinxiEntity> wrapper);
   	
   	BumenxinxiView selectView(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenxinxiEntity> wrapper);
   	
}

