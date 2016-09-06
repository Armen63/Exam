package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Albom;
import am.aca.Exam.comman.model.Playlist;
import am.aca.Exam.comman.model.Singer;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public interface SingerRepository {
    SingerRepository addSinger(String string)throws InvalidCommandException;
    SingerRepository editSinger(String string)throws InvalidCommandException;
    void deleteSinger(Integer id)throws InvalidCommandException;
    Set<Singer> listSingers(Playlist playlist)throws InvalidCommandException;
    Set<Singer> listSingers(Albom albom)throws InvalidCommandException;
    Set<Singer> listMarredSingers(Singer singer)throws  InvalidCommandException;
    Integer getStatusSinger(Integer id)throws InvalidCommandException;

}
