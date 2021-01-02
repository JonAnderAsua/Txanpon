package azterketa.utils;

import javafx.scene.image.Image;

import java.util.Date;

public class Txanpona {
    private int id;
    private String izena;
    private Date data;
    private Float balioa;
    private Float bolumena;
    private Image irudia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getBalioa() {
        return balioa;
    }

    public void setBalioa(Float balioa) {
        this.balioa = balioa;
    }

    public Float getBolumena() {
        return bolumena;
    }

    public void setBolumena(Float bolumena) {
        this.bolumena = bolumena;
    }

    public Image getIrudia() {
        return irudia;
    }

    public void setIrudia(Image irudia) {
        this.irudia = irudia;
    }
}
