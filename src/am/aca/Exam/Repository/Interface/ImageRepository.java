package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.Image;

/**
 * Created by Armen on 9/6/2016.
 */
public interface ImageRepository {
    Image addImage(Image image)throws InvalidCommandException;
    void deleteImage(Integer id)throws InvalidCommandException;
}
