package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiapairenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiapairenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiapairenwuView;


/**
 * 下派任务
 *
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface XiapairenwuService extends IService<XiapairenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiapairenwuVO> selectListVO(Wrapper<XiapairenwuEntity> wrapper);
   	
   	XiapairenwuVO selectVO(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
   	
   	List<XiapairenwuView> selectListView(Wrapper<XiapairenwuEntity> wrapper);
   	
   	XiapairenwuView selectView(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiapairenwuEntity> wrapper);
   	

}

