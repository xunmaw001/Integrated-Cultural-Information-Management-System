package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenhuazhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenhuazhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuazhanshiView;


/**
 * 文化展示
 *
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface WenhuazhanshiService extends IService<WenhuazhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenhuazhanshiVO> selectListVO(Wrapper<WenhuazhanshiEntity> wrapper);
   	
   	WenhuazhanshiVO selectVO(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
   	
   	List<WenhuazhanshiView> selectListView(Wrapper<WenhuazhanshiEntity> wrapper);
   	
   	WenhuazhanshiView selectView(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenhuazhanshiEntity> wrapper);
   	
}

