package com.entity.view;

import com.entity.ShangbanjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 上班记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
@TableName("shangbanjilu")
public class ShangbanjiluView  extends ShangbanjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangbanjiluView(){
	}
 
 	public ShangbanjiluView(ShangbanjiluEntity shangbanjiluEntity){
 	try {
			BeanUtils.copyProperties(this, shangbanjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
