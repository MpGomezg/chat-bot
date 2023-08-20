package co.edu.unbosque.model;

import java.io.Serializable;

public class RespuestaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -893295406840233846L;
	private int num;
	private String resp;
	
	public RespuestaDTO() {
		// TODO Auto-generated constructor stub
	}

	public RespuestaDTO(int num, String resp) {
		super();
		this.num = num;
		this.resp = resp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RespuestaDTO [num=" + num + ", resp=" + resp + "]";
	}
	
	
	
}
