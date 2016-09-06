package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.AlbomRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Albom;
import am.aca.Exam.comman.model.Music;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public class AlbomRepositoryImpl implements AlbomRepository {
    private static AlbomRepositoryImpl instance;
    private AlbomRepositoryImpl(){

    }
    public static AlbomRepositoryImpl getInstance(){
        if(instance==null){
            instance=new AlbomRepositoryImpl();
        }
        return instance;
    }
    @Override
    public Albom createAlbom(Albom albom) throws InvalidCommandException {
        return null;
    }

    @Override
    public Albom editALbom(Albom albom) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteAlbom(Integer id) throws InvalidCommandException {

    }

    @Override
    public Albom getAlbom(Integer id) throws InvalidCommandException {
        return null;
    }

    @Override
    public Set<Music> getMusicsInThatAlbom(Integer id) throws InvalidCommandException {
        return null;
    }

    @Override
    public Integer getStatusAlbom(Integer id) throws InvalidCommandException {
        return null;
    }

    @Override
    public Set<Music> newxtYearsMusicsFromNewAlbom(Albom albom) throws InvalidCommandException {
        return null;
    }
}
