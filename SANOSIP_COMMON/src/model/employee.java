/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nilanga
 */
public class employee {

    private String emp_id;
    private String fname;
    private String lname;
    private String address;
    private String cont_no;
    private String nic;
    private String gender;
    private String ac_level;

    public employee(String emp_id, String fname, String lname, String address, String cont_no, String nic, String gender, String ac_level) {
        this.emp_id = emp_id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.cont_no = cont_no;
        this.nic = nic;
        this.gender = gender;
        this.ac_level = ac_level;
    }

    public String getEmpID() {
        return this.emp_id;
    }

    public void setEmpID(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstname() {
        return this.fname;
    }

    public void setFirstname(String fname) {
        this.fname = fname;
    }

    public String getLastname() {
        return this.lname;
    }

    public void setLastname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_no() {
        return this.cont_no;
    }

    public void setContact_no(String cont_no) {
        this.cont_no = cont_no;
    }

    public String getNIC() {
        return this.nic;
    }

    public void setNIC(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAcceesLevel() {
        return this.ac_level;
    }

    public void setAccessLevel(String ac_level) {
        this.ac_level = ac_level;
    }
}