package pub.makers.shop.marketing.service;


import pub.makers.shop.tradeGoods.entity.Image;

/**
 * Created by dy on 2017/5/3.
 */
public interface OnlineStudyImageBizService {

    /**
     * 保存文章相关图片
     * @param covePic
     * @return
     */
    Image saveStudyImage(String covePic);

    /**
     * 更新文章相关图片
     * @param image
     */
    Image updateStudyImage(Image image);

    /**
     * 删除文章相关图片
     * @param id
     */
    void deleteStudyImageById(long id);

    /**
     * 查询文章相关图片
     * @param id
     * @return
     */
    Image getStudyImageById(String id);
}
