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


import com.dao.JiabanjiluDao;
import com.entity.JiabanjiluEntity;
import com.service.JiabanjiluService;
import com.entity.vo.JiabanjiluVO;
import com.entity.view.JiabanjiluView;

@Service("jiabanjiluService")
public class JiabanjiluServiceImpl extends ServiceImpl<JiabanjiluDao, JiabanjiluEntity> implements JiabanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiabanjiluEntity> page = this.selectPage(
                new Query<JiabanjiluEntity>(params).getPage(),
                new EntityWrapper<JiabanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiabanjiluEntity> wrapper) {
		  Page<JiabanjiluView> page =new Query<JiabanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiabanjiluVO> selectListVO(Wrapper<JiabanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiabanjiluVO selectVO(Wrapper<JiabanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiabanjiluView> selectListView(Wrapper<JiabanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiabanjiluView selectView(Wrapper<JiabanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
