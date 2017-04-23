package com.simon.quick.common;


/**
 * 
* @ClassName: BaseDao  
* @Description: 所有自定义Dao的顶级接口, 封装常用的增删查改操作
* @author simon 
* @date 2017年4月17日 上午11:00:13  
*  
* T: 代表数据库中的表 映射的Java对象类型
* PK :代表对象的主键类型
 */

public interface BaseDao<T, PK> {
	
	 /**
     * 插入对象
     *
     * @param model 对象
     */
    int insertSelective(T model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int updateByPrimaryKeySelective(T model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    T selectByPrimaryKey(PK id);


}
