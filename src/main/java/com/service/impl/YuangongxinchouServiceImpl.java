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


import com.dao.YuangongxinchouDao;
import com.entity.YuangongxinchouEntity;
import com.service.YuangongxinchouService;
import com.entity.vo.YuangongxinchouVO;
import com.entity.view.YuangongxinchouView;

@Service("yuangongxinchouService")
public class YuangongxinchouServiceImpl extends ServiceImpl<YuangongxinchouDao, YuangongxinchouEntity> implements YuangongxinchouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongxinchouEntity> page = this.selectPage(
                new Query<YuangongxinchouEntity>(params).getPage(),
                new EntityWrapper<YuangongxinchouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongxinchouEntity> wrapper) {
		  Page<YuangongxinchouView> page =new Query<YuangongxinchouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongxinchouVO> selectListVO(Wrapper<YuangongxinchouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongxinchouVO selectVO(Wrapper<YuangongxinchouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongxinchouView> selectListView(Wrapper<YuangongxinchouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongxinchouView selectView(Wrapper<YuangongxinchouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
