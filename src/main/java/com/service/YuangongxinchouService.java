package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongxinchouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongxinchouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongxinchouView;


/**
 * 员工薪酬
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface YuangongxinchouService extends IService<YuangongxinchouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongxinchouVO> selectListVO(Wrapper<YuangongxinchouEntity> wrapper);
   	
   	YuangongxinchouVO selectVO(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
   	
   	List<YuangongxinchouView> selectListView(Wrapper<YuangongxinchouEntity> wrapper);
   	
   	YuangongxinchouView selectView(@Param("ew") Wrapper<YuangongxinchouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongxinchouEntity> wrapper);
   	
}

