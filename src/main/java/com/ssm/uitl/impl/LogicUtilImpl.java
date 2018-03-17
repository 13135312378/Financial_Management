package com.ssm.uitl.impl;

import com.ssm.uitl.LogicUtil;
import com.ssm.uitl.Result;
import org.springframework.stereotype.Service;



@Service
public class LogicUtilImpl implements LogicUtil {

	public <T> Result get(T object) {
		Result result = new Result();
		if (object != null) {
			result.setStatus(0);
			result.setData(object);
			result.setMsg("查询成功！");
		} else {
			result.setStatus(1);
			result.setMsg("查询失败！");
		}
		return result;
	}

	public <T> Result getList(T object, int totalPages) {
		Result result = new Result();
		if (object != null) {
			result.setStatus(0);
			result.setData(object);
			result.setMsg("查询成功！");
		} else {
			result.setStatus(1);
			result.setMsg("查询失败！");
		}
		result.setOtherInfo(totalPages);
		return result;
	}

	public Result update(int line) {
		Result result = new Result();
		if (line > 0) {
			result.setStatus(0);
			result.setMsg("修改成功！");
		} else {
			result.setStatus(1);
			result.setMsg("修改失败！");
		}
		return result;
	}

	public Result del(int line) {
		Result result = new Result();
		if (line > 0) {
			result.setStatus(0);
			result.setMsg("删除成功！");
		} else {
			result.setStatus(1);
			result.setMsg("删除失败！");
		}
		return result;
	}


	public Result add(int line) {
		Result result = new Result();
		if (line > 0) {
			result.setStatus(0);
			result.setMsg("添加成功！");
		} else {
			result.setStatus(1);
			result.setMsg("添加失败！");
		}
		return result;
	}

}
