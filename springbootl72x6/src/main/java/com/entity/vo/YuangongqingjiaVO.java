package com.entity.vo;

import com.entity.YuangongqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工请假
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-11-28 16:33:41
 */
public class YuangongqingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 请假类型
	 */
	
	private String qingjialeixing;
		
	/**
	 * 请假时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qingjiashijian;
		
	/**
	 * 请假天数
	 */
	
	private Integer qingjiatianshu;
		
	/**
	 * 请假原因
	 */
	
	private String qingjiayuanyin;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：请假类型
	 */
	 
	public void setQingjialeixing(String qingjialeixing) {
		this.qingjialeixing = qingjialeixing;
	}
	
	/**
	 * 获取：请假类型
	 */
	public String getQingjialeixing() {
		return qingjialeixing;
	}
				
	
	/**
	 * 设置：请假时间
	 */
	 
	public void setQingjiashijian(Date qingjiashijian) {
		this.qingjiashijian = qingjiashijian;
	}
	
	/**
	 * 获取：请假时间
	 */
	public Date getQingjiashijian() {
		return qingjiashijian;
	}
				
	
	/**
	 * 设置：请假天数
	 */
	 
	public void setQingjiatianshu(Integer qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	
	/**
	 * 获取：请假天数
	 */
	public Integer getQingjiatianshu() {
		return qingjiatianshu;
	}
				
	
	/**
	 * 设置：请假原因
	 */
	 
	public void setQingjiayuanyin(String qingjiayuanyin) {
		this.qingjiayuanyin = qingjiayuanyin;
	}
	
	/**
	 * 获取：请假原因
	 */
	public String getQingjiayuanyin() {
		return qingjiayuanyin;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
