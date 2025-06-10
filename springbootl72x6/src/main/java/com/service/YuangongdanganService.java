package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongdanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongdanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongdanganView;


/**
 * 员工档案
 *
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface YuangongdanganService extends IService<YuangongdanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongdanganVO> selectListVO(Wrapper<YuangongdanganEntity> wrapper);
   	
   	YuangongdanganVO selectVO(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
   	
   	List<YuangongdanganView> selectListView(Wrapper<YuangongdanganEntity> wrapper);
   	
   	YuangongdanganView selectView(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongdanganEntity> wrapper);
   	

}

