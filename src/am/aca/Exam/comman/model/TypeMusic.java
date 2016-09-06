package am.aca.Exam.comman.model;

/**
 * Created by Armen on 9/6/2016.
 */
public enum TypeMusic {
    ROCK(1),
    HOUSE(2),
    DUBSTEP(3),
    SHAXOVSHUXOV(4);
    private Integer id;



    TypeMusic(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
