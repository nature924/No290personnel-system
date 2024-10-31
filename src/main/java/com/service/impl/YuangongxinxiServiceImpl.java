package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongxinxiDao;
import com.entity.YuangongxinxiEntity;
import com.service.YuangongxinxiService;
import com.entity.vo.YuangongxinxiVO;
import com.entity.view.YuangongxinxiView;

@Service("yuangongxinxiService")
public class YuangongxinxiServiceImpl extends ServiceImpl<YuangongxinxiDao, YuangongxinxiEntity> implements YuangongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongxinxiEntity> page = this.selectPage(
                new Query<YuangongxinxiEntity>(params).getPage(),
                new EntityWrapper<YuangongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongxinxiEntity> wrapper) {
		  Page<YuangongxinxiView> page =new Query<YuangongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongxinxiVO> selectListVO(Wrapper<YuangongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongxinxiVO selectVO(Wrapper<YuangongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongxinxiView> selectListView(Wrapper<YuangongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongxinxiView selectView(Wrapper<YuangongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
