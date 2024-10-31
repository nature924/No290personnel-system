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


import com.dao.KaoqinxinxiDao;
import com.entity.KaoqinxinxiEntity;
import com.service.KaoqinxinxiService;
import com.entity.vo.KaoqinxinxiVO;
import com.entity.view.KaoqinxinxiView;

@Service("kaoqinxinxiService")
public class KaoqinxinxiServiceImpl extends ServiceImpl<KaoqinxinxiDao, KaoqinxinxiEntity> implements KaoqinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqinxinxiEntity> page = this.selectPage(
                new Query<KaoqinxinxiEntity>(params).getPage(),
                new EntityWrapper<KaoqinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqinxinxiEntity> wrapper) {
		  Page<KaoqinxinxiView> page =new Query<KaoqinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoqinxinxiVO> selectListVO(Wrapper<KaoqinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoqinxinxiVO selectVO(Wrapper<KaoqinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoqinxinxiView> selectListView(Wrapper<KaoqinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqinxinxiView selectView(Wrapper<KaoqinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
