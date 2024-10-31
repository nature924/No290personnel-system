package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongxinxiView;


/**
 * 员工信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
public interface YuangongxinxiService extends IService<YuangongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongxinxiVO> selectListVO(Wrapper<YuangongxinxiEntity> wrapper);
   	
   	YuangongxinxiVO selectVO(@Param("ew") Wrapper<YuangongxinxiEntity> wrapper);
   	
   	List<YuangongxinxiView> selectListView(Wrapper<YuangongxinxiEntity> wrapper);
   	
   	YuangongxinxiView selectView(@Param("ew") Wrapper<YuangongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongxinxiEntity> wrapper);
   	
}

