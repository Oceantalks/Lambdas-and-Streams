package root;

import root.Trade;

import java.util.ArrayList;

/**
 * Created by Ado on 2017-12-28.
 */
public class CreateTradeList {

    private ArrayList<Trade> tradeList;


    public CreateTradeList() {

        this.tradeList = new ArrayList<>();
        this.tradeList.add(new Trade(1L, 500, "Shamaran", "OIL", false, createShareHolders()));
        this.tradeList.add(new Trade(2L, 1500, "Fingerprint", "IT", false, createShareHolders()));
        this.tradeList.add(new Trade(3L, 1300, "Ripple", "CryptoCurrency", true, createShareHolders()));
        this.tradeList.add(new Trade(4L, 300, "PostNord", "Logistics", false, createShareHolders()));
        this.tradeList.add(new Trade(5L, 200, "Bring", "Logistics",false, createShareHolders()));
        this.tradeList.add(new Trade(6L, 1200, "Neo", "CryptoCurrency", true, createShareHolders()));
        this.tradeList.add(new Trade(7L, 640, "PreciseBiometrics", "IT", true, createShareHolders()));
        this.tradeList.add(new Trade(8L, 4500, "SHELL", "OIL", false, createShareHolders()));
        this.tradeList.add(new Trade(9L, 500, "Shamaran", "OIL", false, createShareHolders()));
    }

    private ArrayList<ShareHolders> createShareHolders() {
        ArrayList<ShareHolders> sh = new ArrayList<>();
        sh.add(new ShareHolders("Adonai", "Tesfay", "hallo.adonai@gmail.com"));
        sh.add(new ShareHolders("Tanya", "Tesfay", "tnesic79@gmail.com"));
        sh.add(new ShareHolders("Magdalena", "Tesfay", "maggio.adonai@gmail.com"));
        return sh;
    }

    public ArrayList<Trade> getTradeList() {
        return tradeList;
    }

    public void setTradeList(ArrayList<Trade> tradeList) {
        this.tradeList = tradeList;
    }
}
