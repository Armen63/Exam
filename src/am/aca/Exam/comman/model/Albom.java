package am.aca.Exam.comman.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public class Albom {
    private TypeMusic typeMusic;
    private Integer countAlbmos;
    private Integer creationTime;
    Integer albomId;
    private Boolean hasGreamy;
    Set<Singer> signersList = new HashSet<>();
    private Integer income;
    private Set<Singer> membersOfAlbom;
    private Boolean albomNextYear;

    public Boolean getAlbomNextYear() {
        return albomNextYear;
    }

    public void setAlbomNextYear(Boolean albomNextYear) {
        this.albomNextYear = albomNextYear;
    }

    public Set<Singer> getMembersOfAlbom() {
        return membersOfAlbom;
    }

    public void setMembersOfAlbom(Set<Singer> membersOfAlbom) {
        this.membersOfAlbom = membersOfAlbom;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Set<Singer> getSignersList() {
        return signersList;
    }

    public void setSignersList(Set<Singer> signersList) {
        this.signersList = signersList;
    }

    public Boolean getHasGreamy() {
        return hasGreamy;
    }

    public void setHasGreamy(Boolean hasGreamy) {
        this.hasGreamy = hasGreamy;
    }

    public TypeMusic getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(TypeMusic typeMusic) {
        this.typeMusic = typeMusic;
    }

    public Integer getCountAlbmos() {
        return countAlbmos;
    }

    public void setCountAlbmos(Integer countAlbmos) {
        this.countAlbmos = countAlbmos;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getAlbomId() {
        return albomId;
    }

    public void setAlbomId(Integer albomId) {
        this.albomId = albomId;
    }

}
