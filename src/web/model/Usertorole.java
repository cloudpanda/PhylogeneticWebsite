package web.model;

/**
 * Usertorole generated by MyEclipse Persistence Tools
 */

public class Usertorole implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer utorid;

	private Integer userid;

	private Integer roleid;

	// Constructors

	/** default constructor */
	public Usertorole() {
	}

	/** full constructor */
	public Usertorole(Integer userid, Integer roleid) {
		this.userid = userid;
		this.roleid = roleid;
	}

	// Property accessors

	public Integer getUtorid() {
		return this.utorid;
	}

	public void setUtorid(Integer utorid) {
		this.utorid = utorid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

}
