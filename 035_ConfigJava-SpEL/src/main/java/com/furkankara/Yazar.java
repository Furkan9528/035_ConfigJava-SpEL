package com.furkankara;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazarBean")
public class Yazar {

	@Value("#{kitapBean}")
	private Kitap kitap;

	@Value("Aslan")
	private String adi;
	
	@Value("Can")
	private String soyadi;
	
	@Value("{#kitapBean.eserAdi}")
	private String kitapAdi;
	

	//---------------------------------------
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	
	@Override
	public String toString() {
		return "Yazar :" + adi +"\n"+
			   "Soyadi=" + soyadi +"\n"+
			   "KitapAdi=" + kitapAdi + "\n"+
			   "Kitap Adi=" + kitap.getEserAdi()+ "\n"+ 
			   "Kitap No=" + kitap.getEserISBN()+ "\n" ;

	}
	
	
}
