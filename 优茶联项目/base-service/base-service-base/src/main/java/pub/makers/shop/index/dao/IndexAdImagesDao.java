package pub.makers.shop.index.dao;

import org.springframework.stereotype.Repository;
import pub.makers.daotemplate.dao.impl.BaseCRUDDaoImpl;
import pub.makers.shop.index.entity.IndexAdImages;

/**
 * Created by dy on 2017/6/12.
 */
@Repository
public class IndexAdImagesDao extends BaseCRUDDaoImpl<IndexAdImages, String> {
    @Override
    protected String getTableName() {

        return "index_ad_images";
    }

    @Override
    protected String getKeyName() {

        return "id";
    }

    @Override
    protected boolean autoGenerateKey() {

        return false;
    }
}
