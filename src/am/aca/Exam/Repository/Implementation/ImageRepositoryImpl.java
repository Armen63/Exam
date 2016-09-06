package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.ImageRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Image;

/**
 * Created by Armen on 9/6/2016.
 */
public class ImageRepositoryImpl implements ImageRepository {
    private static ImageRepositoryImpl instance;
    private ImageRepositoryImpl(){

    }
    public static ImageRepositoryImpl getInstance(){
        if(instance==null){
            instance=new ImageRepositoryImpl();
        }
        return instance;
    }
    @Override
    public Image addImage(Image image) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteImage(Integer id) throws InvalidCommandException {

    }
}
