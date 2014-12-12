package web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * Storrole generated by MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer roleid;

	private String rolename;

	private String roledesc;
	
	private String isdefault;

	private Set<User> storusers = new HashSet<User>();
	private Set<Menu> stormenus = new HashSet<Menu>();
	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String rolename) {
		this.rolename = rolename;
	}

	/** full constructor */
	public Role(String rolename, String roledesc) {
		this.rolename = rolename;
		this.roledesc = roledesc;
	}
	
	public Role(Integer roleid, String rolename, String roledesc,
			String isdefault) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.roledesc = roledesc;

	}

	// Property accessors

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledesc() {
		return this.roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	public Set<Menu> getStormenus() {
		return stormenus;
	}

	public void setStormenus(Set<Menu> stormenus) {
		this.stormenus = stormenus;
	}

	public Set<User> getStorusers() {
		return storusers;
	}

	public void setStorusers(Set<User> storusers) {
		this.storusers = storusers;
	}

/*	public Role(Integer roleid, String rolename, String roledesc, String isdefault) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.roledesc = roledesc;
	//	this.storusers = storusers;
	//	this.stormenus = stormenus;
	}*/

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

}