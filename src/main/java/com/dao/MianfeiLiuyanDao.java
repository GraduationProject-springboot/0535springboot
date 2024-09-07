package com.dao;

import com.entity.MianfeiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MianfeiLiuyanView;

/**
 * 免费电影评论 Dao 接口
 *
 * @author 
 */
public interface MianfeiLiuyanDao extends BaseMapper<MianfeiLiuyanEntity> {

   List<MianfeiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
