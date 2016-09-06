package am.aca.Exam.comman.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Armen on 9/6/2016.
 */
public class Playlist {
    private Integer playlistId;
    Set<Music> musicSet = new HashSet<>();
    List<Music> musicList = new ArrayList<>();
    List<Music> musicLengthList = new ArrayList<>();

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Set<Music> getMusicSet() {
        return musicSet;
    }

    public void setMusicSet(Set<Music> musicSet) {
        this.musicSet = musicSet;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicLengthList() {
        return musicLengthList;
    }

    public void setMusicLengthList(List<Music> musicLengthList) {
        this.musicLengthList = musicLengthList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        if (!playlistId.equals(playlist.playlistId)) return false;
        if (!musicSet.equals(playlist.musicSet)) return false;
        if (!musicList.equals(playlist.musicList)) return false;
        return musicLengthList.equals(playlist.musicLengthList);

    }

    @Override
    public int hashCode() {
        int result = playlistId.hashCode();
        result = 31 * result + musicSet.hashCode();
        result = 31 * result + musicList.hashCode();
        result = 31 * result + musicLengthList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "am.aca.Exam.comman.model.Playlist{" +
                "playlistId=" + playlistId +
                ", musicSet=" + musicSet +
                ", musicList=" + musicList +
                ", musicLengthList=" + musicLengthList +
                '}';
    }
}
