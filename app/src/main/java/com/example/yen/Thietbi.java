package com.example.yen;

import java.io.Serializable;

public class Thietbi implements Serializable {
    private String name;
    private String ma;
    private String matkhau;

    public Thietbi() {

    }

    public Thietbi(String name, String ma, String matkhau) {
        this.name = name;
        this.ma = ma;
        this.matkhau = matkhau;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }


    @Override
    public String toString() {
        return this.name + this.ma;
    }
}
