package com.zhzx.dao.model.common;import com.zhzx.dao.model.BaseModel;public class BdictionaryModel extends BaseModel {		/**	*字典项编号	*/	private String id;		/**	*字典key	*/	private String keyno;		/**	*字典值	*/	private String value;		/**	*字典文本	*/	private String caption;		/**	*字典描述	*/	private String describe;			public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getKeyno() {	    return this.keyno;	}	public void setKeyno(String keyno) {	    this.keyno=keyno;	}	public String getValue() {	    return this.value;	}	public void setValue(String value) {	    this.value=value;	}	public String getCaption() {	    return this.caption;	}	public void setCaption(String caption) {	    this.caption=caption;	}	public String getDescribe() {	    return this.describe;	}	public void setDescribe(String describe) {	    this.describe=describe;	}	}