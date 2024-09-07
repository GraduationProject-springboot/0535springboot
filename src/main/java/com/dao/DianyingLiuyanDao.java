package com.dao;

import com.entity.DianyingLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingLiuyanView;

/**
 * 付费电影评价 Dao 接口
 *
 * @author 
 */
public interface DianyingLiuyanDao extends BaseMapper<DianyingLiuyanEntity> {

   List<DianyingLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
