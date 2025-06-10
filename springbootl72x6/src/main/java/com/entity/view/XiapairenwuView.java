package com.entity.view;

import com.entity.XiapairenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下派任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
@TableName("xiapairenwu")
public class XiapairenwuView  extends XiapairenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiapairenwuView(){
	}
 
 	public XiapairenwuView(XiapairenwuEntity xiapairenwuEntity){
 	try {
			BeanUtils.copyProperties(this, xiapairenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
