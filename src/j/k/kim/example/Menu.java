package j.k.kim.example;

import j.k.kim.mapper.AbstractDomain;

public class Menu extends AbstractDomain {

	private static final long serialVersionUID = 8150074166420318363L;
	
	public String OBJECT_ID;
	public String OBJECT_NM;
	public String PARENT_ID;
	public String OPEN_YN;
	public String SQ;
	public String FILE_PATH;
	public String NOTE;

	public String getOBJECT_ID() {
		return OBJECT_ID;
	}

	public void setOBJECT_ID(String oBJECT_ID) {
		OBJECT_ID = oBJECT_ID;
	}

	public String getOBJECT_NM() {
		return OBJECT_NM;
	}

	public void setOBJECT_NM(String oBJECT_NM) {
		OBJECT_NM = oBJECT_NM;
	}

	public String getPARENT_ID() {
		return PARENT_ID;
	}

	public void setPARENT_ID(String pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}

	public String getOPEN_YN() {
		return OPEN_YN;
	}

	public void setOPEN_YN(String oPEN_YN) {
		OPEN_YN = oPEN_YN;
	}

	public String getSQ() {
		return SQ;
	}

	public void setSQ(String sQ) {
		SQ = sQ;
	}

	public String getFILE_PATH() {
		return FILE_PATH;
	}

	public void setFILE_PATH(String fILE_PATH) {
		FILE_PATH = fILE_PATH;
	}

	public String getNOTE() {
		return NOTE;
	}

	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}

	
}
