package com.imtom.reptile.demo.entity;

import javax.persistence.*;

/**
 * @ClassName MovieUrlEntity
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/28 16:30
 * @Version 1.0
 **/
@Entity
@Table(name = "movie_url", schema = "reptile", catalog = "")
public class MovieUrlEntity {

    private String id;
    private String desId;
    private String desUrl;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "des_id")
    public String getDesId() {
        return desId;
    }

    public void setDesId(String desId) {
        this.desId = desId;
    }

    @Basic
    @Column(name = "des_url")
    public String getDesUrl() {
        return desUrl;
    }

    public void setDesUrl(String desUrl) {
        this.desUrl = desUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieUrlEntity that = (MovieUrlEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (desId != null ? !desId.equals(that.desId) : that.desId != null) return false;
        if (desUrl != null ? !desUrl.equals(that.desUrl) : that.desUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (desId != null ? desId.hashCode() : 0);
        result = 31 * result + (desUrl != null ? desUrl.hashCode() : 0);
        return result;
    }
}
