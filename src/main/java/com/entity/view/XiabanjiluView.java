package com.entity.view;

import com.entity.XiabanjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下班记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 17:11:35
 */
@TableName("xiabanjilu")
public class XiabanjiluView  extends XiabanjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiabanjiluView(){
	}
 
 	public XiabanjiluView(XiabanjiluEntity xiabanjiluEntity){
 	try {
			BeanUtils.copyProperties(this, xiabanjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
