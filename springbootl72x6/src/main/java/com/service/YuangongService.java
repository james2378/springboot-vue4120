package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongView;


/**
 * 员工
 *
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface YuangongService extends IService<YuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongVO> selectListVO(Wrapper<YuangongEntity> wrapper);
   	
   	YuangongVO selectVO(@Param("ew") Wrapper<YuangongEntity> wrapper);
   	
   	List<YuangongView> selectListView(Wrapper<YuangongEntity> wrapper);
   	
   	YuangongView selectView(@Param("ew") Wrapper<YuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);
   	

}

