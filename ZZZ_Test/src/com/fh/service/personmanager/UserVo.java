
package com.fh.service.personmanager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>userVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="byyx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="byzy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="change_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="create_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fz_zzlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listVo" type="{http://personmanager.service.fh.com/}userTypeVo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="user_cysj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_pid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_position_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user_zw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userVo", propOrder = {
    "byyx",
    "byzy",
    "changeTime",
    "createTime",
    "fzZzlx",
    "listVo",
    "userCysj",
    "userDegree",
    "userId",
    "userMobile",
    "userName",
    "userPassword",
    "userPid",
    "userPosition",
    "userPositionCode",
    "userSex",
    "userUnit",
    "userZw",
    "zy"
})
public class UserVo {

    protected String byyx;
    protected String byzy;
    @XmlElement(name = "change_time")
    protected String changeTime;
    @XmlElement(name = "create_time")
    protected String createTime;
    @XmlElement(name = "fz_zzlx")
    protected String fzZzlx;
    @XmlElement(nillable = true)
    protected List<UserTypeVo> listVo;
    @XmlElement(name = "user_cysj")
    protected String userCysj;
    @XmlElement(name = "user_degree")
    protected String userDegree;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "user_mobile")
    protected String userMobile;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "user_password")
    protected String userPassword;
    @XmlElement(name = "user_pid")
    protected String userPid;
    @XmlElement(name = "user_position")
    protected String userPosition;
    @XmlElement(name = "user_position_code")
    protected String userPositionCode;
    @XmlElement(name = "user_sex")
    protected String userSex;
    @XmlElement(name = "user_unit")
    protected String userUnit;
    @XmlElement(name = "user_zw")
    protected String userZw;
    protected String zy;

    /**
     * 获取byyx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByyx() {
        return byyx;
    }

    /**
     * 设置byyx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByyx(String value) {
        this.byyx = value;
    }

    /**
     * 获取byzy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByzy() {
        return byzy;
    }

    /**
     * 设置byzy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByzy(String value) {
        this.byzy = value;
    }

    /**
     * 获取changeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeTime() {
        return changeTime;
    }

    /**
     * 设置changeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeTime(String value) {
        this.changeTime = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取fzZzlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFzZzlx() {
        return fzZzlx;
    }

    /**
     * 设置fzZzlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFzZzlx(String value) {
        this.fzZzlx = value;
    }

    /**
     * Gets the value of the listVo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listVo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListVo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTypeVo }
     * 
     * 
     */
    public List<UserTypeVo> getListVo() {
        if (listVo == null) {
            listVo = new ArrayList<UserTypeVo>();
        }
        return this.listVo;
    }

    /**
     * 获取userCysj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCysj() {
        return userCysj;
    }

    /**
     * 设置userCysj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCysj(String value) {
        this.userCysj = value;
    }

    /**
     * 获取userDegree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDegree() {
        return userDegree;
    }

    /**
     * 设置userDegree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDegree(String value) {
        this.userDegree = value;
    }

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取userMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置userMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMobile(String value) {
        this.userMobile = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取userPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置userPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * 获取userPid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPid() {
        return userPid;
    }

    /**
     * 设置userPid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPid(String value) {
        this.userPid = value;
    }

    /**
     * 获取userPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * 设置userPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPosition(String value) {
        this.userPosition = value;
    }

    /**
     * 获取userPositionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPositionCode() {
        return userPositionCode;
    }

    /**
     * 设置userPositionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPositionCode(String value) {
        this.userPositionCode = value;
    }

    /**
     * 获取userSex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置userSex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSex(String value) {
        this.userSex = value;
    }

    /**
     * 获取userUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUnit() {
        return userUnit;
    }

    /**
     * 设置userUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUnit(String value) {
        this.userUnit = value;
    }

    /**
     * 获取userZw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserZw() {
        return userZw;
    }

    /**
     * 设置userZw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserZw(String value) {
        this.userZw = value;
    }

    /**
     * 获取zy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZy() {
        return zy;
    }

    /**
     * 设置zy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZy(String value) {
        this.zy = value;
    }

}
