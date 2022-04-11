package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rower")
public class Rower {
	@Id
	@GeneratedValue
	private Long numer;
	private int kolo;
	private String marka;
	
	
	public Rower(Long numer, int kolo, String marka) {
		super();
		this.numer = numer;
		this.kolo = kolo;
		this.marka = marka;
	}
	public Long getNumer() {
		return numer;
	}
	public void setNumer(Long numer) {
		this.numer = numer;
	}
	public int getKolo() {
		return kolo;
	}
	public void setKolo(int kolo) {
		this.kolo = kolo;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	@Override
	public String toString() {
		return "Rower [numer=" + numer + ", kolo=" + kolo + ", marka=" + marka + "]";
	}
	

}
