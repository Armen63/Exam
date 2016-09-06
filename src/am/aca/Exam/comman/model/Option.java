package am.aca.Exam.comman.model;

/**
 * Created by Armen on 9/6/2016.
 */
public class Option {
    private Boolean isStereo;
    private Boolean idBassed;
    private Integer volume;
    private Integer decibel;

    public Integer getDecibel() {
        return decibel;
    }

    public void setDecibel(Integer decibel) {
        this.decibel = decibel;
    }

    public Boolean getStereo() {
        return isStereo;
    }

    public void setStereo(Boolean stereo) {
        isStereo = stereo;
    }

    public Boolean getIdBassed() {
        return idBassed;
    }

    public void setIdBassed(Boolean idBassed) {
        this.idBassed = idBassed;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getReapeated() {
        return isReapeated;
    }

    public void setReapeated(Boolean reapeated) {
        isReapeated = reapeated;
    }

    private Boolean isReapeated;// vor ha krknvi
}
