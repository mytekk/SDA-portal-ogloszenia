package ogloszenia.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;

@Entity

public class Advertisement {
	/*
	tytul
    zdjecie
    wlasciciel
    cena
    tresc
    data od
    data do
    czy aktywne
    czy premium
    city name
    ocena od osoby kupujacej
    kategoria
    liczba wyswietlen
	 */



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true)
	Integer id;


	@Column(nullable=false)
	String title;

	@Lob
	byte[] img;

	@JoinColumn(nullable=false)
	@ManyToOne
	User owner;

	@Column(nullable=false)
	BigDecimal price;

	@Column(nullable=false)
	String text;

	@Column(nullable=false)
	LocalDate dateFrom;

	@Column(nullable=false)
	LocalDate dateTo;

	@Column(nullable=false)
	Boolean isActive;

	@Column(nullable=false)
	Boolean isPremium;

	@Column(nullable=false)
	String cityName;

	@Column(nullable=false)
	Integer rating;

	@Column(nullable=false)
	String category;

	@Column(nullable=false)
	Integer views;


	public Advertisement(){}


	public byte[] getImg() {
		return img;
	}



	public void setImg(byte[] img) {
		this.img = img;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsPremium() {
		return isPremium;
	}

	public void setIsPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}


	public void setOwner(User owner) {
		this.owner = owner;
	}

}
