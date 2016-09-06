package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Music;
import am.aca.Exam.comman.model.Playlist;

import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public interface PlaylistRepository {
    Playlist addPlaylist(Playlist playlist)throws InvalidCommandException;
    Playlist editPlaylist(Playlist playlist)throws InvalidCommandException;
    void deletePlaylist(Integer id)throws InvalidCommandException;
    Set<Music> setMusics(Playlist playlist)throws InvalidCommandException;
    Integer getStatusPlaylist(Integer id)throws InvalidCommandException;

}
