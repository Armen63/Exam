package am.aca.Exam.comman.util;

/**
 * Created by Armen on 9/6/2016.
 */
public class Util {
    private static Integer musicNextID = 1;
    private static Integer playlistNextID = 1;
    private static Integer albomNextID = 1;
    private static Integer imageNextID = 1;
    private static Integer userNextID = 1;

    public static Integer generateMusicId(){
        return ++musicNextID;
    }
    public static Integer generatePlaylistID(){
        return ++playlistNextID;
    }
    public static Integer generateAlbomNextID(){
        return ++albomNextID;
    }
    public static Integer generateUserNextID(){
        return ++userNextID;
    }
    public static Integer generateImageNextID(){
        return ++imageNextID;
    }
}

