package com.innofi.component.webservice.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.innofi.framework.pojo.BasePojo;

/**
 * 功能/ 模块： 模块中文名称
 * 
 * @author  liuhuaiyang huaiyang.liu@innofi.com.cn
 * @version 2.0.0 13-5-10
 *          查询webservice配置bean对应的方法对象
 *          修订历史： 日期 作者 参考 描述
 *          北京名晟信息技术有限公司版权所有.
 */
@Entity
@Table(name = "SYS_SERVICE_BEANMETHOD_CONFIG")

public class SysServiceBeanmethodConfig extends BasePojo {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 创建日期
	 */
	private Date crtDate;

	/**
	 * 创建组织
	 */
	private String crtOrgCode;

	/**
	 * 创建人
	 */
	private String crtUserCode;

	/**
	 * 是否需要鉴权
	 */
	private String isauth;

	/**
	 * 方法名称
	 */
	private String methodName;

	/**
	 * 服务id
	 */
	private String serviceId;

	/**
	 * 修改日期
	 */
	private Date updDate;

	/**
	 * 修改组织
	 */
	private String updOrgCode;

	/**
	 * 修改人
	 */
	private String updUserCode;

	@Column(name = "CRT_DATE")
	public Date getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	@Column(name = "CRT_ORG_CODE")
	public String getCrtOrgCode() {
		return this.crtOrgCode;
	}

	public void setCrtOrgCode(String crtOrgCode) {
		this.crtOrgCode = crtOrgCode;
	}

	@Column(name = "CRT_USER_CODE")
	public String getCrtUserCode() {
		return this.crtUserCode;
	}

	public void setCrtUserCode(String crtUserCode) {
		this.crtUserCode = crtUserCode;
	}

	@Column(name = "ISAUTH")
	public String getIsauth() {
		return this.isauth;
	}

	public void setIsauth(String isauth) {
		this.isauth = isauth;
	}

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "METHOD_ID")
	public String getId() {
		return super.getId();
	}

	@Column(name = "METHOD_NAME")
	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Column(name = "SERVICE_ID")
	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Column(name = "UPD_DATE")
	public Date getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	@Column(name = "UPD_ORG_CODE")
	public String getUpdOrgCode() {
		return this.updOrgCode;
	}

	public void setUpdOrgCode(String updOrgCode) {
		this.updOrgCode = updOrgCode;
	}

	@Column(name = "UPD_USER_CODE")
	public String getUpdUserCode() {
		return this.updUserCode;
	}

	public void setUpdUserCode(String updUserCode) {
		this.updUserCode = updUserCode;
	}
}