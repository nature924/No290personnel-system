package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiabanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiabanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiabanjiluView;


/**
 * 下班记录
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface XiabanjiluService extends IService<XiabanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiabanjiluVO> selectListVO(Wrapper<XiabanjiluEntity> wrapper);
   	
   	XiabanjiluVO selectVO(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
   	
   	List<XiabanjiluView> selectListView(Wrapper<XiabanjiluEntity> wrapper);
   	
   	XiabanjiluView selectView(@Param("ew") Wrapper<XiabanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiabanjiluEntity> wrapper);
   	
}

