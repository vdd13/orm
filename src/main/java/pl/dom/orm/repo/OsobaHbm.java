package pl.dom.orm.repo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="osoba")
public class OsobaHbm implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	Integer Id;

	@Column(name = "imie")
	String imie;
	String nazwisko;
	Integer numer;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Integer getNumer() {
		return numer;
	}
	public void setNumer(Integer numer) {
		this.numer = numer;
	}

	public String toString(){
		return getId() + " " + getImie() + " "+ getNazwisko() + " " +getNumer(); 
	}
	
}
