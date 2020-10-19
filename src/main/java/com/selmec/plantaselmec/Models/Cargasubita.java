package com.selmec.plantaselmec.Models;
// Generated Oct 30, 2014 5:43:43 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cargasubita generated by hbm2java
 */
@Entity
@Table(name = "cargasubita", catalog = "casetapruebas"
)
public class Cargasubita implements java.io.Serializable {

    private Integer id;
    private Prueba prueba;
    private Integer seg;
    private Double vinicio;
    private Double vfinal;
    private Double hfinal;
    private Double hinicio;
    private Double icarga;

    public Cargasubita() {
    }

    public Cargasubita(Prueba prueba) {
        this.prueba = prueba;
    }

    public Cargasubita(Prueba prueba, Integer seg, Double vinicio, Double vfinal, Double hfinal, Double hinicio, Double icarga) {
        this.prueba = prueba;
        this.seg = seg;
        this.vinicio = vinicio;
        this.vfinal = vfinal;
        this.hfinal = hfinal;
        this.hinicio = hinicio;
        this.icarga = icarga;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PruebaID", nullable = false)
    public Prueba getPrueba() {
        return this.prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Column(name = "seg")
    public Integer getSeg() {
        return this.seg;
    }

    public void setSeg(Integer seg) {
        this.seg = seg;
    }

    @Column(name = "vinicio", precision = 22, scale = 0)
    public Double getVinicio() {
        return this.vinicio;
    }

    public void setVinicio(Double vinicio) {
        this.vinicio = vinicio;
    }

    @Column(name = "vfinal", precision = 22, scale = 0)
    public Double getVfinal() {
        return this.vfinal;
    }

    public void setVfinal(Double vfinal) {
        this.vfinal = vfinal;
    }

    @Column(name = "hfinal", precision = 22, scale = 0)
    public Double getHfinal() {
        return this.hfinal;
    }

    public void setHfinal(Double hfinal) {
        this.hfinal = hfinal;
    }

    @Column(name = "hinicio", precision = 22, scale = 0)
    public Double getHinicio() {
        return this.hinicio;
    }

    public void setHinicio(Double hinicio) {
        this.hinicio = hinicio;
    }

    @Column(name = "icarga", precision = 22, scale = 0)
    public Double getIcarga() {
        return this.icarga;
    }

    public void setIcarga(Double icarga) {
        this.icarga = icarga;
    }

}
