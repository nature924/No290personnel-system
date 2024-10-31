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


import com.dao.ShangbanjiluDao;
import com.entity.ShangbanjiluEntity;
import com.service.ShangbanjiluService;
import com.entity.vo.ShangbanjiluVO;
import com.entity.view.ShangbanjiluView;

@Service("shangbanjiluService")
public class ShangbanjiluServiceImpl extends ServiceImpl<ShangbanjiluDao, ShangbanjiluEntity> implements ShangbanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangbanjiluEntity> page = this.selectPage(
                new Query<ShangbanjiluEntity>(params).getPage(),
                new EntityWrapper<ShangbanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangbanjiluEntity> wrapper) {
		  Page<ShangbanjiluView> page =new Query<ShangbanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangbanjiluVO> selectListVO(Wrapper<ShangbanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangbanjiluVO selectVO(Wrapper<ShangbanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangbanjiluView> selectListView(Wrapper<ShangbanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangbanjiluView selectView(Wrapper<ShangbanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
