package com.ace.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name="TEACHERINFO")
public class TeacherInfo {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private String id;
	private String name;
	private String university;
	private String major;
	private int experienceYears;
	@Lob
	private String aboutme;
	private String imageUrl;
	private String videoUrl;
	@Lob
	private String experience;
	@Lob
	private String interest;
	private Date createdDate;
	private Date modifiedDate;
	@OneToMany(mappedBy = "teacherInfo", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<BookInfo> bookInfos = new HashSet<BookInfo>();
	
	public Set<BookInfo> getBookInfos() {
		return bookInfos;
	}
	public void setBookInfos(Set<BookInfo> bookInfos) {
		this.bookInfos = bookInfos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}	
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "TeacherInfo [id=" + id + ", name=" + name + ", university="
				+ university + ", major=" + major + ", experienceYears="
				+ experienceYears + ", aboutme=" + aboutme + ", imageUrl="
				+ imageUrl + ", videoUrl=" + videoUrl + ", experience="
				+ experience + ", interest=" + interest + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate
				+ ", bookInfos=" + bookInfos + "]";
	}

	
	
}
