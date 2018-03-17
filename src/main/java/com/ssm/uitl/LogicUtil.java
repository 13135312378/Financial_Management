package com.ssm.uitl;

/**
 * 逻辑处理验证接口
 */
public interface LogicUtil {

	/**
	 * 查询返回单个对象逻辑处理
	 * @param object 传入判断的对象
	 * @return 返回Result对象
	 */
	public <T> Result get(T object);

	/**
	 * 查询结果返回多个对象逻辑处理
	 * @param object 传入判断的对象
	 * @param totalPages 分页的总页数
	 * @return 返回Result对象
	 */
	public <T> Result getList(T object, int totalPages);

	/**
	 * 修改逻辑判断
	 * @param line 影响的行数
	 * @return 返回Result对象
	 */
	public Result update(int line);

	/**
	 * 删除逻辑判断
	 * @param line 影响的行数
	 * @return 返回Result对象
	 */
	public Result del(int line);

	/**
	 * 新增逻辑判断
	 * @param line 影响的行数
	 * @return 返回Result对象
	 */
	public Result add(int line);


}
