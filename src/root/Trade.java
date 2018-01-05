package root;

import java.util.ArrayList;

/**
 * Created by Ado on 2017-12-28.
 */
public class Trade {

    private Long id;
    private int quantity;
    private String nameOfTrade;
    private String segmentOfTrade;
    private boolean isBigRisk;
    private boolean isCheap;
    private ArrayList<ShareHolders> sh;

    public Trade() {
        this.id = 0L;
        this.quantity = 0;
        this.nameOfTrade = "";
        this.segmentOfTrade = "";
        this.isBigRisk = false;
        this.isCheap = false;
    }

    public Trade(Long id, int quantity, String nameOfTrade, String segmentOfTrade, boolean isBigRisk, ArrayList<ShareHolders> sh) {
        this.id = id;
        this.quantity = quantity;
        this.nameOfTrade = nameOfTrade;
        this.segmentOfTrade = segmentOfTrade;
        this.isBigRisk = isBigRisk;
        if (quantity >= 800){
            this.isCheap = false;
        } else {
            this.isCheap = true;
        }
        this.sh = sh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameOfTrade() {
        return nameOfTrade;
    }

    public void setNameOfTrade(String nameOfTrade) {
        this.nameOfTrade = nameOfTrade;
    }

    public String getSegmentOfTrade() {
        return segmentOfTrade;
    }

    public void setSegmentOfTrade(String segmentOfTrade) {
        this.segmentOfTrade = segmentOfTrade;
    }

    public boolean isBigRisk() {
        return isBigRisk;
    }

    public void setBigRisk(boolean bigRisk) {
        isBigRisk = bigRisk;
    }

    public boolean isCheap() {
        return isCheap;
    }

    public void setCheap(boolean cheap) {
        isCheap = cheap;
    }

    public ArrayList<ShareHolders> getSh() {
        return sh;
    }

    public void setSh(ArrayList<ShareHolders> sh) {
        this.sh = sh;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", nameOfTrade='" + nameOfTrade + '\'' +
                ", segmentOfTrade='" + segmentOfTrade + '\'' +
                ", isBigRisk=" + isBigRisk +
                ", isCheap=" + isCheap +
                ", sh=" + sh +
                '}';
    }
}
