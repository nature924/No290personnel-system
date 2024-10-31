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


import com.dao.XiabanjiluDao;
import com.entity.XiabanjiluEntity;
import com.service.XiabanjiluService;
import com.entity.vo.XiabanjiluVO;
import com.entity.view.XiabanjiluView;

@Service("xiabanjiluService")
public class XiabanjiluServiceImpl extends ServiceImpl<XiabanjiluDao, XiabanjiluEntity> implements XiabanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiabanjiluEntity> page = this.selectPage(
                new Query<XiabanjiluEntity>(params).getPage(),
                new EntityWrapper<XiabanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiabanjiluEntity> wrapper) {
		  Page<XiabanjiluView> page =new Query<XiabanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiabanjiluVO> selectListVO(Wrapper<XiabanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiabanjiluVO selectVO(Wrapper<XiabanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiabanjiluView> selectListView(Wrapper<XiabanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiabanjiluView selectView(Wrapper<XiabanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
