package com.wh.spring.helloworld.properties;

public class User {
	
	private int id;
	private String username;
	private String password;
	private int gender;
	private String remark;
	private String bookmarker;
	private String study;
	private String interest;
	private int clazz;
	private int experience;
	private  String labelMarker;
	private String recentRead;
	
	public User(int id, String username, String password, int gender, String remark, String bookmarker, String study,
			String interest, int clazz, int experience, String labelMarker, String recentRead) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.remark = remark;
		this.bookmarker = bookmarker;
		this.study = study;
		this.interest = interest;
		this.clazz = clazz;
		this.experience = experience;
		this.labelMarker = labelMarker;
		this.recentRead = recentRead;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ ", remark=" + remark + ", bookmarker=" + bookmarker + ", study=" + study + ", interest=" + interest
				+ ", clazz=" + clazz + ", experience=" + experience + ", labelMarker=" + labelMarker + ", recentRead="
				+ recentRead + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the bookmarker
	 */
	public String getBookmarker() {
		return bookmarker;
	}
	/**
	 * @param bookmarker the bookmarker to set
	 */
	public void setBookmarker(String bookmarker) {
		this.bookmarker = bookmarker;
	}
	/**
	 * @return the study
	 */
	public String getStudy() {
		return study;
	}
	/**
	 * @param study the study to set
	 */
	public void setStudy(String study) {
		this.study = study;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/**
	 * @return the clazz
	 */
	public int getClazz() {
		return clazz;
	}
	/**
	 * @param clazz the clazz to set
	 */
	public void setClazz(int clazz) {
		this.clazz = clazz;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @return the labelMarker
	 */
	public String getLabelMarker() {
		return labelMarker;
	}
	/**
	 * @param labelMarker the labelMarker to set
	 */
	public void setLabelMarker(String labelMarker) {
		this.labelMarker = labelMarker;
	}
	/**
	 * @return the recentRead
	 */
	public String getRecentRead() {
		return recentRead;
	}
	/**
	 * @param recentRead the recentRead to set
	 */
	public void setRecentRead(String recentRead) {
		this.recentRead = recentRead;
	}

}
