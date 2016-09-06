package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Music;
import am.aca.Exam.comman.model.TypeMusic;

import java.util.Date;
import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public interface MusicRepository {
    Music addMusic(Music music) throws InvalidCommandException;
    Music editMusic(Music music) throws InvalidCommandException;  //cut
    void deleteMusic(Integer id) throws InvalidCommandException;
    Set<Music> assessMusic(TypeMusic typeMusic) throws InvalidCommandException;
    Boolean isPlaying(Integer id)throws InvalidCommandException;
    Integer getStatusMusic(Integer id)throws InvalidCommandException;


}
