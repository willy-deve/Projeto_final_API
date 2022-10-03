package com.projetofinalapi.entities;


import java.util.Objects;

public class Recados {
    private Integer id;
    private String description;
    private String detail;

    public Recados() {
    }

    public Recados(Integer id, String description, String detail) {
        this.id = id;
        this.description = description;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recados recados = (Recados) o;
        return id.equals(recados.id) && description.equals(recados.description) && detail.equals(recados.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, detail);
    }

    @Override
    public String toString() {
        return "Recados{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
