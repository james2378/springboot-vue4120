package com.dao;

import com.entity.XiapairenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiapairenwuVO;
import com.entity.view.XiapairenwuView;


/**
 * 下派任务
 * 
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface XiapairenwuDao extends BaseMapper<XiapairenwuEntity> {
	
	List<XiapairenwuVO> selectListVO(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
	
	XiapairenwuVO selectVO(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
	
	List<XiapairenwuView> selectListView(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);

	List<XiapairenwuView> selectListView(Pagination page,@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
	
	XiapairenwuView selectView(@Param("ew") Wrapper<XiapairenwuEntity> wrapper);
	

}
