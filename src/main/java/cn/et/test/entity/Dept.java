package cn.et.test.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.id
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dName
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.pId
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.id
     *
     * @return the value of dept.id
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.id
     *
     * @param id the value for dept.id
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dName
     *
     * @return the value of dept.dName
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dName
     *
     * @param dname the value for dept.dName
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.pId
     *
     * @return the value of dept.pId
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.pId
     *
     * @param pid the value for dept.pId
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}