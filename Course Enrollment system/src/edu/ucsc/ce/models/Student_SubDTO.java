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
public class Student_SubDTO {

    private Integer ssid;
    private StudentDTO studentDTO;; 
    private SubjectDTO subjectDTO;

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
     * @return the subid
     */
    public Integer getSubid() {
        return subid;
    }

    /**
     * @param subid the subid to set
     */
    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    /**
     * @return the ssid
     */
    public Integer getSsid() {
        return ssid;
    }

    /**
     * @param ssid the ssid to set
     */
    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    /**
     * @return the studentDTO
     */
    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    /**
     * @param studentDTO the studentDTO to set
     */
    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    /**
     * @return the subjectDTO
     */
    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    /**
     * @param subjectDTO the subjectDTO to set
     */
    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

}
