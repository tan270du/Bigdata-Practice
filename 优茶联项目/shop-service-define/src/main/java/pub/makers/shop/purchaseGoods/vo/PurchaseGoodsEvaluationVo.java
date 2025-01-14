package pub.makers.shop.purchaseGoods.vo;

import pub.makers.shop.cargo.entity.vo.ImageGroupVo;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoodEvaluation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 洪晓明
 * @Description: 进货商品评论表
 * @date 2017年02月21日 下午15:02:41
 */
public class PurchaseGoodsEvaluationVo implements Serializable {

    private String id;

    private String tag;

    private String purGoodsId;//进货商品编号

    private String goodSkuId;//skuid

    private String user;//

    private String userName;

    private String content;

    private String image;

    private ImageGroupVo images;

    private Date evaluateTime;

    private Integer score;

    private String headImgUrl;

    private String skuLong;

    private String orderId;

    private String orderListId;

    private String goodName;

    private String isHide;

    private String isReplied;

    private String repliedId;

    private Date buyTime;

    private List<String> imageUrlList;

    private PurchaseGoodsEvaluationVo replied;

    private List<PurchaseGoodsEvaluationVo> repliedList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurGoodsId() {
        return purGoodsId;
    }

    public void setPurGoodsId(String purGoodsId) {
        this.purGoodsId = purGoodsId;
    }

    public String getGoodSkuId() {
        return goodSkuId;
    }

    public void setGoodSkuId(String goodSkuId) {
        this.goodSkuId = goodSkuId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getSkuLong() {
        return skuLong;
    }

    public void setSkuLong(String skuLong) {
        this.skuLong = skuLong;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderListId() {
        return orderListId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setOrderListId(String orderListId) {
        this.orderListId = orderListId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getIsHide() {
        return isHide;
    }

    public void setIsHide(String isHide) {
        this.isHide = isHide;
    }

    public String getIsReplied() {
        return isReplied;
    }

    public void setIsReplied(String isReplied) {
        this.isReplied = isReplied;
    }

    public String getRepliedId() {
        return repliedId;
    }

    public void setRepliedId(String repliedId) {
        this.repliedId = repliedId;
    }

    public List<PurchaseGoodsEvaluationVo> getRepliedList() {
        return repliedList;
    }

    public void setRepliedList(List<PurchaseGoodsEvaluationVo> repliedList) {
        this.repliedList = repliedList;
    }

    public ImageGroupVo getImages() {
        return images;
    }

    public void setImages(ImageGroupVo images) {
        this.images = images;
    }

    public List<String> getImageUrlList() {
        return imageUrlList;
    }

    public void setImageUrlList(List<String> imageUrlList) {
        this.imageUrlList = imageUrlList;
    }

    public PurchaseGoodsEvaluationVo getReplied() {
        return replied;
    }

    public void setReplied(PurchaseGoodsEvaluationVo replied) {
        this.replied = replied;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public PurchaseGoodEvaluation toPurchaseGoodEvaluation() {
        PurchaseGoodEvaluation evaluation = new PurchaseGoodEvaluation();
        evaluation.setPurGoodsId(this.getPurGoodsId());
        evaluation.setGoodSkuId(this.getGoodSkuId());
        evaluation.setUser(this.getUser());
        evaluation.setUserName(this.getUserName());
        evaluation.setContent(this.getContent());
        evaluation.setImage(this.getImage());
        evaluation.setEvaluateTime(this.getEvaluateTime());
        evaluation.setScore(this.getScore());
        evaluation.setOrderId(this.getOrderId());
        evaluation.setGoodName(this.getGoodName());
        evaluation.setIsHide(this.getIsHide());
        evaluation.setIsReplied(this.getIsReplied());
        evaluation.setRepliedId(this.getRepliedId());
        return evaluation;
    }

    public static PurchaseGoodsEvaluationVo fromPurchaseGoodEvaluation(PurchaseGoodEvaluation evaluation) {
        PurchaseGoodsEvaluationVo vo = new PurchaseGoodsEvaluationVo();
        vo.setId(evaluation.getId().toString());
        vo.setPurGoodsId(evaluation.getPurGoodsId());
        vo.setGoodSkuId(evaluation.getGoodSkuId());
        vo.setUser(evaluation.getUser());
        vo.setUserName(evaluation.getUserName());
        vo.setContent(evaluation.getContent());
        vo.setImage(evaluation.getImage());
        vo.setEvaluateTime(evaluation.getEvaluateTime());
        vo.setScore(evaluation.getScore());
        vo.setOrderId(evaluation.getOrderId());
        vo.setGoodName(evaluation.getGoodName());
        vo.setIsHide(evaluation.getIsHide());
        vo.setIsReplied(evaluation.getIsReplied());
        vo.setRepliedId(evaluation.getRepliedId());
        vo.setHeadImgUrl(evaluation.getHeadImgUrl());
        return vo;
    }

}