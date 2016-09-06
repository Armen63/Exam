package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.MusicRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Music;
import am.aca.Exam.comman.model.TypeMusic;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public class MusicRepositoryImpl implements MusicRepository {
    private static MusicRepositoryImpl instance;
    private MusicRepositoryImpl(){

    }
    public static MusicRepositoryImpl getInstance(){
        if(instance==null){
            instance=new MusicRepositoryImpl();
        }
        return instance;
    }
    @Override
    public Music addMusic(Music music) throws InvalidCommandException {
        return null;
    }

    @Override
    public Music editMusic(Music music) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteMusic(Integer id) throws InvalidCommandException {

    }

    @Override
    public Set<Music> assessMusic(TypeMusic typeMusic) throws InvalidCommandException {
        return null;
    }

    @Override
    public Boolean isPlaying(Integer id) throws InvalidCommandException {
        return null;
    }

    @Override
    public Integer getStatusMusic(Integer id) throws InvalidCommandException {
        return null;
    }


}
