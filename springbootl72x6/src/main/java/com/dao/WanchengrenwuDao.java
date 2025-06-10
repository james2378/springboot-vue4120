package com.dao;

import com.entity.WanchengrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengrenwuVO;
import com.entity.view.WanchengrenwuView;


/**
 * 完成任务
 * 
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface WanchengrenwuDao extends BaseMapper<WanchengrenwuEntity> {
	
	List<WanchengrenwuVO> selectListVO(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	
	WanchengrenwuVO selectVO(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	
	List<WanchengrenwuView> selectListView(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);

	List<WanchengrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	
	WanchengrenwuView selectView(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	

}
