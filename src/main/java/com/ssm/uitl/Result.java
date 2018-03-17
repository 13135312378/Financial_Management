package com.ssm.uitl;

import org.springframework.stereotype.Component;

import java.io.Serializable;


/**
 * 返回的结果对象 {"status":0,"msg":"成功","data":xxx}
 * @author daiyongqin
 */
@Component
public class Result implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * status 表示数据库操作的状态：0表示成功,其他表示失败
	 */
	private int status;//0表示成功,其他表示失败
	/**
	 * msg  根据状态不同返回不同的消息
	 */
	private String msg;//消息
	/**
	 * data 将具体的数据返回
	 */
	private Object data;//返回的数据
	/**
	 * 返回其它附带信息
	 */
	private Object otherInfo;//其他信息

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(Object otherInfo) {
		this.otherInfo = otherInfo;
	}

	
	

	

	
}
