package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiapairenwuDao;
import com.entity.XiapairenwuEntity;
import com.service.XiapairenwuService;
import com.entity.vo.XiapairenwuVO;
import com.entity.view.XiapairenwuView;

@Service("xiapairenwuService")
public class XiapairenwuServiceImpl extends ServiceImpl<XiapairenwuDao, XiapairenwuEntity> implements XiapairenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiapairenwuEntity> page = this.selectPage(
                new Query<XiapairenwuEntity>(params).getPage(),
                new EntityWrapper<XiapairenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiapairenwuEntity> wrapper) {
		  Page<XiapairenwuView> page =new Query<XiapairenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiapairenwuVO> selectListVO(Wrapper<XiapairenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiapairenwuVO selectVO(Wrapper<XiapairenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiapairenwuView> selectListView(Wrapper<XiapairenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiapairenwuView selectView(Wrapper<XiapairenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
