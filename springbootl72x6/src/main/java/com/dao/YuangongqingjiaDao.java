package com.dao;

import com.entity.YuangongqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongqingjiaVO;
import com.entity.view.YuangongqingjiaView;


/**
 * 员工请假
 * 
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public interface YuangongqingjiaDao extends BaseMapper<YuangongqingjiaEntity> {
	
	List<YuangongqingjiaVO> selectListVO(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	YuangongqingjiaVO selectVO(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	List<YuangongqingjiaView> selectListView(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);

	List<YuangongqingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	YuangongqingjiaView selectView(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	

}
