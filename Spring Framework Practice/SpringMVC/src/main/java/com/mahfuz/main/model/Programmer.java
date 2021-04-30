package com.mahfuz.main.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Programmer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Column(name="programmer_name")
	private String pname;
	private String plang;


	public Programmer() {
		super();
	}

	public Programmer(int pid, String pname, String plang) {
		this.pid = pid;
		this.pname = pname;
		this.plang = plang;

	}



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlang() {
		return plang;
	}

	public void setPlang(String plang) {
		this.plang = plang;
	}


	public String toString () {
		return "Programmer [pid="+pid+",pname="+pname+",plang="+plang+"]";
	}

	
}
