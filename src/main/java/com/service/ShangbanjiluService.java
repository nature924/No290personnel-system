package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangbanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangbanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangbanjiluView;


/**
 * 上班记录
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface ShangbanjiluService extends IService<ShangbanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangbanjiluVO> selectListVO(Wrapper<ShangbanjiluEntity> wrapper);
   	
   	ShangbanjiluVO selectVO(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
   	
   	List<ShangbanjiluView> selectListView(Wrapper<ShangbanjiluEntity> wrapper);
   	
   	ShangbanjiluView selectView(@Param("ew") Wrapper<ShangbanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangbanjiluEntity> wrapper);
   	
}

