package am.aca.Exam.comman.model;

/**
 * Created by Armen on 9/6/2016.
 */
public class Music {
    private Integer creationTime;
    private Double length;
    TypeMusic typeMusic;


    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public TypeMusic getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(TypeMusic typeMusic) {
        this.typeMusic = typeMusic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Music music = (Music) o;

        if (!creationTime.equals(music.creationTime)) return false;
        if (!length.equals(music.length)) return false;
        return typeMusic == music.typeMusic;

    }

    @Override
    public int hashCode() {
        int result = creationTime.hashCode();
        result = 31 * result + length.hashCode();
        result = 31 * result + typeMusic.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Music{" +
                "creationTime=" + creationTime +
                ", length=" + length +
                ", typeMusic=" + typeMusic +
                '}';
    }
}
