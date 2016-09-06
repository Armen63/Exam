package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Albom;
import am.aca.Exam.comman.model.Music;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public interface AlbomRepository {
    Albom createAlbom(Albom albom)throws InvalidCommandException;
    Albom editALbom(Albom albom)throws InvalidCommandException;
    void deleteAlbom(Integer id)throws InvalidCommandException;
    Albom getAlbom(Integer id)throws InvalidCommandException;
    Set<Music> getMusicsInThatAlbom(Integer id)throws InvalidCommandException;
    Integer getStatusAlbom(Integer id)throws InvalidCommandException;
    Set<Music> newxtYearsMusicsFromNewAlbom(Albom albom)throws InvalidCommandException;

}
