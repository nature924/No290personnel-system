package com.entity.view;

import com.entity.YuangongxinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工薪酬
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
@TableName("yuangongxinchou")
public class YuangongxinchouView  extends YuangongxinchouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongxinchouView(){
	}
 
 	public YuangongxinchouView(YuangongxinchouEntity yuangongxinchouEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongxinchouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
