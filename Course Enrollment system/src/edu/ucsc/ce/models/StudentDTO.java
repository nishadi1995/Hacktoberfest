 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.models;

/**
 *
 * @author Jinadi
 */
public class StudentDTO {
    private Integer sid;
    private CourseDTO courseDTO;
   
    private FacultyDTO facultyDTO;
     private String NIC;
    private String name;
    private String address;
    private String dob;

   
    
    

    /**
     * @return the sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the facultyDTO
     */
    public FacultyDTO getFacultyDTO() {
        return facultyDTO;
    }

    /**
     * @param facultyDTO the facultyDTO to set
     */
    public void setFacultyDTO(FacultyDTO facultyDTO) {
        this.facultyDTO = facultyDTO;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the courseDTO
     */
    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    /**
     * @param courseDTO the courseDTO to set
     */
    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }
    
}
