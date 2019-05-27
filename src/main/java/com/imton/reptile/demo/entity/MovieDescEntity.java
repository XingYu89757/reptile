package com.imton.reptile.demo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @ClassName MovieDescEntity
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/22 14:32
 * @Version 1.0
 **/
@Entity
@Table(name = "movie_desc", schema = "reptile")
public class MovieDescEntity {
    private String id;
    private String typeName;
    private String typeCode;
    private String moveName;
    private String img;
    private String moveScore;
    private String translatedName;
    private String oldName;
    private String year;
    private String placeOrigin;
    private String type;
    private String language;
    private String subitile;
    private String releaseTime;
    private String douban;
    private String imDb;
    private String videoSize;
    private String videoMemory;
    private String mins;
    private String director;
    private String superstar;
    private String intro;
    private String url;
    private String createTime;
    private Date releaseDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "type_code")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Basic
    @Column(name = "move_name")
    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "move_score")
    public String getMoveScore() {
        return moveScore;
    }

    public void setMoveScore(String moveScore) {
        this.moveScore = moveScore;
    }

    @Basic
    @Column(name = "translated_name")
    public String getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
    }

    @Basic
    @Column(name = "old_name")
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Basic
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "place_origin")
    public String getPlaceOrigin() {
        return placeOrigin;
    }

    public void setPlaceOrigin(String placeOrigin) {
        this.placeOrigin = placeOrigin;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "subitile")
    public String getSubitile() {
        return subitile;
    }

    public void setSubitile(String subitile) {
        this.subitile = subitile;
    }

    @Basic
    @Column(name = "release_time")
    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Basic
    @Column(name = "douban")
    public String getDouban() {
        return douban;
    }

    public void setDouban(String douban) {
        this.douban = douban;
    }

    @Basic
    @Column(name = "IMDb")
    public String getImDb() {
        return imDb;
    }

    public void setImDb(String imDb) {
        this.imDb = imDb;
    }

    @Basic
    @Column(name = "video_size")
    public String getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize;
    }

    @Basic
    @Column(name = "video_memory")
    public String getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(String videoMemory) {
        this.videoMemory = videoMemory;
    }

    @Basic
    @Column(name = "mins")
    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    @Basic
    @Column(name = "director")
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @Column(name = "superstar")
    public String getSuperstar() {
        return superstar;
    }

    public void setSuperstar(String superstar) {
        this.superstar = superstar;
    }

    @Basic
    @Column(name = "intro")
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "release_date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieDescEntity that = (MovieDescEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;
        if (typeCode != null ? !typeCode.equals(that.typeCode) : that.typeCode != null) return false;
        if (moveName != null ? !moveName.equals(that.moveName) : that.moveName != null) return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;
        if (moveScore != null ? !moveScore.equals(that.moveScore) : that.moveScore != null) return false;
        if (translatedName != null ? !translatedName.equals(that.translatedName) : that.translatedName != null)
            return false;
        if (oldName != null ? !oldName.equals(that.oldName) : that.oldName != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (placeOrigin != null ? !placeOrigin.equals(that.placeOrigin) : that.placeOrigin != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (subitile != null ? !subitile.equals(that.subitile) : that.subitile != null) return false;
        if (releaseTime != null ? !releaseTime.equals(that.releaseTime) : that.releaseTime != null) return false;
        if (douban != null ? !douban.equals(that.douban) : that.douban != null) return false;
        if (imDb != null ? !imDb.equals(that.imDb) : that.imDb != null) return false;
        if (videoSize != null ? !videoSize.equals(that.videoSize) : that.videoSize != null) return false;
        if (videoMemory != null ? !videoMemory.equals(that.videoMemory) : that.videoMemory != null) return false;
        if (mins != null ? !mins.equals(that.mins) : that.mins != null) return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (superstar != null ? !superstar.equals(that.superstar) : that.superstar != null) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (typeCode != null ? typeCode.hashCode() : 0);
        result = 31 * result + (moveName != null ? moveName.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (moveScore != null ? moveScore.hashCode() : 0);
        result = 31 * result + (translatedName != null ? translatedName.hashCode() : 0);
        result = 31 * result + (oldName != null ? oldName.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (placeOrigin != null ? placeOrigin.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (subitile != null ? subitile.hashCode() : 0);
        result = 31 * result + (releaseTime != null ? releaseTime.hashCode() : 0);
        result = 31 * result + (douban != null ? douban.hashCode() : 0);
        result = 31 * result + (imDb != null ? imDb.hashCode() : 0);
        result = 31 * result + (videoSize != null ? videoSize.hashCode() : 0);
        result = 31 * result + (videoMemory != null ? videoMemory.hashCode() : 0);
        result = 31 * result + (mins != null ? mins.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (superstar != null ? superstar.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        return result;
    }
}
