package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.PlaylistRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Music;
import am.aca.Exam.comman.model.Playlist;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public class PlayListRepositoryImpl implements PlaylistRepository {
    private static PlayListRepositoryImpl instance;
    private PlayListRepositoryImpl(){

    }
    public static PlayListRepositoryImpl getInstance(){
        if(instance==null){
            instance=new PlayListRepositoryImpl();
        }
        return instance;
    }
    @Override
    public Playlist addPlaylist(Playlist playlist) throws InvalidCommandException {
        return null;
    }

    @Override
    public Playlist editPlaylist(Playlist playlist) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deletePlaylist(Integer id) throws InvalidCommandException {

    }

    @Override
    public Set<Music> setMusics(Playlist playlist) throws InvalidCommandException {
        return null;
    }

    @Override
    public Integer getStatusPlaylist(Integer id) throws InvalidCommandException {
        return null;
    }
}
