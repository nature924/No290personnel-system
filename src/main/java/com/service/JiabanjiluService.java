package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiabanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiabanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiabanjiluView;


/**
 * 加班记录
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface JiabanjiluService extends IService<JiabanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiabanjiluVO> selectListVO(Wrapper<JiabanjiluEntity> wrapper);
   	
   	JiabanjiluVO selectVO(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
   	
   	List<JiabanjiluView> selectListView(Wrapper<JiabanjiluEntity> wrapper);
   	
   	JiabanjiluView selectView(@Param("ew") Wrapper<JiabanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiabanjiluEntity> wrapper);
   	
}

