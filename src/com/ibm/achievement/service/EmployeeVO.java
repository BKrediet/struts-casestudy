//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package com.ibm.achievement.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projects" type="{http://service.achievement.ibm.com/}projectVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userRoll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeVO", namespace = "http://service.achievement.ibm.com/", propOrder = {
    "activeFlag",
    "emailID",
    "employeeId",
    "firstName",
    "lastName",
    "managerFlag",
    "managerId",
    "projects",
    "userRoll"
})
public class EmployeeVO {

    protected String activeFlag;
    protected String emailID;
    protected String employeeId;
    protected String firstName;
    protected String lastName;
    protected String managerFlag;
    protected String managerId;
    @XmlElement(nillable = true)
    protected List<ProjectVO> projects;
    protected String userRoll;

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the managerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerFlag() {
        return managerFlag;
    }

    /**
     * Sets the value of the managerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerFlag(String value) {
        this.managerFlag = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectVO }
     * 
     * 
     */
    public List<ProjectVO> getProjects() {
        if (projects == null) {
            projects = new ArrayList<ProjectVO>();
        }
        return this.projects;
    }

    /**
     * Gets the value of the userRoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoll() {
        return userRoll;
    }

    /**
     * Sets the value of the userRoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    
    
    public void setUserRoll(String value) {
        this.userRoll = value;
    }

	public void setProjects(List<ProjectVO> projects) {
		this.projects = projects;
	}

}
