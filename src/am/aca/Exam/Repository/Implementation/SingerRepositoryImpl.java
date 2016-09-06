package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.SingerRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Albom;
import am.aca.Exam.comman.model.Playlist;
import am.aca.Exam.comman.model.Singer;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public   class SingerRepositoryImpl implements SingerRepository {
    @Override
    public SingerRepository addSinger(String string) throws InvalidCommandException {
        return null;
    }

    @Override
    public SingerRepository editSinger(String string) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteSinger(Integer id) throws InvalidCommandException {

    }

    @Override
    public Set<Singer> listSingers(Playlist playlist) throws InvalidCommandException {
        return null;
    }

    @Override
    public Set<Singer> listSingers(Albom albom) throws InvalidCommandException {
        return null;
    }

    @Override
    public Set<Singer> listMarredSingers(Singer singer) throws InvalidCommandException {
        return null;
    }

    @Override
    public Integer getStatusSinger(Integer id) throws InvalidCommandException {
        return null;
    }
}
