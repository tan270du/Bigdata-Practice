package pub.makers.shop.cargo.entity.vo;

import pub.makers.shop.store.vo.ImageVo;
import pub.makers.shop.tradeGoods.entity.Image;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dy on 2017/5/23.
 */
public class ImageGroupVo implements Serializable {

    private String groupId;
    private List<ImageVo> images = new ArrayList<ImageVo>();
    private List<Image> imageList;

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public ImageGroupVo() {
    }

    public ImageGroupVo(String groupId, List<ImageVo> images) {
        this.groupId = groupId;
        this.images = images;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<ImageVo> getImages() {
        return images;
    }

    public void setImages(List<ImageVo> images) {
        this.images = images;
    }

    public void addImages(ImageVo imageVo) {
        this.images.add(imageVo);
    }
}
